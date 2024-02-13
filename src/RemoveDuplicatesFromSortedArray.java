public class RemoveDuplicatesFromSortedArray {

    //Alters array so that all unique values are at the beginning
    //Returns count of unique values
    static int removeDuplicates(int[] nums){

        if (nums == null || nums.length == 0) {
            return 0;
        }

        //functions as an iterator for current unique value AND counter for unique values
        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        
        //+1 to account for the first value
        return i + 1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1, 1, 2, 3, 3, 3, 3, 3, 5, 5};

        int k = removeDuplicates(nums);

        for(int el : nums){
            System.out.printf("%d ", el);
        }

        System.out.println();
        System.out.println(k);
    }
}
