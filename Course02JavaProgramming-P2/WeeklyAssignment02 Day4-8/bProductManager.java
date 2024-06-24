/*
Implement a Java program to manage a collection of products using a Map collection. 
Define a Product class with attributes like id, name, price, and category. 
Provide operations to add products, remove products by ID, find products by name or category, and display all products in the collection.  

Define the Product Class 
Start by defining a Product class with attributes such as id, name, price, and category. 
Include appropriate constructors, getters, setters, toString(). 

Implement the Main Program (ProductManager) 
Create a ProductManager class to demonstrate various operations on the map of products using HashMap.  
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product 
{
    protected int id;
    protected String name, category;
    protected double price;


    public Product(int id, String name, double price, String category) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
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

    public double getPrice() 
    {
        return price;
    }
    public void setPrice(int price) 
    {
        this.price = price;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    @Override
    public String toString() 
    {
        return "Product{id = " + id + ", name = " + name + ", price = " + price +  ", category = " + category +"}";
    }
}

public class bProductManager 
{
    private Map<Integer, Product> productMap;

    public bProductManager() 
    {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) 
    {
        productMap.put(product.getId(), product);
        System.out.println("Product added successfully.");
    }

    public void removeProduct(int id) 
    {
        if (productMap.containsKey(id)) 
        {
            productMap.remove(id);
            System.out.println("Product removed successfully.");
        } 
        else 
        {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void findProductByName(String name) 
    {
        boolean found = false;
        for (Product product : productMap.values()) 
        {
            if (product.getName().equalsIgnoreCase(name)) 
            {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("No products found with the name " + name);
        }
    }

    public void findProductByCategory(String category) 
    {
        boolean found = false;
        for (Product product : productMap.values()) 
        {
            if (product.getCategory().equalsIgnoreCase(category)) 
            {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("No products found in the category " + category);
        }
    }

    public void displayAllProducts() 
    {
        if (productMap.isEmpty()) 
        {
            System.out.println("No products available.");
        } 
        else 
        {
            for (Product product : productMap.values()) 
            {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) 
    {
        bProductManager manager = new bProductManager();
        Scanner sc = new Scanner(System.in);
        int choice, id;
        String name, category;
        double price;

        do 
        {
            System.out.print("----------------------------------------");
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product by ID");
            System.out.println("3. Find Product by Name");
            System.out.println("4. Find Product by Category");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  
            System.out.println("----------------------------------------");

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Product Category: ");
                    category = sc.nextLine();
                    manager.addProduct(new Product(id, name, price, category));
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    manager.removeProduct(removeId);
                    break;

                case 3:
                    System.out.print("Enter Product Name to find: ");
                    String findName = sc.nextLine();
                    manager.findProductByName(findName);
                    break;

                case 4:
                    System.out.print("Enter Product Category to find: ");
                    String findCategory = sc.nextLine();
                    manager.findProductByCategory(findCategory);
                    break;

                case 5:
                    manager.displayAllProducts();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        while (choice != 6);
        sc.close();
    }
}
