package com.product.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.product.model.Product;

public class ProductDaoImpl implements ProductDao
{
	private Connection con;

    @Override
    public void createProductTable() throws SQLException 
    {
        Statement st = con.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS PRODUCTS (id INT PRIMARY KEY, name VARCHAR(50), category VARCHAR(50), price DOUBLE)";
        st.execute(sql);
        System.out.println("Product table created!");
        st.close();
    }

    @Override
    public void addProduct(Product p) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("INSERT INTO PRODUCTS VALUES (?,?,?,?)");
        pst.setInt(1, p.getId());
        pst.setString(2, p.getName());
        pst.setString(3, p.getCategory());
        pst.setDouble(4, p.getPrice());
        int count = pst.executeUpdate();
        System.out.println(count + " record added to products table successfully!");
        pst.close();
    }

    @Override
    public List<Product> showAllProducts() throws SQLException 
    {
        Statement st = con.createStatement();
        List<Product> products = new ArrayList<>();
        ResultSet rs = st.executeQuery("SELECT * FROM PRODUCTS");
        while (rs.next()) 
        {
            products.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        rs.close();
        st.close();
        return products;
    }

    @Override
    public List<Product> showProductsSortedByName() throws SQLException 
    {
        Statement st = con.createStatement();
        List<Product> products = new ArrayList<>();
        ResultSet rs = st.executeQuery("SELECT * FROM PRODUCTS ORDER BY name");
        while (rs.next()) 
        {
            products.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        rs.close();
        st.close();
        return products;
    }

    @Override
    public void connect() throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/productdb";
        String user = "root";
        String pwd = "Mysql@369#pass";
        con = DriverManager.getConnection(url, user, pwd);
        System.out.println("Connected to the database!");
    }

    @Override
    public void updateProduct(Product p) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("UPDATE PRODUCTS SET name = ?, category = ?, price = ? WHERE id = ?");
        pst.setString(1, p.getName());
        pst.setString(2, p.getCategory());
        pst.setDouble(3, p.getPrice());
        pst.setInt(4, p.getId());
        int cnt = pst.executeUpdate();
        System.out.println(cnt + " record updated successfully!");
        pst.close();
    }

    @Override
    public void deleteProduct(int id) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("DELETE FROM PRODUCTS WHERE id = ?");
        pst.setInt(1, id);
        int cnt = pst.executeUpdate();
        System.out.println(cnt + " record deleted successfully!");
        pst.close();
    }

    @Override
    public Product findProductByIdUsingProc(int id) throws SQLException 
    {
        CallableStatement cs = con.prepareCall("{CALL findProductById(?)}");
        cs.setInt(1, id);
        ResultSet rs = cs.executeQuery();
        Product product = null;
        if (rs.next()) 
        {
            product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
        }
        rs.close();
        cs.close();
        return product;
    }

    @Override
    public double findMostExpensiveProductUsingFunc() throws SQLException 
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findMostExpensiveProduct()");
        rs.next();
        double price = rs.getDouble(1);
        rs.close();
        st.close();
        return price;
    }

    @Override
    public String findMostExpensiveProductNameUsingFunc() throws SQLException 
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findMostExpensiveProductName()");
        rs.next();
        String name = rs.getString(1);
        rs.close();
        st.close();
        return name;
    }

    @Override
    public double findCheapestProductUsingFunc() throws SQLException 
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findCheapestProduct()");
        rs.next();
        double price = rs.getDouble(1);
        rs.close();
        st.close();
        return price;
    }

    @Override
    public String findCheapestProductNameUsingFunc() throws SQLException 
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findCheapestProductName()");
        rs.next();
        String name = rs.getString(1);
        rs.close();
        st.close();
        return name;
    }

}
