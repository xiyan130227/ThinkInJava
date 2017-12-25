package interfaces.music4;

import polymorphism.upcasting.music.Note;

import java.util.Random;

abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play()   " + n);
    }

    public void adjust() {

    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play()   " + n);
    }

    public void adjust() {

    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()   " + n);
    }

    public void adjust() {

    }
}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play()   " + n);
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play()   " + n);
    }
}

class InstrumentGenerator {
    Random gen = new Random(47);

    public Instrument next() {
        switch (gen.nextInt(5)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
        }
    }
}

class InstrumentGenerator2 {
    Random gen = new Random(47);
    Class<?> instruments[] = {
            Wind.class,
            Percussion.class,
            Stringed.class,
            Brass.class,
            Woodwind.class,
    };

    public Instrument next() {
        int idx = Math.abs(gen.nextInt(instruments.length));
        try {
            return (Instrument) instruments[idx].newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot Create", e);
        }
    }
}

public class Music4 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
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

//        InstrumentGenerator gen = new InstrumentGenerator();
//        for (int i = 0; i < 20; i++) {
//            System.out.println(gen.next());
//        }
    }

}
