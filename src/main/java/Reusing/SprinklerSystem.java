package Reusing;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String value1, value2, value3, value4;
    private int i;
    private float f;
    private WaterSource source = new WaterSource();

    public String toString() {
        return "value1 = " + value1 + "     " +
                "value2 = " + value2 + "    " +
                "value3 = " + value3 + "    " +
                "value4 = " + value4 + "\n" +
                "i = " + i + "  " + "f = " + f + "  " +
                "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
