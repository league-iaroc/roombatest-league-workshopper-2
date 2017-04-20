package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(500,500);
	sleep(1500);
	driveDirect(300,450);
	sleep(1500);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(450,300);
	sleep(1500);
	driveDirect(400,400);
	sleep(1000);
	driveDirect(300,450);
	sleep(1800);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(350,200);
	sleep(1500);
	driveDirect(500,500);
	
	}

	public void loop() {
	
	}
}
