/**
 * Created by gaoxiangzeng-personal on 15/12/3.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return null;
        }
        char start = 'A';
        StringBuffer sb = new StringBuffer();
        while (n != 0) {
            n--;
            sb.append(String.valueOf((char)(n % 26 + start)));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
