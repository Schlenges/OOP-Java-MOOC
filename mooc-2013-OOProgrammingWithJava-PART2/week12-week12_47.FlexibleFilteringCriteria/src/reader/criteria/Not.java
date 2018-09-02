package reader.criteria;

public class Not implements Criterion{

  Criterion criterion;

  public Not(Criterion criterion){
    this.criterion = criterion;
  }

  @Override
  public boolean complies(String line){
    return !criterion.complies(line); 
  }
}