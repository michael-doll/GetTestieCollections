package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    @Test
    public void TestAdd(){
        Vector vector = new Vector();
        vector.add(1);

        Assert.assertTrue(vector.contains(1));
    }
    @Test
    public void TestEnsureCapacity(){
        Vector vector = new Vector();
        vector.add(1);
        vector.ensureCapacity(54);

        int expected = 54;
        int actual = vector.capacity();
        Assert.assertEquals(expected,actual);
    }
}
