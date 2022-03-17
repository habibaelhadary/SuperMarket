package supermarket;
import java.util.*;
public class shopChar {
    ArrayList<Item>items=new ArrayList<>();
    public void additem(Item ite){
    items.add(ite);
}
    public double getTotelPrice(){
        double totel=0.0;
        for(Item item:items){
            if(item instanceof CountItem)
                totel+=((CountItem)item).getItem();
            else 
                totel+=((uncountItems)item).getItem();
        }
        return totel;
    }
    public void showItem(){
        CountItem item1=null;
        uncountItems item2=null;
        for (Item item:items){
            if(item instanceof CountItem){
                item1=(CountItem)item;
                System.out.println(item1.getName()+"\t"+(item1.getPrice())+"\t"+(item1.getNumOfItem())+"\t"+item1.getItem());
            }
            else{
               item2=(uncountItems)item;
                System.out.println(item2.getName()+"\t"+item2.getPrice()+"\t"+item2.getWeigth()+"\t"+item2.getItem());
            }
        }
    }
}
