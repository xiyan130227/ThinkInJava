package polymorphism.upcasting;

import polymorphism.upcasting.music.Note;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play()   " + n);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play()   " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play()   " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play()   " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Brass.play()   " + n);
    }

    @Override
    public String toString() {
        return "Override";
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play()   " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class E06_MusicToString {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void printAll(Instrument[] orch) {
        for (Instrument i : orch) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);

        printAll(orchestra);
    }

}
