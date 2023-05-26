package Car;

public class Main {
    public static void main(String[] args){
        Wheel wheel = new Wheel(6);
        Navigation navigation = new Navigation("IOS");
        Handle handle = new Handle(3);
        Car car = new Car(wheel,navigation,handle);
        int test = Time.test;

        car.run();

    }

}

