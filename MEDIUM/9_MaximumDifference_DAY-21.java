/* *
 * 9] Maximum Difference
 */

//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution {

    int findMaxDiff(int a[], int n) {

    Stack<Integer> st = new Stack<>();
    int[] ls = new int[n];
    int[] rs = new int[n];

    for(int i=0; i<n; i++) {
        int el = a[i];

        while(!st.isEmpty() && st.peek() >= el) st.pop();

            if(st.isEmpty()) {
                ls[i] = 0;
            } else {
                ls[i] = st.peek();
            }
            st.push(el);
    }
    st.clear();

    for(int i=n-1; i>=0; i--) {
        int el = a[i];

        while(!st.isEmpty() && st.peek() >= el) st.pop();

            if(st.isEmpty()) {
                rs[i] = 0;
            } else {
                rs[i] = st.peek();
            }
            st.push(el);
    }

    int max = Integer.MIN_VALUE;

    for(int i=0; i<n; i++) {
        max = Math.max(max, Math.abs(ls[i]-rs[i]));
    }

    return max;
    }
}
