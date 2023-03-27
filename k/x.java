package k;

public class x {
	public static void waveform(int arr[]) {
		for(int i=0;i<arr.length;i+=2) {
			if(i>0 && arr[i]<arr[i-1]) {
				int temp;
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
if(i<arr.length-1 && arr[i]<arr[i+1]) {
	int temp;
	temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
}
		}
		  for(int element: arr) {
	            System.out.println(element);
	}
	}
	public static int search(int []arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,30,40,50,60,70};
System.out.println(search(arr,60));
waveform(arr);
	}

}
//   