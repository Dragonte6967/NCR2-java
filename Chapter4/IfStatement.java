package Chapter4;

public class IfStatement{
    public static void main(String[] args) {
        int x = (int)(Math.random()*100);
        System.out.println("x: " + x);
        if(x>=60){
            System.out.println("Pass the examination!");
            System.out.println("Congratulations!");
            System.out.println("Have a Good Day");
        }
        System.out.println("Bye bye");
    }
}