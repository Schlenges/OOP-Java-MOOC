package personnel;

public class Person{
  private String name;
  private Education education;

  public Person(String name, Education education){
    this.education = education;
    this.name = name;
  }

  public Education getEducation(){
    return education;
  }

  @Override
  public String toString(){
    return name + ", " + education;
  }
}