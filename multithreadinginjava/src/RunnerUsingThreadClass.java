public class RunnerUsingThreadClass extends Thread{

    @Override
    public void run() {
        for(int i=0;i<11;i++){
            System.out.println("From Runner "+i);
        }
    }
    
}
