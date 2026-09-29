class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int result = 0;

        for (int num : nums) {

            // Start only if num is the beginning
            if (!set.contains(num - 1)) {

                int count = 0;
                int curr = num;

                while (set.contains(curr)) {
                    count++;
                    curr++;
                }

                result = Math.max(result, count);
            }
        }

        return result;
    }
}