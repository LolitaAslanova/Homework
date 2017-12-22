package lesson11.instrument;

public class Trumpet implements Tool {
    public int diametr;

    public Trumpet() {
    }

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
    public void play() {
        System.out.println("Играет труба с " + diametr + " диаметром.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return diametr == trumpet.diametr;
    }

    @Override
    public int hashCode() {
        return diametr;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diametr=" + diametr +
                '}';
    }
}
