package lesson9.car.vehicles;

public class Car {
    private String carClass;
    private String marka;

    public Car() {
    }

    public Car(String carClass, String marka) {
        this.carClass = carClass;
        this.marka = marka;
    }

    public void start(){
        System.out.println("Поехали.");
    }
    public void stop(){
        System.out.println("Останавливаемся.");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (carClass != null ? !carClass.equals(car.carClass) : car.carClass != null) return false;
        return marka != null ? marka.equals(car.marka) : car.marka == null;
    }

    @Override
    public int hashCode() {
        int result = carClass != null ? carClass.hashCode() : 0;
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
