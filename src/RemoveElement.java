public class RemoveElement {

    //Rearranges array so elements with value val are at the end
    //Returns count - count of values unequal to val
    //val - value not be counted
    static int removeElement(int[] nums, int val){
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                for(int j = i; j < nums.length; j++){
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }

        for (int el : nums) {
            if (el == val) {
                break;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 4, 5, 5, 5, 6, 7, 5};
        int val = 5;

        int count = removeElement(nums, val);

        System.out.println(count);
        for(int el : nums){
            System.out.printf("%d ", el);
        }
    }
}
