class Solution {
    public boolean buddyStrings(String s, String goal) {
        char a='a',b='a';
        int count=0;
        int [] chars=new int [26];
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            chars[s.charAt(i)-'a']++;
            if(s.charAt(i)!=goal.charAt(i))
            {
                if(count==0)
                {
                    a=s.charAt(i);
                    b=goal.charAt(i);
                    count++;
                }
                else if(a==goal.charAt(i) && b==s.charAt(i))
                    count++;

                //if more than 1 swap occurs then return false
                else return false;
                } 
            }
       
        if(count==0)
            for(int i:chars) 
              if(i>1) return true;
        

        return count==2;
    }
}