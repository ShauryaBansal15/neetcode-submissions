class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int length = s.length();
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();

        for (int i = 0; i < length; i++) {
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < length; i++) {
            if (!myMap.containsKey(t.charAt(i)) || myMap.get(t.charAt(i)) == 0) {
                return false;
            }
            myMap.put(t.charAt(i), myMap.get(t.charAt(i)) - 1);
        }

        return true;
    }
}
