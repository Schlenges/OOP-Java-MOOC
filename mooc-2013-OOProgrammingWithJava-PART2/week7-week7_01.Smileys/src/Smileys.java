
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        int length = characterString.length();
        boolean even = length % 2 == 0;
        String smiley = ":)";
        String line = "";
        
        for(int i = 0; i < length + 6; i += 2){
            line += smiley;
        }
        
        System.out.println(line);
        
        if(even){
            System.out.println(smiley + " " + characterString + " " + smiley);
        } else {
            System.out.println(smiley + " " + characterString + "  " + smiley);
        }
        
        System.out.println(line);
        
    }

}