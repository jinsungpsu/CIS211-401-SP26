public class Train {
    Car firstCar;
}

class Car {
    Car next;
    double tonsCargo;
}

class Test {
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.firstCar = new Car();
        train1.firstCar.tonsCargo = 1.5;
        train1.firstCar.next = new Car();
        String name = "johnny";
        train1.firstCar.next.tonsCargo = 2.0;
        double tax = 6.0;
        train1.firstCar.next.next = new Car();
        train1.firstCar.next.next.tonsCargo = 0.5;
    }
}
