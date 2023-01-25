public class Impl extends java.rmi.server.UnicastRemoteObject implements Converter{
    public Impl() 
        throws java.rmi.RemoteException { 
        super(); 
    } 
 
    public double con(double a, int b) 
        throws java.rmi.RemoteException { 
	switch(b){        
	case 1:
                System.out.println("MYR to USD");
		return a*0.227; 
	case 2:
                System.out.println("MYR to EUR");
		return a*0.212; 
	case 3:
                System.out.println("MYR to AUD");
		return a*0.333; 
	case 4:
                System.out.println("MYR to GBP");
		return a*0.188; 
	case 5:
                System.out.println("MYR to CAD");
		return a*0.308; 
	default:
		break;
	}
	return 0;
    } 
}
