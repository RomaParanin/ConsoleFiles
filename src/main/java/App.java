package main.java;

        import main.java.service.Operations;

public class App {

    public static void main(String[] args) {
        Operations operation = Operations.getInstance();
        try{
            operation.action();
        } catch (IllegalArgumentException e){
            System.out.println("oshibka");
        }
    }
}
