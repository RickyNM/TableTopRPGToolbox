/*
SpellAbility.java
Author: Ricky Morash
Version: 12.14.2017

SpellAbility is a subclass of RPGToolbox that is ment to handle all abilities and spells
*/

public class SpellAbility extends RPGToolbox
{
  private String range; // the range of the spell or ability
  private String cost; // the material cost of the spell or ability
  private String effect; // the effect of the spell ability
  private int duration; // the duration in rounds of combat
  private int level; // the level of the spell or required level for the ability
  private boolean concentration; // if the spell requires concentration

  public SpellAbility()
  {
    super();
    range = "";
    cost = "";
    effect = "";
    duration = 0;
    level = 0;
    concentration = false;
  }

  public SpellAbility(String newName, String newDescription, String newPicture, String newRange, String newCost, String newEffect, int newDuration, int newLevel, boolean newConcentration)
  {
    super(newName, newDescription, newPicture);
    range = newRange;
    cost = newCost;
    effect = newEffect;
    duration = newDuration;
    level = newLevel;
    concentration=newConcentration;
  }

/*
setRange sets the range for the spell or ability
It checks if the sting is null or blank
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
      System.out.println("There is no range.");
    }
  }

/*
getRange returns the range of the spell or ability
*/
  public String getRange()
  {
    return range;
  }

/*
setCost sets the cost
Checks if the string is null
*/
  public void setCost(String newCost)
  {
    if (newCost != null)
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
setEffect sets the effect
It checks if the string is null or blank
*/
  public void setEffect(String newEffect)
  {
    if (newEffect != null && !newEffect.trim().equals("") )
    {
      newEffect = newEffect.trim();
      effect = newEffect;
    }
    else
    {
      System.out.println("There is no effect.");
    }
  }

/*
getEffect returns the effect
*/
  public String getEffect()
  {
    return effect;
  }

/*
setDuration sets the duration
It checks if the int is negative
*/
  public void setDuration(int newDuration)
  {
    if (newDuration >= 0)
    {
      duration = newDuration;
    }
    else
    {
      System.out.println("You cannot have a negative duration");
    }
  }

/*
getDuration returns the duration
*/
  public int getDuration()
  {
    return duration;
  }

/*
setLevel sets the level
It checks if the int is negative
*/
  public void setLevel(int newLevel)
  {
    if (newLevel >= 0)
    {
      level = newLevel;
    }
    else
    {
      System.out.println("There are no negative spell levels");
    }
  }

/*
getLevel returns the level
*/
  public int getLevel()
  {
    return level;
  }

/*
getConcentration returns the concentration
*/
  public boolean getConcentration()
  {
    return concentration;
  }

/*
setConcentration returns the concentration
*/
  public void setConcentration(boolean newConcentration)
  {
      concentration = newConcentration;
  }

/*
toString converts the SpellAbility to a string to be writen to a file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Type: Background\n" + outPut;
    outPut += "Range: " + range + "\n";
    outPut += "Cost: " + cost + "\n";
    outPut += "Effect: " + effect + "\n";
    outPut += "Duration" + String.valueOf(duration) + "\n";
    outPut += "Level: " + String.valueOf(level) + "\n";
    outPut += "Concentration: " + String.valueOf(concentration) + "\n";
    return outPut;
  }
}

