class Solution {
    public String intToRoman(int num) {
    int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] r = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    StringBuilder sb = new StringBuilder();
    for(int i=0;i < n.length; i++)
    {
        while(num >= n[i])
        {
            sb.append(r[i]);
            num-=n[i];
        }
    }
    return sb.toString();
}
}