import java.util.*;

class Main {

    public static int solution(int[] arr, int k) {
        // write your code here
        HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		int count=0,sum=0;
		for(int val:arr)
		{
			sum+=val;
            int rem=sum%k;
            if(rem < 0)
            {
                rem+=k;
            }
			if(map.containsKey(rem))
			{
                int freq=map.get(rem);
				count+=freq;
				map.put(rem,freq+1);
			}
            else
            {
                map.put(rem,1);
            }
		}
		return count;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
        scn.close();
    }

}
