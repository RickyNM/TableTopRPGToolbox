
public class Armor extends Item
{
  private String armorClass;
  private boolean stealth;

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

  public String getArmorClass()
  {
    return armorClass;
  }

  public void setArmorClass(String newArmorClass)
  {
    if (newArmorClass != null)
    {
      armorClass = newArmorClass;
    }
    else
    {
      System.out.println("There is no armorClass.");
    }
  }

  public boolean getStealth()
  {
    return stealth;
  }

  public void setStealth(boolean newStealth)
  {
      stealth = newStealth;
  }

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
