/*
Campaign.java
Author: Ricky Morash
Version: 12.14.2017

Campaign is a class that will house all of the information for the app
*/

import java.util.ArrayList;
import java.io.*;

public class Campaign
{
  //the lists of all of the types needed. The ones that are commented out are because the classes have not been implemented
  private ArrayList<Background> backgrounds;
  private ArrayList<Character> characters;
  private ArrayList<CharacterClass> characterClasses;
  private ArrayList<Item> items;
  //private ArrayList<Map> maps;
  //private ArrayList<Monster> monsters;
  private ArrayList<Race> races;
  private ArrayList<SpellAbility> spellAbilities;

  //the file names for all of the types
  private static String BACKGROUNDS      = "Backgronds.txt";
  private static String CHARACTERS       = "Characters.txt";
  private static String CHARACTERCLASSES = "CharacterClasses.txt";
  private static String ITEMS            = "Items.txt";
  //private static String MAPS             = "Maps.txt";
  //private static String MONSTERS         = "Monsters.txt";
  private static String RACES            = "Races.txt";
  private static String SPELLABILITIES   = "SpellAbilities.txt";

  public Campaign()
  {
    backgrounds = new ArrayList<Background>();
    characters = new ArrayList<Character>();
    characterClasses = new ArrayList<CharacterClass>();
    items = new ArrayList<Item>();
    //maps = new ArrayList<Map>();
    //monsters = new ArrayList<Monster>();
    races = new ArrayList<Race>();
    spellAbilities = new ArrayList<SpellAbility>();
  }

/*
addBackground adds a background
It checks if the Background is null
*/
  public void addBackground(Background newBackground)
  {
    if (newBackground != null)
    {
      backgrounds.add(newBackground);
    }
  }

/*
setBackground sets the background at the given index
It checks if the index is valid and if the Background is null
*/
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

/*
getBackground takes an index and returns the coonected background
It checks if the index is valid
*/
  public Background getBackground(int i)
  {
    if (i < 0 || i > backgrounds.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return backgrounds.get(i);
  }

/*
removeBackground takes a background and removes it from the ArrayList
It checks if the Background is null and returns null if it is not in the ArrayList
*/
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

/*
removeBackground takes an index and removes the connected background
It checks if the index is valid
*/
  public Background removeBackground(int i)
  {
    if (i >= 0 && i < backgrounds.size())
    {
      return backgrounds.remove(i);
    }
    return null;
  }

/*
addCharacter adds a background
It checks if the Character is null
*/
  public void addCharacter(Character newCharacter)
  {
    if (newCharacter != null)
    {
      characters.add(newCharacter);
    }
  }

/*
setCharacter sets the character at the given index
It checks if the index is valid and if the Character is null
*/
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

/*
getChacter takes an index and returns the coonected character
It checks if the index is valid
*/
  public Character getChacter(int i)
  {
    if (i < 0 || i > characters.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return characters.get(i);
  }

/*
removeCharacter takes a character and removes it from the ArrayList
It checks if the Character is null and returns null if it is not in the ArrayList
*/
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

/*
removeCharacter takes an index and removes the connected character
It checks if the index is valid
*/
  public Character removeCharacter(int i)
  {
    if (i >= 0 && i < characters.size())
    {
      return characters.remove(i);
    }
    return null;
  }

/*
addCharacterClass adds a background
It checks if the CharacterClass is null
*/
  public void addCharacterClass(CharacterClass newCharacterClass)
  {
    if (newCharacterClass != null)
    {
      characterClasses.add(newCharacterClass);
    }
  }

/*
setCharacterClass sets the character class at the given index
It checks if the index is valid and if the CharacterClass is null
*/
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

/*
getCharacterClass takes an index and returns the coonected character class
It checks if the index is valid
*/
  public CharacterClass getCharacterClass(int i)
  {
    if (i < 0 || i > characterClasses.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return characterClasses.get(i);
  }

/*
removeCharacterClass takes a character class and removes it from the ArrayList
It checks if the CharacterClass is null and returns null if it is not in the ArrayList
*/
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

/*
removeCharacterClass takes an index and removes the connected character class
It checks if the index is valid
*/
  public CharacterClass removeCharacterClass(int i)
  {
    if (i >= 0 && i < characterClasses.size())
    {
      return characterClasses.remove(i);
    }
    return null;
  }

/*
addItem adds a background
It checks if the Item is null
*/
  public void addItem(Item newItem)
  {
    if (newItem != null)
    {
      items.add(newItem);
    }
  }

/*
setItem sets the item at the given index
It checks if the index is valid and if the Item is null
*/
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

/*
getItem takes an index and returns the coonected item
It checks if the index is valid
*/
  public Item getItem(int i)
  {
    if (i < 0 || i > items.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return items.get(i);
  }

/*
removeItem takes a item and removes it from the ArrayList
It checks if the Item is null and returns null if it is not in the ArrayList
*/
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

/*
removeItem takes an index and removes the connected item
It checks if the index is valid
*/
  public Item removeItem(int i)
  {
    if (i >= 0 && i < items.size())
    {
      return items.remove(i);
    }
    return null;
  }
/*
//these are commented out because the classes have not been implemented yet

/*
addMap adds a background
It checks if the Map is null
*/
/*
  public void addMap(Map newMap)
  {
    if (newMap != null)
    {
      maps.add(newMap);
    }
  }

/*
setMap sets the map at the given index
It checks if the index is valid and if the Map is null
*/
/*
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

/*
getMap takes an index and returns the coonected map
It checks if the index is valid
*/
/*
  public Map getMap(int i)
  {
    if (i < 0 || i > maps.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return maps.get(i);
  }

/*
removeMap takes a map and removes it from the ArrayList
It checks if the Map is null and returns null if it is not in the ArrayList
*/
/*
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

/*
removeMap takes an index and removes the connected mapbackground
It checks if the index is valid
*/
/*
  public Map removeMap(int i)
  {
    if (i >= 0 && i < maps.size())
    {
      return maps.remove(i);
    }
    return null;
  }

/*
addMonster adds a background
It checks if the Monster is null
*/
/*
  public void addMonster(Monster newMonster)
  {
    if (newMonster != null)
    {
      monsters.add(newMonster);
    }
  }

/*
setMonster sets the monster at the given index
It checks if the index is valid and if the Monster is null
*/
/*
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

/*
getMonster takes an index and returns the coonected monster
It checks if the index is valid
*/
/*
  public Monster getMonster(int i)
  {
    if (i < 0 || i > monsters.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return monsters.get(i);
  }

/*
removeMonster takes a monster and removes it from the ArrayList
It checks if the Monster is null and returns null if it is not in the ArrayList
*/
/*
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

/*
removeMonster takes an index and removes the connected monster
It checks if the index is valid
*/
/*
  public Monster removeMonster(int i)
  {
    if (i >= 0 && i < monsters.size())
    {
      return monsters.remove(i);
    }
    return null;
  }
*/

/*
addRace adds a background
It checks if the Race is null
*/
  public void addRace(Race newRace)
  {
    if (newRace != null)
    {
      races.add(newRace);
    }
  }

/*
setRace sets the race at the given index
It checks if the index is valid and if the Race is null
*/
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

/*
getRace takes an index and returns the coonected race
It checks if the index is valid
*/
  public Race getRace(int i)
  {
    if (i < 0 || i > races.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return races.get(i);
  }

/*
removeRace takes a race and removes it from the ArrayList
It checks if the Race is null and returns null if it is not in the ArrayList
*/
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

/*
removeRace takes an index and removes the connected race
It checks if the index is valid
*/
  public Race removeRace(int i)
  {
    if (i >= 0 && i < races.size())
    {
      return races.remove(i);
    }
    return null;
  }

/*
addSpellAbility adds a background
It checks if the SpellAbility is null
*/
  public void addSpellAbility(SpellAbility newSpellAbility)
  {
    if (newSpellAbility != null)
    {
      spellAbilities.add(newSpellAbility);
    }
  }

/*
setSpellAbility sets the spell ability at the given index
It checks if the index is valid and if the SpellAbility is null
*/
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

/*
getSpellAbility takes an index and returns the coonected spell ability
It checks if the index is valid
*/
  public SpellAbility getSpellAbility(int i)
  {
    if (i < 0 || i > spellAbilities.size())
    {
      System.out.println("That is outside the list");
      return null;
    }
    return spellAbilities.get(i);
  }

/*
removeSpellAbility takes a spell ability and removes it from the ArrayList
It checks if the SpellAbility is null and returns null if it is not in the ArrayList
*/
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

/*
removeSpellAbility takes an index and removes the connected spell ability
It checks if the index is valid
*/
  public SpellAbility removeSpellAbility(int i)
  {
    if (i >= 0 && i < spellAbilities.size())
    {
      return spellAbilities.remove(i);
    }
    return null;
  }

/*
construct is called at the start of the program to read all of the files and get the information off of them
the methods are commented out because they are not finished
*/
  public void construct()
  {
    //readBackgrounds(BACKGROUNDS);
    //readCharacters(CHARACTERS);
    //readCharacterClasses(CHARACTERCLASSES);
    //readItems(ITEMS);
    //readMaps(MAPS);
    //readMonsters(MONSTERS);
    //readRaces(RACES);
    //readSpellAbilities(SPELLABILITIES);
  }

/*
readCharacter reads character off of the inputed file name
*/
  public void readCharacters(String fileName)
  {
    String line = null;
    Character curent;           // the diffener classes needed to construct a Character
    CharacterClass curentClass;
    Background curentBackground;
    Race curentRace;

    try
    {
      FileReader fileReader = new FileReader(fileName);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      while ((line = bufferedReader.readLine()) != null)
      {
        curent = new Character();
        if (!line.startsWith("Player:\t")) // checks if the next line is appropriate
        {
          System.out.println("Not a character terminating readCharacter.");
          bufferedReader.close();
          return;
        }

        line = line.substring(8);
        curent.setPlayer(line);  // sets the player

        if ((line = bufferedReader.readLine()) == null) // checks if there is a next line
        {
          System.out.println("Incompleate character terminating readCharacter.");
          bufferedReader.close();
          return;
        }
        if (!line.startsWith("Class:\t")) // checks if the next line is appropriate
        {
          System.out.println("Not a character terminating readCharacter.");
          bufferedReader.close();
          return;
        }

        line = line.substring(7);
        //if ((curentClass = getCharacterClass(line)) == null) // getCharacterClass(String) still needs to be implemented
        //{
        curentClass = new CharacterClass();
        curentClass.setName(line);
        //}
        curent.setCharacterClass(curentClass); // sets the CharacterClass

        if ((line = bufferedReader.readLine()) == null) // checks if there is a next line
        {
          System.out.println("Incompleate character terminating readCharacter.");
          bufferedReader.close();
          return;
        }
        if (!line.startsWith("Background:\t")) // checks if the next line is appropriate
        {
          System.out.println("Not a character terminating readCharacter.");
          bufferedReader.close();
          return;
        }

        line = line.substring(12);
        //if ((curentBackground = getBackground(line)) == null) // getBackground(String) still needs to be implemented
        //{
        curentBackground = new Background();
        curentBackground.setName(line);
        //}
        curent.setBackground(curentBackground); // sets the Background

        if ((line = bufferedReader.readLine()) == null) // checks if there is a next line
        {
          System.out.println("Incompleate character terminating readCharacter.");
          bufferedReader.close();
          return;
        }
        if (!line.startsWith("Race:\t")) // checks if the next line is appropriate
        {
          System.out.println("Not a character terminating readCharacter.");
          bufferedReader.close();
          return;
        }

        line = line.substring(6);
        //if ((curentRace = getRace(line)) == null) //getRace(String) still needs to be implemented
        //{
        curentRace = new Race();
        curentRace.setName(line);
        //}
        curent.setRace(curentRace); // sets the Race

        if ((line = bufferedReader.readLine()) == null) // checks if there is a next line
        {
          System.out.println("Incompleate character terminating readCharacter.");
          bufferedReader.close();
          return;
        }
        if (!line.startsWith("Level:\t")) // checks if the next line is appropriate
        {
          System.out.println("Not a character terminating readCharacter.");
          bufferedReader.close();
          return;
        }

        line = line.substring(7);
        curent.setLevel(Integer.parseInt(line)); sets the level

        if ((line = bufferedReader.readLine()) == null) // checks if there is a next line
        {
          System.out.println("Incompleate character terminating readCharacter.");
          bufferedReader.close();
          return;
        }
        if (!line.startsWith("Name:\t")) // checks if the next line is appropriate
        {
          System.out.println("Not a character terminating readCharacter.");
          bufferedReader.close();
          return;
        }

        line = line.substring(6);
        // continue here mothod not finnished





      }
      bufferedReader.close();
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("Unable to open file '" + fileName + "'");
    }
    catch (IOException ex)
    {
      System.out.println("Error reading file '" + fileName + "'");
    }
  }

/*
writeTo is called at the end of the program to write all f the information to the files
the ones that are commented out are commented out because the class has not been implemented
*/
  public void writeTo()
  {
    writeBackgrounds();
    writeCharacters();
    writeCharacterClasses();
    writeItems();
    //writeMaps();
    //writeMonsters();
    writeRaces();
    writeSpellAbilities();
  }

/*
writeBackgrounds writes the backgrounds to the file by geting the toString for each
*/
  private void writeBackgrounds()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(BACKGROUNDS);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < backgrounds.size(); i++)
      {
        bufferedWriter.write(backgrounds.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ BACKGROUNDS + "'");
    }
  }

/*
writeCharacters writes the characters to the file by geting the toString for each
*/
  private void writeCharacters()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(CHARACTERS);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < characters.size(); i++)
      {
        bufferedWriter.write(characters.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ CHARACTERS + "'");
    }
  }

/*
writeCharacterClasses writes the character classes to the file by geting the toString for each
*/
  private void writeCharacterClasses()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(CHARACTERCLASSES);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < characterClasses.size(); i++)
      {
        bufferedWriter.write(characterClasses.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ CHARACTERCLASSES + "'");
    }
  }

