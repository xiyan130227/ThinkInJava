package refactoring.no1;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        title = title;
        priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int _priceCode) {
        this.priceCode = _priceCode;
    }

    public String getTitle() {
        return title;
    }
}
