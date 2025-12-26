class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      
    
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int n : nums1) {
            set1.add(n);
        }

        // Check nums2 elements
        for (int n : nums2) {
            if (set1.contains(n)) {
                resultSet.add(n);
            }
        }

        // Convert resultSet to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int n : resultSet) {
            result[i++] = n;
        }

        return result;

    }
}