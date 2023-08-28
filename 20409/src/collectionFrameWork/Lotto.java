package collectionFrameWork;

public class Lotto {

	public static void main(String[] args) {
		// 45개 Ball중에서 6개를 랜덤하게 뽑아보자
		//랜덤한 수를 생성할떄 ArrayList와 HashMap중 어떤 방식이 좋은지 알아보자
		System.out.println("[ArratList방식으로 생성된 로또번호]");
		LottoArrayList lotto1 = new LottoArrayList();
		lotto1.getRandomBall();
		
		System.out.println("[HashMap방식으로 생성된 로또번호]");
		LottoHashMap lotto2 = new LottoHashMap();
		lotto2.getRandomBall();
		
		
		
	}	

}
