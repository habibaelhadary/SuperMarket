
package supermarket;

public class uncountItems extends Item{
    private double weigth;
    public uncountItems(String name, double price,double we) {
        super(name, price);
        this.weigth=we;
    }

    @Override
    public double getItem() {
       return (this.weigth*getPrice());
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getWeigth() {
        return weigth;
    }
    @Override
    public String toString(){
        return "UnCountableItem{" + "weight=" + weigth + '}';
        
    }
}
