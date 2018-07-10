
public abstract  class Animal {

    public double availableJumpHeight = 0;
    public int availableRunDistance = 0;
    public int availableSwimDistance = 0;

    public int getAvailableRunDistance(){
        return availableRunDistance;
    }
    public int getAvailableSwimDistance(){
        return availableSwimDistance;
    }
    public double getAvailableJumpHeight(){
        return availableJumpHeight;
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


    public void jumpOver(double height){
        System.out.println((canJump(height) ?
                "Животное перепрыгнуло" :
                "Животное может прыгать только на высоту до " + getAvailableJumpHeight() + " метров") );
    }

    public void jumpOver(double height, String animalType){
        System.out.println((canJump(height) ?
                animalType + " перепрыгнула" :
                animalType + " может прыгать только на высоту до " + getAvailableJumpHeight() + " метров"));
    }

    public boolean canRun(int distance){
        return (this.availableRunDistance > distance);
    }

    public boolean canSwim(int distance){
        return (this.availableSwimDistance > distance);
    }

    public boolean canJump(double height){
        return (this.availableJumpHeight > height);
    }

}
