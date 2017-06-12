package edu.iis.mto.serverloadbalancer;

/**
 * Created by Konrad Gos on 12.06.2017.
 */
public class ServerLoadBalancer {
    public void balance(Server[] servers, Vm[] vms) {
        if(vms.length > 0) {
            servers[0].currentLoadPercentage=100.0d;
        }
    }
}
