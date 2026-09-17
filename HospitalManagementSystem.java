import java.util.Scanner;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("================================");

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();

        System.out.println("\n--------- PATIENT DETAILS ---------");

        System.out.println("Patient Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Gender       : " + gender);
        System.out.println("Disease      : " + disease);
        System.out.println("Doctor       : " + doctor);

        System.out.println("-----------------------------------");
        System.out.println("Patient registered successfully!");

        sc.close();
    }
}