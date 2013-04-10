package shapes;
import java.util.Scanner;
public class hori_sine{

    char[][] sine = new char [150][150];
    Scanner in = new Scanner(System.in);
    int row,column,scalingFactor,numberOfCycles,sineWidth,sineHeight,sineHeight1;
    double middleOfGraphHeight,graphStart,graphEnd,range,unitStepX,unitStepY,pointStartX;
       
       public
       void geo_hori_sine(){
        System.out.print("\n\n");
        System.out.print("\t\t\t###########SINE WAVE###########\n\n\n");
        /*
 Function to represent Horizontal Sine Wave
*/
System.out.print("\n\t\tEnter width and height of sine wave: ");
    sineWidth = in.nextInt();
    sineHeight = in.nextInt();
    System.out.print("\n\t\tEnter number of cycles you want: ");
    numberOfCycles = in.nextInt();
    
    middleOfGraphHeight = sineHeight / 2;
    graphStart = 0.;
    graphEnd = 360. * numberOfCycles;
    graphStart *= Math.PI / 180;
    graphEnd *= Math.PI / 180;
    range = graphEnd - graphStart;
    unitStepX = range / sineWidth;
    
     for(row = 0; row <= sineHeight; row++)
	{ 
	    for(column = 0; column <= sineWidth; column++)
	    sine[row][column] = ' ';
	}

	//to draw x-axis of graph               
	for(column = 0; column <= sineWidth; column++)  
	{   
	    row = (int)sineHeight/2; 
	    sine[row][column] = '-'; 
	}
	
	//to draw sine wave
	pointStartX = graphStart;
	for(int sineWaveX = 0; sineWaveX <= sineWidth; sineWaveX++)      
	{
	    double sineWaveY = Math.sin(pointStartX);
        double sineWaveY1 = - sineWaveY * (middleOfGraphHeight) +sineHeight/2;                
        int sineWaveY2 = (int) Math.round(sineWaveY1);
        sine[sineWaveY2][sineWaveX] = '*';
        pointStartX += unitStepX;
    }

	//Print the complete array
	for(row = 0; row <= sineHeight; row++)
	{
	    for(column = 0; column <= sineWidth; column++)
	    { 
	        System.out.print(sine[row][column]);
	    }
	    System.out.println(" ");
	}
	}
}
