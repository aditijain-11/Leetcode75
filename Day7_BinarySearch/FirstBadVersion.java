public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int right = n, left = 0, res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean isBad = isBadVersion(mid);
            if (isBad) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;

    }
}
