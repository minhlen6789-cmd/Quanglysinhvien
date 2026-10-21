import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String name= sc.nextLine();
        System.out.print("Nam sinh: ");
        int year= sc.nextInt();
        System.out.print("Diem trung binh: ");
        double mark= sc.nextDouble();
        System.out.println("Ho ten: "+name);
        System.out.println("Nam sinh: "+year);
        System.out.println("Diem trung binh: "+mark);
    }
}