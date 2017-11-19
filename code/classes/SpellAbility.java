

public class SpellAbility extends RPGToolbox
{
  private String range;
  private String cost;
  private String effect;
  private int duration;
  private int level;
  private boolean concentration;

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

  public void setRange(String newRange)
  {
    if (newRange != null)
    {
      range = newRange;
    }
    else
    {
      System.out.println("There are no range.");
    }
  }

  public String getRange()
  {
    return range;
  }

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

  public String getCost()
  {
    return cost;
  }

  public void setEffect(String newEffect)
  {
    if (newEffect != null && !newEffect.trim().equals("") )
    {
      effect = newEffect;
    }
    else
    {
      System.out.println("There is no effect.");
    }
  }

  public String getEffect()
  {
    return effect;
  }

  public void setDuration(int newDuration)
  {
      duration = newDuration;
  }

  public int getDuration()
  {
    return duration;
  }

  public void setLevel(int newLevel)
  {
      level = newLevel;
  }

  public int getlevel()
  {
    return level;
  }

  public boolean getConcentration()
  {
    return concentration;
  }

  public void setConcentration(boolean newConcentration)
  {
      concentration = newConcentration;
  }

  public void writeTo(String filerange)
  {
    //stuff
  }
}
