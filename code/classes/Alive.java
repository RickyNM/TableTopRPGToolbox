/*
 *  Alive.java
 *  Author: Strider Jonak
 *  Version: 11.30.2017
 *
 *  Superclass for living creatures that will extend
 *  both Character and Monster classes.
 */

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Alive extends RPGToolbox {

	private String NAME;
	private String ALIGNMENT;
	private int    HEALTHNOW;
	private int    HEALTHMAX;
	private int    HEALTHTEMP;
	private int    ARMORCLASS;
	private int    MOVESPEED;
	private int    EXPERIENCE;

	private List<Integer>		StatLIST	= new ArrayList<Integer>();
	private List<Integer>		ModiLIST	= new ArrayList<Integer>();
	private List<Item>		ItemLIST 	= new ArrayList<Item>();
	private List<SpellAbility> 	SpellLIST	= new ArrayList<SpellAbility>();
	private List<Integer>		ProfLIST	= new ArrayList<Integer>();

	// ALIVE CONSTRUCTOR
  	public Alive(String name, String align,
					int health, int armor, int speed, int exp,
					List<Integer> stats, List<Integer> mods, List<Integer> pros) {
  		NAME			= name;
		ALIGNMENT		= align;
  		HEALTHNOW		= health;
  		HEALTHMAX		= health;
		HEALTHTEMP		= 0;
		ARMORCLASS		= armor;
		MOVESPEED		= speed;
		EXPERIENCE		= exp;
		StatLIST		= stats;
		ModiLIST		= mods;
		ProfLIST		= pros;
	}

  /*  NAME METHODS
   *  getName - return String NAME
   *  setName - change String NAME
   */
	public String getName() {
		return NAME;
	}
	public void setName(String name) {
		NAME = name;
	}

  /*  ALIGNMENT METHODS
   *  getAlignment - return String ALIGNMENT
   *  setAlignment - change String ALIGNMENT
   */
	public String getAlignment() {
		return ALIGNMENT;
	}
	public void setAlignment(String align) {
		ALIGNMENT = align;
	}
  /*  HEALTHNOW METHODS
   *  getHealthNow - return int HEALTHNOW
   *  setHealthNow - change int HEALTHNOW
   *  addHealthNow - add int to HEALTHNOW
   *  subHealthNow - sub int from HEALTHNOW
   */
	public int getHealthNow() {
		return HEALTHNOW;
	}
	public void setHealthNow(int health) {
		HEALTHNOW = health;
	}
	public void addHealthNow(int health) {
		HEALTHNOW += health;
	}
	public void subHealthNow(int health) {
		HEALTHNOW -= health;
	}

  /*  HEALTHMAX METHODS
   *  getHealthMax - return int HEALTHMAX
   *  setHealthMax - change int HEALTHMAX
   *  addHealthMax - add int to HEALTHMAX
   *  subHealthMax - sub int from HEALTHMAX
   */
	public int getHealthMax() {
		return HEALTHMAX;
	}
	public void setHealthMax(int health) {
		HEALTHMAX = health;
	}
	public void addHealthMax(int health) {
		HEALTHMAX += health;
	}
	public void subHealthMax(int health) {
		HEALTHMAX -= health;
	}

  /*  HEALTHTEMP METHODS
   *  getHealthTemp - return int HEALTHTEMP
   *  setHealthTemp - change int HEALTHTEMP
   *  addHealthTemp - add int to HEALTHTEMP
   *  subHealthTemp - sub int from HEALTHTEMP
   */
	public int getHealthTemp() {
		return HEALTHTEMP;
	}
	public void setHealthTemp(int health) {
		HEALTHTEMP = health;
	}
	public void addHealthTemp(int health) {
		HEALTHTEMP += health;
	}
	public void subHealthTemp(int health) {
		HEALTHTEMP -= health;
	}

  /*  ARMORCLASS METHODS
   *  getArmorClass - return int ARMORCLASS
   *  setArmorClass - change int ARMORCLASS
   *  addArmorClass - add int to ARMORCLASS
   *  subArmorClass - sub int from ARMORCLASS
   */
	public int getArmorClass() {
		return ARMORCLASS;
	}
	public void setArmorClass(int armor) {
		ARMORCLASS = armor;
	}
	public void addArmorClass(int armor) {
		ARMORCLASS += armor;
	}
	public void subArmorClass(int armor) {
		ARMORCLASS -= armor;
	}

  /*  MOVESPEED METHODS
   *  getMoveSpeed - return int MOVESPEED
   *  setMoveSpeed - change int MOVESPEED
   *  addMoveSpeed - add int to MOVESPEED
   *  subMoveSpeed - sub int from MOVESPEED
   */
	public int getMoveSpeed() {
		return MOVESPEED;
	}
	public void setMoveSpeed(int speed) {
		MOVESPEED = speed;
	}
	public void addMoveSpeed(int speed) {
		MOVESPEED += speed;
	}
	public void subMoveSpeed(int speed) {
		MOVESPEED -= speed;
	}

  /*  EXPERIENCE METHODS
   *  getExperience - return int EXPERIENCE
   *  setExperience - change int EXPERIENCE
   *  addExperience - add int to EXPERIENCE
   *  subExperience - sub int from EXPERIENCE
   */
	public int getExperience() {
		return EXPERIENCE;
	}
	public void setExperience(int exp) {
		EXPERIENCE = exp;
	}
	public void addExperience(int exp) {
		EXPERIENCE += exp;
	}
	public void subExperience(int exp) {
		EXPERIENCE -= exp;
	}

	/*
	 *  toString()  - return a String representation of the Alive object
	 */
	public String toString() {
		return  "Name:\t"	+	NAME		+
			"\nAlign:\t"	+	ALIGNMENT	+
			"\nStats:\t"	+	StatLIST.toString()	+
			"\nMods:\t"	+	ModiLIST.toString()	+
			"\nPros:\t"	+	ProfLIST.toString()	+
			"\nHealth:\t"	+	HEALTHNOW	+"/"+	HEALTHMAX	+"+"+	HEALTHTEMP	+
			"\nArmor:\t"	+	ARMORCLASS	+
			"\nSpeed:\t"	+	MOVESPEED	+
			"\nExp:\t"	+	EXPERIENCE	+
				
			"\nItems:\t"	+	ItemLIST.toString()	+
			"\nSpells:\t"	+	SpellLIST.toString();
	}
}
