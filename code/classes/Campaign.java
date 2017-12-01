import java.util.ArrayList;
import java.io.*;

public class Campaign
{
  private ArrayList<Background> backgrounds;
  private ArrayList<Character> characters;
  private ArrayList<CharacterClass> characterClasses;
  private ArrayList<Item> items;
  private ArrayList<Map> maps;
  private ArrayList<Monster> monsters;
  private ArrayList<Race> races;
  private ArrayList<SpellAbility> spellaAbilities;

  private static String BACKGROUNDS      = "..\\Files\\Backgronds.txt";
  private static String CHARACTERS       = "..\\Files\\Characters.txt";
  private static String CHARACTERCLASSES = "..\\Files\\CharacterClasses.txt";
  private static String ITEMS            = "..\\Files\\Items.txt";
  private static String MAPS             = "..\\Files\\Maps.txt";
  private static String MONSTERS         = "..\\Files\\Monsters.txt";
  private static String RACES            = "..\\Files\\Races.txt";
  private static String SPELLABILITIES   = "..\\Files\\SpellAbilities.txt";

  public Campain()
  {
    backgrounds = new ArrayList<Background>();
    characters = new ArrayList<Characcter>();
    characterClasses = new ArrayList<CharacterClass>();
    items = new ArrayList<Item>();
    maps = new ArrayList<Map>();
    monsters = new ArrayList<Monster>();
    races = new ArrayList<Race>();
    spellaAbilities = new ArrayList<SpellAbility>();
  }

  //add remove for each
  public void addBackground(Background newBackground)
  {
    if (newBackground != null)
    {
      backgrounds.add(newBackground);
    }
  }

  public void setBackground(Background newBackground, int i)
  {
    if (i < 0 || i > backgrounds.size() || newBackground == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      backgrounds.set(i, newBackground);
    }
  }

