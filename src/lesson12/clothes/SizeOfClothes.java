package lesson12.clothes;

public enum SizeOfClothes {
    XXS(),XS(),S(),M(),L();
    public void getDescription() {
        System.out.println("Взрослый размер");
    }
    private int euroSize;
}
