package typeinfo.toys;

public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();

        Class<? super FancyToy> up = ftClass.getSuperclass();
//        Class<Toy> up1 = ftClass.getSuperclass();

        Object obj = up.newInstance();
    }
}
