import javax.swing.JOptionPane;
public class PracticeDB {

/* Using JOptionPane

Numeric grade to Letter grade Converter

Using   -JOptionPane
	-switch case

*/
    public static void main(String[] args) {
        String Grade;
        String r1,r2,r3,r4,r5;
        int grade;
        Grade=JOptionPane.showInputDialog("Enter your grade");//Grade get value
        grade=Integer.parseInt(Grade);//Grade value ->converted to int grade
        r1="You received an A";
        r2="You received an B";
        r3="You received an C";
        r4="You received an D";
        r5="You received an F";
        switch(grade/10){
            case 10:JOptionPane.showMessageDialog(null,r1);
                break;
            case 9:JOptionPane.showMessageDialog(null,r1);
                break;
            case 8:JOptionPane.showMessageDialog(null,r2);
                break;
            case 7:JOptionPane.showMessageDialog(null,r3);
                break;
            case 6:JOptionPane.showMessageDialog(null,r4);
                break;
            default: JOptionPane.showMessageDialog(null,"You received an F");
                //OR (null, r5);
        }        
        }
    }  
