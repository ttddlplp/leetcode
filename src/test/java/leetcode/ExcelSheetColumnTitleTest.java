package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/3.
 */
public class ExcelSheetColumnTitleTest {

    private ExcelSheetColumnTitle excelSheetColumnTitle;

    @Before
    public void setUp() throws Exception {
        excelSheetColumnTitle = new ExcelSheetColumnTitle();
    }

    @Test
    public void testName() throws Exception {
        assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
        assertEquals("AA", excelSheetColumnTitle.convertToTitle(27));
        assertEquals("Z", excelSheetColumnTitle.convertToTitle(26));
        assertEquals("AAA", excelSheetColumnTitle.convertToTitle(26*27+1));
    }
}