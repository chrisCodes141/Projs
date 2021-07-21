import javax.swing.JOptionPane;
public class program_30 {
    //P21 useing DB
    public static void main(String[] args) {
        String inputstring;
        double a, b, c, d, x, x1, x2;
               
        inputstring=JOptionPane.showInputDialog("Please enter the \"A\" value");
        a=Double.parseDouble(inputstring);
        inputstring=JOptionPane.showInputDialog("Please enter the \"B\" value");
        b=Double.parseDouble(inputstring);
        inputstring=JOptionPane.showInputDialog("Please enter the \"C\" value");
        c=Double.parseDouble(inputstring);
        
        if (a==0)
            if (b==0)
                if (c==0)
                    System.out.println("All solutions");
                else
                    System.out.println("No solutions");
            else{
                System.out.println("Linear");
                x=-c/b;
                System.out.println("X is "+x);       
            }
        else{
            d=(b*b)-(4*a*c);
            if (d<0)
                System.out.println("No solution");
            else if (d==0)
            {
                System.out.println("Duplicate solution");
                x=-b/(2*a);
                System.out.println("X is "+x);
            }
            else
            {
             System.out.println("Two solutions");
             x1=(-b+ Math.sqrt(d))/(2*a);
             x2=(-b- Math.sqrt(d))/(2*a);
             System.out.println("x1 is "+x1+" and x2 is "+x2);
            }    
        }  
    }
}
