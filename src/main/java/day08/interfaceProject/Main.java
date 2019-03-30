package day08.interfaceProject;

public class Main {
    public static void main(String[] args) {


        HireDate hire = new HireDate();
        System.out.println(hire.makeDate(3,5,2091));

        SalariedEmployee hire1 = new SalariedEmployee("William", "Cropper", 1435, 1000.00);
        System.out.println(hire1.makeDate(3,5,2019));
        System.out.println(hire1.calculatePay());

        HourlyEmployee hire2 = new HourlyEmployee("William","Cropper", 1435, 1, 50);
        System.out.println(hire2.calculatePay());

    }
}
