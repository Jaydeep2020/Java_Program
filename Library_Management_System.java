import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false; // Books are initially available for borrowing
    }

    // Getter and Setter for isBorrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Borrowed: " + (isBorrowed ? "Yes" : "No");
    }
}

// Library class
class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();
        Book book = new Book(title, author, isbn);
        books.add(book);
        System.out.println("Book '" + title + "' by " + author + " added to the library.");
    }

    // Borrow a book
    public void borrowBook(Scanner scanner) {
        System.out.print("Enter the title of the book you want to borrow: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    System.out.println("Sorry, the book '" + title + "' is already borrowed.");
                } else {
                    book.setBorrowed(true);
                    System.out.println("You have successfully borrowed '" + title + "'.");
                }
                return;
            }
        }
        System.out.println("Sorry, the book '" + title + "' was not found in the library.");
    }

    // Return a book
    public void returnBook(Scanner scanner) {
        System.out.print("Enter the title of the book you want to return: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    System.out.println("The book '" + title + "' was not borrowed.");
                } else {
                    book.setBorrowed(false);
                    System.out.println("You have successfully returned '" + title + "'.");
                }
                return;
            }
        }
        System.out.println("Sorry, the book '" + title + "' was not found in the library.");
    }

    // Display available books
    public void displayAvailableBooks() {
        boolean found = false;
        System.out.println("\nAvailable Books in the Library:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are currently available in the library.");
        }
    }

    // Search for a book
    public void searchBook(Scanner scanner) {
        System.out.print("Enter the title or author of the book you are searching for: ");
        String searchTerm = scanner.nextLine();
        boolean found = false;
        System.out.println("\nSearch results for '" + searchTerm + "':");
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found for '" + searchTerm + "'.");
        }
    }
}

// Main class --> LibraryManagementSystem
class Main{
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Search for a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    library.addBook(scanner);
                    break;
                case "2":
                    library.borrowBook(scanner);
                    break;
                case "3":
                    library.returnBook(scanner);
                    break;
                case "4":
                    library.displayAvailableBooks();
                    break;
                case "5":
                    library.searchBook(scanner);
                    break;
                case "6":
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-6).");
            }
        }
    }
}
