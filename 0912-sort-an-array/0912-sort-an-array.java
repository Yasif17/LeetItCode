class Solution {

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

}