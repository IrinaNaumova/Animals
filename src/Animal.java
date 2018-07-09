
public abstract  class Animal {

    public double availableJumpHeight = 0;
    public int availableRunDistance = 0;
    public int availableSwimDistance = 0;

    public int getAvailableRunDistance(){
        return availableRunDistance;
    }

    public abstract void swim(int distance);

    public void run(int distance){
        System.out.println((canRun(distance) ?
                "Животное пробежало" :
                "Животное может бежать только на расстояние до " + getAvailableRunDistance() + " метров") );
    }

    public void run(int distance, String animalType){
        System.out.println((canRun(distance) ?
                animalType + " пробежала" :
                animalType + " может бежать только на расстояние до " + getAvailableRunDistance() + " метров"));
    }

    public void jumpOver(int height){

    }

    public boolean canRun(int distance){
        return (this.availableRunDistance > distance);
    }

}
