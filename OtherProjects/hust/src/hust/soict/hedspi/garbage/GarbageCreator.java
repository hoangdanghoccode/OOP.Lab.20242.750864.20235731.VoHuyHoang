package hust.soict.hedspi.garbage;

public class GarbageCreator {
         
	public static void main(String[] args) {
		String s = new String();
		long start = System.currentTimeMillis();
		for(int i=1;i<20000;i++) {
			s+="line";	}
		System.out.println(System.currentTimeMillis()-start);
	}
	
}
