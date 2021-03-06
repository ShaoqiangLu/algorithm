package leetcode;

public class Solution7 {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result != 0 && (result ^ x) < 0) {
                return 0;
            }
            x /= 10;
        }
        return result;
    }
}
