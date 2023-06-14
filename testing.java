package misc;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number_stream s = new Number_stream();
		s.add(5);
		s.add(1);
		s.add(4);
		s.add(4);
		s.add(5);
		s.add(9);
		s.add(7);
		s.add(13);
		s.add(3);
		
		System.out.println(s.get_rank(1));//O(nlog(n))
		System.out.println(s.get_rank(3));//O(1)
		System.out.println(s.get_rank(4));//O(1)
		System.out.println(s.get_rank(7));//O(1)
	}

}
