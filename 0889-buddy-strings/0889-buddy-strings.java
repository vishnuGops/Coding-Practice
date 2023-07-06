class Solution {
    public boolean buddyStrings(String s, String goal) {
        char a='a',b='a';
        int count=0;
        int [] chars=new int [26];
        char [] schar=s.toCharArray();
        char [] goalchar=goal.toCharArray();
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<schar.length;i++)
        {
            chars[schar[i]-'a']++;
            if(schar[i]!=goalchar[i])
            {
                if(count==0)
                {
                    a=schar[i];
                    b=goalchar[i];
                    count++;
                }
                else if(a==goalchar[i] && b==schar[i])
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