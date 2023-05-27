package Car;


public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(6);
        Navigation navigation = new Navigation("IOS");
        Handle handle = new Handle(3);
        Speed speed = new Speed();
        Car car = new Car(wheel, navigation, handle,speed);
        int test = Time.test;

        car.run();
        int test1 = car.test();
        car.speed();
    }

}

