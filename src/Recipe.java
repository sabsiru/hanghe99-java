import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요리 이름 입력");
        String recipeName = sc.nextLine();
        System.out.println("별점을 입력하세요.");
        double price = sc.nextDouble();
        double percent = price * 20;

        sc.nextLine();
        String[] desc = new String[10];
        for (int i = 0; i < desc.length; i++) {
            desc[i] = sc.nextLine();
        }

        System.out.println("["+recipeName+"]");
        System.out.println("별점 : "+price+"("+percent+"%)");
        for(int i = 0; i < desc.length; i++) {
            System.out.println(i+1+"."+desc[i]);
        }

        sc.close();

    }
}
