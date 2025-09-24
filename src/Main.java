import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Product bread;
       Product cheese;
       Product fruit;
       Product toiletPaper;

       bread = new Product("Bread", 1.00, 10);
       cheese = new Product("Cheese", 3.60, 10);
       fruit = new Product("Fruit", 2.80, 10);
       toiletPaper = new Product("Toilet paper", 1.45, 10);

       SuperMarket superMarketAldi = new SuperMarket(bread, cheese, fruit, toiletPaper);

       bread = new Product("Bread", 1.80, 10);
       cheese = new Product("Cheese", 5.20, 10);
       fruit = new Product("Fruit", 3.90, 10);
       toiletPaper = new Product("Toilet paper", 2.10, 10);

       SuperMarket superMarketJumbo = new SuperMarket(bread, cheese, fruit, toiletPaper);

       Scanner scanner = new Scanner(System.in);
       IO.println("Wat is je naam");
       String person = scanner.nextLine();
       Customer customer1 = new Customer(person);
       IO.println("Wat wil je kopen? (Bread, Cheese, Fruit, Toilet paper)");
       String product = scanner.nextLine().toLowerCase();
       IO.println("Hoeveel?");
       int amount = Integer.parseInt(scanner.nextLine());
       IO.println("Naar welke winkel wil je? (Aldi of Jumbo)");
       String marketInput = scanner.nextLine();

       SuperMarket chosenMarket = switch (marketInput.trim().toLowerCase()) {
           case "aldi"  -> superMarketAldi;
           case "jumbo" -> superMarketJumbo;
           default -> {
               IO.println("Onbekende winkel, ik kies Aldi.");
               yield superMarketAldi;
           }
       };

       IO.println(customer1.getName());

       customer1.goToSupermarket(chosenMarket);
       customer1.buyItem(product, amount);

       IO.println("--------------------------------");



   }
}
