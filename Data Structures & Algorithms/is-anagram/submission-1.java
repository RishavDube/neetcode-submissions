class Solution {
public boolean isAnagram(String s, String t) {
    // Step 1: Check lengths first (Quick exit)
    if (s.length() != t.length()) return false;

    // Step 2: Use frequency array for 'a-z'
    int[] count = new int[26];

    // Step 3: Single pass to update counts
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++; // Increment for string s
        count[t.charAt(i) - 'a']--; // Decrement for string t
    }

    // Step 4: Verify all frequencies are zero
    for (int val : count) {
        if (val != 0) return false;
    }

    return true;
}
}
