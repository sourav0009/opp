import java.util.*;
class Th extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("028");
            i+=1;
        }
    }
}
class Th1 extends Thread{
    public void run(){
        int i=0;
        while(i<15){
            System.out.println("Sourav");
            i+=1;
        }
    }
}
public class imp_of_thread {
    public static void main(String[] args) {
        Th t=new Th();
        Th1 t1=new Th1();
        t.start();
        t1.start();
    }
}
