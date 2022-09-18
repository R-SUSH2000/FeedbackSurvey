
public class Wipro2 {
	
	int pingen(int x,int y,int z) {
		//largest in a number 
		int l1=largest(x);int l2=largest(y);int l3=largest(z);
		int s1=smallest(x);int s2=smallest(y);int s3=smallest(z);
		int t1=Math.max(l1, l2);	int thd=Math.max(t1, l3);
		int t2=Math.max(s1, s2);	int hd=Math.max(t2, s3);
		int td=freqmax(x,y,z);
		int od=freqmin(x,y,z);
		return td*1000+od*100+thd*10+hd;
	}
	int largest(int x) {
		int l=0;
		while (x>0)
		{
			int temp=x%10;
			if(temp>l)
			{l=temp;}
			x=x/10;		
		}return l;
	}
	int smallest(int x) {
		int s=0;
		while (x>0)
		{
			int temp=x%10;
			if(temp<s)
			{s=temp;}
			x=x/10;		
		}return s;
	}
	int freqmax(int input1,int input2,int input3) {
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
        int tem = input1;
        while(tem!=0)
        {
            arr[tem%10]++;
            tem/=10;
        }
        tem = input2;
        while(tem!=0)
        {
            arr[tem%10]++;
            tem/=10;
        }
        tem = input3;
        while(tem!=0)
        {
            arr[tem%10]++;
            tem/=10;
        }
        int x = 0;
        int low = Integer.MIN_VALUE;
        int s =0;
        for(int i:arr)
        {
            if(low<=i && i!=0)
            {
                x = s;
                low = i;
            }
            
            s++;
        }return x;
	}
	int freqmin(int input1,int input2,int input3) {
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
        int tem = input1;
        while(tem!=0)
        {
            arr[tem%10]++;
            tem/=10;
        }
        tem = input2;
        while(tem!=0)
        {
            arr[tem%10]++;
            tem/=10;
        }
        tem = input3;
        while(tem!=0)
        {
            arr[tem%10]++;
            tem/=10;
        }
        int x = 0;
        int low = Integer.MAX_VALUE;
        int s =0;
        for(int i:arr)
        {
            if(low>i && i!=0)
            {
                x = s;
                low = i;
            }            
            s++;
        }return x;
	}

	public static void main(String[] args) {
		Wipro2 w= new Wipro2();
		System.out.println(w.pingen(1233, 3123, 1235));
	}

}
