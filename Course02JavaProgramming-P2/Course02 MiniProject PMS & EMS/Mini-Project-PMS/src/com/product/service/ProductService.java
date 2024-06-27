package com.product.service;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.product.dao.ProductDaoImpl;
import com.product.model.Product;

public class ProductService 
{
	public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
		boolean authenticated = false;
		while(!authenticated)
		{
			System.out.println("-----------------------------------------------");
			System.out.println("User Authentication");
			System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------------------------");
            switch (choice)
            {
            case 1:
                Authenticator.register();
                break;
            case 2:
                authenticated = Authenticator.authenticate();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
            }
		}
		
        ProductDaoImpl dao = new ProductDaoImpl();
        int choice, productId;
        String productName, productCategory;
        double productPrice;

        do 
        {
        	System.out.println("-----------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Create Product Table");
            System.out.println("2. Add New Product");
            System.out.println("3. Show All Products");
            System.out.println("4. Show Products Sorted by Name");
            System.out.println("5. Update Product");
            System.out.println("6. Delete Product");
            System.out.println("7. Find Product By ID");
            System.out.println("8. Find Most Expensive Product Name and Price");
            System.out.println("9. Find Cheapest Product Name and Price");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------------------------");

            switch (choice) {
                case 1:
                    dao.connect();
                    dao.createProductTable();
                    break;

                case 2:
                    dao.connect();
                    System.out.print("Enter Product ID: ");
                    productId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    productName = sc.nextLine();
                    System.out.print("Enter Product Category: ");
                    productCategory = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    productPrice = sc.nextDouble();
                    sc.nextLine();
                    Product product = new Product(productId, productName, productCategory, productPrice);
                    dao.addProduct(product);
                    break;

                case 3:
                    dao.connect();
                    List<Product> products = dao.showAllProducts();
                    if(products.isEmpty())
                    {
                    	System.out.println("No entries found in the product table");
                    }
                    else
                    {
                        for (Product p : products) 
                        {
                            System.out.println(p);
                        }
                    }
                    break;

                case 4:
                    dao.connect();
                    List<Product> sortedProducts = dao.showProductsSortedByName();
                    if(sortedProducts.isEmpty())
                    {
                    	System.out.println("No entries found in the product table");
                    }
                    else
                    {
                    	for (Product p : sortedProducts) 
                        {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    dao.connect();
                    System.out.print("Enter Product ID to update: ");
                    int updateProductId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Product Name: ");
                    String newProductName = sc.nextLine();
                    System.out.print("Enter New Product Category: ");
                    String newProductCategory = sc.nextLine();
                    System.out.print("Enter New Product Price: ");
                    double newProductPrice = sc.nextDouble();
                    sc.nextLine();
                    Product updatedProduct = new Product(updateProductId, newProductName, newProductCategory, newProductPrice);
                    dao.updateProduct(updatedProduct);
                    break;

                case 6:
                    dao.connect();
                    System.out.print("Enter Product ID to delete: ");
                    int deleteProductId = sc.nextInt();
                    sc.nextLine();
                    dao.deleteProduct(deleteProductId);
                    break;

                case 7:
                    dao.connect();
                    System.out.print("Enter Product ID to find: ");
                    int findProductId = sc.nextInt();
                    sc.nextLine();
                    Product foundProduct = dao.findProductByIdUsingProc(findProductId);
                    System.out.println(foundProduct != null ? foundProduct : "Product not found");
                    break;

                case 8:
                    dao.connect();
                    double mostExpensivePrice = dao.findMostExpensiveProductUsingFunc();
                    String mostExpensiveProductName = dao.findMostExpensiveProductNameUsingFunc();
                    System.out.println("Most Expensive Product is " + mostExpensiveProductName + " and its price is Rs." + mostExpensivePrice);
                    break;

                case 9:
                    dao.connect();
                    String cheapestProductName = dao.findCheapestProductNameUsingFunc();
                    double cheapestPrice = dao.findCheapestProductUsingFunc();
                    System.out.println("Cheapest Product is " + cheapestProductName + " and its price is Rs." + cheapestPrice);
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } 
        while (choice != 10);

        sc.close();
    }
}
