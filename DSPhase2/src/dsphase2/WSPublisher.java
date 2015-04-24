/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsphase2;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Amaya
 */
public class WSPublisher {
    
    private static WSPublisher instance=null;
    
    private WSPublisher(){
        
    }
    
    public static WSPublisher getInstance(){
        if(instance==null){
            return new WSPublisher();
        }
        else{
            return instance;
        }
    }

    public void publishWebService(String ip, int port) {
        Endpoint.publish("http://" + ip + ":" + port + "/ws/netlingoservice", new ReceiverWebServiceImpl());
    }

    public static void main(String[] args) {
	  Endpoint.publish("http://localhost:9999/ws/netlingoservice", new ReceiverWebServiceImpl());
        //publishWebService("localhost", 9999);
    }
}
