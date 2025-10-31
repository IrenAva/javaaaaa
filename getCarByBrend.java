public class getCarByBrend {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000, "ABC123"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000, "DEF456"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "GHI789")
        };
        
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено машин Toyota: " + toyotaCars.length);
    }
    
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index++] = car;
            }
        }
        
        return result;
    }
}