public class status extends Thread {
	public status() {

	}

	public void run(character character, int num) { // i를 누르면 상태를 보여줌
		if (num == 3) {
			System.out.println("직업:" + character.name);
			System.out.println("체력:" + character.hp + "/" + character.max_hp);
			System.out.println("공격력:" + (character.attack_value + character.weapon.attack_value));
			System.out.println("방어력:" + (character.defend_value + character.equip.defend_value));
			System.out.println("<스킬 목록>----------------------------");
			System.out.println(character.skill1.name + "\n데미지:" + character.skill1.damage + "\n소비마나:" + character.skill1.use_mp);
			System.out.println("------------------------------------");
		}
		if (num == 4) {
			System.out.println("스킬1:" + character.skill1.name + "소모마나:" + character.skill1.use_mp + "데미지:"
					+ character.skill1.damage);
		}
	}
}
