/*
 *    Character.java
 *    Author: Strider Jonak
 *    Version: 12.14.2017
 *
 *    Character object used in creating
 *    player and non-player characters.
 */

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Character extends Alive {

	private String		PLAYER;		// Player Name
	private CharacterClass	CCLASS;		// Character Class
	private Background	BACKGROUND;	// Background
	private Race		RACE;		// Race
	private int		LEVEL;		// Character Level

	// CHARACTER CONSTRUCTOR
	public Character(String name, String align, String player,
		CharacterClass cclass, Background background, Race race,
		int health, int armor, int speed, int exp, int level,
		List<Integer> stats, List<Integer> mods, List<Integer> pros){

		super(name, align, health, armor, speed, exp, stats, mods, pros);
		PLAYER		= player;
		CCLASS		= cclass;
		BACKGROUND 	= background;
		RACE 		= race;
		LEVEL 		= level;
	}

	// CHARACTER CONSTRUCTOR
	public Character(){
		super("", "", 0, 0, 0, 0, new ArrayList<Integer>(), new ArrayList<Integer>(), new ArrayList<Integer>());
		PLAYER 		= "";
		CCLASS		= new CharacterClass();
		BACKGROUND 	= new Background();
		RACE 		= new Race();
		LEVEL 		= 1;
 	}

	/*  PLAYER METHODS
  	 *  getPlayer - return String PLAYER
   	 *  setPlayer - change String PLAYER
   	 */
  	public String getPlayer(){
    		return PLAYER;
  	}
  	public void setPlayer(String player){
		
    		if (player != null && !player.trim().equals("") ){
      			PLAYER = player;
    		}else{
      			System.out.println("There is no player.");
    		}
  	}

	/*  CHARACTERCLASS METHODS
  	 *  getCharacterClass - return CharacterClass CCLASS
   	 *  setCharacterClass - change CharacterClass CCLASS
   	 */
	public CharacterClass getCharacterClass(){
  		return CCLASS;
  	}
  	public void setCharacterClass(CharacterClass cclass){
    		if (cclass != null){
      			CCLASS = cclass;
    		}else{
      			System.out.println("There is no character class");
    		}
	}

	/*  RACE METHODS
  	 *  getRace - return Race RACE
   	 *  setRace - change Race RACE
   	 */
  	public Race getRace(){
    		return RACE;
  	}
  	public void setRace(Race race){
    		if (race != null){
      			RACE = race;
    		}else{
      			System.out.println("There is no race");
    		}
  	}

	/*  BACKGROUND METHODS
  	 *  getBackground - return Background BACKGROUND
   	 *  setBackground - change Background BACKGROUND
   	 */
  	public Background getBackground(){
    		return BACKGROUND;
  	}
  	public void setBackground(Background background){
    		if (background != null){
     			BACKGROUND = background;
    		}else{
      			System.out.println("There is no background");
    		}
  	}

	/*  LEVEL METHODS
  	 *  getLevel - return int LEVEL
   	 *  setLevel - change int LEVEL
   	 */
  	public int getLevel(){
    		return LEVEL;
  	}
  	public void setLevel(int level){
    		if (level >= 1){
      			LEVEL = level;
    		}else{
      			System.out.println("The lowest level is 1");
    		}
 	}

	/*
	 *  toString()  - return a String representation of the Alive object
	 */
	public String toString() {
		return	"\nPlayer:\t"		+ PLAYER		+
			"\nClass:\t"		+ CCLASS.getName()	+
			"\nBackground:\t"	+ BACKGROUND.getName()	+
			"\nRace:\t"		+ RACE.getName()	+
			"\nLevel:\t"		+ LEVEL			+
			"\n"			+ super.toString();
	}
}
