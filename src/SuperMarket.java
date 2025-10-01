import java.util.ArrayList;

public class SuperMarket {

    private String name;
    ArrayList<Product> productList;

    public SuperMarket(String name, ArrayList<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Product> getProductList(){
        return productList;
    }

//    public void buyBread(int amount){
//        buyItem(this.bread, amount);
//    }
//
//    public void buyFruit(int amount){
//        buyItem(this.fruit, amount);
//    }
//
//    public void buyToiletPaper(int amount){
//        buyItem(this.toiletPaper, amount);
//    }
//
//    public void buyCheese(int amount){
//        buyItem(this.cheese, amount);
//    }

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
