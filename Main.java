import java.util.Scanner;

interface utility{
    public void get_details();
    public void set_details();
}
public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("***** Welcome to showroom management system *****");
        System.out.println();
        System.out.println("**** Enter Your Choice *****");
        System.out.println();
        System.out.println("1).ADD Showrooms \t\t\t 2). ADD Employees \t\t\t 3). ADD Cars");
        System.out.println();
        System.out.println("4).Get Showrooms \t\t\t 5). Get Employees \t\t\t 6). Get Cars");
        System.out.println();
        System.out.println("******** Enter 0 to exit to get out of the application  ********");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Cars car[] = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;

        while(choice!=0){
            main_menu();
            choice = sc.nextInt();

            while (choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1). ADD new showroom");
                        System.out.println("9). Go Back main menu");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_counter] = new Employees();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2). ADD new Employee");
                        System.out.println("9). Go Back main menu");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        employee[employees_counter] = new Employees();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2). ADD new Employee");
                        System.out.println("9). Go Back main menu");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for(int i=0; i<showroom_counter; i++){
                            showroom[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). Go Back To Main Menu");
                        System.out.println("0). Exist");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++){
                            employee[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). Go Back To Main Menu");
                        System.out.println("0). Exist");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for(int i=0; i<car_counter; i++){
                            car[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). Go Back To Main Menu");
                        System.out.println("0). Exist");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid choice: ");
                        break;
                }
            }
        }
    }
}