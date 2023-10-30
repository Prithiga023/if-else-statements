 /*
    Time complexity: O(1)
    Space complexity: O(1)
*/
public class Solution {
    public static String compareIfElse(int a, int b) {
        if (a > b)
            return "greater";
        else if (a < b)
            return "smaller";
        else
            return "equal";
    }
} 