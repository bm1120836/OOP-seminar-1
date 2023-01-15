public class Start {
    public static void main(String[] args) {
        VendingMachine vending1 = new VendingMachine(new Product(10, "milk"));
        vending1.addProduct(new Product(20, "bread"));
        vending1.addProduct(new Raviolli(75, "Italianj", 20));
        vending1.addProduct(new Milk(12, "Parmalat", 10));
        vending1.addProduct(new Chocolate(50, "Ritter", 35));
        for(Product item : vending1.getProducts()) {
            System.out.println(item);      // выводим на экран
        }

        //Product find = vending1.find("Italianj");           // find name Italianj
        //System.out.println(find);
    }
}