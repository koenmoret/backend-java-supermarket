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

       Customer customer1 = new Customer("Koen");
       IO.println(customer1.getName());
       customer1.goToSupermarket(superMarketAldi);
       customer1.buyItem("bread", 2);

       IO.println("---------------------");

       Customer customer2 = new Customer("Jan");
       IO.println(customer2.getName());
       customer2.goToSupermarket(superMarketJumbo);
       customer2.buyItem("bread", 12);

       IO.println("---------------------");

       Customer customer3 = new Customer("Richard");
       IO.println(customer3.getName());
       customer3.goToSupermarket(superMarketJumbo);
       customer3.buyItem("Banaan", 3);

   }
}
