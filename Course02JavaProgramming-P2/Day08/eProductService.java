import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Product 
{
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    @Override
    public String toString() 
    {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

public class eProductService
{
    List<Product> products;
    static Scanner sc;

    static 
    {
        sc = new Scanner(System.in);
    }

    public eProductService() 
    {
        products = new ArrayList<>();
    }

    public static void main(String[] args) 
    {
        eProductService ps = new eProductService();
        boolean exit = false;
        while (!exit) 
        {
            System.out.println("Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Sort Products by Price");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    ps.addProduct();
                    break;
                case 2:
                    System.out.println("The products in stock:");
                    ps.showProduct();
                    break;
                case 3:
                    ps.sortProduct();
                    System.out.println("The products in stock after sorting by price:");
                    ps.showProduct();
                    break;
                case 4:
                    ps.updateProduct();
                    break;
                case 5:
                    ps.deleteProduct();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addProduct() 
    {
        System.out.println("Enter product details: id name price");
        System.out.print("Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name : ");
        String name = sc.next();
        System.out.print("Price : ");
        int price = sc.nextInt();
        products.add(new Product(id, name, price));
    }

    private void showProduct() 
    {
        for (Product p : products) 
        {
            System.out.println(p);
        }
    }

    private void sortProduct() 
    {
        Collections.sort(products, (p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()));
    }

    public void updateProduct() 
    {
        System.out.print("Enter product id to update : ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Product p : products) 
        {
            if (p.getId() == id) 
            {
                System.out.println("Enter new name and price:");
                System.out.print("New ame : ");
                String name = sc.next();
                System.out.print("New price : ");
                int price = sc.nextInt();
                p.setName(name);
                p.setPrice(price);
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct() 
    {
        System.out.print("Enter product id to delete : ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Product p : products) 
        {
            if (p.getId() == id) 
            {
                products.remove(p);
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

}
