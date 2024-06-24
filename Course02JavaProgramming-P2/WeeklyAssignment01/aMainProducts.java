
// Abstract class Product
abstract class Product {
    protected String productId;
    protected String productName;
    protected double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public abstract void displayDetails();
}

// Subclass Book
class Book extends Product {
    private String author;

    public Book(String productId, String productName, double price, String author) {
        super(productId, productName, price);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
    }
}

// Subclass Electronics
class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String productId, String productName, double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

public class aMainProducts {
    public static void main(String[] args) {
        // Book instance
        Book book = new Book("B01", "Wings Of Fire", 100.99, "A. P. J. Abdul Kalam");
        book.displayDetails();

        // Electronics instance
        Electronics electronics = new Electronics("E01", "Smartphone", 10000.99, 24);
        electronics.displayDetails();
    }
}
