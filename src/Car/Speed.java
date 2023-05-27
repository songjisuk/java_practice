package Car;

public class Speed {
    private int sp;

    public Speed() {
        this.sp = 0;
    }

    public void up(int increase) {
        sp += increase;
    }

    public void down(int decrease) {
        sp -= decrease;
    }

    public int getSpeed() {
        return sp;
    }

    public void speed() {
        Speed speed = new Speed();
        System.out.println("시작 속도: " + speed.getSpeed());

        speed.up(50);
        System.out.println("현재 속도: " + speed.getSpeed());

        speed.down(20);
        System.out.println("현재 속도: " + speed.getSpeed());
    }
}
