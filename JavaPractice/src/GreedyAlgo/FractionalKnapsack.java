package GreedyAlgo;
import java.util.*;
class obj{
	int weight,value;
	public obj(int w,int v) {
		this.value=v;
		this.weight=w;
	}
}
public class FractionalKnapsack {

	public static void main(String[] args) {
		obj []t= {new obj(50,600),new obj(20,500),new obj(30,400)};
		int w=70;
		System.out.println(maxValue(t,w));
	}

	private static int maxValue(obj[] t,int w) {
		Comparator<obj> comp= new Comparator<obj>()
		{
			@Override
			public int compare(obj o1, obj o2) {
				return ();
			}
		};
		Arrays.sort(t,comp);
		int res=0; 
		for(int cur=1;cur<t.length;cur++)
		{
			if(t[curr].weight<=) 
		}
	}

}
