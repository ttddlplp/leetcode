package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/11/23.
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        return (C - A) * (D - B) + (G - E) * (H - F) - getIntersect(A, B, C, D, E, F, G, H);
    }

    private int getIntersect(int A, int B, int C, int D, int E, int F, int G, int H) {
        int minX = Math.max(A, E);
        int minY = Math.max(B, F);

        int maxX = Math.min(C, G);
        int maxY = Math.min(D, H);

        return (maxX < minX || maxY < minY) ? 0 : (maxX - minX) * (maxY - minY);
    }
}
