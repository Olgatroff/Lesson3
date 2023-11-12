public class CarTask3 {
    String brand;
    String color;

    public CarTask3(){

    }

    public CarTask3 (String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public static void main(String[] args){
        CarTask3 mercedesBenz = new CarTask3("Mercedes Benz", "черный");
        CarTask3 bmw = new CarTask3("BMW", "белый");
//        CarTask3 ferrari = new CarTask3("Ferrari", "красный");

        CarTask3 ferrari = new CarTask3();
            ferrari.brand = "Ferrari";
            ferrari.color = "красный";

        System.out.println("В автопарке в наличии есть следующие автомобили:" + "\n" + "Марка:" + " " + mercedesBenz.brand +
                "," + " " + "цвет:" + " " + mercedesBenz.color + "\n" + "Марка:" + " " + bmw.brand + "," + " " + "цвет:" +
                " " + bmw.color + "\n" + "Марка:" + " " + ferrari.brand + "," + " " + "цвет:" + " " + ferrari.color);
    }
}