package Collection;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.addFirst("서장훈");
		list.addLast("김희철");
		list.add(1,"김영철");
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		
	}

}
