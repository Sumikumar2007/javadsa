class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int n = a.length;
               int m = b.length;

               int[] merged = new int[n + m];
               int k = 0;
               for (int i = 0; i < n; i++) {
                   merged[k++] = a[i];
               }
               for (int i = 0; i < m; i++) {
                   merged[k++] = b[i];
               }
                Arrays.sort(merged);
                int total = merged.length;

               if (total % 2 == 1) {
                   return ( merged[total / 2]);
               } else {
                   int middle1 = merged[total / 2 - 1];
                   int middle2 = merged[total / 2];
                   return ( middle1 + (double) middle2) / 2;
               }
    }
}