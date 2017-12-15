/*
Armor.java
Author: Ricky Morash
Version: 12.14.2017

Armor is a subclass of Item that is ment to deal with all armors.
*/

public class Armor extends Item
{
  private String armorClass; // the string that represents the armor class in the form of # [+ Dex, , + Dex max #]
  private boolean stealth; // a boolean that says if there is a disadvantage on stealth rolls

  public Armor()
  {
    super();
    armorClass = "10 + Dex";
    stealth = false;
  }

  public Armor(String newName, String newDescription, String newPicture,  String newCost, int newWeight, String newArmorClass, boolean newStealth)
  {
    super(newName, newDescription, newPicture, newCost, newWeight);
    armorClass = newArmorClass;
    stealth = newStealth;
  }

/*
getArmorClass returns the armor class
*/
  public String getArmorClass()
  {
    return armorClass;
  }


/*
setArmorClass sets the armor class
It checks if the string is null or blank and if there are the apropriate number of words
Should add a check for the words to be valid
*/
  public void setArmorClass(String newArmorClass)
  {
    if (newArmorClass != null && !newArmorClass.trim().equals(""))
    {
      newArmorClass = newArmorClass.trim();
      String[] words = newArmorClass.split(" ");
      if (words.length == 1 || words.length == 3 || words.length == 5) {
        armorClass = newArmorClass;
      }
      else
      {
        System.out.println("The corect format is '# + Dex' or '#' or '# + Dex Max #'.");
      }
    }
    else
    {
      System.out.println("There is no armorClass.");
    }
  }

/*
getStealth returns the boolean stealth
*/
  public boolean getStealth()
  {
    return stealth;
  }

/*
setStealth sets the stealth to the new value
*/
  public void setStealth(boolean newStealth)
  {
      stealth = newStealth;
  }

/*
toString converts the armor to a sting to be writen to a file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Subtype: Armor\n" + outPut;
    outPut += "ArmorClass: " + armorClass + "\n";
    outPut += "Stealth: " + stealth + "\n";
    return outPut;
  }
}
