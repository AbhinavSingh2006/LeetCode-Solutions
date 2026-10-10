class Solution {
    public boolean check(int[] nums) {
      
     int brCount =0;
     int last = nums.length -1;
      
      // Count the points where the sorted order breaks
     for(int i = 0; i <= last -1;i++){
         if(nums[i]>nums[i+1]){
             brCount++;
         }
     } 
      
      // More than one break means the array cannot be sorted and rotated
      if(brCount > 1){
         return false;
     }
      
      // If there is one break, the last element must be <= the first
     return brCount==0 || nums[0] >= nums[last];
    }
}
