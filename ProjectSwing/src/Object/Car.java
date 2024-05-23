package Object;

public class Car {
    int carId;
    String carModel;
    int carYear;
    float carPrice;

    public String getCarModel(){
        return carModel;
    }

    public void setCarModel(String carModel){
        this.carModel=carModel;
    }

    public int getCarId(){
        return carId;
    }
    public void setCarId(int carId){
        this.carId=carId;
    }

    public int carYear(){
        return carYear;
    }

    public void setCarYear(int carYear){
        this.carYear=carYear;
    }

    public Float carPrice(){
        return carPrice;
    }

    public void setCarPrice(float carPrice){
        this.carPrice=carPrice;
    }

    public Car(String carModelVariable,int carIdVariable,int carYearVariable,float carPriceVariable){
        carModel=carModelVariable;
        carId=carIdVariable;
        carYear=carYearVariable;
        carPrice=carPriceVariable;
    }

    public String toString(){
         return "\n Carro Numero: "+ carId +"\n Modelo: "+ carModel +  "\n Ano de Fabricação: " +carYear+ "\n Preço FIPE: " +carPrice;
    }
}
