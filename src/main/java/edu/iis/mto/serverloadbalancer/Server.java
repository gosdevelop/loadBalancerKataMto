package edu.iis.mto.serverloadbalancer;

/**
 * Created by Konrad Gos on 11.06.2017.
 */
public class Server {
    public double currentLoadPercentage;
    public int capacity;

    public boolean contains(Vm theVm) {
        return true;
    }

    public Server(int capacity) {
        super();
        this.capacity = capacity;
    }
}
