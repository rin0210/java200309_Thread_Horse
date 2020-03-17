package java200309_Thread_Horse;

import java.util.ArrayList;

public class Rank {
	private int horseCount = 0; // ���� ���� ���� ����.
	private ArrayList<Horse> hList = new ArrayList<>(); // ���� �������� ������ ���� �迭

	public Rank(int r) {	// main���� ������ �� ���� ���� �迭 ����
		horseCount = r;
	}

	public void ranking(Horse horse) {
		hList.add(horse);	// ���� ������ ������ ���� �迭�� �־��ش�.
		if (hList.size() == horseCount) { // �� ���� ���� ���� ������ ���� ���� ���ٸ�
			for (int i = 0; i < hList.size(); i++) {
				System.out.println((i + 1) + "�� : " + hList.get(i).getName());
			}
		}
	}
}
