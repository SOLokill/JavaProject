
public class Daynight extends Thread {
	public monster monster;

	public Daynight(monster monster) {
		this.monster = monster;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
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
