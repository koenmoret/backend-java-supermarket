import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product bread;
        Product cheese;
        Product fruit;
        Product toiletPaper;
        Product drink;
        Product shampoo;
        Product soda;
        Product teethbrush;

        bread = new Product("Bread", 1.00, 10);
        cheese = new Product("Cheese", 3.60, 10);
        fruit = new Product("Fruit", 2.80, 10);
        toiletPaper = new Product("Toilet paper", 1.45, 10);
        drink = new Product("Cola", 1.10, 10);
        shampoo = new Product("Shampoo", 2.10, 10);
        soda = new Product("Soda", 2.30, 10);
        teethbrush = new Product("Teethbrush", 0.80, 10);

        ArrayList<Product> productList1 = new ArrayList<>();

        productList1.add(bread);
        productList1.add(cheese);
        productList1.add(fruit);
        productList1.add(toiletPaper);

        SuperMarket superMarketAldi = new SuperMarket("Aldi", productList1);

        ArrayList<Product> productList2 = new ArrayList<>();

        productList2.add(drink);
        productList2.add(cheese);
        productList2.add(soda);
        productList2.add(toiletPaper);

        SuperMarket superMarketJumbo = new SuperMarket("Jumbo", productList2);

        ArrayList<Product> productList3 = new ArrayList<>();

        productList3.add(shampoo);
        productList3.add(teethbrush);
        productList3.add(fruit);
        productList3.add(drink);

        SuperMarket superMarketAlberHeijn = new SuperMarket("Albert Heijn", productList3);

        Map<String, SuperMarket> superMarketMap = new HashMap<>();

        superMarketMap.put("Aldi", superMarketAldi);
        superMarketMap.put("Jumbo", superMarketJumbo);
        superMarketMap.put("Albert Heijn", superMarketAlberHeijn);

        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("Koen");
        SuperMarket superMarket = superMarketAldi;
        Boolean running = true;
        Boolean reset = true;
        int choice = 1;

        while(running) {

            if(reset) {
                IO.println("What do you want to do?");
                IO.println("1 - Pick a supermarket");
                IO.println("2 - buy a product");
                IO.println("3 - restock a product");
                IO.println("4 - exit");

                scanner = new Scanner(System.in);

                choice = Integer.parseInt(scanner.nextLine());
                reset = false;
            }

            switch (choice) {
                case 1:
                    IO.println("Naar welke supermarkt wil je?");
                    IO.println("Kies er één:");
                    IO.println("1- Aldi");
                    IO.println("2- Jumbo");
                    IO.println("3- Albert Heijn");
                    int choiceSupermarket = Integer.parseInt(scanner.nextLine());
                    String superMarketChoice = null;
                    if (choiceSupermarket == 1) {
                        superMarketChoice = "Aldi";
                    } else if (choiceSupermarket == 2) {
                        superMarketChoice = "Jumbo";
                    } else if (choiceSupermarket == 3) {
                        superMarketChoice = "Albert Heijn";
                    } else {
                        IO.println("Verkeerde keus. (1,2 or 3)");
                        break;
                    }

                    superMarket = superMarketMap.get(superMarketChoice);
                    customer.goToSupermarket(superMarket);
                    IO.println("");
                    IO.println("Je gaat naar de " + superMarket.getName() + " en wat wil je kopen?");
                    choice++;
                    break;

                case 2:
                    if (customer.getSuperMarkt() == null) {
                        IO.println("");
                        IO.println("Kies een supermarkt eerst.");
                        choice = 1;
                        break;
                    }

                    for (Product product : superMarket.getProductList()) {
                        IO.println("- " + product.getName() + " (voorraad " + product.getAmount() + ")");
                    }
                    IO.println("");
                    IO.println("Kies product of ga terug(0):");
                    String productChoice = scanner.nextLine();

                    if (productChoice.equals("0")) {
                        reset = true;
                        break;
                    }

                    Product chosenProduct = null;

                    for (Product product : superMarket.getProductList()) {
                        if (product.getName().equalsIgnoreCase(productChoice)) {
                            chosenProduct = product;
                            break;
                        }
                    }
                    IO.println("");
                    IO.println("Hoeveel wil je er kopen?");

                    int choiceAmount = Integer.parseInt(scanner.nextLine());
                    if (choiceAmount <= chosenProduct.getAmount()) {
                        customer.buyItem(productChoice, choiceAmount);
                        break;
                    } else {
                        IO.println("Er is te wijnig op voorraad!");
                    }
                    break;
                case 3:
                    IO.println("");
                    IO.println("In ontwikkeling!");
                    choice = 1;
                    break;

                case 4:
                    IO.println("");
                    IO.println("Tot ziens!");
                    running = false;
                    break;
                default:
                    IO.println("verkeerde keus");
                    break;
            }

        }


//       Scanner scanner = new Scanner(System.in);
//       IO.println("Wat is je naam");
//       String person = scanner.nextLine();
//       Customer customer1 = new Customer(person);
//       IO.println("Wat wil je kopen? (Bread, Cheese, Fruit, Toilet paper)");
//       String product = scanner.nextLine().toLowerCase();
//       IO.println("Hoeveel?");
//       int amount = Integer.parseInt(scanner.nextLine());
//       IO.println("Naar welke winkel wil je? (Aldi of Jumbo)");
//       String marketInput = scanner.nextLine();
//
//       SuperMarket chosenMarket = switch (marketInput.trim().toLowerCase()) {
//           case "aldi"  -> superMarketAldi;
//           case "jumbo" -> superMarketJumbo;
//           default -> {
//               IO.println("Onbekende winkel, ik kies Aldi.");
//               yield superMarketAldi;
//           }
//       };
//
//       IO.println(customer1.getName());
//
//       customer1.goToSupermarket(chosenMarket);
//       customer1.buyItem(product, amount);
//
//       IO.println("--------------------------------");



    }
}