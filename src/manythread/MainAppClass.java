package manythread;

public class MainAppClass {
    public static void main(String[] args) throws InterruptedException {
        testthread thread1 = new testthread();
        testingthreads thread2 = new testingthreads();
        thread1.start();
        thread2.start();
        Thread thread3 = new Thread(() -> {
            System.out.println("mt is working");
            for(int i = 0; i < 12; i++)
            {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread3.sleep(5000);
        thread3.start();
        //thread1.setPriority(10);
        //thread2.setPriority(1);


        //System.out.println("Priority of the first thread: " + thread1.getPriority());
        //System.out.println("Priority of the second thread: " + thread2.getPriority());
    }
}
