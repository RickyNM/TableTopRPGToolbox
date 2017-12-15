/*
Bag.java
Author: Ricky Morash
Version: 12.13.2017

Bag is a subclass of Item that is ment to deal with all items that can contain other items.
*/

import java.util.ArrayList;

public class Bag extends Item
{
  private ArrayList<Item> contained; // the list of all items in the bag
  private int maxWeight; // the maximum weight that the bag can hold
  private int curentWeight; // the amount of weight curently in the bag

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

/*
setContained set contained to the entered ArrayList
It checks if the ArrayList is null
*/
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

/*
getContained returns the ArrayList contained
It is commented out because the user should not get the full ArrayList and should need to
do things throught the class.
*/
/*
  public ArrayList<Item> getContained()
  {
    return contained;
  }
*/

/*
addItem adds a new Item to the contained ArrayList
It checks if the Item is null first
*/
  public void addItem(Item newItem)
  {
    if (newItem != null)
    {
      contained.add(newItem);
    }
  }

/*
setItem sets a specific Item to a new Item
It checks if the index is valid and if the Item is null
*/
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

/*
getItem returns the Item at a secific index
It makes sure that the index is valid
*/
  public Item getItem(int i)
  {
    if (i < 0 || i > contained.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return contained.get(i);
  }

/*
removeItem revoves the Item with the given name
It returns the Item or null if it is not in the list
*/
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

/*
removeItem removes the Item at the designated index
It confinmes that the index is valid
*/
  public Item removeItem(int i)
  {
    if (i >= 0 && i < contained.size())
    {
      return contained.remove(i);
    }
    return null;
  }

/*
getMaxWeight returns the maxWeight to the user
*/
  public int getMaxWeight()
  {
    return maxWeight;
  }

/*
setMaxWeight sets the maxWeight
It confirms that the newMaxWeight is a positive number
*/
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

/*
getCurentWeight returns the weight of all of the items in the bag
*/
  public int getCurentWeight()
  {
    return curentWeight;
  }

/*
setCurentWeight resets the curentWeight
It makes sure that the new weight in positive
Should be phased out and have the weight of any Item add or removed when the item is
*/
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

/*
toString converts the Bag to a string to be writen to a file
*/
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
