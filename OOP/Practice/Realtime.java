class Agent{


	int playerHP = 100;

	void gunDamage(){
		System.out.println("Damage By Gun"); // gun damage is same for all agents
	}
}
class Duelist extends Agent{
	int noOfFlashes = 2;

	void flashAbility(){
		System.out.println("Flashes");  //duels have special ability of flash
	}

}

class Player{
	public static void main(String args[]){
		Duelist obj = new Duelist();
		obj.gunDamage();
		obj.flashAbility();
	}
}	
