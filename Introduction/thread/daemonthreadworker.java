package thread;

public class daemonthreadworker {
    public static void main(String[] args) {
       cleaner c1=new cleaner();
       c1.setDaemon(true);
       c1.start();  
       System.out.println("Main thread is running");
    }
    
}
class cleaner extends Thread{
    public void run(){
        while(true){
            System.out.println("Cleaner is cleaning the room");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}