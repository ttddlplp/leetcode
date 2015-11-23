/**
 * Created by gaoxiangzeng-personal on 15/11/16.
 */
public class Calculator {
    class TreeNode {
        String val;
        TreeNode left;
        TreeNode right;
        TreeNode(String x) { val = x; }

        @Override
        public String toString() {
            return val + "\n" + left + " | " + right;
        }
    }

    class Result {
        TreeNode treeNode;
        int nextIndex;
        Result(TreeNode treeNode, int nextIndex) {
            this.treeNode = treeNode;
            this.nextIndex = nextIndex;
        }
    }

    public int calculate(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String s1 = s.replaceAll(" ", "");
        TreeNode tree = formATree(s1.toCharArray(), 0, s1.length() - 1).treeNode;
        System.out.println(tree);
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate("(1 + 1) + 5)");
    }

    private Result formATree(char[] s1, int start, int end) {
        TreeNode left = null;
        TreeNode right = null;
        TreeNode mid = null;
        boolean isWithin = false;
        int currentIndex = start;
        if (currentIndex <= end && s1[currentIndex] >= '0' && s1[currentIndex] <= '9') {
            StringBuffer sb = new StringBuffer();
            while (currentIndex <= end && s1[currentIndex] >= '0' && s1[currentIndex] <= '9'){
                sb.append(s1[currentIndex++]);
            }
            left = new TreeNode(sb.toString());
        } else if (s1[currentIndex] == '(') {
            isWithin = true;
            Result result = formATree(s1, currentIndex + 1, end);
            left = result.treeNode;
            currentIndex = result.nextIndex;
        } else {
            throw new RuntimeException();
        }

        if (currentIndex <= end && (s1[currentIndex] == '+' || s1[currentIndex] == '-')) {
            mid = new TreeNode(String.valueOf(s1[currentIndex++]));
        } else if (currentIndex > end) {
            return new Result(left, currentIndex++);
        } else if (currentIndex <= end && s1[currentIndex] >= '0' && s1[currentIndex] <= '9') {
            return new Result(left, currentIndex++);
        } else if (s1[currentIndex] == ')') {
            return new Result(left, currentIndex++);
        } else {
            throw new RuntimeException();
        }

        Result result = formATree(s1, currentIndex, end);
        right = result.treeNode;
        mid.left = left;
        mid.right = right;

        if (isWithin) {
            if (currentIndex <= end && s1[currentIndex] != ')') {
                throw new RuntimeException();
            }
            currentIndex++;
        }
        return new Result(mid, currentIndex);
    }
}
