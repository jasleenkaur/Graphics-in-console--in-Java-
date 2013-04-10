package shapes;
import java.util.Scanner;

public class arcOfCircle{

int graphHeight, graphWidth, aspectedGraphHeight, row, column, radius, x, y;
double startAngle, endAngle,angle, angleStep;
char[][] circle = new char [150][150];
 
 Scanner in = new Scanner(System.in);
	
  public
    void geo_arcOfCircle(){
    System.out.print("\n\n\t\t\t###### Draw Arc of Circle #######\n");
    System.out.print( "\n\t\tEnter graph Height: ");
    graphHeight = in.nextInt();
    System.out.print( "\t\tEnter graph Width: ");
    graphWidth = in.nextInt();
    System.out.print( "\t\tRadius of circle: ");
    radius = in.nextInt();
    System.out.print( "\t\tEnter starting Angle of arc: ");
    startAngle = in.nextInt();
    System.out.print( "\t\tEnter End Angle of arc: ");
    endAngle = in.nextInt();
    
    
    aspectedGraphHeight = (int)(graphHeight/2 + .5);  
    //graphHeight is divided by scaling factor 2 for aspected ratio of characters in terminal
    startAngle *= Math.PI/180.;
    endAngle *= Math.PI/180.;
    angleStep = 2* Math.PI/(2 * 2 * radius);   //2 * 2 *radius = no. of dots
        
    
    // define graphpaper          
    for(row=0; row<=aspectedGraphHeight; row++)
    {    
        for(column=0; column<=graphWidth; column++)
        {
        circle[row][column]=' ';
        }
    }   
    
    //horizontal axis     
    for(column = 0; column <= graphWidth; column++)
    {
        row = (int)(aspectedGraphHeight / 2);
        circle[row][column] = '-';
    }
            
    //vertical axis
    for(row = 0; row <= aspectedGraphHeight; row++)
    {
         column = (int)(graphWidth / 2);
         circle[row][column] = '|';
    }
     
    //points of arc  
    for (angle = startAngle;  angle <= endAngle; angle += angleStep)
    {   
       x = (int)(radius * Math.cos(angle) +.5);  
       y = (int)(radius * Math.sin(angle) +.5);
     
     row = (int)(aspectedGraphHeight/2 - y/2 +.5);  
     // y is divided by scaling factor 2 for aspected ratio of characters in terminal
     column = (int)graphWidth/2 + x;
     circle[row][column] = '.';
    }    
        
    
    //print circle
    for(row = 0; row<=aspectedGraphHeight; row++)
        {
             for(column = 0; column<=graphWidth; column++)
             System.out.print( circle[row][column]);
             System.out.println(" ");
        }     
}
}
