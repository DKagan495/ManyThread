package manythread;
public class testthread extends Thread {
public void run()
{
   for (int i = 0; i < 12; i++)
   {
       System.out.println("The 1-st thread");
   }

}

}
