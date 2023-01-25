import java.rmi.Naming;

public class Server {
    public Server() {
     try {
       Converter c = new Impl();
       Naming.rebind("rmi://localhost:1099/ConverterService", c);
     } catch (Exception e) {
       System.out.println("Trouble: " + e);
     }
   }

   public static void main(String args[]) {
     new Server();
   }
}
