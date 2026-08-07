import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        // --------------------------------------------------
        // STEP 1 : Create a HashMap
        // --------------------------------------------------
        //
        // HashMap stores data in the form:
        //
        // Key   -> Value
        //
        // Here,
        //
        // Key   = Number in the array
        // Value = Index of that number
        //
        // Example:
        //
        // Number : 2
        // Index  : 0
        //
        // map = {2 = 0}
        //
        // Why?
        // Because later we want to quickly find
        // whether another number already exists.
        //
        HashMap<Integer, Integer> map = new HashMap<>();


        // --------------------------------------------------
        // STEP 2 : Traverse the array
        // --------------------------------------------------
        //
        // Visit every element one by one.
        //
        // nums = [2,7,11,15]
        //
        // i = 0
        // i = 1
        // i = 2
        // i = 3
        //
        for (int i = 0; i < nums.length; i++) {

            // --------------------------------------------------
            // STEP 3 : Find the required number
            // --------------------------------------------------
            //
            // Formula:
            //
            // target = current number + required number
            //
            // Therefore,
            //
            // required number = target - current number
            //
            // Example:
            //
            // target = 9
            // current = 2
            //
            // required = 9 - 2 = 7
            //
            int complement = target - nums[i];


            // --------------------------------------------------
            // STEP 4 : Check whether required number
            // already exists inside the HashMap
            // --------------------------------------------------
            //
            // Example:
            //
            // map = {2 = 0}
            //
            // current number = 7
            //
            // complement = 2
            //
            // Since 2 exists in the map,
            // we have found our answer.
            //
            if (map.containsKey(complement)) {

                // --------------------------------------------------
                // Return both indices
                //
                // map.get(complement)
                // gives the index of the first number.
                //
                // i is the current index.
                //
                // Example:
                //
                // map.get(2) = 0
                // current index = 1
                //
                // Answer = [0,1]
                //
                return new int[]{map.get(complement), i};
            }


            // --------------------------------------------------
            // STEP 5 : Store current number inside HashMap
            // --------------------------------------------------
            //
            // Key = Number
            // Value = Index
            //
            // Example:
            //
            // nums[i] = 7
            // i = 1
            //
            // map becomes
            //
            // {
            //   2 = 0
            //   7 = 1
            // }
            //
            map.put(nums[i], i);
        }


        // --------------------------------------------------
        // STEP 6 : This line will never execute
        // because the problem guarantees
        // exactly one solution.
        //
        // It is only written because Java
        // requires every method to return something.
        // --------------------------------------------------
        return new int[]{};
    }
}