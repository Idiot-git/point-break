package pointBreak;
import java.util.Scanner;
import java.util.Random;
public class Battle 
{
	public static void main(String [] args)
	{
		Random Random = new Random();
		Scanner in = new Scanner(System.in);
		int turnCounter = 0;
		double enemyDamage = 0;
		String keepGoing = " ";
		double girlDamage = 0;
		Character testGirl = new Character();
		testGirl.healthCalc();
		String input = "null";
		System.out.println("Input a number between 1 and 14 for a preset: ");
		testGirl.preset(in.nextInt());
		System.out.println(testGirl.toString());
		System.out.println("Is this the one? (Y/N)");
		input = in.nextLine();
		in.nextLine();
		System.out.println("input: " + input);
		while(input.equals("Y"))
		{
			System.out.println("Input a number between 1 and 14 for a preset: ");
			testGirl.preset(in.nextInt());
			System.out.println(testGirl.toString());
			System.out.println("Is this the one? (Y/N)");
			input = in.nextLine();
			in.nextLine();
		}
		System.out.println("First battle...");
		Character Enemy = new Character();
		do
			{
			int max1 = testGirl.getLevel() + 5;
			int min1 = testGirl.getLevel() - 5;
			int ranLvl = Random.nextInt(max1 - min1) + min1;
			int max2 = 6;
			int min2 = 1;
			int rancls = Random.nextInt(max2 - min2) + min2;
			int max3 = 4;
			int min3 = 1;
			int ranhitint = Random.nextInt(max3 - min3) + min3;
			String ranhit = " ";
			if (ranhitint == 1)
			{
				ranhit = "Single";
			}
			else if (ranhitint == 2)
			{
				ranhit = "Burst";
			}
			else if (ranhitint == 3)
			{
				ranhit = "Melee";
			}
			else
			{
				ranhit = "Special";
			}
			Enemy.Enemy(rancls, ranLvl);
			Enemy.healthCalc();
				System.out.println("Enemy: " + Enemy.toString());			
				if(testGirl.getSpeed() >= Enemy.getSpeed())
				{
					testGirl.setPriority();
				}
				else
				{
					Enemy.setPriority();
				}
				do
				{
					System.out.println("Your stats: " + testGirl.toString());
					System.out.println("Your turn, you have; 'Single', 'Burst', 'Melee', 'Special'");
					input = in.nextLine();
					girlDamage = testGirl.Damage(input, Enemy);
					System.out.println("You hit the enemy for " + girlDamage + " damage!");
					if(Enemy.getHealth() > 0)
					{
						enemyDamage = Enemy.Damage(ranhit, testGirl);
						System.out.println("you have been hit for " + enemyDamage + " damage!");
					}
					turnCounter++;
					System.out.println("You have: " + testGirl.getHealth() + " HP.");
					System.out.println("The enemy has: " + Enemy.getHealth() + " HP.");
					if(testGirl.getHealth() <= 0)
					{
						System.out.println("You lose!");
					}
					else if(Enemy.getHealth() <= 0)
					{
						System.out.println("You win, this time. You earn: " + turnCounter + " exp!");
						testGirl.giveEXP(turnCounter, Enemy.getLevel());
						testGirl.restore();
					}
				}
				while(Enemy.getHealth() > 0 && testGirl.getHealth() > 0);
				System.out.println("Next Battle?");
				keepGoing = in.nextLine();
			}
		while(keepGoing.equalsIgnoreCase("Y") || keepGoing.equalsIgnoreCase("Yes"));
		if(testGirl.getHealth() >= 0)
		{
			System.out.print("You win!");
		}
		else
		{
			System.out.println("You lose...");
		}
		}
}
