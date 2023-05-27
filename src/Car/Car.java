package Car;

public class Car {
    private Wheel wheel;
    private Navigation navigation;
    private Handle handle;

    private Speed speed;
    public Car(Wheel wheel,Navigation navigation,Handle handle,Speed speed){
        this.wheel = wheel;
        this.handle = handle;
        this.navigation = navigation;
        this.speed = speed;
    }
    public void run() {
        System.out.println("차가 달린다");
        System.out.println(this.wheel.getSize());
        System.out.println(this.handle.getSize());
        System.out.println(this.navigation.getVersion());
    }
    public void speed(){
        System.out.println("시작속도 : "+ speed.getSpeed());
        speed.up(50);
        System.out.println("현재속도 : "+ speed.getSpeed());
        speed.down(20);
        System.out.println("현재속도 : "+ speed.getSpeed());
    }

    public int test(){
        return 1;
    }// 접근제어자(생략가능), 변수타입, 변수명
}
