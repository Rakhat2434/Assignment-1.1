import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year >= 1000 && year < 10000){
            if(year / 100 == 31){
                System.out.println(year - 8);
            }
            else{
                System.out.println("Wrong year");
            }
        }
        else{
            System.out.println("Wrong year");}
    }
}