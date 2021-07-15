public class Main {
    public static void main(String[] args){

        Rabbit rabbit = new Rabbit();
        Lizard lizard = new Lizard();
        Tarantula scary = new Tarantula();

        System.out.println("Welcome to the Pet store!");
        System.out.println("Create a rabbit!");
        rabbit.createRabbit(rabbit);

        System.out.println("\nCreate a lizard!");
        lizard.createLizard(lizard);

        System.out.println("\nCreate a Tarantula");
        scary.createTarantula(scary);

        System.out.println(rabbit.getPet());
        System.out.println(lizard.getPet());
        System.out.println(scary.getPet());

    }
}
