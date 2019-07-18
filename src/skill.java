public class skill {
	String name;
	int damage;
	int use_mp;
	
	public skill(String name,int damage,int use_mp) {
		this.name=name;
		this.damage=damage;
		this.use_mp=use_mp;
	}
	
	public void useSkill(int damage, int use_mp, monster monster, character character) {
		monster.hp -= damage;
		character.mp -= use_mp;
	}
}