class Solution {
    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int sum=0;
        int max = nums[0];

        for(int i=0;i<n;i++){
            sum+=nums[i];

            max = Math.max(sum,max);

            if(sum<0){
                sum=0;
            }

        }
        return max;
    }
}




//         int result = nums[0]; // 6


//         // Oouter loop for starting point of subarray
//         for(int i=0;i<nums.length;i++){
//             int currSum=0;

//             // Inner loop for ending point of subarray
//             for(int j=i;j<nums.length;j++){
//                 currSum = currSum+nums[j]; // 

//                 // Update result if currSum is greater than result.
//                 result = Math.max(result,currSum);
//                 // result = 6
//             }
//         }
//         return result;


