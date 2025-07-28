package ACP;

public class Concurrency5 {
    public static void main(String[] args) {
        Thread thread3 = new Thread(()->{
            try{
                Thread.sleep(2);
                for(int i=100000;i>0;i--){

                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        },"states");
        thread3.start();

        while(true){
            Thread.State state = thread3.getState();
            System.out.println(state);
            if(state == Thread.State.TERMINATED) break;
        }
    }
}
