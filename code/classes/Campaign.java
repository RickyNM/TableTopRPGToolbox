import java.util.ArrayList;

public class Campaign
{
  private ArrayList<Background> backgronds;
  private ArrayList<Characcter> characters;
  private ArrayList<CharacterClass> characterClasses;
  private ArrayList<Item> items;
  private ArrayList<Map> maps;
  private ArrayList<Monster> monsters;
  private ArrayList<Race> races;
  private ArrayList<SpellAbility> spellaAbilities;

  public Campaign()
  {
    backgronds = new ArrayList<Background>();
    characters = new ArrayList<Characcter>();
    characterClasses = new ArrayList<CharacterClass>();
    items = new ArrayList<Item>();
    maps = new ArrayList<Map>();
    monsters = new ArrayList<Monster>();
    races = new ArrayList<Race>();
    spellaAbilities = new ArrayList<SpellAbility>();
  }

  //add remove for each

  public void construct()
  {
    //stuff
  }

  public void writeTo()
  {
    //stuff
  }
}
