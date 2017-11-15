

public class Weapon extends Item
{
  private String damage;
  private String damageType;
  private String range;
  private String hands;

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

  public String getHands()
  {
    return hands;
  }

  public void setHands(String newHands)
  {
    if (newHands != null)
    {
      hands = newHands;
    }
    else
    {
      System.out.println("There is no hands.");
    }
  }

  public void setDamage(String newDamage)
  {
    if (newDamage != null)
    {
      damage = newDamage;
    }
    else
    {
      System.out.println("There is no damage.");
    }
  }

  public String getDamage()
  {
    return damage;
  }

  public void setDamageType(String newDamageType)
  {
    if (newDamageType != null)
    {
      damageType = newDamageType;
    }
    else
    {
      System.out.println("Cannot have a negative damageType.");
    }
  }

  public String getDamageType()
  {
    return damageType;
  }

  public String getRange()
  {
    return range;
  }

  public void setRange(String newRange)
  {
    if (newRange != null)
    {
      range = newRange;
    }
    else
    {
      System.out.println("Cannot have a negative damageType.");
    }
  }

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
