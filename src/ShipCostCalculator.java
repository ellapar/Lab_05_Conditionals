import java.util.Scanner;
public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter price of an item");
        double itemPrice = scanner.nextDouble();

        double shippingCost = (itemPrice >= 100) ? 0 : (0.02 * itemprice);

        double totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping cost: $" + String.format("%.2f", shipping ));
        System.out.println("Total price: $" + String.format("%.2f", totalPrice));
        scanner.close();
    }
}