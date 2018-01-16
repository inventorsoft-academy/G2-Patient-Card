import com.veboro.patientcard.registry.DoctorNavigation;
import com.veboro.patientcard.registry.PatientNavigation;
import com.veboro.patientcard.users.Patient;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        boolean menuOn = true;
        int  userChoise = 0;
        Scanner scanner = new Scanner(System.in);
        String startMenu = "1.Patient \n2.Doctor";


            System.out.println("Welcome to Hospital patient system");
            System.out.println("Who are you?");
            System.out.println(startMenu);

        while (menuOn) {
            System.out.print("Enter your choice: ");
            String userType = scanner.nextLine();

            //Checking is it number
            try {
                userChoise = Integer.parseInt(userType);
            } catch (NumberFormatException e) {

            }

            //Checking for correct number
            if(userChoise >0 && userChoise<=2) {

                if (userChoise == 1) {
                    PatientNavigation patientNavigation = new PatientNavigation(0);
                    patientNavigation.patientAuthMenu();
                    menuOn = false;
                }
                else if(userChoise == 2){
                    DoctorNavigation doctorNavigation = new DoctorNavigation(0);
                    doctorNavigation.doctorMenu();
                    menuOn = false;
                }
            }
            else {
                System.out.println("Enter correct number\n"+startMenu);
            }
        }
    }
}
