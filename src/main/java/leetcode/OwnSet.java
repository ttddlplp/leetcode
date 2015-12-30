package leetcode;

public class OwnSet {
    private int prime = 1007;

    private Integer[] values = new Integer[prime];

    public void add(int value) {
        int currentIndex = value % prime;
        Integer current = values[currentIndex];

        int lastIndex = currentIndex - 1 >= 0 ? currentIndex - 1 : prime;
        while (current != null && currentIndex != lastIndex) {
            currentIndex = (currentIndex + 1) % prime;
            current = values[currentIndex];
        }
        if (currentIndex == lastIndex) {
            throw new IllegalArgumentException("set is full");
        }
        values[currentIndex] = value;
    }

    public boolean contains(int value) {
        int currentIndex = value % prime;
        Integer current = values[currentIndex];
        if (current == null) {
            return false;
        }

        int lastIndex = currentIndex - 1 >= 0 ? currentIndex - 1 : prime;
        while (current != null && !current.equals(value) && currentIndex != lastIndex) {
            currentIndex = (currentIndex + 1) % prime;
            current = values[currentIndex];
        }
        if (current == null) {
            return false;
        }
        return current.equals(value);
    }

    public void remove(int value) {
        int currentIndex = value % prime;
        Integer current = values[currentIndex];

        int lastIndex = currentIndex - 1 >= 0 ? currentIndex - 1 : prime;
        while (current != null && !current.equals(value) && currentIndex != lastIndex) {
            currentIndex = (currentIndex + 1) % prime;
            current = values[currentIndex];
        }

        if (current != null && current.equals(value)) {
            values[currentIndex] = null;
        }
    }
}
