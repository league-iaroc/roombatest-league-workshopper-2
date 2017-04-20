package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
driveDirect(500,500);
sleep(350);
driveDirect(250,350);
sleep(2800);
driveDirect(500,500);
sleep(1500);
driveDirect(500,400);
sleep(500);
driveDirect(500,500);
sleep(1000);
driveDirect(400,500);
sleep(1300);
driveDirect(500,300);
sleep(2000);
driveDirect(500,500);
sleep(2100);
driveDirect(500,300);
sleep(1200);
driveDirect(500,500);
sleep(1000);
driveDirect(100,200);
sleep(4000);
driveDirect(500,500);
sleep(2500);
driveDirect(300,500);

	}

	public void loop() {

	}
}
