import java.util.Random;

public final class Dog extends Animal {

    public Dog(){
        Random random = new Random();
        this.availableRunDistance = 500 + ( -100 + random.nextInt(20)*10); // 500 +/- 100
        this.availableSwimDistance = 10;
        this.availableJumpHeight = 0.5;
    }

    @Override
    public void swim(int distance){

    }

    @Override
    public void run(int distance){
        super.run(distance, "Собака");
    }

}
