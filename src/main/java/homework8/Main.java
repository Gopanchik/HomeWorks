package homework8;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setYear(3);
        car1.setColor("red");
        car1.setWeight(65);

        car2.setYear(4);
        car2.setColor("blue");

        System.out.println("Car1" + car1.toString());
        System.out.println("Car2" + car2.toString());
    }
}
//