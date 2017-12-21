package polymorphism.upcasting.music3;

import polymorphism.upcasting.music.Note;

import java.util.Random;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play()   " + n);
    }

    String what() {
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
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play()   " + n);
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play()   " + n);
    }
}

class Brass extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Brass.play()   " + n);
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
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

public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
//        Instrument[] orchestra = {
//                new Wind(),
//                new Percussion(),
//                new Stringed(),
//                new Brass(),
//                new Woodwind()
//        };
//        tuneAll(orchestra);

        InstrumentGenerator gen = new InstrumentGenerator();
        for (int i = 0; i < 20; i++) {
            System.out.println(gen.next());
        }
    }

}
