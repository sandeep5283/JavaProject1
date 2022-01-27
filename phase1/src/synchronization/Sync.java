package synchronization;

public class Sync { 
    public void send(String msg){ 
        System.out.println("Sending\t"  + msg ); 
        try{ 
            Thread.sleep(1000); 
        } 
        catch (Exception e) { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread{ 
    private String msg; 
  //  private Thread t; 
    Sync  Sync; 
    ThreadedSend(String m,  Sync obj) 
    { 
        msg = m; 
        Sync = obj; 
    } 
  
    public void run() 
    {  
        synchronized(Sync) 
        { 
            Sync.send(msg); 
        } 
    } 
} 
class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
        Sync snd = new Sync(); 
        ThreadedSend S1 = 
            new ThreadedSend( " Hi " , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 