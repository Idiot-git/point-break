package pointBreak;
public class Character 
{
	private int Level;
	private String Name;
	private int Class;
	private double HPCap;
	private boolean priority;
	private double tempHealth;
	
	public Character()
	{
		Level = 1;
		Class = 1;
		Name = "john doe";
	}
	
	public Character(int setClass, String setName)
	{
		Level = 1;
		Class = setClass;
		Name = setName;
	}
	
	public void healthCalc()
	{
		double Health = 0;
		if(Class == 1)
		{
			Health = 100 + ((Level / 10) + 10);
		}
		if(Class == 2)
		{
			Health = 175 + ((Level / 10) + 25);
		}
		if(Class == 3)
		{
			Health = 125 + ((Level / 10) + 15);
		}
		if(Class == 4)
		{
			Health = 110 + ((Level / 10) + 10);
		}
		if(Class == 5)
		{
			Health = 200 + ((Level / 10) + 20);
		}
		if(Class == 6)
		{
			Health = 115 + ((Level / 10) + 15);
		}
		Health = Math.round(Health);
		HPCap = Health;
		tempHealth = Health;
	}
	
	public double getHealth()
	{
		return Math.round(tempHealth);
	}
	
	public double getAttack()
	{
		double Attack = 0;
		if(Class == 1)
		{
			Attack = 50 * ((((double) Level * 10) / 100) + 1);
		}
		if(Class == 2)
		{
			Attack = 60 * ((((double) Level * 10) / 100) + 1);
		}
		if(Class == 3)
		{
			Attack = 75 * ((((double) Level * 13) / 100) + 1);
		}
		if(Class == 4)
		{
			Attack = 65 * ((((double) Level * 10) / 100) + 1);
		}
		if(Class == 5)
		{
			Attack = 95 * ((((double) Level * 10) / 100) + 1);
		}
		if(Class == 6)
		{
			Attack = 100 * ((((double) Level * 15) / 100) + 1);
		}
		Attack = Math.round(Attack);
		return Attack;
	}
	
	public double getDefense()
	{
		double Defense = 0;
		if(Class == 1)
		{
			Defense = ((Level + 100) - 18) * ((((double) Class/100) * 10) + 1);
		}
		if(Class == 2)
		{
			Defense = ((Level + 150) - 15) * ((((double) Class/100) * 10) + 1);
		}
		if(Class == 3)
		{
			Defense = ((Level + 125) - 18) * ((((double) Class/100) * 10) + 1);
		}
		if(Class == 4)
		{
			Defense = ((Level + 110) - 18) * ((((double) Class/100) * 10) + 1);
		}
		if(Class == 5)
		{
			Defense = ((Level + 175) - 18) * ((((double) Class/100) * 10) + 1);
		}
		if(Class == 6)
		{
			Defense = ((Level + 100) - 18) * ((((double) Class/100) * 10) + 1);
		}
		Defense = Math.round(Defense);
		return Defense;
	}
	
