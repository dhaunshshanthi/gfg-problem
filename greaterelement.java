class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0; i< arr.length;i++){
            int right=-1;
           for(int j = i + 1; j <  n; j++){
            right = Math.max(right, arr[j]);
           }
           res[i] = right;
        }
        return res;
    }
}
