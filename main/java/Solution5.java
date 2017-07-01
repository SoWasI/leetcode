/**
 * Created by 张 on 2017/7/1.
 */
public class Solution5 {
    public String longestPalindrome(String s)
    {
        String res = "";
        int curLen = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (isPalindrome(s, i - curLen - 1, i))
            {
                res = s.substring(i - curLen - 1, i+1);
                curLen += 2;
            } else if (isPalindrome(s, i - curLen, i))
            {
                res = s.substring(i - curLen, i+1);
                curLen += 1;
            }
        }
        return res;
    }

    public boolean isPalindrome(String s, int begin, int end)
    {
        if (begin < 0)
            return false;
        while (begin < end)
        {
            if (!(s.charAt(begin++) == s.charAt(end--)))
                return false;
        }
        return true;
    }
}
