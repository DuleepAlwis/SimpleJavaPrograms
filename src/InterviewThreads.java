public class InterviewThreads {

    public static void main(String [] args){
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t = new ThreadTwo();
        Thread t2 = new Thread(t);
        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}

class ThreadOne extends Thread{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T1 "+i);
        }
    }
}

class ThreadTwo implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T2 "+i);
        }
    }
}
