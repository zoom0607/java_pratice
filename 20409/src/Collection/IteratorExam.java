package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("페이커");
		list.add("ㅋㅋㄹㅋㅋㅋ");
		list.add("구마유스");
		list.add("ㅋㅋㄹㅋㅋㅋ");
		list.add("제우스");
		list.add("ㅋㅋㄹㅋㅋㅋ");
		list.add("케리아");
		list.add("오너");
		
		System.out.println(list);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		Iterator<String> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		it = list.iterator();
		System.out.println("++++++++++++++++++++++++++++++++++++++");

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");

		it = list.iterator();//커서를 처음으로 이동
		while(it.hasNext()) {
			String s = it.next();
			if(s.contains("ㅋㅋㄹㅋㅋㅋ")) {
			it.remove();
			}
		}

		System.out.println(list);
			
			
			
			
			
			
		}
		
		
		
		
		
	}


