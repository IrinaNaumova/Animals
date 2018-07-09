import java.util.Random;

public class Bird extends Animal{

    public Bird(){
        Random random = new Random();
        this.availableRunDistance = 5 + ( -3 + random.nextInt(6)); // 5 +/- 3
        this.availableSwimDistance = 0;
        this.availableJumpHeight = 2;
    }

    @Override
    public void swim(int distance){
        System.out.println("Птица не умеет плавать");
    }

    @Override
    public void run(int distance){
        super.run(distance, "Птичка");

    }

}
