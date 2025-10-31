public class getCarByBrendAndYearOperational {
    public static void main(String[] args) {
        // Тестовые данные
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2018, "Black", 25000, "ABC123"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000, "DEF456"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "GHI789"),
            new Car(4, "Toyota", "RAV4", 2015, "Blue", 18000, "JKL012")
        };
        
        // Тестирование метода getCarByBrend
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено машин Toyota: " + toyotaCars.length);
        
        // Тестирование метода getCarByBrendAndYearOperational
        int currentYear = 2024;
        Car[] oldToyotaCars = getCarByBrendAndYearOperational(cars, "Toyota", 5, currentYear);
        System.out.println("Найдено машин Toyota старше 5 лет: " + oldToyotaCars.length);
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
    
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years, int currentYear) {
        int count = 0;
        // Подсчитываем количество машин, удовлетворяющих условиям
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend) && (currentYear - car.getYear()) > years) {
                count++;
            }
        }
        
        // Создаем массив результатов
        Car[] result = new Car[count];
        int index = 0;
        
        // Заполняем массив
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend) && (currentYear - car.getYear()) > years) {
                result[index++] = car;
            }
        }
        
        return result;
    }
}