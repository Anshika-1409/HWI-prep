import java.util.Arrays;

public class cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3}; 
        int[] s = {1, 1};  

        cookies sol = new cookies();
        int result = sol.findContentChildren(g, s);
        System.out.println("Maximum number of content children: " + result);
    }
}