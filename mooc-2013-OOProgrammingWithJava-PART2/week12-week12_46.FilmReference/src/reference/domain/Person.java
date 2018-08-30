package reference.domain;

public class Person{

  private String name;

  public Person(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  @Override
  public String toString(){
    return name;
  }

  @Override
  public boolean equals(Object object){
    if (object == null) {
      return false;
    }

    if(getClass() != object.getClass()) {
      return false;
    }

    Person otherPerson = (Person) object;

    if(this.name != otherPerson.getName()){
      return false;
    }

    return true;
  }

  @Override
  public int hashCode(){
    if(name == null) {
      return 3;
    }

    return name.hashCode();
  }
}