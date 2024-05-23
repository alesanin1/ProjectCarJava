package MainFile;
import java.util.Scanner;





public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int userDecision;

        do{
            System.out.println("§§§§§§§ Olá, seja bem vindo a Loja de Carro! §§§§§§§§");
            System.out.println("______________________\n Digite a opção Desejada:\n1 Adicionar um dado:\n1 Deletar um dado:\n2 Atualizar dados:\n3 Ler os dados:\n4 Limpar tela\n5 Sair da aplicação.\n______________________");
            userDecision=sc.nextInt();

            switch (userDecision) {
                case 1:{
                    Methods.Crud.addingCar();
                    
                    
                    break;
                }
                    
                    
                case 2:{
                    Methods.Crud.deleteCar();
                    
                    break;
                }
                    
            
                case 3:{
                    System.out.println("Leitura de dados");
                    Methods.Crud.viewCar();
                    break;
                }
                    

                case 4:{
                    System.out.println("\n\n\n\n\n\n\n");
                    break;
                
                }
                    

                case 5:{
                    System.exit(0);
                    break;
                }
                   
        }
    }
    while(userDecision!=5);
}
}

