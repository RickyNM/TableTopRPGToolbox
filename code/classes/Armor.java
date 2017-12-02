
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
    if (newArmorClass != null && !newArmorClass.trim().equals(""))
    {
      newArmorClass = newArmorClass.trim();
      String[] words = newArmorClass.split(" ");
      if (words.length == 1 || words.length == 3) {
        armorClass = newArmorClass;
      }
      else
      {
        System.out.println("The corect format is '# + Dex' or '#'.");
      }
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

  public String toString()
  {
    String outPut = super.toString();
    outPut = "Subtype: Armor\n" + outPut;
    outPut += "ArmorClass: " + armorClass + "\n";
    outPut += "Stealth: " + stealth + "\n";
    return outPut;
  }
}

