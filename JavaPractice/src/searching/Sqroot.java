package searching;

public class Sqroot {

	int sqrtInt(int x) {
		int low=0,high=x,ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			int msqt=mid*mid;
			if(msqt==x)
				return mid;
			else if(msqt>x)
			{
				high=mid-1;
			}
			else 
			{
				low=mid+1;
				ans=mid;
			}
		}
			return ans;			
		}
	}

