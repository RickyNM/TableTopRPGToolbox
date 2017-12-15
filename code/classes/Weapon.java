/*
Weapon.java
Author: Ricky Morash
Version: 12.14.2017

Weapon is a subclass of Item that is ment to deal with all weapons.
*/

public class Weapon extends Item
{
  private String damage; // the string representation of the damage in the form of # + (Dex/Str)
  private String damageType; // the string of the type of damage
  private String range; // the string representation of the range in the form of #, #/#, or # #/#
  private String hands; // the string representation of the number of hands used for the weapon

  public Weapon()
  {
    super();
    damage = new String();
    damageType = "";
    range = "";
    hands = "1";
  }

  public Weapon(String newName, String newDescription, String newPicture,  String newCost, int newWeight, String newDamage, String newDamageType, String newRange, String newHands)
  {
    super(newName, newDescription, newPicture, newCost, newWeight);
    damage = newDamage;
    damageType = newDamageType;
    range = newRange;
    hands = newHands;
  }

/*
getHands returnd the hands variable
*/
  public String getHands()
  {
    return hands;
  }

/*
setHands sets the hands variable
It checks if the string is null or blank
*/
  public void setHands(String newHands)
  {
    if (newHands != null && !newHands.trim().equals(""))
    {
      newHands = newHands.trim();
      hands = newHands;
    }
    else
    {
      System.out.println("There is no hands.");
    }
  }

/*
setDamage sets the damage
It checks if the string is null or blank
Should also check if the string is of the apropriate form
*/
  public void setDamage(String newDamage)
  {
    if (newDamage != null && !newDamage.trim().equals(""))
    {
      newDamage = newDamage.trim();
      damage = newDamage;
    }
    else
    {
      System.out.println("There is no damage.");
    }
  }

/*
getDamage returns the damage
*/
  public String getDamage()
  {
    return damage;
  }

/*
setDamageType sets the damage type
It checks if the string is null or blank
*/
  public void setDamageType(String newDamageType)
  {
    if (newDamageType != null && !newDamageType.trim().equals(""))
    {
      newDamageType = newDamageType.trim();
      damageType = newDamageType;
    }
    else
    {
      System.out.println("No damageType given.");
    }
  }

/*
getDamageType returns the damage type
*/
  public String getDamageType()
  {
    return damageType;
  }

/*
getRange returns the range
*/
  public String getRange()
  {
    return range;
  }

/*
setRange sets the range
It checks if the string is null or blank
*/
  public void setRange(String newRange)
  {
    if (newRange != null && !newRange.trim().equals(""))
    {
      newRange = newRange.trim();
      range = newRange;
    }
    else
    {
      System.out.println("No range given.");
    }
  }

/*
toString converts the weapon to a string to be writen to a file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Subtype: Weapon\n" + outPut;
    outPut += "Damage: " + damage + "\n";
    outPut += "DamageType: " + damageType + "\n";
    outPut += "Range: " + range + "\n";
    outPut += "Hands: " + hands + "\n";
    return outPut;
  }
}
