package edu.iis.mto.serverloadbalancer;

/**
 * Created by Konrad Gos on 13.06.2017.
 */
public class ServerBuilder implements Builder<Server> {
    private int capacity;

    public ServerBuilder withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public Server build() {
        return new Server(capacity);
    }

    public static ServerBuilder server() {
        return new ServerBuilder();
    }
}
