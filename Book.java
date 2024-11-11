import java.util.Scanner;

class Book1 {
    String name;
    String author;
    double price;
    int num_pages;
    Book1(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

       void setDetails(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    String getDetails() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages;
    }

      public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages;
    }
}

public class Book{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline character

        Book1[] books = new Book1[n];

             for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine();  // Consume the leftover newline character

            books[i] = new Book1(name, author, price, num_pages);
        }

               System.out.println("Book Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }


    }
}





