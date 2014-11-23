package game;
import ship.*;

public class runGame {
	public static void main(String[] args) {
		Ship kestrel = new Kestrel();
		Thread systemsThread = new Thread();
		io.GameWindow view = new io.GameWindow(kestrel);
	}
}
