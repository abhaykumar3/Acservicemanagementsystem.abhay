import java.util.*;    //abhay kumar (12104849)

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Work you want to do: ");
            System.out.println("1. Add Customer");
            System.out.println("2. Add AC Unit");
            System.out.println("3. Schedule Service Appointment");
            System.out.println("4. Assign Technician");
            System.out.println("5. Mark Appointment as Completed");
            System.out.println("6. View Appointments");
            System.out.println("7. View Technicians");
            System.out.println("8. Quit");
        int x = sc.nextInt();


        switch (x) {
            case 1:
            System.out.println("1. Add Customer");

                break;
            case 2:
            System.out.println("2. Add AC Unit");

                break;
            case 3:
            System.out.println("3. Schedule Service Appointment");

                break;
            case 4:
            System.out.println("4. Assign Technician");

                break;
            case 5:
            System.out.println("5. Mark Appointment as Completed");

                break;
            case 6:
            System.out.println("6. View Appointments");

                break;
            case 7:
            System.out.println("7. View Technicians");

                break;
            case 8:
            System.out.println("8. Quit");
                break;
                
        
            default:
                break;
        }
    }
}
