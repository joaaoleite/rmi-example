package sd;
import java.rmi.*;

public interface RemoteCounterI extends Remote {
    void clean() throws RemoteException;  	    
    void increment(int n) throws RemoteException;
    int read() throws RemoteException;
}
