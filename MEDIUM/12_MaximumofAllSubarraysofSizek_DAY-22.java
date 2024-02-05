/* *
 * 12] Maximum of all subarrays of size k
 */ 

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();


        for (int i = 0; i < k; i++) {

            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }


        for (int i = k; i < n; i++) {
            result.add(arr[deque.peek()]);

            while (!deque.isEmpty() && deque.peek() <= i - k)
                deque.removeFirst();

            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();

            deque.addLast(i);
        }
        result.add(arr[deque.peek()]);

        return result;
    }
}
