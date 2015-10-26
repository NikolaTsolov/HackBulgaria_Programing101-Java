import java.util.*;
public class problem1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x:");
        int x = sc.nextInt();

        System.out.print("Enter y:");
        int y = sc.nextInt();

        System.out.println("Enter the string");
        String str = sc.next();
        int multiply = 1;
        for(char ch : str.toCharArray())
        {
            if (ch == '~')
            {
                multiply = -1;
            }
            if(ch == '>')
            {
                x = x + 1 * multiply;
            }
            if(ch == '<')
            {
                x = x - 1 * multiply;
            }
            if(ch == 'V')
            {
                y = y + 1 * multiply;
            }
            if(ch == '^')
            {
                y = y + 1 * multiply;
            }
        }

        System.out.printf("X:%d, Y:%d", x,y);
        sc.close();
    }

}
