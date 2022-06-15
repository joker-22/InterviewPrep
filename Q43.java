public class Q43 {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            boolean a = isBadVersion(mid);
            if ((mid == 1 || (!isBadVersion(mid - 1))) && a) {
                return mid;
            } else if (a) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int i) {
        return false;
    }
}
