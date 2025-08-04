import java.util.Scanner;

public class Day_14D2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.print("Enter the string 2 : ");
        String str2 = sc.nextLine();
        System.out.print("Enter the integer : ");
        int a = sc.nextInt();
        System.out.print("Enter the integer2 : ");
        int b = sc.nextInt();
        System.out.println("Enter the string3: ");
        String str3 = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(a,'#');
        System.out.println(sb); // set chara at

        System.out.println(sb.reverse()); // reverse

        System.out.println(sb.append(str2+a+b));  // append data

        System.out.println(sb.delete(a,b));  // delete char range
        System.out.println(sb.deleteCharAt(b));  // delete char at

        System.out.println(sb.insert(a,str3)); // insert method

        System.out.println(str.compareTo(str2));  // compare method
    }
}
