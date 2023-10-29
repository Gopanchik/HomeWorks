package homework8;
//
public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(10, 200, 60, "black");
    }

    public Car(int year, double speed, int weight) {
        this();
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }
    public Car(int year, double speed) {
        this();
        this.year = year;
        this.speed = speed;
    }


    public Car(int year) {
        this();
        this.year = year;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "(" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ')';
    }

}