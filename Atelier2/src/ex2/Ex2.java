package ex2;
import static java.lang.Math.max;
public class Ex2 {

	public static int max3(int a , int b , int c) {
		//return max(max(a,b),c);
		return a>b && a>c ? a: b>a && b>c ?b:c;
	}
	
	public static double max3(double a , double b , double c) {
		//return max(max(a,b),c);
		return a>b && a>c ? a: b>a && b>c ?b:c;
	}
	
	public static boolean impr(boolean a , boolean b , boolean c) {
		int ctr=0;
		if(a==true) {
			ctr+=1;
		}else if(b==true) {
			ctr+=1;
		}else if(c==true) {
			ctr+=1;
		}
		return ctr%2==1;
	}
	public static boolean impr2(boolean a , boolean b , boolean c) {
		int ctr=0;
		if(a) 
			ctr+=1;
		if(b)
			ctr+=1;
		if(c==true) 
			ctr+=1;
		return ctr%2==1;
	}
	
	public static boolean equal(int[] tb1, int[] tb2) {
		if(tb1.length != tb2.length) return false;
		else
			for(int i=0 ; i<tb1.length; i++)
				if(tb1[i]!=tb2[i]) return false;
					
		return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(equal(new int[] {1,2,3},new int[] {1,2,3}));
	}

}
