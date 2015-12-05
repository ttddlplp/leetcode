/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null) {
            return 0;
        }

        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");

        int i = 0;
        while(i < split1.length || i < split2.length) {
            Integer value1 = i >= split1.length ? 0 : Integer.valueOf(split1[i]);
            Integer value2 = i >= split2.length ? 0 : Integer.valueOf(split2[i]);
            if (value1 < value2) {
                return -1;
            } else if (value1 > value2) {
                return 1;
            }
            i++;
        }

        return 0;
    }
}
