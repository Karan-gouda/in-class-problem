package k;
// find the gcd of 2 number

public class gcd {
public static int gcdof2(int a,int b) {
	if (b==0)
		return a;
	return gcdof2(b,b%a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(gcdof2(32,8));
	}

}
