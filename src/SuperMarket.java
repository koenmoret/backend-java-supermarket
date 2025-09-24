public class SuperMarket {

    Product bread;
    Product fruit;
    Product toiletPaper;
    Product cheese;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper) {

        Product fake = new Product("fake",0,0);

        if(bread == null){
           this.bread = fake;
        }else {
            this.bread = bread;
        }
        if(fruit == null){
            this.fruit = fake;
        }else {
            this.fruit = fruit;
        }
        if(toiletPaper == null){
            this.toiletPaper = fake;
        }else {
            this.toiletPaper = toiletPaper;
        }
        if(cheese == null){
            this.cheese = fake;
        }else {
            this.cheese = cheese;
        }
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
