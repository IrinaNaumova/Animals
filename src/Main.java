
public class Main {

    public static void main(String[] args) {
        Bird chizhik = new Bird();
        chizhik.run(3);
        chizhik.run(20);
        chizhik.swim(10);
        chizhik.jumpOver(0.1);
        chizhik.jumpOver(100);
        System.out.println("-------");

        Horse plotva = new Horse();
        plotva.run(150);
        plotva.run(2000);
        plotva.swim(10);
        plotva.swim(1000);
        plotva.jumpOver(1);
        plotva.jumpOver(100);
        System.out.println("-------");

        Dog psina = new Dog();
        psina.run(150);
        psina.run(2000);
        psina.swim(2);
        psina.swim(1000);
        psina.jumpOver(0.1);
        psina.jumpOver(100);
        System.out.println("-------");

        Cat murka = new Cat();
        murka.run(150);
        murka.run(2000);
        murka.swim(10);
        murka.jumpOver(1);
        murka.jumpOver(100);
        System.out.println("-------");
    }
}
