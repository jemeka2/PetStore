import java.util.Random;
import java.util.Scanner;

public class Tarantula extends Animal{

    public void createTarantula(Tarantula spider){
        Random random = new Random();
        boolean randBool = random.nextBoolean();

        Scanner kybd = new Scanner(System.in);

        System.out.println("Enter name: ");
        spider.setName(kybd.nextLine());

        System.out.println("Enter type: ");
        spider.setType(kybd.nextLine());

        System.out.println("Enter a description: ");
        spider.setDesc(kybd.nextLine());

        spider.setInStock(randBool);
    }

    @Override
    public String getPet(){
        return "          \nSpooky Store       " +
                "\n---------------------------- " +
                "\nName:          " + super.getName() +
                "\nType:          " + super.getType() +
                "\nDescription:   " + super.getDesc() +
                "\nAvailability:  " + super.isInStock()+
                "\nThis is terrifying, why would you want this!";
    }
}
