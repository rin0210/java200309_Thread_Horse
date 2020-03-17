package java200309_Thread_Horse;


public class Main {

	public static void main(String[] args) {
		String[] hList = { "1번 말", "2번 말", "3번 말", "4번 말", "5번 말" };
//		ArrayList<Horse> thList = new ArrayList<>();
//		ArrayList<Horse> rank = new ArrayList<>();

		Rank rk = new Rank(hList.length);
		for (int i = 0; i < hList.length; i++) {
			Horse horse = new Horse(rk);
			horse.setName(hList[i]);
			horse.start();

//			thList.add(horse); // 생성한 스레드를 리스트에 삽입
		}

//		try {
//			for (int i = 0; i < thList.size(); i++) {
//				thList.get(i).join();
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		for (int i = 0; i < rank.size(); i++) {
//			System.out.println(i + 1 + "등 : " + rank.get(i).getName());
//		}
	}
}
