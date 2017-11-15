
import java.util.ArrayList;

public class CharacterClass extends RPGToolbox
{
  private ArrayList<SpellAbility> abilities;
  private ArrayList<Item> items;
  private String health;
  private ArrayList<String> proficiencies;

  public CharacterClass()
  {
    super();
    abilities = new ArrayList<SpellAbility>();
    items = new ArrayList<Item>();
    health = "";
    proficiencies = new ArrayList<String>();
  }

  public CharacterClass(String newName, String newDescription, String newPicture, ArrayList<SpellAbility> newAbilities, ArrayList<Item> newItems, String newHealth, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    abilities = newAbilities;
    items = newItems;
    health = newHealth;
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

  public void setItems(ArrayList<Item> newItems)
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

  public void setHealth(String newHealth)
  {
    if (newHealth != null && !newHealth.trim().equals("") )
    {
      health = newHealth;
    }
    else
    {
      System.out.println("There is no health.");
    }
  }

  public String getHealth()
  {
    return health;
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

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}
