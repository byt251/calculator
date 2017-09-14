//** Author: Bethlehem Teshome
//CSC 200
//09/13/2017
import java.util.Scanner;
import javax.swing.JOptionPane;
public class calculator {
    public static void main(String[]args){
        //constant variable
        final double PI = 22/7; //capitalize the name of your constant

        //integers
        byte x=120; //-128<=x<=127
        short s=31000;//-32768<=y<=32767
        int  i=2000000000;//-2147483648<=z<=2147483647
        long l=21000000000l; // the 'l' at the end represents long
        double n1,n2,product;



        //decimals
        float f=7.5f; // f represents float
        double d= 800.65;

        //characters
        char letter ='A';

        //true/false
        boolean status= false;

        // instantiation
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the first number");
        n1= keyboard.nextDouble();
        System.out.println("enter the second number");
        n2=keyboard.nextDouble();
        product=n1*n2;


        JOptionPane.showMessageDialog(null,"your product is\""+ product +"\"");

    }

}
