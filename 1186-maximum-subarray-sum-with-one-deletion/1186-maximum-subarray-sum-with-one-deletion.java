class Solution {
    public int maximumSum(int[] arr) {

        int n = arr.length;

        int nodel = arr[0];
        int onedel = -1000000000;
        int res = arr[0];

        for (int i = 1; i < n; i++) {

            int prevnodel = nodel;

            nodel = Math.max(arr[i], nodel + arr[i]);

            onedel = Math.max(prevnodel, onedel + arr[i]);

            res = Math.max(res, Math.max(nodel, onedel));
        }

        return res;
    }
}