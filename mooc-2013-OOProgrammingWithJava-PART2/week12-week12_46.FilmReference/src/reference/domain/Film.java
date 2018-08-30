package reference.domain;

public class Film{

  private String name;

  public Film(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  @Override
  public String toString(){
    return "" + name;
  }

  @Override
  public boolean equals(Object object){
    if (object == null) {
      return false;
    }

    if(this.getClass() != object.getClass()) {
      return false;
    }

    Film otherFilm = (Film) object;

    if(this.hashCode() != otherFilm.hashCode()){
      return false;
    }

    return true;
  }

  @Override
  public int hashCode(){
    if(name == null) {
      return 7;
    }

    return name.hashCode();
  }
}