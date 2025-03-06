import java.util.*;

class palindrome{
    public static void main (String[] args){
        String s= "ab";
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.print("Not Palindrome");
                break;
            }
            else{
                System.out.println("Palindrome");
            }
            i++;
            j--;
        }
    }
}
