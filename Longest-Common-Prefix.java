class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str =new  StringBuilder();
        int n=strs.length;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<n;j++){
                if(i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i)){
                    return str.toString();


                }
            }
            str.append(strs[0].charAt(i));
        }
        return str.toString();
    }
}