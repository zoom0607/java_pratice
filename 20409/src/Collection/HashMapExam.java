package Collection;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//데이터 추가
		map.put("페이커", 10);
		map.put("구마유스", 5);
		map.put("제우스", 3);
	
		System.out.println(map);
		System.out.println(map.size());
		
		
		//데이터 조회
		System.out.println(map.get("페이커"));
		
		//데이터 삭제
		map.remove("페이커");
		map.remove("페이커", 10);
		
		for(int value: map.values()) {
			System.out.println(value);
		}
		
		for(String key:map.keySet()) {
			System.out.println("고객이름 : "+key+" 포인트 : "+map.get(key));
		}
		
		
		
		
	}

}
