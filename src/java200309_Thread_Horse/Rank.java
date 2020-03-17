package java200309_Thread_Horse;

import java.util.ArrayList;

public class Rank {
	private int horseCount = 0; // 경주 말의 수를 센다.
	private ArrayList<Horse> hList = new ArrayList<>(); // 골인 지점까지 도착한 말의 배열

	public Rank(int r) {	// main에서 가지고 온 경주 말의 배열 길이
		horseCount = r;
	}

	public void ranking(Horse horse) {
		hList.add(horse);	// 골인 지점에 도착한 말을 배열에 넣어준다.
		if (hList.size() == horseCount) { // 총 경주 말의 수와 도착한 말의 수가 같다면
			for (int i = 0; i < hList.size(); i++) {
				System.out.println((i + 1) + "등 : " + hList.get(i).getName());
			}
		}
	}
}
