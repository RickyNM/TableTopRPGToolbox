/*
 *    AliveTest.java
 *    Author: Strider Jonak
 *    Version: 12.14.2017
 *
 *    Test for Alive.java.
 */

import java.util.*;
import java.util.List;

public class AliveTest {

	public static void main(String[] args) {

		// Stat Point ArrayList
		List<Integer> stats1	= new ArrayList<>();
		// Modifier Point ArrayList
		List<Integer> mods1	= new ArrayList<>();
		// Known Proficiency ArrayList
		List<Integer> pros1	= new ArrayList<>();

		// Fill Statistic List
		stats1.add(9);
		stats1.add(18);
		stats1.add(12);
		stats1.add(13);
		stats1.add(12);
		stats1.add(16);

		// Fill Modifier List
		mods1.add(-1);
		mods1.add(4);
		mods1.add(1);
		mods1.add(2);
		mods1.add(1);
		mods1.add(3);

		// Clear Proficiencies to Zero
		for (int i = 0; i < 18; i++){
			pros1.add(0);
		}

		// CharacterClass Test Object
		CharacterClass	Wizard = new CharacterClass();
		Wizard.setName("Wizard");
		// Background Test Object
		Background	Hermit = new Background();
		Hermit.setName("Hermit");
		// Race Test Object
		Race		Human = new Race();
		Human.setName("Human");

		// Character Test Object
		Character player1 = new Character(
			"Gandalf the Gray",	// NAME
			"Neutral Good",		// ALIGNMENT
			"Tolkin",		// PLAYER
			Wizard,			// CCLASS
			Hermit,			// BACKGROUND
			Human,			// RACE	
			10,			// HEALTH
			8,			// ARMORCLASS
			30,			// MOVESPEED
			500,			// EXPERIENCE
			1,			// LEVEL
			stats1,			// StatLIST
			mods1,			// ModiLIST
			pros1			// ProfLIST
		);
		
		// Print ToString
		System.out.println(player1.toString());
		System.out.println("<------LEVELUP----->");

		// Change Test Object
		player1.setName("Gandalf the White");
		player1.setAlignment("Lawful Good");
		player1.setHealthMax(player1.getHealthMax()*5);
		player1.setHealthNow(player1.getHealthMax());
		player1.addHealthTemp(25);
		player1.subMoveSpeed(5);
		player1.addExperience(1000);

		// Print ToString
		System.out.println(player1.toString());
	}
}
