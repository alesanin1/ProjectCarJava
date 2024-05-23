package Methods;
import java.util.ArrayList;
import java.util.Scanner;
import Object.Car;

public class Crud {
    static ArrayList <Car> list= new ArrayList<>();
    static int carQuantity;
    static Scanner sc= new Scanner(System.in);

    public static void addingCar(){
        System.out.println("Então você deseja Adicionar um carro, Primeiro diga o nome do mesmo:");
        String nameCar=sc.next();
        System.out.println("Agora diga o Ano:");
        int yearcar=sc.nextInt();
        System.out.println("Agora diga o preço do carro:");
        float valueCar=sc.nextFloat();
        carQuantity=list.size()+1;
        Car object= new Car(nameCar,carQuantity,yearcar,valueCar);
        list.add(object);
        System.out.println("Carro adicionado"); 
    }

    public static void deleteCar() {

        System.out.println("Você irá deletar um carro? caso sim, digite a posição ou escreva cancelar");
        String deleteCar=sc.next();
        if (deleteCar.equalsIgnoreCase("cancelar")){
            System.out.println("Cancelado!");
        }
        else{
            int deleteCarint=Integer.parseInt(deleteCar);
            list.remove(deleteCarint-1);
            for (Car object:list) {
                list.get(list.indexOf(object)).setCarId(list.indexOf(object)+1);
            }
            System.out.println("Carro deletado");
            
        }
        
    }

    public static void attCar() {
        System.out.println("Você realmente deseja atualizar um dado? Por favor digite o Número do Carro: ");
        int num= sc.nextInt();
        System.out.println("Digite a Opção escolhida: \n 1- Modelo; \n 2-Ano; \n 3-Preço; \n 4-cancelar(apertar enter apenas) ");
        int op=sc.nextInt();

        switch (op) {
            case 1:{
                System.out.println("Digite o novo Nome do Modelo:");
                String carModel= sc.next();
                list.get(num-1).setCarModel(carModel);
                
                break;
            }

            case 2:{
                System.out.println("Digite o novo Ano do Modelo");
                int carYear=sc.nextInt();
                list.get(num-1).setCarYear(carYear);

                break;
            }

            case 3:{
                System.out.println("Digite o novo Preço do Carro");
                int carPrice=sc.nextInt();
                list.get(num-1).setCarPrice(carPrice);
             
                break;
            }
            default:
            System.out.println("Não houve alteração, voltando ao inicio...");
                break;
        }
        System.out.println("Dados Atualizados!");
        
    }

    public static void viewCar() {
        for (Car object: list){
            System.out.println(object);
        }
        
    }


}
