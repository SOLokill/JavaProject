public class equipment extends item {
	String name;
	int attack_value;
	int defend_value;

	public equipment(String name, int attack_value, int defend_value) {
		this.name = name;
		this.attack_value = attack_value;
		this.defend_value = defend_value;
	}

}