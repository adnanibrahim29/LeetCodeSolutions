class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[temp]){
                temp++;
                nums[temp] = nums[i];
            }
        }
        return temp + 1;
    }
}