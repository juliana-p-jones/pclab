package assemblepc;

//  case is a taken word, use case1
public class PC {
    private Case case1;
    private MotherBoard motherBoard;
    private Monitor monitor;


    public PC(Case case1, MotherBoard motherBoard, Monitor monitor){
    this.case1 = case1;
    this.motherBoard = motherBoard;
    this.monitor = monitor;
    }

    public void drawLogo(){
        monitor.drawPixel(0,0,null);
    }

    public void description(){
        System.out.println("Welcome to Worst Buy! Below us the description " +
                "of the PC on sale today: " + "\n Model: "  + case1.getModel()
                +"\n Manufacturer: "  + case1.getManufacturer()  + "\n" + "MotherBoard Description:\n" + "Model: " + motherBoard.getModel() + "\n Manufacturer: " + motherBoard.getManufacturer() + "\nModel: " + monitor.getModel() + "\n Manufacturer: " + monitor.getManufacturer());
    }

    public void powerUp(){
        case1.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram(null);
    }
}
