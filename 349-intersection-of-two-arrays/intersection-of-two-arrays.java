class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res=new ArrayList<>();
        int left=0;
        int right=0;
        int n=nums1.length;
        int m=nums2.length;
        while(left<n && right<m){
            if(nums1[left]==nums2[right]){
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[left]) {
                    res.add(nums1[left]);
                    
                }
                left++;
                right++;
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
            

        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}