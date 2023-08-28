package collectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class LottoHashMap {

	public void getRandomBall() {
		
	
		Set<Integer> lotto = new HashSet<Integer>();
		int lottoNum = 0;
		
	/*HashSet은 자체로 중복을 허용하지 않기에, 
	  중복된 번호는 들어가지 않는다. 6새가 들어갈때까지 반복한다.*/
		while(lotto.size() != 6) {
			lottoNum = (int)(Math.random()*45)+1;
			lotto.add(lottoNum);
		}
		
		
		
		for(Integer value : lotto) {
			System.out.printf("%2d ", value);
		}
		
		
		
		
	}
		
		
		
		
	}


