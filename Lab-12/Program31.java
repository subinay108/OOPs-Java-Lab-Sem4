// WAP in Java to implement thread

class NewThread extends Thread{
    int sleepTime;
    NewThread(String name, int sleepTime){
        super(name);
        this.sleepTime = sleepTime;
        start();
    }

    @Override
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(this + " : " + i);
                Thread.sleep(sleepTime);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Exiting Child... " + this);
    }

}

public class Program31{
    public static void main(String[] args){
        NewThread t1 = new NewThread("Thread1", 1000);
        NewThread t2 = new NewThread("Thread2", 2000);
        
        // Waiting for theads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting...");
        
    }
}