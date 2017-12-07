/*
 *	Character.java
 *	Author: Strider Jonak
 *	Version: 12.3.17
 *
 *	Character object used in creating
 *	player and non-player characters.
 */

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Character extends Alive {

	private String			PLAYER;
	private CharacterClass	CCLASS;
	private Background		BACKGROUND;
	private Race			RACE;
	private int				LEVEL;

	// CHARACTER CONSTRUCTOR
	public Character(String name, String align, String player,
						CharacterClass cclass, Background background, Race race,
						int health, int armor, int speed, int exp, int level,
						List<Integer> stats, List<Integer> mods, List<Integer> pros) {

		super(name, align, health, armor, speed, exp, stats, mods, pros);
		PLAYER	=	player;
		CCLASS	=	cclass;
		BACKGROUND = background;
		RACE = race;
		LEVEL = level;
	}

  public Character()
  {
    super("", "", 0, 0, 0, 0, new ArrayList<Integer>(), new ArrayList<Integer>(), new ArrayList<Integer>());
    PLAYER = "";
    CCLASS	=	new CharacterClass();
		BACKGROUND = new Background();
		RACE = new Race();
		LEVEL = 1;
  }

  public void setPlayer(String player)
  {
    if (player != null && !player.trim().equals("") )
    {
      PLAYER = player;
    }
    else
    {
      System.out.println("There is no player.");
    }
  }

  public String getPlayer()
  {
    return PLAYER;
  }

  public void setCClass(CharacterClass cclass)
  {
    if (cclass != null)
    {
      CCLASS = cclass;
    }
    else
    {
      System.out.println("There is no character class");
    }
  }

  public CharacterClass getCClass()
  {
    return CCLASS;
  }

  public void setRace(Race race)
  {
    if (race != null)
    {
      RACE = race;
    }
    else
    {
      System.out.println("There is no race");
    }
  }

  public Race getRace()
  {
    return RACE;
  }

  public void setBackground(Background background)
  {
    if (background != null)
    {
      BACKGROUND = background;
    }
    else
    {
      System.out.println("There is no background");
    }
  }

  public Background getBackground()
  {
    return BACKGROUND;
  }

  public void setLevel(int level)
  {
    if (level >= 1)
    {
      LEVEL = level;
    }
    else
    {
      System.out.println("The lowest level is 1");
    }
  }

  public int getLevel()
  {
    return LEVEL;
  }

	/*
	 *  toString()  - return a String representation of the Alive object
	 */
	public String toString() {
		return	"\nPlayer:\t"		+ PLAYER				+
				"\nClass:\t"		+ CCLASS.getName()		+
				"\nBackground:\t"	+ BACKGROUND.getName()	+
				"\nRace:\t"			+ RACE.getName()		+
				"\nLevel:\t"		+ LEVEL					+
				"\n"				+ super.toString();
	}
}

