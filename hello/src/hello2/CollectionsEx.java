package hello2;

import java.util.*;

public class CollectionsEx {

	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String e= iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("���̾��");
		myList.add(0,"���Ͼ߿����");
		myList.add(2,"�ظ�����");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") +1;
		System.out.println("�ƹ�Ÿ�� " + index + "��° ����Դϴ�.");
	}

}
