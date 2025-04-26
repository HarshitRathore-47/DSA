class Solution {
    
    public String removeKdigits(String num, int k) {
        
        String str=\\;
        if(k==num.length()){
            str= \0\;
            return str;
        }
        int n=num.length();
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && k > 0 && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k > 0 && !stack.isEmpty()) {
          stack.pop();
            k--;
        }
        while(!stack.isEmpty()){
            str = stack.pop() + str ;
        }

        while( str.length() > 1 && str.charAt(0)=='0'){
            str = str.substring(1);
        }
        
        return str;

    }
    
}