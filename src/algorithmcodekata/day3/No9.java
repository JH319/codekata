package algorithmcodekata.day3;

public class No9 {
    public int No9(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } continue;
        }
        return sum;
    }
}
