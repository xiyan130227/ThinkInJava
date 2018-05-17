package proxy;

public class StaticProxy {
    public static void main(String[] args) {
        Marry you = new You();
        WeddingCompany company = new WeddingCompany(you);
        company.marry();
    }
}

interface Marry {
    void marry();
}

class You implements Marry {

    @Override
    public void marry() {
        System.out.println("You and Change married!!!");
    }
}

class WeddingCompany implements Marry {
    private Marry you;

    public WeddingCompany(Marry you) {
        this.you = you;
    }

    private void before() {
        System.out.println("Buy something ...");
    }

    private void after() {
        System.out.println("Clean room ...");
    }

    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}

