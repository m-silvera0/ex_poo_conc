public class For3 extends Thread{
    public void run(){
        int w=0;
        for (int i = 0; i <50; i++){
            w=w+4;
            System.out.println("Executando For 3");
            try{
                Thread.sleep(100);
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Valor Final de w: "+w);
        }
    }
}