import java.util.BitSet;

/**
 * Created by gaoxiangzeng-personal on 15/11/18.
 */
public class Nim {
    public boolean canWinNim(int n) {
        return canWin(n);
    }

    private boolean canWin(int n) {
        BitSet bitSet = new BitSet(3);
        for (int i = 1; i <= n; i++) {
            if (i <= 3){
                bitSet.set(i - 1);
                continue;
            }
            bitSet.set(i % 3, !bitSet.get((i - 1) % 3) || !bitSet.get((i - 2) % 3) || !bitSet.get((i - 3) % 3));
        }
        return bitSet.get(n % 3);
    }

    public static void main(String[] args) {
        Nim nim = new Nim();
        System.out.println(nim.canWinNim(1348820612));
    }
}
