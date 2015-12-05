/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        if (a == null || b == null) {
            return "";
        }

        int inverseIndex = 1;
        StringBuilder sb = new StringBuilder(Math.max(a.length(), b.length()) + 1);

        boolean addOne = false;
        while (a.length() - inverseIndex >= 0 || b.length() - inverseIndex >= 0) {
            int indexA = a.length() - inverseIndex;
            int indexB = b.length() - inverseIndex;
            if (getaChar(a, indexA) == '1') {
                if (getaChar(a, indexA) == getaChar(b, indexB)) {
                    if (!addOne) {
                        sb.append('0');
                    } else {
                        sb.append('1');
                    }
                    addOne = true;
                } else {
                    if (addOne) {
                        sb.append('0');
                        addOne = true;
                    } else {
                        sb.append('1');
                        addOne = false;
                    }
                }
            } else {
                if (getaChar(a, indexA) == getaChar(b, indexB)) {
                    if (!addOne) {
                        sb.append('0');
                    } else {
                        sb.append('1');
                    }
                    addOne = false;
                } else {
                    if (addOne) {
                        sb.append('0');
                        addOne = true;
                    } else {
                        sb.append('1');
                        addOne = false;
                    }
                }
            }
            inverseIndex++;
        }

        if (addOne) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    private char getaChar(String a, int indexA) {
        if (indexA < 0) {
            return '0';
        }
        return a.charAt(indexA);
    }
}
