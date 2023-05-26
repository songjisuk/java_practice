package Car;

public class Car {
    private Wheel wheel;
    private Navigation navigation;
    private Handle handle;

    public Car(Wheel wheel,Navigation navigation,Handle handle){
        this.wheel = wheel;
        this.handle = handle;
        this.navigation = navigation;
    }
    public void run() {
        System.out.println("차가 달린다");
        System.out.println(this.wheel.getSize());
        System.out.println(this.handle.getSize());
        System.out.println(this.navigation.getVersion());
    }

}
