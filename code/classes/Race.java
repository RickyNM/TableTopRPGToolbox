import java.util.ArrayList;

public class Race extends RPGToolbox
{
  private ArrayList<SpellAbility> abilities;
  private ArrayList<String> movement;
  private ArrayList<Integer> speed;
  private String size;
  private ArrayList<String> proficiencies;

  public Race()
  {
    super();
    abilities = new ArrayList<SpellAbility>();
    movement = new ArrayList<String>();
    speed = new ArrayList<Integer>();
    size = "";
    proficiencies = new ArrayList<String>();
  }

  public Race(String newName, String newDescription, String newPicture, ArrayList<SpellAbility> newAbilities, ArrayList<String> newMovement, ArrayList<Integer> newSpeed, String newSize, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    abilities = newAbilities;
    movement = newMovement;
    speed = newSpeed;
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

  public void addMovement(String newMovement, int newSpeed)
  {
    if (newMovement != null && newSpeed > 0 && !newMovement.trim().equals(""))
    {
      movement.add(newMovement.trim());
      speed.add(Integer.valueOf(newSpeed));
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

  public void setMovement(String newMovement, int index)
  {
    if (newMovement != null && !newMovement.trim().equals("") && index > 0 && index < movement.size())
    {
      movement.set(index, newMovement);
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

  public void setSpeed(int newSpeed, int index)
  {
    if (newSpeed > 0 && index > 0 && index < movement.size())
    {
      speed.set(index, Integer.valueOf(newSpeed));
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

  public int removeMovement(int i)
  {
    if (i >= 0 && i < movement.size())
    {
      movement.remove(i);
      return (int)speed.remove(i);
    }
    return -1;
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

  public String getProficiency(int i)
  {
    if (i < 0 || i > proficiencies.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return proficiencies.get(i);
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

  public void writeTo(String fileabilities)
  {
    //stuff
  }
}

