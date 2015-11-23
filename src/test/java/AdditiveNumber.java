/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        if (num == null) {
            return false;
        }
        int n = num.length();
        if (n < 3) {
            return false;
        }

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int first = 0;
                int second = i;
                int third = j;
                while (third < n) {
                    String firstNum = num.substring(first, second);
                    String secondNum = num.substring(second, third);
                    if (firstNum.startsWith("0") || secondNum.startsWith("0")) {
                        break;
                    }
                    Long result = Long.parseLong(firstNum) + Long.parseLong(secondNum);
                    if (num.substring(third).startsWith(result.toString())) {
                        first = second;
                        second = third;
                        third += result.toString().length();
                    } else {
                        break;
                    }
                }
                if (third == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
