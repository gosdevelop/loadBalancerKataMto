package edu.iis.mto.serverloadbalancer;

/**
 * Created by Konrad Gos on 12.06.2017.
 */
public class ServerLoadBalancer {
    public void balance(Server[] servers, Vm[] vms) {
        for (Vm vm : vms) {
            servers[0].addVm(vm);
        }

    }
}
