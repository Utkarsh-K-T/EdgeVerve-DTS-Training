package com.product.dao;

import java.sql.SQLException;
import java.util.List;

import com.product.model.Product;

public interface ProductDao 
{
    public void createProductTable() throws SQLException;
    public void addProduct(Product p) throws SQLException;
    public List<Product> showAllProducts() throws SQLException;
    public List<Product> showProductsSortedByName() throws SQLException;
    public void connect() throws SQLException;
    public void updateProduct(Product p) throws SQLException;
    public void deleteProduct(int id) throws SQLException;
    public Product findProductByIdUsingProc(int id) throws SQLException;
    public double findMostExpensiveProductUsingFunc() throws SQLException;
    public String findMostExpensiveProductNameUsingFunc() throws SQLException;
    public double findCheapestProductUsingFunc() throws SQLException;
    public String findCheapestProductNameUsingFunc() throws SQLException;
}
