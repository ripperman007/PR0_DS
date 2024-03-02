package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 37;

    private Queue<Double> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString().replaceAll("\\.0 ", " ").replaceAll("\\.", ",");
    }

    public Queue<Double> getQueue() {
        return this.queue;
    }

    public void add(int num) {
        double rounded = Math.sin(Math.toRadians(num)) * 1000.0;
        this.queue.add(Math.round(rounded) / 1000.0);
    }
}
