
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {

        try {

            if (args.length < 3) {
                System.out.println("Usage: java Client <num1> <op> <num2>");
                return;
            }


            Registry registry= LocateRegistry.getRegistry("localhost",1099);
            Calculator obj=( Calculator)registry.lookup("CalculatorService");
            double x = Double.parseDouble(args[0]); // أول رقم
            String op = args[1];                    // العملية (+ - * /)
            double y = Double.parseDouble(args[2]); // ثاني رقم

              switch (op){
                  case "+":
                      System.out.println(obj.add(x, y));
                      break;

                  case "-":
                      System.out.println(obj.subtract(x, y));
                      break;

                  case "*":

                      System.out.println(obj.multiply(x, y));
                      break;

                  case "/":
                      System.out.println(obj.divide(x, y));
                      break;

                  default:
                      System.out.println("Invalid operation");
              }


        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    }

