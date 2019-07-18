public class character {
	String name;
	int hp;
	int mp;
	int max_hp;
	int max_mp;
	int attack_value;
	int defend_value;
	equipment weapon;
	equipment equip;
	portion hp_portion;
	portion mp_portion;
	skill skill1;

	public character(String name, int hp, int mp, int max_hp, int max_mp, int attack_value, int defend_value,
					 equipment weapon, equipment equip, portion hp_portion, portion mp_portion, skill skill1) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.max_hp = max_hp;
		this.max_mp = max_mp;
		this.attack_value = attack_value;
		this.defend_value = defend_value;
		this.weapon = weapon;
		this.equip = equip;
		this.hp_portion = hp_portion;
		this.mp_portion = mp_portion;
		this.skill1 = skill1;
		
	}
}