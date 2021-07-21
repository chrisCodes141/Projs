import java.util.Scanner;
public class program_72 {
//Linear equation run as many equations(including none) as user wants
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        //String is;
        float a, b, x;
        int num, c;
        //Boolean yes;
        //yes= true;
        System.out.println("Do you have an equation to solve? Yes=1/No=2 ");
        c=k.nextInt();
        while (c==1){
 
        //prnt coiff
        System.out.println("Please enter the A value: ");
        a=k.nextFloat();
        System.out.println("Please enter the B value: ");
        b=k.nextFloat();
        
        if (a==0)
            if (b==0)
                System.out.println("All solutions");
            else
                System.out.println("No solutions");
        else{
            System.out.println("One solution");
            x=-b/a;
            System.out.println("X= "+x);
        } 
        System.out.println("Do you have an equation to solve? Yes=1/No=2 ");
        c=k.nextInt();
}
   System.out.println("Have a nice day, hope to see you soon with more equations!");      
}
}
