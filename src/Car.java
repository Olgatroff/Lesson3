public class Car {
    String color;
    String brand;

    public void goCar(){
        System.out.println("едет");
    }
    public void stopCar(){
        System.out.println("тормозит");
    }

//    public String goCar(){
//        return "едет";
//    }
//
//    public String stopCar(){
//        return "тормозит";
//    }

    public static void main(String[] args) {
        Car mercedesBenz = new Car();
        mercedesBenz.color = "Black";
        mercedesBenz.brand = "Mercedes Benz";

        Car bmw = new Car();
        bmw.color = "White";
        bmw.brand = "BMW";

        Car ferrari = new Car();
        ferrari.color = "Red";
        ferrari.brand = "Ferrari";

        System.out.println("В автопарке в наличии есть следующие автомобили:" + "\n" + "Марка:" + " " +
                mercedesBenz.brand + "," + " " + "цвет:" + " " + mercedesBenz.color + "\n" +
                "Марка:" + " " + bmw.brand + "," + " " + "цвет:" + " " + bmw.color + "\n" +
                "Марка:" + " " + ferrari.brand + "," + " " + "цвет:" + " " + ferrari.color);

        System.out.println("Сейчас" + " " + mercedesBenz.brand);
        mercedesBenz.goCar();
        mercedesBenz.stopCar();

        System.out.println("Сейчас" + " " + bmw.brand);
        bmw.goCar();
        bmw.stopCar();

        System.out.println("Сейчас" + " " + ferrari.brand);
        ferrari.goCar();
        ferrari.stopCar();

//        System.out.println("Сейчас" + " " + mercedesBenz + mercedesBenz.goCar());
    }

}