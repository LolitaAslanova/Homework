package lesson11.instrument;

public class Trumpet implements Tool {
    int diametr;

    public Trumpet(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diametr=" + diametr +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет труба с " + diametr + " диаметром.");
    }
}
