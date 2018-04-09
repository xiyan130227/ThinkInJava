package enumerated;

import java.util.EnumSet;

public class CarWash {
    public enum Cycle {
        UNDERBODY {
            @Override
            void action() {
                System.out.println("UNDERBODY");
            }
        },
        WHEELWASH {
            @Override
            void action() {
                System.out.println("WHEELWASH");
            }
        },
        PREWASH {
            @Override
            void action() {
                System.out.println("PREWASH");
            }
        },
        BASIC {
            @Override
            void action() {
                System.out.println("BASIC");
            }
        },
        HOTWAX {
            @Override
            void action() {
                System.out.println("HOTWAX");
            }
        },
        RINSE {
            @Override
            void action() {
                System.out.println("RINSE");
            }
        },
        BLOWDRY {
            @Override
            void action() {
                System.out.println("BLOWDRY");
            }
        };
        abstract void action();
    }

    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC, Cycle.RINSE);

    @Override
    public String toString() {
        return cycles.toString();
    }

    public void washCar() {
        for(Cycle c: cycles)
            c.action();
    }

    public void add(Cycle cycle) {
        cycles.add(cycle);
    }

    public static void main(String[] args) {
        CarWash wash = new CarWash();
        System.out.println(wash);

        wash.washCar();

        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.BLOWDRY);

        System.out.println(wash);

        wash.washCar();
    }
}
