public class Attack extends Thread {
	public String mms;
	public monster monster;
	public character character;
	
	public void run(monster monster) {
		if (monster.name == "피카츄") {
			System.out.println("------------------------------------------------");
			System.out.println("피카! 피카!");
			System.out.println("피카츄는 백만볼트를 사용했다.");
			System.out.println("------------------------------------------------");
			character.hp -= (monster.attack_value - (character.defend_value + character.equip.defend_value));
			if (character.hp > character.max_hp) {
				character.hp = character.max_hp;
			}
			if(monster.attack_value-(character.defend_value+character.equip.defend_value)<0) {
				System.out.println("0의 데미지를 주었습니다.");
				System.out.println("------------------------------------------------");
			}
			if (character.hp < 0) {
				System.out.println(character.name + "의 체력" + "0/" + character.max_hp);
				System.out.println("------------------------------------------------");
			} else
				System.out.println(character.name + "의 체력" + character.hp + "/" + character.max_hp);
			System.out.println("------------------------------------------------");

		}
		if (monster.name == "람머스") {
			System.out.println("------------------------------------------------");
			System.out.println("구른다...");
			System.out.println("람머스는 구르기를 사용했다.");
			System.out.println("------------------------------------------------");
			character.hp -= (monster.attack_value - (character.defend_value + character.equip.defend_value));
			if (character.hp > character.max_hp) {
				character.hp = character.max_hp;
			}
			if(monster.attack_value-(character.defend_value+character.equip.defend_value)<0) {
				System.out.println("0의 데미지를 주었습니다.");
				System.out.println("------------------------------------------------");
			}
			if (character.hp < 0) {
				System.out.println(character.name + "의 체력" + "0/" + character.max_hp);
				System.out.println("------------------------------------------------");
			} else
				System.out.println(character.name + "의 체력" + character.hp + "/" + character.max_hp);
			System.out.println("------------------------------------------------");
		}
		if (monster.name == "군다") {
			System.out.println("------------------------------------------------");
			System.out.println("군다는 창을 크게 휘둘렀다!");
			System.out.println("------------------------------------------------");
			character.hp -= (monster.attack_value - (character.defend_value + character.equip.defend_value));
			if (character.hp > character.max_hp) {
				character.hp = character.max_hp;
			}
			if(monster.attack_value-(character.defend_value+character.equip.defend_value)<0) {
				System.out.println("0의 데미지를 주었습니다.");
				System.out.println("------------------------------------------------");
			}
			if (character.hp < 0) {
				System.out.println(character.name + "의 체력" + "0/" + character.max_hp);
				System.out.println("------------------------------------------------");
			} else
				System.out.println(character.name + "의 체력" + character.hp + "/" + character.max_hp);
			System.out.println("------------------------------------------------");
		}
		if (monster.name == "디아블로") {
			System.out.println("------------------------------------------------");
			System.out.println("디아블로는 불을 내뿜었다!!");
			System.out.println("------------------------------------------------");
			character.hp -= (monster.attack_value - (character.defend_value + character.equip.defend_value));
			if (character.hp > character.max_hp) {
				character.hp = character.max_hp;
			}
			if(monster.attack_value-(character.defend_value+character.equip.defend_value)<0) {
				System.out.println("0의 데미지를 주었습니다.");
				System.out.println("------------------------------------------------");
			}
			if (character.hp < 0) {
				System.out.println(character.name + "의 체력" + "0/" + character.max_hp);
				System.out.println("------------------------------------------------");
			} else
				System.out.println(character.name + "의 체력" + character.hp + "/" + character.max_hp);
			System.out.println("------------------------------------------------");
		}
	}
}
