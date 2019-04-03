package day09;

public class Main {
    public static void main(String[] args) {

        Dimension dimension = new Dimension(1080,720,400);
        Case pccase = new Case("Acer","260p", "evga", dimension);
        Resolution res = new Resolution(500,400);
        Monitor mon = new Monitor("590g", "Acer", 500, 1080);
        Motherboard mother = new Motherboard("Acer", "680g", 4, 6, "0.27");
        PC pc = new PC(mother,pccase,mon);

        pc.powerUp();
        System.out.println(pc);
    }
}
