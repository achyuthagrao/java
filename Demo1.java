// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class EnterSubString {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.println("enter the substring");
        String substr=scan.nextLine();
        System.out.println("enter the position");
        int pos=scan.nextInt();
        String newstr=" ";
        int len=0;
        for(char ch:str.toCharArray())
        {
            len++;
        }
        for(int i=0;i<len;i++)
        {
            if(i==pos)
                {
                    newstr=newstr+substr+str.charAt(i);
                }
                else
                {
                    newstr=newstr+str.charAt(i);
                }
        }
            System.out.println(newstr);
    }
}
