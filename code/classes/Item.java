public class Item extends RPGToolbox
{
  private String cost;
  private int weight;

  public Item()
  {
    super();
    cost = "";
    weight = 0;
  }

  public Item(String newName, String newDescription, String newPicture,  String newCost, int newWeight)
  {
    super(newName, newDescription, newPicture);
    cost = newCost;
    weight = newWeight;
  }

  public void setCost(String newCost)
  {
    if (newCost != null && !newCost.trim().equals("") )
    {
      cost = newCost;
    }
    else
    {
      System.out.println("There is no cost.");
    }
  }

  public String getCost()
  {
    return cost;
  }

  public int getWeight()
  {
    return weight;
  }

  public void setWeight(int newWeight)
  {
    if (newWeight >= 0)
    {
      weight = newWeight;
    }
    else
    {
      System.out.println("Cannot have a negative weight.");
    }
  }

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
