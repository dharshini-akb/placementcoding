class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
       String newstring = "";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                newstring=newstring+ch;
            }
        }
        String reverse="";
        for(int i=newstring.length()-1;i>=0;i--)
        {
            reverse=reverse+newstring.charAt(i);
        }
        return newstring.equals(reverse);
    }
}
