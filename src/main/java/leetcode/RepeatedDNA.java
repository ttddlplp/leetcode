package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by gaoxiangzeng-personal on 15/11/28.
 */
public class RepeatedDNA {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> resultSet = new HashSet<>();
        if (s.length() <= 10) {
            return new ArrayList<>();
        }

        QuadTree root = new QuadTree('*');
        for (int i = 0; i <= s.length() - 10; i++) {
            QuadTree current = root;
            boolean createdSomeNewNode = false;
            String substring = s.substring(i, i + 10);
            for (int j = 0; j < substring.length(); j++) {
                char val = substring.charAt(j);
                if (!current.isChildExists(val)) {
                    current.addChild(val);
                    createdSomeNewNode = true;
                }
                current = current.getChild(val);
            }
            if (!createdSomeNewNode) {
                resultSet.add(substring);
            }
        }
        List<String> result = new ArrayList<>();
        result.addAll(resultSet);
        return result;
    }

    class QuadTree {
        char val;
        QuadTree A;
        QuadTree T;
        QuadTree G;
        QuadTree C;

        public QuadTree(char val) {
            this.val = val;
        }

        public boolean isChildExists(char val) {
            return getChild(val) != null;
        }

        private QuadTree getChild(char val) {
            switch (val) {
                case 'A': return A;
                case 'T': return T;
                case 'G': return G;
                case 'C': return C;
                default : throw new RuntimeException();
            }
        }

        private void addChild(char val) {
            switch (val) {
                case 'A': this.A = new QuadTree(val); break;
                case 'T': this.T = new QuadTree(val); break;
                case 'G': this.G = new QuadTree(val); break;
                case 'C': this.C = new QuadTree(val); break;
                default : throw new RuntimeException();
            }
        }
    }
}
