import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class TTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() {
    }

    @Test
    public void callArgumentInstance() {
    }

    @Test
    public void test() {
        List list = Mockito.mock(List.class);

        Mockito.when(list.add("one")).thenReturn(true);
        Mockito.when(list.size()).thenReturn(2);

        Assert.assertTrue(list.add("one"));
        Assert.assertEquals(list.size(), 1);


    }
}