package assemblepc;

public class Main {
    public static void main(String[] args) {
        //Creating my instances!
        Dimension dimension = new Dimension(9, 10, 2);
        Resolution resolution = new Resolution(2,3);
        Monitor monitor = new Monitor("Victoria's Secret", "CheapysCheap Manufacturing", resolution);
        Case case2 = new Case("VeryNice", "Borat inc", "10", dimension);
        MotherBoard motherBoard = new MotherBoard("Ipad", "Apple", 2, 3, "hi I'm computer");
        PC pc = new PC(case2, motherBoard, monitor);


        pc.description();
        pc.powerUp();



    }
}