/*
writeItems writes the items to the file by geting the toString for each
*/
  private void writeItems()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(ITEMS);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < items.size(); i++)
      {
        bufferedWriter.write(items.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ ITEMS + "'");
    }
  }
/*
// these are commented out because the classes have not been implemented yet
/*
writeMaps writes the maps to the file by geting the toString for each
*/
/*
  private void writeMaps()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(MAPS);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < maps.size(); i++)
      {
        bufferedWriter.write(maps.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ MAPS + "'");
    }
  }

/*
writeMonsters writes the monsters to the file by geting the toString for each
*/
/*
  private void writeMonsters()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(MONSTERS);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < monsters.size(); i++)
      {
        bufferedWriter.write(monsters.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ MONSTERS + "'");
    }
  }
*/

/*
writeRaces writes the races to the file by geting the toString for each
*/
  private void writeRaces()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(RACES);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < races.size(); i++)
      {
        bufferedWriter.write(races.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ RACES + "'");
    }
  }

/*
writeSpellAbilities writes the spell abilities to the file by geting the toString for each
*/
  private void writeSpellAbilities()
  {
    try
    {
      FileWriter fileWriter = new FileWriter(SPELLABILITIES);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < spellAbilities.size(); i++)
      {
        bufferedWriter.write(spellAbilities.get(i).toString());
        bufferedWriter.newLine();
      }
      bufferedWriter.close();
    }
    catch (IOException ex)
    {
      System.out.println("Error writing to file '"+ SPELLABILITIES + "'");
    }
  }
}

