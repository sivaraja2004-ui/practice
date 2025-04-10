class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        int pos=-1;
        char k=' ';
        for(int i=0; i<haystack.length(); i++)
        {
            if(haystack.charAt(i)==needle.charAt(0) && (i+(len-1))<haystack.length())
            {
                if(haystack.substring(i, i+len).equals(needle))
                {
                    pos=i;
                    break;
                }
            }
            if(pos!=-1)
            break;
        }
        return pos;
    }
}