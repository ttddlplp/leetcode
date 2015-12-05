/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        if (a == null || b == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder(Math.max(a.length(), b.length()) + 1);

        int carry = 0;
        for(int indexA = a.length() - 1, indexB = b.length() - 1; indexA >= 0 || indexB >= 0; indexA--, indexB--) {
            int valA = indexA >= 0 ? a.charAt(indexA) - '0' : 0;
            int valB = indexB >= 0 ? b.charAt(indexB) - '0' : 0;
            int val = (valA + valB + carry) % 2;
            carry = (valA + valB + carry) / 2;
            val += '0';
            sb.append((char)val);
        }

        if (carry > 0) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
