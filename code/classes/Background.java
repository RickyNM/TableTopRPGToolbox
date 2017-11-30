import java.util.ArrayList;

public class Background extends RPGToolbox
{
  private SpellAbility ability;
  private ArrayList<String> characterTraits;
  private ArrayList<ArrayList<String>> suggestions;
  private ArrayList<Item> items;
  private ArrayList<String> proficiencies;

  public Background()
  {
    super();
    ability = new SpellAbility();
    characterTraits = new ArrayList<String>();
    suggestions = new ArrayList<ArrayList<String>>();
    items = new ArrayList<Item>();
    proficiencies = new ArrayList<String>();
  }

  public Background(String newName, String newDescription, String newPicture, SpellAbility newAbility, ArrayList<String> newCharacterTraits, ArrayList<ArrayList<String>> newSuggestions, ArrayList<Item> newItems, ArrayList<String> newProficiencies)
  {
    super(newName, newDescription, newPicture);
    ability = newAbility;
    characterTraits = newCharacterTraits;
    suggestions = newSuggestions;
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

  public void addCharacterTrait(String newCharacterTrait)
  {
    if (newCharacterTrait != null && !newCharacterTrait.trim().equals(""))
    {
      characterTraits.add(newCharacterTrait.trim());
      suggestions.add(new ArrayList<String>());
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

  public void setCharacterTraits(String newCharacterTrait, int i)
  {
    if (newCharacterTrait != null && !newCharacterTrait.trim().equals("") && i > 0 && i < characterTraits.size())
    {
      characterTraits.set(i, newCharacterTrait);
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

  public void setSuggestion(String newSuggestion, int i, int j)
  {
    if (newSuggestion != null && !newSuggestion.trim().equals("") && i > 0 && i < suggestions.size() && j > 0 && j < suggestions.get(i).size())
    {
      suggestions.get(i).set(j, newSuggestion);
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

  public void addSuggestion(String newSuggestion, int i)
  {
    if (newSuggestion != null && !newSuggestion.trim().equals("") && i > 0 && i < suggestions.size())
    {
      suggestions.get(i).add(newSuggestion);
    }
    else
    {
      System.out.println("That is an invalid input.");
    }
  }

  public String removeSuggestion(int i, int j)
  {
    if (i > 0 && i < suggestions.size() && j > 0 && j < suggestions.get(i).size())
    {
      return suggestions.get(i).remove(j);
    }
    return null;
  }

  public ArrayList<String> removeCharacterTrait(int i)
  {
    if (i >= 0 && i < characterTraits.size())
    {
      characterTraits.remove(i);
      return suggestions.remove(i);
    }
    return null;
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

  public void writeTo(String fileName)
  {
    //stuff
  }
}
