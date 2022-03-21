//方法1 使用Set容器
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(set.contains(num)){
                return num;
            }else{
                set.add(num);
            }
        }
        return -1;
    }
}

//方法2 最优解法
class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
        while(i != nums[i]){
            if(nums[i] == nums[nums[i]]){
                return nums[i];
                }
            int temp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = temp;
            }
        }
        return -1;
    }
}
