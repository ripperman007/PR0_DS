package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;

    private void fillQueue() {
        for (int i = 0; i <= 360; i+=10) {
            pr0q.add(i);
        }
    }
    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getQueue().size());

        assertEquals(
                new String("0 0,174 0,342 0,5 0,643 0,766 0,866 0,94 0,985 1 0,985 0,94 0,866 0,766 0,643 0,5 " +
                        "0,342 0,174 0 -0,174 -0,342 -0,5 -0,643 -0,766 -0,866 -0,94 -0,985 -1 -0,985 -0,94 -0,866 -0,766 " +
                        "-0,643 -0,5 -0,342 -0,174 0 "), this.pr0q.clearFullQueue());

        assertEquals(0, this.pr0q.getQueue().size());
    }

}
