package edu.iis.mto.serverloadbalancer;

/**
 * Created by Konrad Gos on 13.06.2017.
 */
public class ServerBuilder implements Builder<Server> {
    private int capacity;
    private double initialLoad;

    public ServerBuilder withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public Server build() {
        Server server = new Server(capacity);
        adInitialLoad(server);
        return server;
    }

    private void adInitialLoad(Server server) {
        if (initialLoad > 0) {
            int initialVmSize = (int) (initialLoad / (double) capacity * 100.0d);
            Vm initialVm = VmBuilder.vm().ofSize(initialVmSize).build();
            server.addVm(initialVm);
        }
    }

    public static ServerBuilder server() {
        return new ServerBuilder();
    }

    public ServerBuilder withCurrentLoadOf(double initialLoad) {
        this.initialLoad = initialLoad;
        return this;
    }
}
