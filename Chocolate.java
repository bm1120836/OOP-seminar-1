


public class Chocolate extends Product{         // расширяем класс Product
    private int count;                     // количество
    public Chocolate(int price, String name, int count) {
        super(price, name);
        this.count = count;
    }
    @Override
    public String toString() {
        return super.toString() + " " + count;
    }
    
}
