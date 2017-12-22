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
    public void play() {
        System.out.println("Играет гитара с " + countOfString + " струнами.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return countOfString == guitar.countOfString;
    }

    @Override
    public int hashCode() {
        return countOfString;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "countOfString=" + countOfString +
                '}';
    }
}