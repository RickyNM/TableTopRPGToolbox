import java.util.*;
import java.util.List;

public class AliveTest {

	public static void main(String[] args) {

		List<Integer> stats1	= new ArrayList<>();
		List<Integer> mods1	= new ArrayList<>();
		List<Boolean> pros1	= new ArrayList<>();

		stats1.add(9);
		stats1.add(18);
		stats1.add(12);
		stats1.add(13);
		stats1.add(12);
		stats1.add(16);

		mods1.add(-1);
		mods1.add(4);
		mods1.add(1);
		mods1.add(2);
		mods1.add(1);
		mods1.add(3);

		for (int i = 0; i < 18; i++){
			pros1.add(false);
		}

		Alive player1 = new Alive(
			"Gandalf the Gray",	// NAME
			"Neutral Good",		// ALIGNMENT
			10,			// HEALTH
			8,			// ARMORCLASS
			30,			// MOVESPEED
			500,			// EXPERIENCE
			stats1,			// StatLIST
			mods1,			// ModiLIST
			pros1			// ProfLIST
		);
		System.out.println(player1.toString());
		System.out.println("<------LEVELUP----->");

		player1.setName("Gandalf the White");
		player1.setAlignment("Lawful Good");
		player1.setHealthMax(player1.getHealthMax()*5);
		player1.setHealthNow(player1.getHealthMax());
		player1.addHealthTemp(25);
		player1.subMoveSpeed(5);
		player1.addExperience(1000);

		System.out.println(player1.toString());
	}
}
