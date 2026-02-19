package javaapplication2;
import java.util.Scanner;

//public is an access modifier,gives public access to
//other files
//access modifiers - Private, Public, Protected

/*
This is
a multi-line
comment

*/
public class JavaApplication2 {

    //static is a copy of something
    /*void-returns nothing (or is nothing)
    Data types: int(0-99999)
    float -(123.736)
    
    */
    public int Age = 18;
    public static void main(String[] args) {
        //Scanner is a class but is also a datatype
        //UserInput is variable name
        //new is to initialize new object
        //Scanner(System.in) object value,
        //System.in telling computer to accept input
        Scanner UserInput1 = new Scanner(System.in);
                
                
        //this is some bs
        boolean Truth = true;
        int myNum = 9;
        String InvoiceNumber = "#131313";
        char Line = '|';
        
        
        System.out.println("My name is john");
        System.out.println("i'm a clown");
        //this is an invoice
        //ID    |Age |Home |Gender
        //41414 |Age |John |Male
        System.out.println("ID    |Age |Home  |Gender");
        System.out.println("41414 |13  |John  |Male");
        
        System.out.println("Please enter your ID");
        String UserInputVariable = UserInput1.next();
        
        System.out.println("***************");
        System.out.println("This is an invoice\t" + InvoiceNumber);
        System.out.print("\nID\t" + Line + "Age\t" + Line + "Name\t" + Line + "Gender");
        System.out.print("\n" + UserInputVariable);
    }
    
}

    
    

