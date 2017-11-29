
import java.util.Hashtable;
import java.util.ArrayList;

public class Background extends RPGToolbox
{
  private SpellAbility ability;
  private Hashtable<String, ArrayList<String>> chacterTraites;
  private ArrayList<Item> items;
  private ArrayList<String> proficiencies;

  public Background()
  {
    super();
    ability = new SpellAbility();
    chacterTraites = new Hashtable<String, ArrayList<String>>();
    items = new ArrayList<Item>();
    proficiencies = new ArrayList<String>();
  }

  public Background(String newName, String newDescription, String newPicture, SpellAbility newAbility, Hashtable<String, ArrayList<String>> newChacterTraites, ArrayList<Item> newItems, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    ability = newAbility;
    chacterTraites = newChacterTraites;
    items = newItems;
    proficiencies = newProficiencies;
  }

  public void setAbility(SpellAbility newAbility)
  {
    if (newAbility != null)
    {
      ability = newAbility;
    }
    else
    {
      System.out.println("There is no ability.");
    }
  }

  public SpellAbility getAbility()
  {
    return ability;
  }

  public void setChacterTraites(Hashtable<String, ArrayList<String>> newChacterTraites)
  {
    if (newChacterTraites != null)
    {
      chacterTraites = newChacterTraites;
    }
    else
    {
      System.out.println("There are no chacterTraites.");
    }
  }

  public Hashtable<String, ArrayList<String>> getChacterTraites()
  {
    return chacterTraites;
  }

  public void setItems(ArrayList<Item> newItems)
  {
    if (newItems != null)
    {
      items = newItems;
    }
    else
    {
      System.out.println("There are no items.");
    }
  }

  public ArrayList<Item> getItems()
  {
    return items;
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

  public void writeTo(String fileName)
  {
    //stuff
  }
}
