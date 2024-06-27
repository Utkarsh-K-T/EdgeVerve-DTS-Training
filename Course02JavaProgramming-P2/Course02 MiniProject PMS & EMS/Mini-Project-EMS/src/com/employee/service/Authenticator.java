package com.employee.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Authenticator 
{
    private static Map<String, String> userStore = new HashMap<>();

    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z0-9@]{6,9}$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$");

    public static void register() 
    {

    	System.out.println("The username must be between 6 and 9 characters long and can contain letters, numbers, and the '@' character!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new username: ");
        String username = sc.nextLine();
        System.out.println("The password must be at least of 6 characters long and contain letters, numbers, and at least one special character. ");
        System.out.print("Enter new password: ");
        String password = sc.nextLine();

        if (!USERNAME_PATTERN.matcher(username).matches()) 
        {
            System.out.println("Invalid username. It must be 6 to 9 characters long and can contain letters, numbers, and '@'.");
            return;
        }

        if (!PASSWORD_PATTERN.matcher(password).matches()) 
        {
            System.out.println("Invalid password. It must be at least 6 characters long and contain letters, numbers, and at least one special character.");
            return;
        }

        if (userStore.containsKey(username)) 
        {
            System.out.println("Username already exists. Please try again.");
        } 
        else 
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
            	System.out.println("Authentication completed! Welcome "+username+" !");
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
