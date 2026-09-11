class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int end = filtered.length() - 1;
        int beginning = 0;
        while (beginning <= end) {
            if (filtered.charAt(beginning) != filtered.charAt(end)) {
                return false;
            }
            beginning++;
            end--;
        }
        return true;
    }
}
