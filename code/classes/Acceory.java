

public class Accessory extends Item
{
  private String type;
  private SpellAbility effect;

  public Accessory()
  {
    super();
    type = "";
    effect = new SpellAbility();
  }

  public Accessory(String newName, String newDescription, String newPicture,  String newCost, int newWeight, String newType, SpellAbility newEffect)
  {
    super(newName, newDescription, newPicture, newCost, newWeight);
    type = newType;
    effect = newEffect;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String newType)
  {
    if (newType != null && !newType.trim().equals(""))
    {
      type = newType;
    }
    else
    {
      System.out.println("There is no type.");
    }
  }

  public SpellAbility getEffect()
  {
    return effect;
  }

  public void setEffect(SpellAbility newEffect)
  {
      if (newEffect != null) {
        effect = newEffect;
      }
      else
      {
        System.out.println("There is no effect.");
      }
  }

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
