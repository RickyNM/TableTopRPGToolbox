/*
Accessory.java
Author: Ricky Morash
Version: 12.13.2017

Accessory is a subclass of Item ment to deal with items that are worn but are not armor.
This means that these items can have an effect when worn but will do nothing when not worn.
*/
public class Accessory extends Item
{
  private String typeOf; // the type of Accessory, ex. Ring, Necklace, etc.
  private SpellAbility effect; // the effect of the Accessory

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

/*
getTypeOf returns the string typeOf
*/
  public String getTypeOf()
  {
    return typeOf;
  }

/*
setTypeOf tries to set the type of
It checks if the entered string is null or blank
*/
  public void setTypeOf(String newTypeOf)
  {
    if (newTypeOf != null && !newTypeOf.trim().equals(""))
    {
      typeOf = newTypeOf.trim();
    }
    else
    {
      System.out.println("There is no type.");
    }
  }

/*
getEffect returns the effect
*/
  public SpellAbility getEffect()
  {
    return effect;
  }

/*
setEffect sets the effect
Checks to see if the SpellAbility is null
*/
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

/*
toString converts the Accessory to a string so that it can be stored in a text file
*/
  public String toString()
  {
    String outPut = super.toString();
    outPut = "Subtype: Accessory\n" + outPut;
    outPut += "TypeOf: " + typeOf + "\n";
    outPut += effect.toString();
    return outPut;
  }
}
