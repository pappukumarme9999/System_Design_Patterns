public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car("Tesla", "Electric");
        Car clonedCar = originalCar.clone();

        System.out.println(originalCar);  // Output: Car [model=Tesla, engine=Electric]
        System.out.println(clonedCar);    // Output: Car [model=Tesla, engine=Electric]
    }
}
