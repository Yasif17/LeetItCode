class Solution {
    public int[] sortArray(int[] nums) {
        
        int n = nums.length;

        for(int i = n/2-1;i>=0;i--){
            heapify(nums,n,i);
        }

        for(int i = n-1;i>=0;i--){
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums,i,0);
        }
        return nums;
    }

    void heapify(int[] a, int n , int i){
        int largest = i;
        int li = 2*i+1;
        int ri = 2*i+2;


        if(li<n && a[li]>a[largest]){
            largest = li;
        }
        if(ri<n && a[ri]>a[largest]){
            largest = ri;
        }
        if(largest!=i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a,n,largest);
        }


    }

}






/*class Solution {

    int[] a;
    int[] tempa;
    int length;

    public int[] sortArray(int[] nums) {
        this.a = nums;
        this.length = nums.length;
        this.tempa = new int[nums.length];
        divide(0,length-1);
        return a;
    }

    public void divide(int start,int end){
        

        if(start<end){
          int mid = (start+end)>>>1;

          divide(start,mid);

          divide(mid+1,end);

          merge(start,mid,end);

        }

    }

    public void merge(int start,int mid,int end){
        for(int i=start;i<=end;i++){
            tempa[i]=a[i];
        }

        int i = start;
        int j = mid+1;
        int k = start;

        while(i<=mid && j<=end){
            if(tempa[i]<tempa[j]){
                a[k] = tempa[i];
                i++;
            }
            else{
                a[k] = tempa[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            a[k] = tempa[i];
            k++;
            i++;
        }

    }

} */