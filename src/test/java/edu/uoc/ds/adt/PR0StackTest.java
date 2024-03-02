package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    private void fillStack() {
        for (int i = 0; i <= 360; i+=10) {
            pr0q.push(i);
        }
    }

    @Before
    public void setUp() {
        this.pr0q = new PR0Stack();

        assertNotNull(this.pr0q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr0q.CAPACITY, this.pr0q.getStack().size());

        assertEquals( new String("0 -0,174 -0,342 -0,5 -0,643 -0,766 -0,866 -0,94 -0,985 -1 -0,985 -0,94 " +
                "-0,866 -0,766 -0,643 -0,5 -0,342 -0,174 0 0,174 0,342 0,5 0,643 0,766 0,866 0,94 0,985 1 0,985 " +
                "0,94 0,866 0,766 0,643 0,5 0,342 0,174 0 "), this.pr0q.clearAllStack());

        assertEquals(0, this.pr0q.getStack().size());
    }
}
