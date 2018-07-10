import java.util.Random;

public final class Bird extends Animal {

    public Bird(){
        Random random = new Random();
        this.availableRunDistance = 5 + (-3 + random.nextInt(6)); // 5 +/- 3
        this.availableSwimDistance = 0;
        this.availableJumpHeight = 0.2 + ((-1 + (double)random.nextInt(2)) / 10); // 0.2 +/- 0.1
    }

    @Override
    public void swim(int distance){
        System.out.println("Птица не умеет плавать");
    }

    @Override
    public void run(int distance){
        super.run(distance, "Птичка");
    }

    @Override
    public void jumpOver(double height){
        super.jumpOver(height, "Птичка");
    }

}

