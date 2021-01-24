package manythread;

public class testingthreads extends Thread {
    public void run()
    {
        for(int i = 0; i < 12; i++)
        {
            System.out.println("The 2-nd thread");
        }
    }


}
