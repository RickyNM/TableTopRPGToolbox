import java.util.ArrayList;

public class CharacterClass extends RPGToolbox
{
  private ArrayList<SpellAbility> abilities;
  private ArrayList<Item> items;
  private int hitDie;
  private ArrayList<String> proficiencies;

  public CharacterClass()
  {
    super();
    abilities = new ArrayList<SpellAbility>();
    items = new ArrayList<Item>();
    hitDie = 6;
    proficiencies = new ArrayList<String>();
  }

  public CharacterClass(String newName, String newDescription, String newPicture, ArrayList<SpellAbility> newAbilities, ArrayList<Item> newItems, int newHitDie, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    abilities = newAbilities;
    items = newItems;
    hitDie = newHitDie;
    proficiencies = newProficiencies;
  }

  public void setAbilities(ArrayList<SpellAbility> newAbilities)
  {
    if (newAbilities != null)
    {
      abilities = newAbilities;
    }
    else
    {
      System.out.println("There are no abilities.");
    }
  }

  public ArrayList<SpellAbility> getAbilities()
  {
    return abilities;
  }

  public void setAbilitys(ArrayList<Item> newItems)
  {
    if (newItems != null)
    {
      items = newItems;
    }
    else
    {
      System.out.println("There is no items.");
    }
  }

  public ArrayList<Item> getItems()
  {
    return items;
  }

  public void setHitDie(int newHitDie)
  {
    if (newHitDie > 0)
    {
      hitDie = newHitDie;
    }
    else
    {
      System.out.println("There is no hitDie.");
    }
  }

  public int getHitDie()
  {
    return hitDie;
  }

  public void setProficiencies(ArrayList<String> newProficiencies)
  {
    if (newProficiencies != null)
    {
      proficiencies = newProficiencies;
    }
    else
    {
      System.out.println("There are no proficiencies.");
    }
  }

  public ArrayList<String> getProficiencies()
  {
    return proficiencies;
  }

  public void addAbility(SpellAbility newAbility)
  {
    if (newAbility != null)
    {
      abilities.add(newAbility);
    }
  }

  public void setAbility(SpellAbility newAbility, int i)
  {
    if (i < 0 || i > abilities.size() || newAbility == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      abilities.set(i, newAbility);
    }
  }

  public SpellAbility getAbility(int i)
  {
    if (i < 0 || i > abilities.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return abilities.get(i);
  }

  public SpellAbility removeAbility(SpellAbility oldAbility)
  {
    if (oldAbility != null)
    {
      for (int i = 0; i < abilities.size(); i++)
      {
        if (oldAbility.getName().equals(abilities.get(i).getName()))
        {
          return abilities.remove(i);
        }
      }
    }
    return null;
  }

  public SpellAbility removeAbility(int i)
  {
    if (i >= 0 && i < abilities.size())
    {
      return abilities.remove(i);
    }
    return null;
  }

  public void addItem(Item newItem)
  {
    if (newItem != null)
    {
      items.add(newItem);
    }
  }

  public void setItem(Item newItem, int i)
  {
    if (i < 0 || i > items.size() || newItem == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      items.set(i, newItem);
    }
  }

  public Item getItem(int i)
  {
    if (i < 0 || i > items.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return items.get(i);
  }

  public Item removeItem(Item oldItem)
  {
    if (oldItem != null)
    {
      for (int i = 0; i < items.size(); i++)
      {
        if (oldItem.getName().equals(items.get(i).getName()))
        {
          return items.remove(i);
        }
      }
    }
    return null;
  }

  public Item removeItem(int i)
  {
    if (i >= 0 && i < items.size())
    {
      return items.remove(i);
    }
    return null;
  }

  public void addProficiency(String newProficiency)
  {
    if (newProficiency != null)
    {
      proficiencies.add(newProficiency);
    }
  }

  public void setProficiency(String newProficiency, int i)
  {
    if (i < 0 || i > proficiencies.size() || newProficiency == null || newProficiency.trim().equals(""))
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      proficiencies.set(i, newProficiency);
    }
  }

  public String removeProficiciency(String oldProficiency)
  {
    if (oldProficiency != null)
    {
      for (int i = 0; i < proficiencies.size(); i++)
      {
        if (oldProficiency.equals(proficiencies.get(i)))
        {
          return proficiencies.remove(i);
        }
      }
    }
    return null;
  }

  public String removeProficiciency(int i)
  {
    if (i >= 0 && i < proficiencies.size())
    {
      return proficiencies.remove(i);
    }
    return null;
  }

  public String toString()
  {
    String outPut = super.toString();
    outPut = "Type: CharacterClass\n" + outPut;
    outPut += "Abilities: " + abilities.toString() + "\n";
    outPut += "Items" + items.toString() + "\n";
    outPut += "HitDie: " + String.valueOf(hitDie) + "\n";
    outPut += "Proficiencies: " + proficiencies.toString() + "\n";
    return outPut;
  }
}
