package leetcode;

import java.util.*;

import static java.lang.Math.max;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }

        return LIS(nums);
    }

    private int LIS(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }

        for (int i = 1; i < result.length; i++) {
            int j = 0;
            while(j < i) {
                if(nums[j] < nums[i]) {
                    result[i] = max(result[i], result[j] + 1);
                }
                j++;
            }
        }

        int max = -1;
        for (int item : result) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public void allCombinations(int[] nums) {
        List<List<Integer>> result = allCombinations(nums, 0);
        System.out.println(result);
    }

    private List<List<Integer>> allCombinations(int[] nums, int i) {
        if (i == nums.length) {
            List<Integer> selfList = new ArrayList<Integer>();
            List<List<Integer>> emptyLists = new ArrayList<List<Integer>>();
            emptyLists.add(selfList);
            return emptyLists;
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<List<Integer>> hasNotLists = allCombinations(nums, i + 1);
        List<List<Integer>> hasLists = new ArrayList<List<Integer>>();
        for (List<Integer> hasNotList : hasNotLists) {
            List<Integer> hasList = new ArrayList<Integer>(hasNotList);
            hasList.add(nums[i]);
            hasLists.add(hasList);
        }

        result.addAll(hasLists);
        result.addAll(hasNotLists);

        return result;
    }

    public String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;

        char[] secretArr = secret.toCharArray();
        char[] guessArr = guess.toCharArray();

        for (int i = 0; i < secretArr.length; i++) {
            if (secretArr[i] == guessArr[i]) {
                A++;
            }
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : secretArr) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        for (char c : guessArr) {
            if (map.containsKey(c)) {
                B++;
                if (map.get(c) == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);
                }
            }
        }
        B = B - A;

        return A + "A" + B + "B";
    }

    public int firstBadVersion(int n) {
        if (!isBadVersion(n)) {
            return -1;
        }
        return findBad(1, n);
    }

    private int findBad(int i, int n) {

        System.out.println("check " + i + " and " + n);
        if (i == n) {
            return isBadVersion(i) ? i : -1;
        }

        int mid = i + (n - i) / 2;


        if (isTheFirstBad(mid)) {
            return mid;
        } else {
            if (isBadVersion(mid)) {
                return findBad(i, mid);
            } else {
                return findBad(mid + 1, n);
            }
        }
    }

    private boolean isTheFirstBad(int version) {
        if (version == 1) {
            return isBadVersion(version);
        } else {
            return isBadVersion(version) && !isBadVersion(version - 1);
        }
    }

    private boolean isBadVersion(int version) {
        return version >= 6;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.allCombinations(new int[]{1,2,3});
        System.out.println(solution.getHint("11", "11"));

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = null;
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.right = treeNode2;
        treeNode2.left = new TreeNode(3);
        treeNode2.right = new TreeNode(4);

        Codec codec = new Codec();
        /*String serialize = codec.serialize(treeNode);
        System.out.println(serialize);
        System.out.println(codec.serialize(codec.deserialize(serialize)));

        System.out.println(codec.serialize(codec.deserialize("[]")));*/
        System.out.println(codec.serialize(codec.deserialize("[1,-1,2,null,null,3]")));

        System.out.println(solution.firstBadVersion(10));
    }



}

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        StringBuffer sb = new StringBuffer();
        sb.append("[");
        Queue<TreeNode> visitQueue = new LinkedList<TreeNode>();
        visitQueue.add(root);

        StringBuffer nullBuffer = new StringBuffer();
        while(!visitQueue.isEmpty()) {
            TreeNode treeNode = visitQueue.poll();
            if (treeNode == null) {
                nullBuffer.append("null,");
                continue;
            }
            sb.append(nullBuffer.toString());
            nullBuffer = new StringBuffer();
            sb.append(treeNode.val + ",");
            visitQueue.add(treeNode.left);
            visitQueue.add(treeNode.right);
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data == "[]") {
            return null;
        }

        String[] nodes = data.substring(1, data.length() - 1).split(",");
        int currentNode = 0;
        if (nodes[currentNode] == "null") {
            return null;
        }

        TreeNode root = generateNode(nodes, currentNode++);
        Queue<TreeNode> visitQueue = new LinkedList<TreeNode>();
        visitQueue.add(root);

        while (!visitQueue.isEmpty() && currentNode < nodes.length) {
            TreeNode node = visitQueue.poll();
            if (node == null) {
                continue;
            }
            node.left = generateNode(nodes, currentNode++);
            node.right = generateNode(nodes, currentNode++);
            visitQueue.add(node.left);
            visitQueue.add(node.right);
        }

        return root;
    }

    private TreeNode generateNode(String[] values, int index) {
        if (index >= values.length) {
            return null;
        }
        String value = values[index];
        if (value.equals("null")) {
            return null;
        } else {
            return new TreeNode(Integer.parseInt(value));
        }
    }


}