  public Background getBackground(int i)
  {
    if (i < 0 || i > backgrounds.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return backgrounds.get(i);
  }

  public Background removeBackground(Background oldBackground)
  {
    if (oldBackground != null)
    {
      for (int i = 0; i < backgrounds.size(); i++)
      {
        if (oldBackground.getName().equals(backgrounds.get(i).getName()))
        {
          return backgrounds.remove(i);
        }
      }
    }
    return null;
  }

  public Background removeBackground(int i)
  {
    if (i >= 0 && i < backgrounds.size())
    {
      return backgrounds.remove(i);
    }
    return null;
  }

  public void addCharacter(Character newCharacter)
  {
    if (newCharacter != null)
    {
      characters.add(newCharacter);
    }
  }

  public void setCharacter(Character newCharacter, int i)
  {
    if (i < 0 || i > characters.size() || newCharacter == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      characters.set(i, newCharacter);
    }
  }

  public Character getChacter(int i)
  {
    if (i < 0 || i > characters.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return characters.get(i);
  }

  public Character removeCharacter(Character oldCharacter)
  {
    if (oldCharacter != null)
    {
      for (int i = 0; i < characters.size(); i++)
      {
        if (oldCharacter.getName().equals(characters.get(i).getName()))
        {
          return characters.remove(i);
        }
      }
    }
    return null;
  }

  public Character removeCharacter(int i)
  {
    if (i >= 0 && i < characters.size())
    {
      return characters.remove(i);
    }
    return null;
  }

  public void addCharacterClass(CharacterClass newCharacterClass)
  {
    if (newCharacterClass != null)
    {
      characterClasses.add(newCharacterClass);
    }
  }

  public void setCharacterClass(CharacterClass newCharacterClass, int i)
  {
    if (i < 0 || i > characterClasses.size() || newCharacterClass == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      characterClasses.set(i, newCharacterClass);
    }
  }

  public CharacterClass getCharacterClass(int i)
  {
    if (i < 0 || i > characterClasses.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return characterClasses.get(i);
  }

  public CharacterClass removeCharacterClass(CharacterClass oldCharacterClass)
  {
    if (oldCharacterClass != null)
    {
      for (int i = 0; i < characterClasses.size(); i++)
      {
        if (oldCharacterClass.getName().equals(characterClasses.get(i).getName()))
        {
          return characterClasses.remove(i);
        }
      }
    }
    return null;
  }

  public CharacterClass removeCharacterClass(int i)
  {
    if (i >= 0 && i < characterClasses.size())
    {
      return characterClasses.remove(i);
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

  public void addMap(Map newMap)
  {
    if (newMap != null)
    {
      maps.add(newMap);
    }
  }

  public void setMap(Map newMap, int i)
  {
    if (i < 0 || i > maps.size() || newMap == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      maps.set(i, newMap);
    }
  }

  public Map getMap(int i)
  {
    if (i < 0 || i > maps.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return maps.get(i);
  }

  public Map removeMap(Map oldMap)
  {
    if (oldMap != null)
    {
      for (int i = 0; i < maps.size(); i++)
      {
        if (oldMap.getName().equals(maps.get(i).getName()))
        {
          return maps.remove(i);
        }
      }
    }
    return null;
  }

  public Map removeMap(int i)
  {
    if (i >= 0 && i < maps.size())
    {
      return maps.remove(i);
    }
    return null;
  }

  public void addMonster(Monster newMonster)
  {
    if (newMonster != null)
    {
      monsters.add(newMonster);
    }
  }

  public void setMonster(Monster newMonster, int i)
  {
    if (i < 0 || i > monsters.size() || newMonster == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      monsters.set(i, newMonster);
    }
  }

  public Monster getMonster(int i)
  {
    if (i < 0 || i > monsters.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return monsters.get(i);
  }

  public Monster removeMonster(Monster oldMonster)
  {
    if (oldMonster != null)
    {
      for (int i = 0; i < monsters.size(); i++)
      {
        if (oldMonster.getName().equals(monsters.get(i).getName()))
        {
          return monsters.remove(i);
        }
      }
    }
    return null;
  }

  public Monster removeMonster(int i)
  {
    if (i >= 0 && i < monsters.size())
    {
      return monsters.remove(i);
    }
    return null;
  }

  public void addRace(Race newRace)
  {
    if (newRace != null)
    {
      races.add(newRace);
    }
  }

  public void setRace(Race newRace, int i)
  {
    if (i < 0 || i > races.size() || newRace == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      races.set(i, newRace);
    }
  }

  public Race getRace(int i)
  {
    if (i < 0 || i > races.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return races.get(i);
  }

  public Race removeRace(Race oldRace)
  {
    if (oldRace != null)
    {
      for (int i = 0; i < races.size(); i++)
      {
        if (oldRace.getName().equals(races.get(i).getName()))
        {
          return races.remove(i);
        }
      }
    }
    return null;
  }

  public Race removeRace(int i)
  {
    if (i >= 0 && i < races.size())
    {
      return races.remove(i);
    }
    return null;
  }

  public void addSpellAbility(SpellAbility newSpellAbility)
  {
    if (newSpellAbility != null)
    {
      spellAbilities.add(newSpellAbility);
    }
  }

  public void setSpellAbility(SpellAbility newSpellAbility, int i)
  {
    if (i < 0 || i > spellAbilities.size() || newSpellAbility == null)
    {
      System.out.println("Invalid set conditions");
    }
    else
    {
      spellAbilities.set(i, newSpellAbility);
    }
  }

  public SpellAbility getSpellAbility(int i)
  {
    if (i < 0 || i > spellAbilities.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return spellAbilities.get(i);
  }

  public SpellAbility removeSpellAbility(SpellAbility oldSpellAbility)
  {
    if (oldSpellAbility != null)
    {
      for (int i = 0; i < spellAbilities.size(); i++)
      {
        if (oldSpellAbility.getName().equals(spellAbilities.get(i).getName()))
        {
          return spellAbilities.remove(i);
        }
      }
    }
    return null;
  }

  public SpellAbility removeSpellAbility(int i)
  {
    if (i >= 0 && i < spellAbilities.size())
    {
      return spellAbilities.remove(i);
    }
    return null;
  }

  public void construct()
  {
    readBackgrounds();
    readCharacters();
    readCharacterClasses();
    readItems();
    readMaps();
    readMonsters();
    readRaces();
    readSpellAbilities();
  }

  public void writeTo()
  {
    writeBackgrounds();
    writeCharacters();
    writeCharacterClasses();
    writeItems();
    writeMaps();
    writeMonsters();
    writeRaces();
    writeSpellAbilities();
  }

  private void writeBackgrounds();
  {
    try {
      FileWriter fileWriter = new FileWriter(BACKGROUNDS);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < backgrounds.size(); i++)
      {
        bufferedWriter.write(backgrounds.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }

  private void writeCharacters();
  {
    try {
      FileWriter fileWriter = new FileWriter(CHARACTERS);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < characters.size(); i++)
      {
        bufferedWriter.write(characters.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }

  private void writeCharacterClasses();
  {
    try {
      FileWriter fileWriter = new FileWriter(CHARACTERCLASSES);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < characterclasses.size(); i++)
      {
        bufferedWriter.write(characterclasses.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }

  private void writeItems();
  {
    try {
      FileWriter fileWriter = new FileWriter(ITEMS);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < items.size(); i++)
      {
        bufferedWriter.write(items.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }

  private void writeMaps();
  {
    try {
      FileWriter fileWriter = new FileWriter(MAPS);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < maps.size(); i++)
      {
        bufferedWriter.write(maps.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }

  private void writeMonsters();
  {
    try {
      FileWriter fileWriter = new FileWriter(MONSTERS);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < monsters.size(); i++)
      {
        bufferedWriter.write(monsters.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }

  private void writeRaces();
  {
    try {
      FileWriter fileWriter = new FileWriter(RACES);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < races.size(); i++)
      {
        bufferedWriter.write(races.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }

  private void writeSpellAbilities();
  {
    try {
      FileWriter fileWriter = new FileWriter(SPELLABILITIES);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < spellAbilities.size(); i++)
      {
        bufferedWriter.write(spellAbilities.get(i).toString());
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file '"+ fileName + "'");
    }
  }
}
