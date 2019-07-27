public class monster {
	public String name;
	public String nname;
	public int hp;
	public int nhp;
	public int max_hp;
	public int attack_value;
	public int defend_value;
	public int atk;
	public int natk;
	public int def;
	public int ndef;

	public monster(String name, String nname, int hp, int nhp, int max_hp, int attack_value, int defend_value, int atk,
			int natk, int def, int ndef) {
		this.name = name;
		this.nname = nname;
		this.hp = hp;
		this.nhp = nhp;
		this.max_hp = max_hp;
		this.attack_value = attack_value;
		this.defend_value = defend_value;
		this.atk = atk;
		this.natk = natk;
		this.def = def;
		this.ndef = ndef;
	}
}
