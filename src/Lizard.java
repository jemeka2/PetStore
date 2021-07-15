import java.util.Scanner;
import java.util.Random;

public class Lizard extends Animal{

    public void createLizard(Lizard pet){
        Random random = new Random();
        boolean randBool = random.nextBoolean();

        Scanner kybd = new Scanner(System.in);

        System.out.println("Enter name: ");
        pet.setName(kybd.nextLine());

        System.out.println("Enter type: ");
        pet.setType(kybd.nextLine());

        System.out.println("Enter a description: ");
        pet.setDesc(kybd.nextLine());

        pet.setInStock(randBool);
    }

    @Override
    public String getPet(){
        return "          \nPet Store       " +
                "\n---------------------------- " +
                "\nName:          " + super.getName() +
                "\nType:          " + super.getType() +
                "\nDescription:   " + super.getDesc() +
                "\nAvailability:  " + super.isInStock()+
                "\nThis lizard likes to walk on water";
    }
}
