import java.util.Scanner;
import java.util.Random;

public class Rabbit extends Animal{


    public void createRabbit(Rabbit animal){
        Random random = new Random();
        boolean randBool = random.nextBoolean();

        Scanner reponse = new Scanner(System.in);

        System.out.println("Enter name: ");
        animal.setName(reponse.nextLine());

        System.out.println("Enter type: ");
        animal.setType(reponse.nextLine());

        System.out.println("Enter a description: ");
        animal.setDesc(reponse.nextLine());

        animal.setInStock(randBool);
    }
    @Override
    public String getPet(){
        return "          \nPet Store       " +
                "\n---------------------------- " +
                "\nName:          " + super.getName() +
                "\nType:          " + super.getType() +
                "\nDescription:   " + super.getDesc() +
                "\nAvailability:  " + super.isInStock()+
                "\nThis bunny has floppy ears!";
    }
}
