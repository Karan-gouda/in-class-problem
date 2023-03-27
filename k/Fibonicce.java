package k;
//find the nth term of fibonacci  series
public class Fibonicce {
public static int fibbo(int n) {
	if(n==0 || n==1) {
		return n;
	}
	return fibbo(n-1)+fibbo(n-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fibbo(10));
		
	}

}
