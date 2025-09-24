public class SuperMarket {

    Product bread;
    Product fruit;
    Product toiletPaper;
    Product cheese;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper) {
        this.bread = bread;
        this.fruit = fruit;
        this.toiletPaper = toiletPaper;
        this.cheese = cheese;
    }

    public void buyBread(int amount){
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount){
        buyItem(this.fruit, amount);
    }

    public void buyToiletPaper(int amount){
        buyItem(this.toiletPaper, amount);
    }

    public void buyCheese(int amount){
        buyItem(this.cheese, amount);
    }

    public void buyItem(Product product, int amount){
        if(product.getAmount() >= amount){
            IO.println("Je hebt het volgende product gekocht: " + product.getName());
            IO.println("Bonnentje: " + amount + " x " + product.getPrice() + " = " + product.getPrice() * amount + " euro.");
        }else {
            IO.println("Er is te wijnig voorraad in de winkel.");
            IO.println("Beschikbaar: " + product.getAmount());
        }
    }
}
