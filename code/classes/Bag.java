
import java.util.ArrayList;

public class Bag extends Item
{
  private ArrayList<Item> contained;
  private int maxWeight;
  private int curentWeight;

  public Bag()
  {
    super();
    contained = new ArrayList<Item>();
    maxWeight = 0;
    curentWeight = 0;
  }

  public Bag(String newName, String newDescription, String newPicture,  String newCost, int newWeight, ArrayList<Item> newContained, int newMaxWeight, int newCurentWeight)
  {
    super(newName, newDescription, newPicture, newCost, newWeight);
    contained = newContained;
    maxWeight = newMaxWeight;
    curentWeight = newCurentWeight;
  }

  public void setContained(ArrayList<Item> newContained)
  {
    if (newContained != null)
    {
      contained = newContained;
    }
    else
    {
      System.out.println("There is no contained.");
    }
  }

  public ArrayList<Item> getContained()
  {
    return contained;
  }

  public int getMaxWeight()
  {
    return maxWeight;
  }

  public void setMaxWeight(int newMaxWeight)
  {
    if (newMaxWeight > 0)
    {
      maxWeight = newMaxWeight;
    }
    else
    {
      System.out.println("Cannot have a negative maxWeight.");
    }
  }

  public int getCurentWeight()
  {
    return curentWeight;
  }

  public void setCurentWeight(int newCurentWeight)
  {
    if (newCurentWeight > 0)
    {
      curentWeight = newCurentWeight;
    }
    else
    {
      System.out.println("Cannot have a negative maxWeight.");
    }
  }

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
/*
    maxWeight
*/
