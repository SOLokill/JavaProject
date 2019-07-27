import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class BgmThread extends Thread {
	public String address;

	public BgmThread(String address) {
		this.address = address;
	}

	@Override

	public void run() {
		try {
			FileInputStream fis = new FileInputStream(address);
			Player playerName = new Player(fis);
			playerName.play();
		} catch (Exception e) {
		}
	}
}