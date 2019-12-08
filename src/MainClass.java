
public class MainClass {

	public static int[] sugarHigh(int candies[], int threshold) {
		int len = candies.length; 
		int mainArr[] = new int[len]; //main array, same length as candies array
		int minSum = 99999; // set minsum to some very high number
		int maxcnt = 0;
		
		for(int j = 0; j<len; j++) {		
			int sum = 0, cnt = 0;
			int arr[] = new int[len]; // for each element I created it's array of indexes
		
			for(int i = j; i<len; i++) {	
				if((sum+candies[i])<threshold)
				{
					sum+=candies[i];
					arr[cnt++] = i;
				}		
				maxcnt = Math.max(cnt, maxcnt);	
			}
		
			if(sum<minSum && cnt>=maxcnt && cnt>0) 
			{
				minSum = sum;
				for(int k = 0; k<cnt; k++)
					mainArr[k] = arr[k];
			}
		}
		int ret[] = new int[maxcnt];
		for(int i = 0; i<maxcnt; i++) //shortening output array
			ret[i] = mainArr[i];
		return ret;
	}
	
	public static void main(String[] args) {
		
		int cand[] = {16, 3, 14, 17, 11};
		int thres = 99;
		
		int res[] = sugarHigh(cand, thres);
		for(int i = 0; i<res.length; i++)
			System.out.print(res[i]+ " ");

	}

}
