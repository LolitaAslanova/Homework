package lesson12.weather;

public enum Seasons {
    WINTER(-43),
    SPRING(22),
    AUTUMN(7),
    SUMMER(70){
        public void getDescription(){
            System.out.println("Теплое время года");
        }
    };
    private int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
        }
    }

