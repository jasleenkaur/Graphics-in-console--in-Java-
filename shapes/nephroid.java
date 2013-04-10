package shapes;
import java.util.Scanner;
public class nephroid{

    int graphHeight, graphWidth, radius, angle, aspectedGraphHeight, row, column, x, y, angleStep;
    char[][] nephroid = new char [150][150];
    Scanner in = new Scanner(System.in);
	
    public
    void geo_nephro(){
    System.out.print("\n\n\t\t\t###### Draw nephroid #######\n");
    System.out.print( "\n\t\tEnter graph Height: ");
     graphHeight = in.nextInt();
    System.out.print( "\t\tEnter graph Width: ");
    graphWidth = in.nextInt();
    System.out.print( "\t\tRadius of nephroid (eg. 6): ");
    radius = in.nextInt();
    
     
    //converting degree to radian by multiplying with pi/180
    angle = (int)(360 * Math.PI/180);
    
    //graphHeight is divided by scaling factor 2 for aspected ratio of characters in terminal
    //.5 is for precision
    aspectedGraphHeight = (int)(graphHeight/2.0);  
    
    
    // define graphpaper          
    for(row=0; row<=aspectedGraphHeight; row++)
    {    
        for(column=0; column<=graphWidth; column++)
        {
        nephroid[row][column]=' ';
        }
    }   
    
    //horizontal axis     
    for(column = 0; column <= graphWidth; column++)
    {
        row = aspectedGraphHeight / 2;
        nephroid[row][column] = '-';
    }
            
    //vertical axis
    for(row = 0; row <= aspectedGraphHeight; row++)
    {
         column = graphWidth / 2;
         nephroid[row][column] = '|';
    }
    
    //points of nephroid
     
    for (angle = 0;  angle <= 360; angle += 1)
    {   
       x = (int)(radius * (3.0 * Math.cos(angle) - Math.cos(3.0*angle))+.5); 
       y = (int)(radius * (3.0 * Math.sin(angle) - Math.sin(3.0*angle))+.5);
     
     row = (aspectedGraphHeight/2 - y/2);  
     // y is divided by scaling factor 2 for aspected ratio of characters in terminal
     column = graphWidth/2 + x;
     nephroid[row][column] = '.';
    }    
        
    
    //print nephroid
    for(row = 0; row<=aspectedGraphHeight; row++)
        {
             for(column = 0; column<=graphWidth; column++)
             System.out.print(nephroid[row][column]);
             System.out.println(" ");
        }     
}
}
