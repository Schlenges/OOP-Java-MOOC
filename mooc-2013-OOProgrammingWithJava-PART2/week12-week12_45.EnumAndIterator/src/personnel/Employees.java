package personnel;

import java.util.List;

public class Employees{
  private List<Person> employees = new List<Person>();

  public Employees(){
  }

  public void add(Person person){

  }

  public void add(List<Person> persons) adds the parameter list of people to the employees
  public void print() prints all the employees
  public void print(Education education) prints all the employees, who have the same education as the one specified as parameter
}