/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author meike
 */
public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        if(!prices.containsKey(product)){
            return -99;
        }
        
        return prices.get(product);
    }
    
    public int stock(String product){
        if(!prices.containsKey(product)){
            return 0;
        }
        
        return stocks.get(product);
    }
    
    public boolean take(String product){
        if(prices.containsKey(product) && stocks.get(product) > 0){
            int newStock = stocks.get(product) - 1;
            stocks.replace(product, newStock);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products(){        
//        Set<String> products = new HashSet<String>();
//        
//        for(String key : prices.keySet()){
//            products.add(key);
//        }
//        
//        return products;

        return stocks.keySet();
    }
}
