package sd;
import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String args[]){

        try{
            RemoteCounterI remoteCounter = new RemoteCounterServant();
            
            Registry reg = LocateRegistry.createRegistry(1234);
	    reg.rebind("myCounter", remoteCounter);
	    
            System.out.println("counter server ready");
        }catch(Exception e) {
            System.out.println("counter server main " + e.getMessage());
        }

    }
}
