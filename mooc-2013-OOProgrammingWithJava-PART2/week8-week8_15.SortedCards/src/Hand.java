/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author meike
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand = new ArrayList<Card>();
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card : hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public int value(){
        int value = 0;
        
        for(Card card : hand){
            value += card.getValue();
        }
        
        return value;
    }
    
    @Override
    public int compareTo(Hand other){
        return this.value() - other.value();
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
