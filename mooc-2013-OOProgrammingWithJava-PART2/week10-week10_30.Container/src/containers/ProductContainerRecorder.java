package containers;

public class ProductContainerRecorder extends ProductContainer{
  private ContainerHistory containerHistory = new ContainerHistory();

  public ProductContainerRecorder(String productName, double capacity, double initialVolume){
    super(productName, capacity, initialVolume);
    this.containerHistory.add(initialVolume);
  }

  public String history(){
    return containerHistory.toString();
  }
}