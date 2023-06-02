package LeetCode75;
import java.util.List;

/* https://leetcode.com/problems/kids-with-the-greatest-number-of-candies */

public class KidWithMostCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int n : candies) max = Math.max(max, n);
        for (int n : candies) l.add(n + extraCandies >= max);
        return l;
    }
}