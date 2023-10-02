import java.util.Scanner;
public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your party affiliation D for democrat, R for republican, and I for independent : ");
        String choice = scanner.next();

        switch (choice) {
            case "D":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "I":
                System.out.println("You get an independent man.");
                break;
            default:
                System.out.println("You get Other");
        }
        scanner.close();
    }
}
