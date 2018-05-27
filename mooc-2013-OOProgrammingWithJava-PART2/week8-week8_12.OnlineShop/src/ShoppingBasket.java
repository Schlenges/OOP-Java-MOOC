/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author meike
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
            return;
        }
        
        basket.put(product, new Purchase(product, 1, price));
    }
    
    public int price(){
        int price = 0;
        
        for(Purchase product : basket.values()){
            price += product.price();
        }
        
        return price;
    }
    
    public void print(){
        for(Purchase product : basket.values()){
            System.out.println(product);
        }
    }
}
