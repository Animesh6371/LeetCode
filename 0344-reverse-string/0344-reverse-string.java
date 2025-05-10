class Solution {
    public void reverseString(char[] s) {
        
        int start = 0;
        int end = s.length-1;
        swap(s,start,end);

    }
    void swap(char s[],int start,int end)
    {
        if(start >= end)
        {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        swap(s,start+1,end-1);
    }
}