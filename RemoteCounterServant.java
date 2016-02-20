package sd;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RemoteCounterServant extends UnicastRemoteObject implements RemoteCounterI{
    private int c;
    
    public RemoteCounterServant()throws RemoteException {
	c = 0;
    }

    public void clean() throws RemoteException{
	System.out.println("chamou clean");
	c=0;
     }

    public  void increment(int n) throws RemoteException{
	System.out.println("chamou increment");
        c += n;
    }

    public int read() throws RemoteException{
	System.out.println("chamou read");
        return c;
    } 
}
