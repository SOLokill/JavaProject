public class Bloodtime extends Thread {
	public monster monster;

	public Bloodtime(monster monster) {
		this.monster = monster;
	
	public void run(monster monster) {
		do {
		int count = 0;
			count++;
			if (count % 2 == 0) {
				monster.nname = "어둠의" + monster.name;
				monster.natk = monster.attack_value * 2;
				monster.ndef = monster.defend_value * 2;
				monster.nhp = monster.hp * 2;
			
			} else {
				continue;
			}
		}
	
	}
}