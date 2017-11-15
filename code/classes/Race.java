
import java.util.Hashtable;
import java.util.ArrayList;

public class Race extends RPGToolbox
{
  private ArrayList<SpellAbility> abilities;
  private Hashtable<String, Integer> movement;
  private String size;
  private ArrayList<String> proficiencies;

  public Race()
  {
    super();
    abilities = new ArrayList<SpellAbility>();
    movement = new Hashtable<String, Integer>();
    size = "";
    proficiencies = new ArrayList<String>();
  }

  public Race(String newName, String newDescription, String newPicture, ArrayList<SpellAbility> newAbilities, Hashtable<String, Integer> newMovement, String newSize, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    abilities = newAbilities;
    movement = newMovement;
    size = newSize;
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

  public void setMovement(Hashtable<String, Integer> newMovement)
  {
    if (newMovement != null)
    {
      movement = newMovement;
    }
    else
    {
      System.out.println("There is no movement.");
    }
  }

  public Hashtable<String, Integer> getMovement()
  {
    return movement;
  }

  public void setSize(String newSize)
  {
    if (newSize != null && !newSize.trim().equals("") )
    {
      size = newSize;
    }
    else
    {
      System.out.println("There is no size.");
    }
  }

  public String getSize()
  {
    return size;
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
