class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;

        int previous=0;
        int next=1;
        int result=0;
        int i=1;

        while(i<n){
            result = previous + next;
            previous = next;
            next = result;
            i++;
        }

        return result;

    }
}