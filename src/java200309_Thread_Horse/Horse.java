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
				rk.ranking(this);	// ������(�������� ��������)��ü�� ������ RankŬ������ ranking�޼���� ����.  
				break;	// ���� ���� 100m�̻� �޷ȴٸ� �����.
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
			System.out.println(">> " + thisName + " ���� ������ �����մϴ�!!");
		}
	}

	private void prt() {
		System.out.println(thisName + " : " + nowM + " " + goal + "m");
	}
}
