/**
 * Created by Michael on 2/15/2017.
 */
public class subTotal {

    private String product;
    private double price;


    public subTotal(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {

        return product + "\t" + price;

    }
}


