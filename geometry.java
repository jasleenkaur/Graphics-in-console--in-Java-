import shapes.*;
import java.util.Scanner;
class geometry{
    public static void main(String args[]){
    {
        int choice;
        Scanner in = new Scanner(System.in);
        
        System.out.print("\n\t~~~~~~ Welcome to Geometry World ~~~~~~");
        System.out.print("\n\t\tWe have codes for Geometry shapes");
        System.out.print("\n\t\tWhich shape you want?");
        System.out.print("\n\n\t------------------------------------");
        System.out.print("\n\t\tEnter 1 for Circle");
        System.out.print("\n\t\tEnter 2 for Arc of Circle");
        System.out.print("\n\t\tEnter 3 for Horizontal sine wave");
        System.out.print("\n\t\tEnter 4 for Vertical sine wave");
        System.out.print("\n\t\tEnter 5 for Rectangle");
        System.out.print("\n\t\tEnter 6 for Cardiod");
        System.out.print("\n\t\tEnter 7 for Hypocycloid");
        System.out.print("\n\t\tEnter 8 for Epicycloid");
        System.out.print("\n\t\tEnter 9 for Nephroid");
        System.out.print("\n\t-------------------------------------\n");
        choice = in.nextInt();
        switch (choice)
        {
        case 1: circle ob1 = new circle();
                ob1.geo_circle();
                break;
        case 2: arcOfCircle ob2 = new arcOfCircle();
                ob2.geo_arcOfCircle();
                break;
        case 3: hori_sine ob3 = new hori_sine();
                ob3.geo_hori_sine();
                break;
        case 4: vert_sine ob4 = new vert_sine();
                ob4.geo_vert_sine();
                break;
        case 5: rectangle ob5 = new rectangle();
                ob5.geo_rect();
                break;
        case 6: cardiod ob6 = new cardiod();
                ob6.geo_cardiod();
                break;
        case 7: hypocycloid ob7 = new hypocycloid();
                ob7.geo_hypocyclo();
                break;
        case 8: epicycloid ob8 = new epicycloid();
                ob8.geo_epicyclo();
                break;
        case 9: nephroid ob9 = new nephroid();
                ob9.geo_nephro();
                 break;
        default: System.out.print("\nOops!!!------------Sorry, You entered wrong code--------------\n");
                
        }
    }
}
}
