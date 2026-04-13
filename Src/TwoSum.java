import java.util.Arrays;

class TwoSum {

    public int[] TwoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

        int[] nums = {10, 20, 25, 30, 45};
        int target = 55;

        int[] result = obj.TwoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}