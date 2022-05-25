import java.util.Scanner;

public class menu {
    Scanner l = new Scanner(System.in);
    public void opcoes(){
        System.out.println("=========Opcoes========");
        System.out.println("1-Zerar");
        System.out.println("2-incrementar");
        System.out.println("3-retornar contador");
        System.out.println("4-sair");
        System.out.print("Sua opcao:");       
    }
    public int escolha(contador x, int a){
        switch(a){
            case 1:
                x.zerar();
                System.out.println("Contador zerado");
                return 1;
            case 2:
                System.out.print("Quantos numeros deseja incrementar: ");
                int cont = l.nextInt();
                for(int i=0; i<cont; i++){
                    x.incrementar();
                }
                return 1;
            case 3:
                System.out.println("o contador está no "+x.retornar());
                return 1;
            default:
                return 0;
        }
    } 
}
