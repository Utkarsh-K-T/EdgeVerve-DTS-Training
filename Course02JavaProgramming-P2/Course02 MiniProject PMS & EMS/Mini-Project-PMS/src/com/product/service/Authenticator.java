package com.product.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Authenticator 
{
    private static Map<String, String> userStore = new HashMap<>();

    public static void register() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new username: ");
        String username = sc.nextLine();
        System.out.print("Enter new password: ");
        String password = sc.nextLine();

        if (userStore.containsKey(username)) 
        {
            System.out.println("Username already exists. Please try again.");
        } else 
        {
            userStore.put(username, password);
            System.out.println("User registered successfully!");
        }
    }

    public static boolean authenticate() 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (userStore.containsKey(username) && userStore.get(username).equals(password)) 
            {
                return true;
            } 
            else 
            {
                System.out.println("Authentication failed. Invalid username or password.");
                return false;
            }
        }
        catch (Exception e) 
        {
            System.out.println("An error occurred during authentication: " + e.getMessage());
            return false;
        }
    }
}
