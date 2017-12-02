
public class Accessory extends Item
{
  private String typeOf;
  private SpellAbility effect;

  public Accessory()
  {
    super();
    typeOf = "";
    effect = new SpellAbility();
  }

  public Accessory(String newName, String newDescription, String newPicture,  String newCost, int newWeight, String newTypeOf, SpellAbility newEffect)
  {
    super(newName, newDescription, newPicture, newCost, newWeight);
    typeOf = newTypeOf;
    effect = newEffect;
  }

  public String getTypeOf()
  {
    return typeOf;
  }

  public void setTypeOf(String newTypeOf)
  {
    if (newTypeOf != null && !newTypeOf.trim().equals(""))
    {
      typeOf = newTypeOf;
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

  public String toString()
  {
    String outPut = super.toString();
    outPut = "Subtype: Accessory\n" + outPut;
    outPut += "TypeOf: " + typeOf + "\n";
    outPut += effect.toString();
    return outPut;
  }
}
