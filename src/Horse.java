import java.util.Random;

public final class Horse extends Animal {

    public Horse(){
        Random random = new Random();
        this.availableRunDistance = 1500 + ( -300 + random.nextInt(60)*10); // 1500 +/- 300
        this.availableSwimDistance = 100;
        this.availableJumpHeight = 3;
    }

    @Override
    public void swim(int distance){

    }

    @Override
    public void run(int distance){
        super.run(distance, "Лошадь");
    }

}
