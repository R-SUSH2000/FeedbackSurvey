package GreedyAlgo;
import java.util.*;
class Activity{
	int start,finish;
	public Activity(int s,int f) {
		this.finish=f;
		this.start=s;
	}
}
public class ActivitySelection {	
	public static void main(String[] args) {
		Activity ar[]= {new Activity(12,25),new Activity(10,20),new Activity(20,30)};
		System.out.println(maxActivity(ar));

	}
	 static int maxActivity(Activity[] ar) {
		Comparator<Activity> comp= new Comparator<Activity>()
		 {@Override
				public int compare(Activity a1, Activity a2) {
					return a1.finish-a2.finish;
		} };
		Arrays.sort(ar,comp);
		int res=1,prev=0;
		for(int curr=1;curr<ar.length;curr++)
		{if(ar[curr].start>=ar[prev].finish) {res++;prev=curr;}}
		return res;
	}
}