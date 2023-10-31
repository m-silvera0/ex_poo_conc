public class For4 extends Thread{
    public void run(){
        int z=0;
        for (int i = 0; i <50; i++){
            z=z+5;
            System.out.println("Executando For 4");
            try{
                Thread.sleep(100);
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Valor Final de z: "+z);
        }
    }
}