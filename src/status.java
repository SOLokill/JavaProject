public class status {

	public void 장비창(character character) {
		
		System.out.println("직업:" + character.name);
		System.out.println("체력:" + character.hp + "/" + character.max_hp);
		System.out.println("공격력:" + (character.attack_value + character.weapon.attack_value));
		System.out.println("방어력:" + (character.defend_value + character.equip.defend_value));
		System.out.println("<스킬 목록>----------------------------");
		System.out.println(character.skill1.name+"\n데미지:"+character.skill1.damage+" 소비마나:"+character.skill1.use_mp);
		System.out.println("------------------------------------");
	}
}
