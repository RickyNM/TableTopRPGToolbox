/*
Background.java
Author: Ricky Morash
Version: 12.14.2017

Background is a subclass of RPGToolbox that is ment to handle all the different backgrounds a character can have
*/

import java.util.ArrayList;

public class Background extends RPGToolbox
{
  private SpellAbility ability; // the ability of the Background
  private ArrayList<String> characterTraits; // the ArrayList of different character traits that there are suggestions for
  private ArrayList<ArrayList<String>> suggestions; // the ArrayList of ArrayLists of suggestions for each character trait
  private ArrayList<Item> items; // the list of Item that the background starts with
  private ArrayList<String> proficiencies; // the list of proficiencies that the background starts with

  public Background()
  {
    super();
    ability = new SpellAbility();
    characterTraits = new ArrayList<String>();
    suggestions = new ArrayList<ArrayList<String>>();
    items = new ArrayList<Item>();
    proficiencies = new ArrayList<String>();
  }

  public Background(String newName, String newDescription, String newPicture, SpellAbility newAbility, ArrayList<String> newCharacterTraits, ArrayList<ArrayList<String>> newSuggestions, ArrayList<Item> newItems, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    ability = newAbility;
    characterTraits = newCharacterTraits;
    suggestions = newSuggestions;
    items = newItems;
    proficiencies = newProficiencies;
  }

/* 
setAbility sets the ability
It checks it the SpellAbility is null
*/
  public void setAbility(SpellAbility newAbility)
  {
    if (newAbility != null)
    {
      ability = newAbility;
    }
    else
    {
      System.out.println("There is no ability.");
    }
  }

/*
getAbility returns the ability
*/
  public SpellAbility getAbility()
  {
    return ability;
  }

/*
addCharacterTrait adds a new character trait
It checks if the string is null or blank
Also adds a new ArrayList to suggestions
*/
  public void addCharacterTrait(String newCharacterTrait)
  {
    if (newCharacterTrait != null && !newCharacterTrait.trim().equals(""))
    {
      characterTraits.add(newCharacterTrait.trim());
      suggestions.add(new ArrayList<String>());
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

/*
setCharacterTrait takes an index and changes the character trait at that index 
It checks if the string is null or blank and if the index is valid
*/
  public void setCharacterTrait(String newCharacterTrait, int i)
  {
    if (newCharacterTrait != null && !newCharacterTrait.trim().equals("") && i > 0 && i < characterTraits.size())
    {
      characterTraits.set(i, newCharacterTrait);
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

/*
setSuggestion takes two indecies and changes the suggestion at that location
It checks if the indecies are valid and if the string is null or blank
*/
  public void setSuggestion(String newSuggestion, int i, int j)
  {
    if (newSuggestion != null && !newSuggestion.trim().equals("") && i > 0 && i < suggestions.size() && j > 0 && j < suggestions.get(i).size())
    {
      suggestions.get(i).set(j, newSuggestion.trim());
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

/*
addSuggestion adds a suggestion to the given ArrayList
It checks if the string is null or blank and if the index is valid
*/
  public void addSuggestion(String newSuggestion, int i)
  {
    if (newSuggestion != null && !newSuggestion.trim().equals("") && i > 0 && i < suggestions.size())
    {
      suggestions.get(i).add(newSuggestion.trim());
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

/*
removeSuggestion takes two indecies and removes the suggestion at that location
It checks if the indecies are valid
*/
  public String removeSuggestion(int i, int j)
  {
    if (i > 0 && i < suggestions.size() && j > 0 && j < suggestions.get(i).size())
    {
      return suggestions.get(i).remove(j);
    }
    return null;
  }

/*
removeCharacterTrait takes an index and removes the character trait and suggestions for it
It checks if the index is valid
*/
  public ArrayList<String> removeCharacterTrait(int i)
  {
    if (i >= 0 && i < characterTraits.size())
    {
      characterTraits.remove(i);
      return suggestions.remove(i);
    }
    return null;
  }

/*
setItems sets the ArrayList of Items
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
      System.out.println("There are no items.");
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
getProficiencies returns the ArrayList of the proficiencies
It is commented out so that the user cannot get the ArrayList
*/
/*
  public ArrayList<String> getProficiencies()
  {
    return proficiencies;
  }
*/

/*
addItem adds a new item
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
setItem sets the Item at the given index 
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
getItem akes an index and returns the Item 
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
removeItem takes an Item and removes it from the ArrayList
It checks if the Item is null and returns null if it is not in the ArrayList
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
removeItem takes an index and removes the connected Item 
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
addProficiency adds a proficiency 
It checks if the string is null or blank
*/
  public void addProficiency(String newProficiency)
  {
    if (newProficiency != null && !newProficiency.trim().equals(""))
    {
      proficiencies.add(newProficiency.trim());
    }
  }

/*
setProficiency sets the proficiency at the given index 
It checks if the index is valid and if the string is null or blank
*/
  public void setProficiency(String newProficiency, int i)
  {
    if (i < 0 || i > proficiencies.size() || newProficiency == null || newProficiency.trim().equals(""))
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      proficiencies.set(i, newProficiency.trim());
    }
  }

/*
getProficiency returns the proficiency at the given index 
It checks if the index is valid
*/
  public String getProficiency(int i)
  {
    if (i < 0 || i > proficiencies.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return proficiencies.get(i);
  }

/*
removeProficiciency takes a string and removes the proficiency
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
removeProficiciency takes an index and removes the connected proficiency
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
toString converts the Background to a string to be writen to a file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Type: Background\n" + outPut;
    outPut += "Ability: " + ability.toString() + "\n";
    outPut += "CharacterTraits: " + characterTraits.toString() + "\n";
    outPut += "Suggestions: " + suggestions.toString() + "\n";
    outPut += "Items" + items.toString() + "\n";
    outPut += "Proficiencies: " + proficiencies.toString() + "\n";
    return outPut;
  }
}
