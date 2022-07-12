class BinarySearch {
    public int search(int[] nums, int target) {
        int right = nums.length - 1, left = 0;
        int pivot;
        while (left <= right) {
            pivot = (right + left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else {
                if (target < nums[pivot]) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }
        return -1;
    }
}
