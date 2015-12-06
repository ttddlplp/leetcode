package leetcode;

import org.junit.Test;

/**
 * Created by gaoxiangzeng-personal on 15/12/2.
 */
public class LRUCacheTest {
    @Test
    public void testName() throws Exception {
        LRUCache lruCache = new LRUCache(3);
        lruCache.set(1, 2);
        lruCache.set(2, 2);
        lruCache.set(3, 2);
        lruCache.set(4, 2);
        lruCache.set(5, 10);
        lruCache.get(3);
        lruCache.set(6, 14);
        System.out.println(lruCache.cache);
    }

    @Test
    public void testName2() throws Exception {
        LRUCache lruCache = new LRUCache(2);
        System.out.println(lruCache.get(2));
        lruCache.set(2, 6);
        System.out.println(lruCache.get(1));
        lruCache.set(1, 5);
        lruCache.set(1, 2);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.cache);
    }

    @Test
    public void testName3() throws Exception {
        LRUCache lruCache = new LRUCache(2);
        lruCache.set(2, 1);
        lruCache.set(1, 1);
        lruCache.set(2, 3);
        lruCache.set(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.cache);
    }
}