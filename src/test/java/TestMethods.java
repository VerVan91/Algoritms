import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMethods {
    @Test
    public void testMethodFind() {
        int[] testArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(Methods.find(testArr, 1), 0, "Not correct");
        Assert.assertEquals(Methods.find(testArr, 5), 4, "Not correct");
        Assert.assertEquals(Methods.find(testArr, 9), 8, "Not correct");
        Assert.assertEquals(Methods.find(testArr, 0), -1, "Not correct");
        Assert.assertEquals(Methods.find(testArr, -10), -1, "Not correct");
        Assert.assertEquals(Methods.find(testArr, -100), -1, "Not correct");
        Assert.assertEquals(Methods.find(testArr, 10), -1, "Not correct");
        Assert.assertEquals(Methods.find(testArr, 100), -1, "Not correct");
        Assert.assertEquals(Methods.find(new int[]{}, 5), -1, "Not correct");
        Assert.assertEquals(Methods.find(new int[]{}, -100), -1, "Not correct");
        Assert.assertEquals(Methods.find(new int[]{}, 100), -1, "Not correct");
    }

    @Test
    public void testMethodFindSorted() {
        int[] testArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] testArr2 = new int[]{1, 3, 2, 5, 7, 6, 4, 9, 8};
        int[] testArr3 = new int[]{-1, 4, -2, 3, 7, -6, 5, -9, 8};

        Assert.assertEquals(Methods.findSorted(testArr, 4),3,"Not correct");
        Assert.assertEquals(Methods.findSorted(testArr, 44),-1,"Not correct");
        Assert.assertEquals(Methods.findSorted(testArr2, 4),6,"Not correct");
        Assert.assertEquals(Methods.findSorted(testArr2, 44),-1,"Not correct");
        Assert.assertEquals(Methods.findSorted(testArr3, 4),1,"Not correct");
        Assert.assertEquals(Methods.findSorted(testArr3, 44),-1,"Not correct");
        Assert.assertEquals(Methods.findSorted(new int[]{}, 4),-1,"Not correct");
        Assert.assertEquals(Methods.findSorted(new int[]{}, 11),-1,"Not correct");
    }

    @Test
    public void testMethodSort() {
        int[] testArr = new int[]{1, 3, 2, 5, 7, 6, 4, 9, 8};
        int[] expectedArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] testArr2 = new int[]{-1, 3, -2, 5, 7, -6, 4, -9, 8};
        int[] expectedArr2 = new int[]{-9, -6, -2, -1, 3, 4, 5, 7, 8};

        Assert.assertEquals(Methods.sort(testArr),expectedArr,"Not correct");
        Assert.assertEquals(Methods.sort(testArr2),expectedArr2,"Not correct");
    }
}
