package at.fhj;

public class Main {
    public static void main(String[] args) {
        // in main method
       System.out.printf("Hallo!");
       new Main().doIt();
    }

    public void doIt(){
        System.out.println("I did it!");
    }
}