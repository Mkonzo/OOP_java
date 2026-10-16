public class Book {
        String title;
        String author;
        double price;
        int yearPublished;

        // Constructor
        public Book(String title, String author, double price, int yearPublished) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.yearPublished = yearPublished;
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
            System.out.println("Year Published: " + yearPublished);
        }

        // Main method to test
        public static void main(String[] args) {
            Book b1 = new Book("Java Programming", "John Doe", 1500.50, 2023);
            b1.displayDetails();
        }
    }

