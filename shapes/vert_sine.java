package shapes;
import java.util.Scanner;
public class vert_sine{

    char[][] sine = new char [150][150];
    Scanner in = new Scanner(System.in);
    int row,column,numberOfCycles,sineWidth,sineHeight;
    double middleOfGraphWidth, graphStart,graphEnd,range,unitStepY,pointStart_X;
      
      public
      void geo_vert_sine(){
        System.out.print("\n\n");
        System.out.print("\t\t\t###########SINE WAVE###########\n\n\n");
    System.out.print("\n\t\tEnter width and height of sine wave: ");
    sineWidth = in.nextInt();
    sineHeight = in.nextInt();
    System.out.print("\n\t\tEnter number of cycles you want: ");
    numberOfCycles = in.nextInt();
    
    middleOfGraphWidth = sineWidth / 2;
    graphStart = 0.;
    graphEnd = 360. * numberOfCycles;
    graphStart *= Math.PI / 180;
    graphEnd *= Math.PI / 180;
    range = graphEnd - graphStart;
    unitStepY = range / sineHeight;
    
     for(row = 0; row <= sineHeight; row++)
	{ 
	    for(column = 0; column <= sineWidth; column++)
	    sine[row][column] = ' ';
	}

	//to draw x-axis of graph               
	             
	for(row = 0; row <= 0 + sineHeight; row++)
    {   
        column = sineWidth/2;  
        sine[row][column] = '|';
    }	  
	
	//to draw sine wave
	  int sineWaveY = 0;
    for(double sineWaveX = graphStart; sineWaveX <= graphEnd; sineWaveX += unitStepY)
    { 
		pointStart_X = Math.sin(sineWaveX);
		double pointStart_X1 = (pointStart_X *  middleOfGraphWidth) + sineWidth/2;                                  
		int pointStart_X2 =(int) Math.round(pointStart_X1);
		sine[sineWaveY][pointStart_X2] = '*';
		sineWaveY++;
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
