import java.util.Scanner;

public class Day_14D {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Siddhi Jadhav loves cake very much ");
        System.out.println(sb.charAt(7));  // char of string

        System.out.println(sb.capacity());  // capacity of string

        sb.setCharAt(4,'o');
        System.out.println(sb); // setting new char

        System.out.println(sb.length()); // length of string

        System.out.println(sb.insert(9,"cake18")); // inserting the new char sequence

        System.out.println(sb.delete(7,12)); // deleting range of char
        System.out.println(sb.deleteCharAt(18)); // deleting char of a particular index
        System.out.println(sb.delete(0,sb.length())); // deleting complete string

        System.out.println(sb.append("She has a teddyBear name CANDY ")); // adding data at last

        System.out.println(sb.reverse());  // reversing a string

        System.out.println(sb.replace(0,sb.length(),"HELLO!! I'm learning Java Programming "));  // replacing the string

        System.out.println(sb.indexOf("m"));
        System.out.println(sb.indexOf("n",25));
        System.out.println(sb.lastIndexOf("n"));
        System.out.println(sb.lastIndexOf("l",8));

        System.out.println(sb.subSequence(3,8)); // extracting the particular sequence of character
        System.out.println(sb.substring(6));
        System.out.println(sb.substring(6,24));

        StringBuilder append = sb.append(" NIce");
        System.out.println(sb.equals(append));
        System.out.println(sb.equals("HELLO!! I'm learning Java Programming "));

        sb.setLength(40);
        System.out.println(sb);  // setting the new length/size of string
        System.out.println(sb.append("NICE"));

        StringBuilder sb2 = new StringBuilder("  Choclate cake,Vanilla cake ");

         sb2.trimToSize();
        System.out.println(sb2); // trimming the string

        System.out.println(sb2.indexOf("i")); // checking index of 'i' in string2
        System.out.println(sb2.indexOf("a",9)); // checking index of 'a' in string2  fromIndex 9
        System.out.println(sb2.lastIndexOf("c"));  // checking last index of 'c'
        System.out.println(sb2.lastIndexOf("c",12));   // checking last index of 'c' from the index 12

        System.out.println(sb==sb2); // == operator
        System.out.println(sb.compareTo(sb2)); // comparing string1 to string2
        System.out.println(sb2.compareTo(sb)); // comparing string2 to string1

        //STRING BUFFER

        StringBuffer sb3 = new StringBuffer(" StringBuffer are threadsafe  ");
        System.out.println(sb3.charAt(11));  // char of string

        System.out.println(sb3.capacity());  // capacity of string

        sb3.setCharAt(9,'j');
        System.out.println(sb3); // setting new char

        System.out.println(sb3.length()); // length of string

        System.out.println(sb3.insert(6," ")); // inserting the new char sequence

        System.out.println(sb3.delete(5,15)); // deleting range of char
        System.out.println(sb3.deleteCharAt(10)); // deleting char of a particular index
        System.out.println(sb3.delete(0,sb3.length())); // deleting complete string

        System.out.println(sb3.append("StringBuilder are more faster than StringBuffer ")); // adding data at last

        System.out.println(sb3.reverse());  // reversing a string

        System.out.println(sb3.replace(0,sb3.length(),"Taj Mahal is located in Agra"));  // replacing the string

        System.out.println(sb3.indexOf("A"));  // indexof
        System.out.println(sb3.indexOf("a" ,14));
        System.out.println(sb3.lastIndexOf("a"));  // last index of
        System.out.println(sb3.lastIndexOf("l",8));

        System.out.println(sb3.subSequence(11,16)); // extracting the particular sequence of character
        System.out.println(sb3.substring(2));
        System.out.println(sb3.substring(0,5));

        StringBuffer sb0 = sb3.append(". It is so beautiful .");
        System.out.println(sb3.equals(sb0));
        System.out.println(sb3.equals(" StringBUffer are threadsafe   "));

        sb3.setLength(66);
        System.out.println(sb3);  // setting the new length/size of string
        System.out.println(sb3.append(" Agra is in Delhi"));

        StringBuffer sb4 = new StringBuffer("  String,StringBuilder,StringBuffer  ");

        sb4.trimToSize();
        System.out.println(sb4); // trimming the string

        System.out.println(sb4.indexOf("S")); // checking index of 'S' in string2
        System.out.println(sb4.indexOf("i",19)); // checking index of 'i' in string2  fromIndex 19
        System.out.println(sb4.lastIndexOf(" "));  // checking last index of ' '
        System.out.println(sb4.lastIndexOf("B",sb4.length()));   // checking last index of 'B' from the size of string4


        System.out.println(sb3==sb4); // == operator
        System.out.println(sb3.compareTo(sb4)); // comparing string3 to string4
        System.out.println(sb3.compareTo(sb4)); // comparing string4 to string3










    }
}
