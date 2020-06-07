package mainPackage;

import java.util.Arrays;
import java.util.Random;



import java.util.*;

public class SuperHero extends HeroProject {
	//new instance variables
	private String [] superPowers = {"Super  Speed", "Super Strenght", "Body Armor", "Flight", "Fire Generation","Weather Control"};
	//getters
	public String [] getSuperPowers() {
		return superPowers;
	}
	
	//constructor
	public SuperHero(String name) {
		super(name);
		generateRandomPowers(this.getSuperPowers());
	}
	
	//private methods++++++++++++++++++++++++++++++++++++++++++++
	private String[] generateRandomPowers(String[] superPowers) {
		int powersSelectCount = 0;
		String [] heroPowerArray = new String[3];
		int addingNewPower = 0;
		Random rand = new Random();
		
		do{
			int indexForSuperPower = rand.nextInt(6);
			heroPowerArray[addingNewPower] = getSuperPowers()[indexForSuperPower];
			removingPower(getSuperPowers(),indexForSuperPower);
			addingNewPower++;
			powersSelectCount++;
		}while(powersSelectCount<3);
		
		return heroPowerArray;
	}
	
	
	private String []	removingPower(String[] superPowers, int indexForPower) {
		for(int i = indexForPower; i<superPowers.length; i++) {
			if(indexForPower<superPowers.length) {
				superPowers = superPowers;
			}else {
				superPowers[i] = superPowers[i+1];
			}
		}
		
		return superPowers;
	}
	//public  methods++++++++++++++++++++++++++++++++++++++++++++
	public void showPowers() {
	for(int i = 0; i<generateRandomPowers(getSuperPowers()).length; i++) {
		System.out.println("This hero has " + generateRandomPowers(getSuperPowers())[i]);
	}
	}

	

}
