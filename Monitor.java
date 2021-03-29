package assemblepc;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution resolution;


    //getters and setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    //constructor

    public Monitor(String model, String manufacturer, Resolution resolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

}
