
public class Bt {

	public void nbattle(monster monster, character character, skill skill) {
		System.out.println(character.name + "의 공격!!");
		System.out.println("------------------------------------------------");
		monster.hp -= ((character.attack_value + character.weapon.attack_value) - monster.ndef);
		System.out.println((character.attack_value + character.weapon.attack_value) - monster.ndef + "의 데미지를 주었습니다.");
		System.out.println("------------------------------------------------");
		if (character.hp > character.max_hp) {
			character.hp = character.max_hp;
		}
		if (monster.hp < 0) {
			System.out.println(monster.nname + "의 체력:" + "0/" + monster.max_hp);
			System.out.println("------------------------------------------------");
		} else
			System.out.println(monster.nname + "의 체력:" + monster.nhp + "/" + monster.max_hp);
		System.out.println("------------------------------------------------");
		System.out.println();
	}

	public void nbattle2(monster monster, character character) {
		System.out.println(monster.name + "의 공격!!");
		System.out.println("------------------------------------------------");
		character.hp -= (monster.natk - (character.defend_value + character.equip.defend_value));
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
