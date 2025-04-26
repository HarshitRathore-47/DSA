class Solution {
    
    public String removeKdigits(String num, int k) {
        StringBuilder str = new StringBuilder();
        if(k==num.length()){
            return \0\;
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
            str.append(stack.pop());
        }
        str.reverse();

        while( str.length() > 1 && str.charAt(0)=='0'){
            str = str.deleteCharAt(0);
        }

        
        return str.toString();

    }
    
}