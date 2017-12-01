
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

  public String getDamage()
  {
    return damage;
  }

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

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
