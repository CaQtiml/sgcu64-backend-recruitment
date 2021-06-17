import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pb1 {
    public static void zero(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print("|  |  ");
        if(i==3) System.out.print("|__|  ");
    }
    public static void one(int i)
    {
        if(i==1) System.out.print("      ");
        if(i==2 || i==3) System.out.print("   |  ");
    }
    public static void two(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print(" __|  ");
        if(i==3) System.out.print("|__   ");
    }
    public static void three(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print(" __|  ");
        if(i==3) System.out.print(" __|  ");
    }
    public static void four(int i)
    {
        if(i==1) System.out.print("      ");
        if(i==2) System.out.print("|__|  ");
        if(i==3) System.out.print("   |  ");
    }
    public static void five(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print("|__   ");
        if(i==3) System.out.print(" __|  ");
    }
    public static void six(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print("|__   ");
        if(i==3) System.out.print("|__|  ");
    }
    public static void seven(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print("   |  ");
        if(i==3) System.out.print("   |  ");
    }
    public static void eight(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print("|__|  ");
        if(i==3) System.out.print("|__|  ");
    }
    public static void nine(int i)
    {
        if(i==1) System.out.print(" __   ");
        if(i==2) System.out.print("|__|  ");
        if(i==3) System.out.print(" __|  ");
    }
    public static void colon(int i)
    {
        if(i==1) System.out.print("   ");
        if(i==2) System.out.print(" . ");
        if(i==3) System.out.print(" . ");
    }
    public static void underscore(int i)
    {
        if(i==1) System.out.print("    ");
        if(i==2) System.out.print("    ");
        if(i==3) System.out.print(" __ ");
    }
    public static void error()
    {
        for(int j=1;j<=3;j++)
        {
            for (int k = 0; k < 8; k++)
            {
                if(k==2||k==5) colon(j);
                else underscore(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String inpst = kb.nextLine();
        int len = inpst.length();
        Pattern pattern = Pattern.compile("[0-9]+:[0-9]+:[0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inpst);
        boolean matchFound = matcher.find();
        if(!matchFound)
        {
            error();
            return ;
        }
        String[] substr = inpst.split(":",0);
        for(int i=1;i<substr.length;i++)
        {
            int chk = Integer.parseInt(substr[i]);
            if(chk<0 || chk>59)
            {
                error();
                return ;
            }
        }
        char[] inp = inpst.toCharArray();
        for(int j=1;j<=3;j++)
        {
            for(int i=0;i<len;i++)
            {
                if(inp[i]=='1') one(j);
                if(inp[i]=='2') two(j);
                if(inp[i]=='3') three(j);
                if(inp[i]=='4') four(j);
                if(inp[i]=='5') five(j);
                if(inp[i]=='6') six(j);
                if(inp[i]=='7') seven(j);
                if(inp[i]=='8') eight(j);
                if(inp[i]=='9') nine(j);
                if(inp[i]=='0') zero(j);
                if(inp[i]==':') colon(j);
            }
            System.out.println("");
        }
    }
}