package io;

import java.io.Serializable;

public class Worm implements Serializable {


}

class Data implements Serializable {
    private int n;

    public Data(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return Integer.toString(n);
    }
}
