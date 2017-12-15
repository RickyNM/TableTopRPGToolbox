/*
Item.java
Author: Ricky Morash
Version: 12.14.2017

Item is a subclass of RPGToolbox and a superclass of Accessory, Armor, Bag, and Weapon
It is ment to aid with handling all types of items
*/

public class Item extends RPGToolbox
{
  private String cost; // the cost of the item in the form of pp# gp# ep# sp# cp#
  private int weight; // the cost of the item in lb

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

/*
setCost sets the cost for the item
It checks if the string is null or blank
Should also check if it is of the right form
*/
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

/*
getCost returns the cost
*/
  public String getCost()
  {
    return cost;
  }

/*
getWeight returns the weight
*/
  public int getWeight()
  {
    return weight;
  }

/*
setWeight sets the weight
It checks if the number is negative
*/
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

/*
toString converts the Item to a string to be writen to a file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Type: Item\n" + outPut;
    outPut += "Cost: " + cost + "\n";
    outPut += "Weight: " + String.valueOf(weight) + "\n";
    return outPut;
  }
}
