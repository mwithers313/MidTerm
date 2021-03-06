//Getter and Constructor class
public class Product {

    private String name;
    private String category;
    private String description;
    private double price;
    private String itemNumber;


    public Product(String itemNumber, String name, String category, String description, double price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //Formatting and toString method
    @Override
        public String toString() {

            return String.format(
                    "%1$-8s %2$-15s %3$-15s %4$-15s      $ %5$5.2f \n", itemNumber, name, category, description, price);
        }
    }


