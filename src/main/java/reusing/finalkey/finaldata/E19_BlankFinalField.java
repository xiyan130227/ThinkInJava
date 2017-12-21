package reusing.finalkey.finaldata;

class WithBlankFinalField {
    private final Integer i;

    public WithBlankFinalField(int ii) {
        i = new Integer(ii);
    }

    public Integer getI() {
//        if(i == null)
//            i = new Integer(47);
        return i;
    }
}

public class E19_BlankFinalField {
    public static void main(String[] args) {
        WithBlankFinalField wbff = new WithBlankFinalField(10);
        System.out.println(wbff.getI());
    }
}
