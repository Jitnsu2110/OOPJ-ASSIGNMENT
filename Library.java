import java.util.ArrayList;

class Library {
    ArrayList<String> books = new ArrayList<>();
    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }
    void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from the library.");
        } else {
            System.out.println(book + " is not available in the library.");
        }
    }
    void displayBooks() {
        System.out.println("Books in Library:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();


        library.addBook("Java Programming");
        library.addBook("Python Programming");
        library.addBook("Data Structures");

        System.out.println();
        library.displayBooks();

        System.out.println();
        library.removeBook("Python Programming");

        System.out.println();
        library.displayBooks();
    }
}