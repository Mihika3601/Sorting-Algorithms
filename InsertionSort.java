class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n; i++){
            int temp = nums[i];
            int j = i - 1; //sorted array end pointer
            while(j >= 0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }
}
