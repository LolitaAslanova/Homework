package Shop;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("Print a magazine");
    }
    public static void printMagazines() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Magazine";
    }
}
