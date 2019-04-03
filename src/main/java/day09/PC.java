package day09;

public class PC {

    private Motherboard motherboard;
    private Case theCase;
    private Monitor monitor;

    public PC(Motherboard motherboard, Case theCase, Monitor monitor) {
        this.motherboard = motherboard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    private void drawLogo(){
        monitor.drawPixel(500,500,"Yellow");
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows");
        System.out.println("Loading specs...");
    }

    @Override
    public String toString() {
        return "PC: " + '\n' +
                motherboard + '\n' +
                theCase + '\n' +
                monitor;
    }
}
