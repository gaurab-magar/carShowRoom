import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details(){
        System.out.println("Name : " + car_name);
        System.out.println("Color : " + car_color);
        System.out.println("Fuel Type : " + car_fuel_type);
        System.out.println("Car Price : " + car_price);
        System.out.println("Car Type : " + car_type);
        System.out.println("Transmission : " + car_transmission);
    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("******* ***/ Enter Car Details /*** *******");
        System.out.println();
        System.out.println("Car Name : ");
        car_name = sc.nextLine();
        System.out.println("Car color");
        car_color = sc.nextLine();
        System.out.println("Car Fuel Type");
        car_fuel_type = sc.nextLine();
        System.out.println("Car Price");
        car_price = sc.nextInt();
        System.out.println("Car Type");
        car_type = sc.nextLine();
        System.out.println("Car Transmission");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;
    }
}
