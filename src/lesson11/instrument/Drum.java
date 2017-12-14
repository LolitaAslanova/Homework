package lesson11.instrument;

public class Drum implements Tool {
    String size;

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с " + size + " размером.");
    }
}
