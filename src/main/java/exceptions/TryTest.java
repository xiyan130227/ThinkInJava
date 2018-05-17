package exceptions;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TryTest {
    @Test
    public void testTry1() {
        InputStreamReader reader = null;

        try {
            reader = new InputStreamReader(System.in);
            reader.read();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testTry2() {
        try(InputStreamReader reader = new InputStreamReader(System.in)) {
            reader.read();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTry3() {
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);

        try(reader; writer) {
            //reader: final
//            reader = null;

            reader.read();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
