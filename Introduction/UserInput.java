import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Enter your registration number: ");
        long reg = scanner.nextLong();
        System.out.println("Enter your Department:");
        String department = scanner.next();
        System.out.println("Enter your phonenumber :");
        long phonenumber = scanner.nextLong();
        System.out.println("Enter your CGPA :");
        float cgpa = scanner.nextFloat();
        double salary=97500.5670;


        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + reg);  
        System.out.println("Department: " + department);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("name : "+name+"Regitser number"+ reg);
        //format using 
        System.out.printf("Name: %s ,reg: %d%n",name,reg);
        //formating with width nad precision (salary as round dont want after decimal )
        System.out.printf("salary: $%,.2f",salary);

        scanner.close();
    }
}