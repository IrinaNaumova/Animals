import java.util.Random;

public final class Dog extends Animal {

    public Dog(){
        Random random = new Random();
        this.availableRunDistance = 500 + ( -100 + random.nextInt(20)*10); // 500 +/- 100
        this.availableSwimDistance = 10 + ( -5 + random.nextInt(10)); // 10 +/- 5;
        this.availableJumpHeight = 0.5 +((-2 + (double)random.nextInt(4)) / 10); // 0.5 +/- 0.2
    }

    @Override
    public void swim(int distance){
        System.out.println((canSwim(distance) ?
                "Собака доплыла" :
                "Собака может плыть только на расстояние до " + getAvailableSwimDistance() + " метров"));
    }

    @Override
    public void run(int distance){
        super.run(distance, "Собака");
    }

    @Override
    public void jumpOver(double height){
        super.jumpOver(height, "Собака");
    }

}
