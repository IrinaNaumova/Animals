import java.util.Random;

public final class Cat extends Animal {

    public Cat(){
        Random random = new Random();
        this.availableRunDistance = 200 + ( -50 + random.nextInt(10)*10); // 200 +/- 50
        this.availableSwimDistance = 0;
        this.availableJumpHeight = 2;
    }

    @Override
    public void swim(int distance){
        System.out.println("Кошка не умеет плавать");
    }

    @Override
    public void run(int distance){
        super.run(distance, "Кошка");
    }

}
