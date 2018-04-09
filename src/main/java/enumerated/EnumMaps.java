package enumerated;

import java.util.EnumMap;
import java.util.Map;

import static enumerated.AlarmPoints.*;

interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command>  em = new EnumMap<>(AlarmPoints.class);

        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });

        em.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom fire!");
            }
        });

        for(Map.Entry<AlarmPoints, Command> e: em.entrySet()) {
            System.out.println(e.getKey() + ": ");
            e.getValue().action();
        }

        System.out.println(em);
    }
}
