
public class Main {

    public static void main(String[] args) {
        Bird chizhik = new Bird();
        chizhik.run(3);
        chizhik.run(20);
        chizhik.swim(10);
        System.out.println("-------");

        Horse plotva = new Horse();
        plotva.run(150);
        plotva.run(2000);
        System.out.println("-------");

        Dog psina = new Dog();
        psina.run(150);
        psina.run(2000);
        System.out.println("-------");

        Cat murka = new Cat();
        murka.run(150);
        murka.run(2000);
        murka.swim(10);
        System.out.println("-------");

    }
}
