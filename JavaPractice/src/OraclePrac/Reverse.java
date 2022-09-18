package OraclePrac;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int a[]= {123,23,13,90};
		int r=a.length-1,l=0;
		while(r>l) {
			int temp=a[r];
			a[r]=a[l];
			a[l]=temp;
			r--;l++;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
