package interfaces.music5;

import polymorphism.upcasting.music.Note;

interface Playable {
    void play(Note n);
}

interface Instrument {
    int VALUE = 5;

    void adjust();
}

class Wind implements Instrument, Playable {

    public void play(Note n) {
        System.out.println(this + ".play()  " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument, Playable {

    public void play(Note n) {
        System.out.println(this + ".play()  " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument, Playable {

    public void play(Note n) {
        System.out.println(this + ".play()  " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] p) {
        for (Playable i : p)
            tune(i);
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };

        tuneAll(orchestra);
    }
}
