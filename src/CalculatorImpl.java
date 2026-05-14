
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImpl extends  UnicastRemoteObject implements  Calculator{


    public CalculatorImpl()throws RemoteException{
        super();
    }
    @Override
    public double add(double x, double y) throws RemoteException {
        return x+y;
    }

    @Override
    public double subtract(double x, double y) throws RemoteException {
        return x-y;
    }

    @Override
    public double divide(double x, double y) throws RemoteException {
        if (y == 0) {
            throw new RemoteException("Cannot divide by zero");
        }
        return x / y;

    }

    @Override
    public double multiply(double x, double y) throws RemoteException {
        return x*y;
    }

}
