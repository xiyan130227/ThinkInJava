package holding;

import java.util.*;

class Snow {
}

class Powder extends Snow {
}

class Light extends Snow {
}

class Heavy extends Snow {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snowl = Arrays.asList(new Crusty(), new Slush(), new Powder());
        List<Snow> snow2 = new ArrayList<>();
        Collections.addAll(snow2, new Light(), new Heavy());

        List<Snow> snow3 = new ArrayList<>(snowl);
        Snow[] sa = new Snow[snow2.size()];
        Collections.addAll(snow3, snow2.toArray(sa));

        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());

        for (Snow s : snowl)
            System.out.print(s + ",  ");
        System.out.println();

        for (Snow s : snow2)
            System.out.print(s + ",  ");
        System.out.println();

        for (Snow s : snow3)
            System.out.print(s + ",  ");
        System.out.println();

        for (Snow s : snow4)
            System.out.print(s + ",  ");
        System.out.println();
    }
}
