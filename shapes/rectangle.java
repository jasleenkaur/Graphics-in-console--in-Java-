package shapes;
import java.util.Scanner;
public class rectangle{
    int row,column,graphWidth,length, graphHeight,height;
    char[][] rectangle = new char [150][150];
    Scanner in = new Scanner(System.in);
    
    public
    void geo_rect(){
    System.out.print("\n\n\t\t\t###### Draw Rectangle #######\n");
    System.out.print( "\n\t\tEnter graph Height: ");
    graphHeight = in.nextInt();
    System.out.print("\t\tEnter graph Width: ");
    graphWidth = in.nextInt();
    System.out.print("\t\tEnter length of rectangle: ");
    length = in.nextInt();
    System.out.print("\t\tEnter height of rectangle: ");
    height = in.nextInt();
    System.out.print("\n");
    
    //scaling factor=2.0
    height = (int)(height/2.0);     
    graphHeight = (int)(graphHeight/2.0);
    for(row = 0; row <= graphHeight; row++)
    { 
        for(column = 0; column <= graphWidth; column++)
        {
            rectangle[row][column] = ' ';
        }
    }

    // Y-axis
    for(int y = 0; y <= graphHeight; y++)
    {
        int x = (int) graphWidth/2;                        
        rectangle[y][x] = '|';
    }

    // X-axis
    for(int x = 0; x <= graphWidth; x++)
    {
        int y = (int)graphHeight/2;
        rectangle[y][x] = '_';
    }

    // draw rectangle
    int heightSide1 =(int) (graphWidth/2 - length/2);
    int heightSide2 =(int) (graphWidth/2 - length/2) + length;
    for(row = (graphHeight/2) - height/2; row <= (graphHeight/2) - height/2 + height; row++)
    {
        rectangle[row][heightSide1] = '.';
        rectangle[row][heightSide2] = '.';
    }

    int lengthSide1 = (int)(graphHeight/2 - height/2);
    int lengthSide2 = (int)(graphHeight/2 - height/2) + height;
    for(row = (graphWidth/2 - length/2); row <= (graphWidth/2 - length/2) + length; row++)
        {
        rectangle[lengthSide1][row] = '.';
        rectangle[lengthSide2][row] = '.';
        }

    // print rectangle
    for(row = 0; row <= graphHeight; row++)
        {
        for(column = 0; column <= graphWidth; column++)
            {
            System.out.print(rectangle[row][column]);
            }
            System.out.println(" ");
        }
}
}   
