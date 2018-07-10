import java.util.Random;

public final class Horse extends Animal {

    public Horse(){
        Random random = new Random();
        this.availableRunDistance = 1500 + ( -300 + random.nextInt(60)*10); // 1500 +/- 300
        this.availableSwimDistance = 100 + ( -40 + random.nextInt(8)*10); // 100 +/- 40;
        this.availableJumpHeight = 3;
    }

    @Override
    public void swim(int distance){
        System.out.println((canSwim(distance) ?
                "Лошадь доплыла" :
                "Лошадь может плыть только на расстояние до " + getAvailableSwimDistance() + " метров"));
    }

    @Override
    public void run(int distance){
        super.run(distance, "Лошадь");
    }

    @Override
    public void jumpOver(double height){
        super.jumpOver(height, "Лошадь");
    }

}
