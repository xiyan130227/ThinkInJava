package proxy;

public class StaticProxy2 {
    public static void main(String[] args) {
        Marry2 you = new You2();
        WeddingCompany2 weddingCompany = new WeddingCompany2(you);
        weddingCompany.marry();
    }
}

interface Marry2 {
    void marry();
}

class You2 implements Marry2 {

    @Override
    public void marry() {

    }
}

class WeddingCompany2 implements Marry2 {

    private Marry2 you;

    public WeddingCompany2(Marry2 you) {
        this.you = you;
    }

    public void before() {}
    public void after() {}

    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}


