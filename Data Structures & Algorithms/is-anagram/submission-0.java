class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        String sortS = new String(charS);
        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        String sortT = new String(charT);
        if(sortS.equals(sortT)){
            return true;
        }
        return false;
    }
}
