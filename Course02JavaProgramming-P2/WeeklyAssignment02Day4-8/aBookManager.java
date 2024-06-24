/*
Create a Java program to manage a collection of books using a Set collection. 
Implement operations to add books, remove books by title, find books by author, and display all books in the collection. 

Define the Book Class 
Start by defining a Book class with attributes such as title, author, isbn, etc. 
Include appropriate constructors, getters, setters, override toString(). 

Implement the Main Program (BookManager) 
Create a BookManager class to demonstrate various operations on the set of books using HashSet. 
Include methods public void addBook(Book book), public void removeBookByTitle(String title), public void findBooksByAuthor(String author), public void displayAllBooks) and main().  
*/
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Scanner;

class Book
{
    protected String title, author;
    protected int isbn, edition;
    protected double price;

    public Book (String title, String author, int isbn, int edition, double price)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.edition = edition;
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getIsbn()
    {
        return isbn;
    }
    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

    public int getEdition()
    {
        return edition;
    }
    public void setEdition(int edition)
    {
        this.edition = edition;
    }

    public double getPrice()
    {
        return price;
    }
    public void setprice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Book {title = " + title + ", author = " + author + ", isbn = " + isbn + ", edition = " + edition + ", price = " + price +"}";
    }
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() 
    {
        return Integer.hashCode(isbn);
    }
}

public class aBookManager
{
    private Set<Book> books;
    public aBookManager() 
    {
        books = new HashSet<>();
    }

    public void addBook(Book book) 
    {
        if (books.add(book)) 
        {
            System.out.println("Book added: " + book);
        } else 
        {
            System.out.println("Book with ISBN " + book.getIsbn() + " already exists.");
        }
    }

    public void removeBookByTitle(String title) 
    {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public void findBooksByAuthor(String author) 
    {
        Set<Book> booksByAuthor = books.stream()
            .filter(book -> book.getAuthor().equalsIgnoreCase(author))
            .collect(Collectors.toSet());
        if (booksByAuthor.isEmpty()) 
        {
            System.out.println("No books found by author '" + author + "'.");
        } else 
        {
            System.out.println("Following books are found in the record : ");
            booksByAuthor.forEach(System.out::println);
        }
    }

    public void displayAllBooks() 
    {
        books.forEach(System.out::println);
    }


    public static void main(String[] args) 
    {
        aBookManager bm = new aBookManager();
        Scanner sc = new Scanner(System.in);
        
        String title, author;
        int choice, isbn, edition;
        double price;

        do
        {
            System.out.print("----------------------------------------");
            System.out.println("\nMenu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book by Title");
            System.out.println("3. Find Books by Author");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------------");

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    title = sc.nextLine();
                    System.out.print("Enter author: ");
                    author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    isbn = sc.nextInt();
                    System.out.print("Enter edition: ");
                    edition = sc.nextInt();
                    System.out.print("Enter price: ");
                    price = sc.nextDouble();
                    Book book = new Book(title, author, isbn, edition, price);
                    bm.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter title to remove: ");
                    title = sc.nextLine();
                    bm.removeBookByTitle(title);
                    break;

                case 3:
                    System.out.print("Enter author to find: ");
                    author = sc.nextLine();
                    bm.findBooksByAuthor(author);
                    break;

                case 4:
                    System.out.println("All books in the collection:");
                    bm.displayAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while(choice!=5);

        sc.close();
    }
} 