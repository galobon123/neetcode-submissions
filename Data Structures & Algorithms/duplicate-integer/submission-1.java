class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicated = false;
        ArrayList<Integer> list = new ArrayList();

        for(int i : nums){
            if(list.contains(i)){
                isDuplicated = true;
                break;
            }
            list.add(i);
        }

        return isDuplicated;
    }
}