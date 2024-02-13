import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //Given an array, returns the majority element
    static int majorityElement(int[] nums){
        int majorityElement;

        //Stores values and their respective counts
        Map<Integer, Integer> valueCounts = new HashMap<>();

        for(int num : nums){
            if(!valueCounts.containsKey(num)){
                valueCounts.put(num, 1);
            }
            else{
                valueCounts.put(num, valueCounts.get(num) + 1);
            }

            //If more than half of elements are the same, return that value
            if(valueCounts.get(num) > nums.length / 2){
                majorityElement = num;
                return majorityElement;
            }
        }

        //Find entry with the highest value (most occurring number)
        Map.Entry<Integer, Integer> highestCount = valueCounts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if(highestCount != null){
            majorityElement = highestCount.getKey();
        }
        else{
            return 0;
        }

        return majorityElement;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2, 2, 1, 1, 1, 3, 5};

        int result = majorityElement(nums);

        System.out.println(result);
    }
}
