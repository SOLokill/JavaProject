
public class Mms extends Thread {
	public String mms;
	public monster monster;

	public Mms(String mms, monster monster) {
		this.mms = mms;
		this.monster = monster;
	}

	@Override
	public void run() {
		if (monster.name == "피카츄") {
			try {
				System.out.println("피카! 피카!");
				System.out.println("피카츄는 백만볼트를 사용했다.");
				Thread.sleep(1000);
				System.out.println("피카츄!");
			} catch (Exception e) {
			}
		}
		if (monster.name == "람머스") {
			try {
				System.out.println("구른다...");
				System.out.println("람머스는 구르기를 사용했다.");
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		if (monster.name == "군다") {
			try {
				System.out.println("군다는 창을 크게 휘둘렀다!");
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		if (monster.name == "디아블로") {
			try {
				System.out.println("디아블로는 불을 내뿜었다!!");
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}
	}
}
