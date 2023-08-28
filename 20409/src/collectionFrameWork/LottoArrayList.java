package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoArrayList {
	public void getRandomBall() {
		List<Integer> lotto = new ArrayList<Integer>();
			
			int count = 0;
			while(count < 6) {
				int lottoNum = (int)(Math.random()*45)+1;
				//ArrayList에는 중복해서 들어갈 수 있기 때문에 이미 뽑힌 숫자인지 체크가 꼭 필요하다.
				if(lotto.contains(lottoNum)) {
					System.out.println("중복값 발생");
					continue;
				}
				lotto.add(lottoNum);
				count++;
				
				
			}
			Collections.sort(lotto); // 로또 번호 정렬
			for(Integer value : lotto) {
				System.out.printf("%2d ", value);
				
			}
			System.out.println();
			lotto.clear();
			
			
			
	}
}
