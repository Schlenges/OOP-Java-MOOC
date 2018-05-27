public class Main {
  public static void main(String[] args) {
    // write test code here
    // Person pekka = new Person("Pekka", 15, 2, 1993);
    Person pekka = new Person("Pekka", 31, 12, 2009);
        Person steve = new Person("Thomas", 1, 1, 2010);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
  }
}
