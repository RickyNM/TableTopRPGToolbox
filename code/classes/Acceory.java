

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
    if (newType != null)
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
      effect = newEffect;
  }

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
