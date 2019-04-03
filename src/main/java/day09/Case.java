package day09;

public class Case {

    private String manufacturer;
    private String model;
    private String powerSupply;
    private Dimension dimemsion;

    public Case(String manufacturer, String model, String powerSupply, Dimension dimemsion) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerSupply = powerSupply;
        this.dimemsion = dimemsion;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimemsion() {
        return dimemsion;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    @Override
    public String toString() {
        return "Case{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimemsion=" + dimemsion +
                '}';
    }
}
