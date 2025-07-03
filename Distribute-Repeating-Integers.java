class Solution {
    public boolean canDistribute(int[] nums, int[] quantity) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        ArrayList <Integer> quantitylist = new ArrayList<>();
        for(int num:quantity){
            quantitylist.add(num);
        }
        quantitylist.sort(Collections.reverseOrder());
        System.out.print(quantitylist);
        System.out.print(freq);
        return SatisfiedOrNot(freq,quantitylist,0);
    }
    public static boolean SatisfiedOrNot(HashMap<Integer,Integer> freq,ArrayList <Integer> quantity,int idx){
        if(idx ==quantity.size()){
            return true;

        }
        for(HashMap.Entry<Integer,Integer> entry: freq.entrySet()){
            int key=entry.getKey();
            int availableCount=entry.getValue();

            if(availableCount >= quantity.get(idx)){
                //choosing the amount
                freq.put(key,availableCount-quantity.get(idx));

                if(SatisfiedOrNot(freq,quantity,idx+1)){
                    return true;
                }
                //backtrack
                else{
                    freq.put(key,availableCount);
                }
            }
            
        }
        return false;
    }
}