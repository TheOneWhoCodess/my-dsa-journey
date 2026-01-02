import java.util.HashMap;
import java.util.Map;

class repeatedNTimes {

    public int repeatedNTimesFunction(int[] nums) {
        int n = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num)==n) {
                return num;
            }
        }

        return -1; // fallback
    }

    public static void main(String[] args) {
        repeatedNTimes obj = new repeatedNTimes();
        int[] nums = {2, 1, 2, 5, 3, 2};
        System.out.println(obj.repeatedNTimesFunction(nums));
    }
}
