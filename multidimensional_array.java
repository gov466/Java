public class Main
{
	public static void main(String[] args) {
	  
	   int [][] numbers={{1,2,3},
	                     {5,6,4},
	                     {9,5,1}};
	
	   System.out.println(numbers [1][1]);
	  
	   String [][]fruits = new String[2][3];
	   fruits[0][0]="grape";
	   System.out.println(fruits[0][0]);
	  
	   for(int row=0;row<numbers.length;row++)
	   {
	       for(int col=0;col<numbers[row].length;col++)
	       {
	         System.out.print(numbers[row][col] + " \t");
	       }
	       System.out.println();
	   }
	   
	}
}
