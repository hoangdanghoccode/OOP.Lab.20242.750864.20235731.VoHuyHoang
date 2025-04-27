package hust.soict.hedspi.garbage;

public class NoGarbage {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		long start = System.currentTimeMillis();
		for(int i=1;i<20000;i++) {
			s.append("line");	}
		System.out.println(System.currentTimeMillis()-start);
	}
}
