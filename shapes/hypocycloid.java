package shapes;
import java.util.Scanner;
public class hypocycloid{

    int graphHeight, graphWidth, radius1, radius2, angle, aspectedGraphHeight, row, column, x, y, angleStep;
    char[][] hypocycloid = new char [150][150];
    Scanner in = new Scanner(System.in);
    
    public
    void geo_hypocyclo(){
    System.out.print("\n\n\t\t\t###### Draw hypocycloid #######\n");
    System.out.print( "\n\t\tEnter graph Height: ");
     graphHeight = in.nextInt();
    System.out.print( "\t\tEnter graph Width: ");
    graphWidth = in.nextInt();
    System.out.print( "\t\tRadius of hypocycloid (eg.10): ");
    radius2 = in.nextInt();
    
    int k=3;
    radius1 = k * radius2;
    
     angle=360;
    //converting degree to radian by multiplying with pi/180
    angle = (int)(angle * Math.PI/180);
    
    //graphHeight is divided by scaling factor 2 for aspected ratio of characters in terminal
    //.5 is for precision
    aspectedGraphHeight = (int)(graphHeight/2 + .5);  
    
    
    // define graphpaper          
    for(row=0; row<=aspectedGraphHeight; row++)
    {    
        for(column=0; column<=graphWidth; column++)
        {
        hypocycloid[row][column]=' ';
        }
    }   
    
    //horizontal axis     
    for(column = 0; column <= graphWidth; column++)
    {
        row = aspectedGraphHeight / 2;
        hypocycloid[row][column] = '-';
    }
            
    //vertical axis
    for(row = 0; row <= aspectedGraphHeight; row++)
    {
         column = graphWidth / 2;
         hypocycloid[row][column] = '|';
    }
    
    //points of hypocycloid
     
    for (angle = 0;  angle <= 360; angle += 1)
    {   
       x = (int)(((radius1- radius2) * Math.cos(angle)) + (radius2 * Math.cos((radius1/radius2 - 1.0)*angle)) +.5);  
       y = (int)(((radius1- radius2) * Math.sin(angle)) - (radius2 * Math.sin((radius1/radius2 - 1.0)*angle)) +.5);
     
     row = (int)(aspectedGraphHeight/2 - y/2 +.5);  
     // y is divided by scaling factor 2 for aspected ratio of characters in terminal
     column = graphWidth/2 + x;
     hypocycloid[row][column] = '.';
    }    
        
    
    //print hypocycloid
    for(row = 0; row<=aspectedGraphHeight; row++)
        {
             for(column = 0; column<=graphWidth; column++)
             System.out.print(hypocycloid[row][column]);
             System.out.println(" ");
        }     
        }     
}
