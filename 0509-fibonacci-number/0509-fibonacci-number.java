class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int previous = 0;
        int next = 1;
        int result = 0;
        for (int i=1;i<n;i++){
            result = previous + next;
            previous = next;
            next = result;
        }
        return result;
    }
}