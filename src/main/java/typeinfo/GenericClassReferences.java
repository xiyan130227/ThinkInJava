package typeinfo;

public class GenericClassReferences {
    public static void main(String[] args) {
//        Class intClass = int.class;
        Class<?> intClass = int.class;
        Class<? extends Number> bounded = int.class;

        bounded = double.class;
        bounded = Number.class;

        Class<Integer> genericIntClass = int.class;
//        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = double.class;
    }

}
