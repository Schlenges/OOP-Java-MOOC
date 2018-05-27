/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author meike
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate) != null){
            return false;
        }
        
        owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate) == null){
            return false;
        }
        
        owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerNames = new ArrayList<String>();
        
        for(String owner : owners.values()){
            if(!ownerNames.contains(owner)){
                ownerNames.add(owner);
                System.out.println(owner);
            }
        }
    }
    
}
