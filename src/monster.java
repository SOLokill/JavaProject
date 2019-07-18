public class monster {
	public String name;
	public int hp;
	public int max_hp;
	public int attack_value;
	public int defend_value;
	public int atk;
	public int def;

	public monster(String name, int hp, int max_hp, int attack_value, int defend_value, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.max_hp = max_hp;
		this.attack_value = attack_value;
		this.defend_value = defend_value;
		this.atk = atk;
		this.def = def;
	}
}
