package virtualThread;

import java.util.ArrayList;
import java.util.List;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for(int i=0;i<1000000;i++){
           var thread =  Thread.ofVirtual().unstarted(()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.setName("Thread"+i);
            thread.start();
            System.out.println("Thread number: "+i);
            threads.add(thread);
        }
        for (Thread thread: threads){
            thread.join();
            System.out.println("Completed: "+thread.getName());
        }
    }
}
