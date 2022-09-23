class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);
        
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> inter = new HashMap<>();
        for(int i =0; i< nums1.length; i++)
            inter.put(nums1[i],inter.getOrDefault(nums1[i], 0) + 1);
        
        for(int j =0; j<nums2.length; j++){
            if(inter.containsKey(nums2[j]) && inter.get(nums2[j])>0){
                res.add(nums2[j]);
                inter.put(nums2[j], inter.get(nums2[j])-1);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}