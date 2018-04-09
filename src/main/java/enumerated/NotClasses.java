package enumerated;

import java.sql.SQLOutput;

enum LikeClasses {
    WINKEN {
        @Override
        void behavior() {
            System.out.println("Behavior1");
        }
    };

    abstract void behavior();

}

public class NotClasses {
    /*void f1(LikeClasses.WINKEN instance) {

    }*/
}
