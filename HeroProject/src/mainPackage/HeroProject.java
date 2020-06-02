package mainPackage;

import java.util.Random;

public class HeroProject {
	//public instance variables+++++++++++++++++
	public String name;
	
	
	//private instance variables+++++++++++++++++
	private int strenght;
	private int speed;
	private int health;
	
	
	//getters+++++++++++++++++++++++++++++++++++
	public int getStrenght() {
		return strenght;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int health() {
		return health;
	}
	
	
	//Constructor for Hero+++++++++++++++++++++++
	public HeroProject(String name) {
		this.name = name;
		generateAbilities();
	}

	
	//private methods+++++++++++++++++++++++++++++++
	private void generateAbilities() {
		this.strenght = (int)(Math.random()*100 + 1);
		this.speed = (int)(Math.random()*100 + 1);
		this.health = (int)(Math.random()*100 + 1);
	}
	
	private boolean hitAttempt() {
		boolean hitChance = false;
		Random hitTry = new Random();
		if(hitTry.nextInt(5)==1) {
			hitChance = true;
		}else {
			hitChance = false;
		}
		return hitChance;
	}
	
	private int hitDamage() {
		int damageScale = (int)(Math.random()*(6)+1);
		int damageDone = damageScale*this.getStrenght();
		return damageDone;
	}
	
	//public methods+++++++++++++++++++++++++++++++++
	
	public void fight() {
		if(hitAttempt()) {
			System.out.println(this.name + " has done " + hitDamage() + " damage");
		}else {
			System.out.println(this.name + " has missed the hit");
		}
	}
	
	public void show() {
		System.out.println(this.name + " strenght is " + this.strenght);
		System.out.println(this.name + " speed is " + this.speed);
		System.out.println(this.name + " health is " + this.health);
		fight();
	}
	
	
	
	
	
	
}
