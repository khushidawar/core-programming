import java.util.Scanner;
public class youngestfriend {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Ages
    System.out.print("Enter Amar's Age: ");
    int amarAge = sc.nextInt();
    System.out.print("Enter Akbar's Age: ");
    int akbarAge = sc.nextInt();
    System.out.print("Enter Anthony's Age: ");
    int anthonyAge = sc.nextInt();

    // Heights
    System.out.print("Enter Amar's Height: ");
    int amarHeight = sc.nextInt();
    System.out.print("Enter Akbar's Height: ");
    int akbarHeight = sc.nextInt();
    System.out.print("Enter Anthony's Height: ");
    int anthonyHeight = sc.nextInt();

    // Youngest
    if (amarAge < akbarAge && amarAge < anthonyAge)
        System.out.println("Youngest Friend: Amar");
    else if (akbarAge < anthonyAge)
        System.out.println("Youngest Friend: Akbar");
    else
        System.out.println("Youngest Friend: Anthony");

    // Tallest
    if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
        System.out.println("Tallest Friend: Amar");
    else if (akbarHeight > anthonyHeight)
        System.out.println("Tallest Friend: Akbar");
    else
        System.out.println("Tallest Friend: Anthony");

    sc.close();
}
}
