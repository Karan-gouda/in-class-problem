package k;
// given an array of positive and negative ingteger find a  continous sub array whose sum is maximum
        
public class q1 {
public static int sum(int arr[]) {
	int MaxSum=-100,currSum=0;
	for(int i=0;i<arr.length;i++) {
		currSum+=arr[i];
		if(currSum>MaxSum) {
			MaxSum=currSum;
		}
		if(currSum<0) {
			currSum=0;
		}
	}
	return MaxSum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={50,850,-50,541,-80};
	}

}

