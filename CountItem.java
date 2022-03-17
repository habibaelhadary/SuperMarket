package supermarket;

public class CountItem extends Item{
    private int NumOfItem;

    public CountItem(String name, double price,int item) {
        super(name, price);
        this.NumOfItem=item;
    }

    @Override
    public double getItem() {
        return (NumOfItem*getPrice());
    }

    public int getNumOfItem() {
        return NumOfItem;
    }

    public void setNumOfItem(int NumOfItem) {
        this.NumOfItem = NumOfItem;
    }
    @Override
    public String toString(){
        return "CountableItem{" + "NumOfItems=" + NumOfItem + '}';
    }
    
}
