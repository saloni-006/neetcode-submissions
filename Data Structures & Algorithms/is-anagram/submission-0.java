class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> setS = new HashMap<>();
       
        if(s.length() != t.length())
        {
            return false;
        }

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(setS.containsKey(ch))
            {
                setS.put(ch, setS.get(ch) + 1);
            } else {
                setS.put(ch, 1);
            }
        }

        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(!setS.containsKey(ch))
            {
                return false;
            }
            setS.put(ch, setS.get(ch) - 1);
            if(setS.get(ch) < 0)
            {
                return false;
            }
        }
        return true;
    }
}