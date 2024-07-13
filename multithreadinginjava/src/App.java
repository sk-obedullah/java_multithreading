public class App {
    public static void main(String[] args) throws Exception {
        // using run method implemented by extending thread class
        Thread t = new RunnerUsingThreadClass();
        t.start();
        // usinf run method implemntation of runnable interface
        RunnerUsingRunnableInterface t2 = new RunnerUsingRunnableInterface();
        t2.run();

        // using thread and implementation of run as annonymous class

        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 11; i++) {
                    System.out.println("From InterfaceImplemented Runner as annonymous " + i);
                }
            }

        });

        t3.start();

    }
}
