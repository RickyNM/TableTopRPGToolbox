/*
RPGToolbox.java
Author: Ricky Morash
Version: 12.14.2017

RPGToolbox is the superclass for Alive, Background, CharacterClass, Item, Map, Race, and addSpellAbility
It is ment to aid in the handling of all the classes
*/

public class RPGToolbox
{
  private String name; // the name of the object
  private String description; // the description of the object
  private String picture; // the string of the path to the picture of the object

  public RPGToolbox()
  {
    name = "";
    description = "";
    picture = "";
  }

  public RPGToolbox(String newName, String newDescription, String newPicture)
  {
    name = newName;
    description = newDescription;
    picture = newPicture;
  }

/*
setName sets the name
It checks if the string is null or blank
*/
  public void setName(String newName)
  {
    if (newName != null && !newName.trim().equals("") )
    {
      newName = newName.trim();
      name = newName;
    }
    else
    {
      System.out.println("There is no name.");
    }
  }

/*
getName returns the name
*/
  public String getName()
  {
    return name;
  }

/*
setDescription sets the description
It checks if the string is null
*/
  public void setDescription(String newDescription)
  {
    if (newDescription != null)
    {
      description = newDescription;
    }
    else
    {
      System.out.println("There is no description.");
    }
  }

/*
getDescription returns the description
*/
  public String getDescription()
  {
    return description;
  }

/*
setPicture sets the picture
It checks if the string is null or blank
Should also check if there is a file at the location
*/
  public void setPicture(String newPicture)
  {
    if (newPicture != null && !newPicture.trim().equals("") )
    {
      newPicture = newPicture.trim();
      picture = newPicture;
    }
    else
    {
      System.out.println("There is no picture.");
    }
  }

/*
getPicture returns the path to the picture
*/
  public String getPicture()
  {
    return picture;
  }

/*
toString converts the RPGToolbox to a string for the purpose of writing it to a file
*/
  public String toString()
  {
    String outPut = "";
    outPut += "name: " + name + "\n";
    outPut += "description: " + description + "\n";
    outPut += "picture: " + picture + "\n";
    return outPut;
  }
}
