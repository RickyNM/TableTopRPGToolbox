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

  public void addItem(Item newItem)
  {
    if (newItem != null)
    {
      contained.add(newItem);
    }
  }

  public void setItem(Item newItem, int i)
  {
    if (i < 0 || i > contained.size() || newItem == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      contained.set(i, newItem);
    }
  }

  public Item getItem(int i)
  {
    if (i < 0 || i > contained.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return contained.get(i);
  }

  public Item removeItem(Item oldItem)
  {
    if (oldItem != null)
    {
      for (int i = 0; i < contained.size(); i++)
      {
        if (oldItem.getName().equals(contained.get(i).getName()))
        {
          return contained.remove(i);
        }
      }
    }
    return null;
  }

  public Item removeItem(int i)
  {
    if (i >= 0 && i < contained.size())
    {
      return contained.remove(i);
    }
    return null;
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

  public String toString()
  {
    String outPut = super.toString();
    outPut = "Subtype: Bag\n" + outPut;
    outPut += "Contained: " + contained.toString() + "\n";
    outPut += "MaxWeight: " + String.valueOf(maxWeight) + "\n";
    outPut += "CurentWeight: " + String.valueOf(curentWeight) + "\n";
    return outPut;
  }
}
