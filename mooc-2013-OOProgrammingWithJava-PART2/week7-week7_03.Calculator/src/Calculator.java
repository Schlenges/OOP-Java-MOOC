/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
public class Calculator {
    private Reader reader;
    private int stats = 0;
    
    public Calculator(){
        this.reader = new Reader();
    }
    
    private void sum(){
        int[] values = values();

        int result = values[0] + values[1];
        System.out.println("sum of the values " + result);
    }
    
    private void difference(){
        int[] values = values();

        int result = values[0] - values[1];
        System.out.println("difference of the values " + result);
    }
    
    private void product(){
        int[] values = values();

        int result = values[0] * values[1];
        System.out.println("product of the values " + result);
    }
    
    private int[] values(){
        int[] values = new int[2];
        
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        
        stats++;
        
        return values;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + stats);
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

}
