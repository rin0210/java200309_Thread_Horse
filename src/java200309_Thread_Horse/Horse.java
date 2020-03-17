package java200309_Thread_Horse;

import java.util.Random;

public class Horse extends Thread {
	private Random r = new Random();
	private String thisName = "";
	private String nowM = "";
	private int goal = 0;
	private int meter = 0;
	private Rank rk = null;

	public Horse(Rank r) {
		this.rk = r;
	}

	@Override
	public void run() {
		thisName = Thread.currentThread().getName();
		while (true) {
			go();
			prt();
			if (goal >= 100) {
				rk.ranking(this);	// 현재의(실행중인 스레드의)객체를 가지고 Rank클래스의 ranking메서드로 간다.  
				break;	// 현재 말이 100m이상 달렸다면 멈춘다.
			}
		}
	}

	private void go() {
		meter = r.nextInt(20) + 1;
		goal = goal + meter;

		for (int i = 0; i < meter; i++) {
			nowM = nowM + ">";
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (goal >= 100) {
			System.out.println(">> " + thisName + " 골인 지점에 도착합니다!!");
		}
	}

	private void prt() {
		System.out.println(thisName + " : " + nowM + " " + goal + "m");
	}
}
