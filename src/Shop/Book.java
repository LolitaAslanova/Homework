package Shop;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Print a book");
    }
    public static void printBooks() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Book";
    }
}

