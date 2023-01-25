import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            Converter c = (Converter) Naming.lookup(
                    "rmi://localhost/ConverterService");

            Scanner sc = new Scanner(System.in);
            int ch = 1;
            double val;
            while (ch != 0) {
                System.out.println(
                        "\nCurrency Convertor\n\nWhich currency would you like to convert?\n\n1.MYR to USD\n2.MYR to EUR\n3.MYR to AUD\n4.MYR to GBP\n5.MYR to CAD\n\nPress 0 to exit");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Amount");
                        val = sc.nextInt();
                        System.out.println("MYR to USD");
                        System.out.println(c.con(val, ch));
                        break;
                    case 2:
                        System.out.println("Enter Amount");
                        val = sc.nextInt();
                        System.out.println("MYR to EUR");
                        System.out.println(c.con(val, ch));
                        break;
                    case 3:
                        System.out.println("Enter Amount");
                        val = sc.nextInt();
                        System.out.println("MYR to AUD");
                        System.out.println(c.con(val, ch));
                        break;
                    case 4:
                        System.out.println("Enter Amount");
                        val = sc.nextInt();
                        System.out.println("MYR to GBP");
                        System.out.println(c.con(val, ch));
                        break;
                    case 5:
                        System.out.println("Enter Amount");
                        val = sc.nextInt();
                        System.out.println("MYR to CAD");
                        System.out.println(c.con(val, ch));
                        break;
                    default:
                        System.out.println("Exit");
                        break;
                }
            }
        } catch (MalformedURLException murle) {
            System.out.println();
            System.out.println(
                    "MalformedURLException");
            System.out.println(murle);
        } catch (RemoteException re) {
            System.out.println();
            System.out.println(
                    "RemoteException");
            System.out.println(re);
        } catch (NotBoundException nbe) {
            System.out.println();
            System.out.println(
                    "NotBoundException");
            System.out.println(nbe);
        } catch (java.lang.ArithmeticException ae) {
            System.out.println();
            System.out.println(
                    "java.lang.ArithmeticException");
            System.out.println(ae);
        }
    }
}
