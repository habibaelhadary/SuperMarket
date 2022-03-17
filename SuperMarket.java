package supermarket;

import java.util.Scanner;

public class SuperMarket {

    
    public static void main(String[] args) {
       
    Scanner out=new Scanner (System.in);
        CountItem item1 = new CountItem("Yogurt",1.25,8);
        CountItem item2 = new CountItem("Egg",30,1);
 
        uncountItems item3 = new uncountItems("Cheese",58,0.5);
        uncountItems item4 = new uncountItems("Lunche",64,0.125);
 
        shopChar cart = new  shopChar();
 
        cart.additem(item1);
        cart.additem(item2);
        cart.additem(item3);
        cart.additem(item4);
 
        System.out.println("Item \tPrice \tAmount \tTotal");
        System.out.println("---------------------------");
        cart.showItem();
        System.out.println("Total Coast = \t\t" +cart.getTotelPrice()+"LE");
    }
}
