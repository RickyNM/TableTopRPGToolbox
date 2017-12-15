/*
Race.java
Author: Ricky Morash
Version: 12.14.2017

Race is a subclass of RPGToolbox that is ment to handle all the different races
*/

import java.util.ArrayList;

public class Race extends RPGToolbox
{
  private ArrayList<SpellAbility> abilities; // the list of abilities connected to the race
  private ArrayList<String> movement; // the list of movement types connected to the race
  private ArrayList<Integer> speed; // the speeds for the associated movment
  private String size; // the size of the race
  private ArrayList<String> proficiencies; // the list of proficiencies connected to the race

  public Race()
  {
    super();
    abilities = new ArrayList<SpellAbility>();
    movement = new ArrayList<String>();
    speed = new ArrayList<Integer>();
    size = "";
    proficiencies = new ArrayList<String>();
  }

  public Race(String newName, String newDescription, String newPicture, ArrayList<SpellAbility> newAbilities, ArrayList<String> newMovement, ArrayList<Integer> newSpeed, String newSize, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    abilities = newAbilities;
    movement = newMovement;
    speed = newSpeed;
    size = newSize;
    proficiencies = newProficiencies;
  }

/*
setAbilities sets the ability list to a new ArrayList
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
It is commented out because the user should not get the full ArrayList
*/
/*
  public ArrayList<SpellAbility> getAbilities()
  {
    return abilities;
  }
*/

/*
addMovement adds a new movement type and speed to the ArrayLists
It checks if the string is null or blank and if the int is negative
*/
  public void addMovement(String newMovement, int newSpeed)
  {
    if (newMovement != null && newSpeed > 0 && !newMovement.trim().equals(""))
    {
      movement.add(newMovement.trim());
      speed.add(Integer.valueOf(newSpeed));
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

/*
setMovement sets the movement at a specific index to a new value
It checks if the string is null or blank and if the index is valid
*/
  public void setMovement(String newMovement, int index)
  {
    if (newMovement != null && !newMovement.trim().equals("") && index > 0 && index < movement.size())
    {
      movement.set(index, newMovement);
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

/*
setSpeed sets the speed at a given index
It checks if the index is valid and if the int is negative
*/
  public void setSpeed(int newSpeed, int index)
  {
    if (newSpeed > 0 && index > 0 && index < movement.size())
    {
      speed.set(index, Integer.valueOf(newSpeed));
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

/*
removeMovement removes the movement and speed at a given index and returns the speed
It checks if the index is valid
*/
  public int removeMovement(int i)
  {
    if (i >= 0 && i < movement.size())
    {
      movement.remove(i);
      return (int)speed.remove(i);
    }
    return -1;
  }

/*
setSize sets the size
It checks if the string is null or blank
*/
  public void setSize(String newSize)
  {
    if (newSize != null && !newSize.trim().equals("") )
    {
      newSize = newSize.trim();
      size = newSize;
    }
    else
    {
      System.out.println("There is no size.");
    }
  }

/*
getSize returns the size
*/
  public String getSize()
  {
    return size;
  }

/*
setProficiencies sets the proficiencies
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
It si commented out so thaat the user cannot get the ArrayList
*/
/*
  public ArrayList<String> getProficiencies()
  {
    return proficiencies;
  }
*/

/*
addProficiency adds a new proficiency
It checks if the string is null or blank
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
setProficiency sets the proficiency at a given index
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
    newProficiency = newProficiency.trim();
    proficiencies.set(i, newProficiency);
  }
}

/*
getProficiency takes an index and returns the proficiency at that index
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
removeProficiciency takes a string and removes the proficiency that has the same String
Returns null if the proficiency is not there
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
addAbility adds a new ability
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
setAbility sets the ability at a given index
It checks if the SpellAbility is null and if the index is valid
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
getAbility takes in an index and returns the connected ability
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
removeAbility takes in a SpellAbility and removes it from the ArrayList
It reurns null if the SpellAbility is not in the ArrayList
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
removeAbility takes an index and removes the connected SpellAbility
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
toString converts the Race to a string for the purpose of writing it to a file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Type: Race\n" + outPut;
    outPut += "Abilities: " + abilities.toString() + "\n";
    outPut += "Movement: " + movement.toString() + "\n";
    outPut += "Speed: " + speed.toString() + "\n";
    outPut += "Size" + size + "\n";
    outPut += "Proficiencies: " + proficiencies.toString() + "\n";
    return outPut;
  }
}
