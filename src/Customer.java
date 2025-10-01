public class Customer<Supermarket> {

    private String name;
    private SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSupermarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public String getName() {
        return name;
    }

    public SuperMarket getSuperMarkt() {
        return superMarket;
    }

    public void buyItem(String productName, int amount){

        for(Product product : superMarket.productList){
            if(product.getName().equalsIgnoreCase(productName)){
                superMarket.buyItem(product, amount);
                return;
            }
        }
//        if(product.equals("bread")){
//            superMarket.buyBread(amount);
//        } else if(product.equals("cheese")){
//            superMarket.buyCheese(amount);
//        } else if(product.equals("fruit")){
//            superMarket.buyFruit(amount);
//        } else if (product.equals("toilet paper")) {
//            superMarket.buyToiletPaper(amount);
//        }
    }


}