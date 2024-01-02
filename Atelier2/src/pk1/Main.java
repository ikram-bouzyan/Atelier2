package pk1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author1 = new Author("jostein gaarder1","jostein_gaarder@gmail.com"
				,'M');
		Author author2 = new Author("jostein gaarde2r","jostein_gaarder@gmail.com"
				,'M');
		Author author3 = new Author("jostein gaarder3","jostein_gaarder@gmail.com"
				,'M');
		Author author4 = new Author("jostein gaarder4","jostein_gaarder@gmail.com"
				,'M');
		
		Book book1 = new Book("sophie's world1",author1,30.8);
		Book book2 = new Book("sophie's world2",author1,30.8);
		Book book3 = new Book("sophie's world3",author1,30.8);
		Book book4 = new Book("sophie's world4",author1,30.8);
		
		Book book5 = new Book("sophie's world4",author1,30.8,2);
		
		System.out.println(book1.toString());
	
		System.out.println(max3(15,2,3));
		
		System.out.println(max3(15.1,2.2,3.3));
		
		System.out.println(impr(true , false , false));
		System.out.println("//////////////////");
//		System.out.println();
		
		int [] t1={1,1,2,2};
		int [] t2={1,1,2,5};
		System.out.println(equl(t1,t2));
		
	}//ex2
	//1
	static int max3(int a , int b, int c) {
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else {
			return c;
		}
		
	}
	//overload function
	static double max3(double a , double b, double c) {
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else {
			return c;
		}
		
	}
	//2
	static boolean impr(boolean a , boolean b, boolean c) {
		int nbr=0;
		if(a == true ) {
			nbr++;
		}
		if(b == true ) {
			nbr+=1;
		}
		if(c == true ) {
			nbr+=1;
		}
		
		if(nbr % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	//3
	static boolean equl(int[] t1 ,int[] t2 ) {
		if(t1.length == t2.length) {
			for (int i=0 ; i<t1.length ; i++) {
				if(t1[i]==t2[i]) {
					return true;
				}
			}
		}else {
			
		}
		return false;
	}
	
	

}
