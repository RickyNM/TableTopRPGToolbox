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
