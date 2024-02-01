public class RemoveElement {

    static int removeElement(int[] nums, int val){
        int k = 0;

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
            k++;
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 4, 5, 5, 5, 6, 7};
        int val = 5;

        int k = removeElement(nums, val);

        System.out.println(k);
        for(int el : nums){
            System.out.printf("%d ", el);
        }
    }
}
