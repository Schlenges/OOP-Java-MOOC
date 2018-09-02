package reader.criteria;

public class Both implements Criterion{

  private Criterion one;
  private Criterion two;

  public Both(Criterion one, Criterion two){
    this.one = one;
    this.two = two;
  }

  @Override
  public boolean complies(String line){
    return one.complies(line) && two.complies(line); 
  }
}