	public double getSpeed()
	{
		double Speed = ((Level * (double) Class) / 10);
		Speed = Math.round(Speed);
		return Speed;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public int getLevel()
	{
		return Level;
	}
	
	public String getClassStat()
	{
		String bad = "invalid.";
		if(Class == 1)
		{
			String HG = "Handgun";
			return HG;
		}
		
		if(Class == 2)
		{
			String SMG = "Sub-Machine gun";
			return SMG;
		}
		
		if(Class == 3)
		{
			String AR = "Assault rifle";
			return AR;
		}
		
		if(Class == 4)
		{
			String LMG = "Light machine gun";
			return LMG;
		}
		
		if(Class == 5)
		{
			String SG = "Shotgun";
			return SG;
		}
		
		if(Class == 6)
		{
			String RF = "Sniper rifle";
			return RF;
		}
		return bad;
	}
	
	public void preset(int presetNumber)
	{
		if(presetNumber == 1)
		{
			Class = 3;
			Level = 1;
			Name = "M4a1";
		}
		
		if(presetNumber == 2)
		{
			Class = 1;
			Level = 1;
			Name = "G17";
		}
		
		if(presetNumber == 3)
		{
			Class = 3;
			Level = 1;
			Name = "AK12";
		}
		
		if(presetNumber == 4)
		{
			Class = 6;
			Level = 1;
			Name = "M200 intervention";
		}
		
		if(presetNumber == 5)
		{
			Class = 5;
			Level = 1;
			Name = "Spas-12";
		}
		
		if(presetNumber == 5)
		{
			Class = 4;
			Level = 1;
			Name = "Negev";
		}
		
		if(presetNumber == 7)
		{
			Class = 3;
			Level = 1;
			Name = "Aug a3";
		}
		
		if(presetNumber == 8)
		{
			Class = 3;
			Level = 1;
			Name = "G3";
		}
		
		if(presetNumber == 9)
		{
			Class = 2;
			Level = 1;
			Name = "Tec-9";
		}
		
		if(presetNumber == 10)
		{
			Class = 6;
			Level = 1;
			Name = "beowulf TCR";
		}
		
		if(presetNumber == 11)
		{
			Class = 1;
			Level = 1;
			Name = "FiveseveN";
		}
		
		if(presetNumber == 12)
		{
			Class = 4;
			Level = 1;
			Name = "M60";
		}
		
		if(presetNumber == 13)
		{
			Class = 3;
			Level = 1;
			Name = "H&k416";
		}
		
		if(presetNumber == 14)
		{
			Class = 5;
			Level = 1;
			Name = "Super Shorty";
		}
	}
	
	public void Enemy(int randomClass, int randomLevel)
	{
		if(randomClass == 1)
		{
			Class = randomClass;
			Level = randomLevel;
			Name = "Viper";
		}
		if(randomClass == 3)
		{
			Class = randomClass;
			Level = randomLevel;
			Name = "Vesper";
		}
		if(randomClass == 5)
		{
			Class = randomClass;
			Level = randomLevel;
			Name = "Vision";
		}
		if(randomClass == 6)
		{
			Class = randomClass;
			Level = randomLevel;
			Name = "Vindicator";
		}
		if(randomClass == 4)
		{
			Class = randomClass;
			Level = randomLevel;
			Name = "Veteran";
		}
		if(randomClass == 2)
		{
			Class = randomClass;
			Level = randomLevel;
			Name = "Vigil";
		}
		if(Level < 1)
		{
			Level = 1;
		}
	}
	
	public String toString()
	{
		String String = "Health: " + Math.round(this.getHealth()) + " Attack: " + this.getAttack() + " Defense: " + this.getDefense() + 
		" Speed: " + this.getSpeed() + " Name: " + this.getName() + " Level: " + this.getLevel() + " Class: " + this.getClassStat();
		return String;
	}
	
	public void setPriority()
	{
		boolean priority = true;
	}
	
	public boolean getPriority()
	{
		return priority;
	}
	
	public void dealDamage(double damage)
	{
		tempHealth -= (damage * (this.getDefense() / 100));
	}
	
	public double Damage(String attack, Character other) 
	{
		double damageNum = 0;
		if(attack.equalsIgnoreCase("Single"))
		{
			damageNum = this.getAttack();
		}
		if(attack.equalsIgnoreCase("Burst"))
		{
			damageNum = (this.getAttack() * 3);
		}
		if(attack.equalsIgnoreCase("Melee"))
		{
			damageNum = 65;
		}
		if(attack.equalsIgnoreCase("Special"))
		{
			damageNum = (this.getAttack() * 2.5);
		}
		other.dealDamage(damageNum);
		return damageNum;
	}
	
	public void giveEXP(int giveLevels, int givelevels)
	{
		this.Level += giveLevels + givelevels;
	}
	
	public void restore()
	{
		this.tempHealth = this.HPCap;
	}
}
