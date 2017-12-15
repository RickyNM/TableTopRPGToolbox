/*
CharacterClass.java
Author: Ricky Morash
Version: 12.14.2017

CharacterClass is a subclass of RPGToolbox that is ment to handle all the different classes a character can have
*/

import java.util.ArrayList;

public class CharacterClass extends RPGToolbox
{
  private ArrayList<SpellAbility> abilities; // the lists of abilities for the class
  private ArrayList<Item> items; // the list of items that you can start with
  private int hitDie; // the number of sides on the hitDie for the class
  private ArrayList<String> proficiencies; // the ArrayList of proficiencies for the class

  public CharacterClass()
  {
    super();
    abilities = new ArrayList<SpellAbility>();
    items = new ArrayList<Item>();
    hitDie = 6;
    proficiencies = new ArrayList<String>();
  }

  public CharacterClass(String newName, String newDescription, String newPicture, ArrayList<SpellAbility> newAbilities, ArrayList<Item> newItems, int newHitDie, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    abilities = newAbilities;
    items = newItems;
    hitDie = newHitDie;
    proficiencies = newProficiencies;
  }

/*
setAbility sets the ability ArrayList
It checks if the ArrayList is null
*/
  public void setAbilities(ArrayList<SpellAbility> newAbilities)
  {
    if (newAbilities != null)
    {
      abilities = newAbilities;
    }
    else
    {
      System.out.println("There are no abilities.");
    }
  }

/*
getAbilities returns the ArrayList of abilities
It is commented out so that the user doesn't get the ArrayList
*/
/*
  public ArrayList<SpellAbility> getAbilities()
  {
    return abilities;
  }
*/

/*
setItems sets the ArrayList for items
It checks if the ArrayList is null
*/
  public void setItems(ArrayList<Item> newItems)
  {
    if (newItems != null)
    {
      items = newItems;
    }
    else
    {
      System.out.println("There is no items.");
    }
  }

/*
getItems returns the ArrayList of Items
It is commented out so that the user cannot get the ArrayList
*/
/*
  public ArrayList<Item> getItems()
  {
    return items;
  }
*/

/*
setHitDie sets the hit die
It checks if the int is not positive
*/
  public void setHitDie(int newHitDie)
  {
    if (newHitDie > 0)
    {
      hitDie = newHitDie;
    }
    else
    {
      System.out.println("There is no hitDie.");
    }
  }

/*
getHitDie returns the hit die
*/
  public int getHitDie()
  {
    return hitDie;
  }

/*
setProficiencies sets the ArrayList of proficiencies
It checks if the ArrayList is null
*/
  public void setProficiencies(ArrayList<String> newProficiencies)
  {
    if (newProficiencies != null)
    {
      proficiencies = newProficiencies;
    }
    else
    {
      System.out.println("There are no proficiencies.");
    }
  }

/*
getProficiencies returns the ArrayList of proficiencies
It is commented out so that the user cannot get the ArrayList
*/
/*
  public ArrayList<String> getProficiencies()
  {
    return proficiencies;
  }
*/

/*
addAbility adds a new SpellAbility to the ArrayList
It checks if the SpellAbility is null
*/
  public void addAbility(SpellAbility newAbility)
  {
    if (newAbility != null)
    {
      abilities.add(newAbility);
    }
  }

/*
setAbility sets the ability at the given index
It chesck if the spellAbility is null and if the index is valid
*/
  public void setAbility(SpellAbility newAbility, int i)
  {
    if (i < 0 || i > abilities.size() || newAbility == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      abilities.set(i, newAbility);
    }
  }

/*
getAbility takes an index and returns the ability at that index
It checks if the index is valid
*/
  public SpellAbility getAbility(int i)
  {
    if (i < 0 || i > abilities.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return abilities.get(i);
  }

/*
removeAbility takes a spellAbility and removes it from the ArrayList
It checks if the spellAbility is null and returns null if it is not in the list
*/
  public SpellAbility removeAbility(SpellAbility oldAbility)
  {
    if (oldAbility != null)
    {
      for (int i = 0; i < abilities.size(); i++)
      {
        if (oldAbility.getName().equals(abilities.get(i).getName()))
        {
          return abilities.remove(i);
        }
      }
    }
    return null;
  }

/*
removeAbility takes an index and removes the spellAbility from the ArrayList
It checks if the index is valid
*/
  public SpellAbility removeAbility(int i)
  {
    if (i >= 0 && i < abilities.size())
    {
      return abilities.remove(i);
    }
    return null;
  }

/*
addItem adds a new Item to the ArrayList
It checks if the Item is null
*/
  public void addItem(Item newItem)
  {
    if (newItem != null)
    {
      items.add(newItem);
    }
  }


/*
setItem takes in an index and sets the conected Item
It checks if the Item is null and if the index is valid
*/
  public void setItem(Item newItem, int i)
  {
    if (i < 0 || i > items.size() || newItem == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      items.set(i, newItem);
    }
  }

/*
getItem returns the Item at the given index
It checks if the index is valid
*/
  public Item getItem(int i)
  {
    if (i < 0 || i > items.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return items.get(i);
  }

/*
removeItem takes an Item and remove it from the ArrayList
It checks if the Item iss null and returns null if it is not in the ArrayList
*/
  public Item removeItem(Item oldItem)
  {
    if (oldItem != null)
    {
      for (int i = 0; i < items.size(); i++)
      {
        if (oldItem.getName().equals(items.get(i).getName()))
        {
          return items.remove(i);
        }
      }
    }
    return null;
  }

/*
removeItem takes an index and removes the conected Item
It checks if the index is valid
*/
  public Item removeItem(int i)
  {
    if (i >= 0 && i < items.size())
    {
      return items.remove(i);
    }
    return null;
  }

/*
addProficiency adds a new proficiency
It checks if the sring is null or blank
*/
  public void addProficiency(String newProficiency)
  {
    if (newProficiency != null && !newProficiency.trim().equals(""))
    {
      newProficiency = newProficiency.trim();
      proficiencies.add(newProficiency);
    }
  }

/*
setProficiency sets the proficiency at the given index
It checks if the index is valid and if the string is blank or null
*/
  public void setProficiency(String newProficiency, int i)
  {
    if (i < 0 || i > proficiencies.size() || newProficiency == null || newProficiency.trim().equals(""))
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      newProficiency = newProficiency.trim();
      proficiencies.set(i, newProficiency);
    }
  }

/*
removeProficiciency takes a string and removes the matching proficiency
It checks if the string is null and returns null if it is not in the ArrayList
*/
  public String removeProficiciency(String oldProficiency)
  {
    if (oldProficiency != null)
    {
      for (int i = 0; i < proficiencies.size(); i++)
      {
        if (oldProficiency.equals(proficiencies.get(i)))
        {
          return proficiencies.remove(i);
        }
      }
    }
    return null;
  }

/*
removeProficiciency takes an index and removes the conected proficiency
It checks if the index is valid
*/
  public String removeProficiciency(int i)
  {
    if (i >= 0 && i < proficiencies.size())
    {
      return proficiencies.remove(i);
    }
    return null;
  }

/*
toString converts the CharacterClass to a string to be writen to a file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Type: CharacterClass\n" + outPut;
    outPut += "Abilities: " + abilities.toString() + "\n";
    outPut += "Items" + items.toString() + "\n";
    outPut += "HitDie: " + String.valueOf(hitDie) + "\n";
    outPut += "Proficiencies: " + proficiencies.toString() + "\n";
    return outPut;
  }
}
