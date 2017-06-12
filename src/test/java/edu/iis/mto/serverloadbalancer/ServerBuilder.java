package edu.iis.mto.serverloadbalancer;

/**
 * Created by Konrad Gos on 12.06.2017.
 */
public class ServerBuilder implements Builder<Server> {
    private int capacity;

    public ServerBuilder withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public Server build() {
        return new Server();
    }

    public static ServerBuilder server() {
        return new ServerBuilder();
    }
}
