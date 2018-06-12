package containers;

public class ProductContainer extends Container{
  private String productName;

  public ProductContainer(String name, double capacity){
    super(capacity);
    this.productName = name;
  }

  public ProductContainer(String name, double capacity, double volume){
    super(capacity, volume);
    this.productName = name;
  }

  public void setName(String newName){
    this.productName = newName;
  }

  public String getName(){
    return this.productName;
  }

  @Override
  public String toString(){
    return productName + ": " + super.toString();
  }
}