package java8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop("BestShop");

        Future<Double> futurePrice = shop.getPriceAsyncByFactory("my favorite product");
//        Future<Double> futurePrice = shop.getPriceAsync("my favorite product");

        doSomethingElse();

        try {
            double price = futurePrice.get();
            System.out.printf("Price is %.2f%n", price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void doSomethingElse() {
        System.out.println("Doing something else...");
    }
}
