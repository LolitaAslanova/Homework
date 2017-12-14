package lesson11.instrument;

public class Guitar implements Tool {
    int countOfString;

    public Guitar(int countOfString) {
        this.countOfString = countOfString;
    }

    public int getCountOfString() {
        return countOfString;
    }

    public void setCountOfString(int countOfString) {
        this.countOfString = countOfString;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "countOfString=" + countOfString +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + countOfString + " струнами.");
    }
}