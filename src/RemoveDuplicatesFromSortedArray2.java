public class RemoveDuplicatesFromSortedArray2 {

    //Alters array so that all unique values are at the beginning
    //Array can have a maximum of 2 duplicates at the start
    //Returns count of unique elements, no more than 2 of each
    //Example: input: [0, 0, 1, 1, 1, 2, 2, 2, 3]
    //         result: [0, 0, 1, 1, 2, 2, 3, _, _] and returns 7
    static int removeDuplicates(int[] nums){

        if (nums == null || nums.length == 0){
            return 0;
        }

        //Functions as an iterator for current unique value AND counter for unique values (up to 2 of each)
        int i = 0;

        //Counts duplicates of current value
        //Cannot be greater than 2
        int countOfCurrentNumber = 1;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] == nums[j-1]){
                countOfCurrentNumber++;
                if(countOfCurrentNumber <= 2){
                    i++;
                    nums[i] = nums[j];
                }
                continue;
            }

            if(nums[j] > nums[i]){
                i++;
                nums[i] = nums[j];
                countOfCurrentNumber = 1;
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

