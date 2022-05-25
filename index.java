import java.util.Scanner;

public class index  {
    public static void main(String[] args){
        menu m = new menu();
        Scanner ler = new Scanner(System.in);
        contador y = new contador();
        int sair=1;
        while(sair!=0){
            m.opcoes();
            int x = ler.nextInt();
            sair = m.escolha(y, x);
        }
        ler.close();
        
    }   

    
}
