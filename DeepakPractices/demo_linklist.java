import java.util.LinkedList;

class demo_linklist {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("deepak");
		System.out.println("=================================");
		System.out.println(l1);
		l1.addLast("bbb");
		System.out.println("=================================");
		System.out.println(l1);
		l1.add("rahul");
		System.out.println("=================================");
		System.out.println(l1);
		l1.addFirst("aaa");
		System.out.println("=================================");
		System.out.println(l1);
		l1.add(3, "amit");
		System.out.println("=================================");
		System.out.println(l1);
	}
}
