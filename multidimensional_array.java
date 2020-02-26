public class Main
{
	public static void main(String[] args) {
	  
	   int [][] numbers={{1,2,3}, 	//input numbers as matrix format
	                     {5,6,4},
	                     {9,5,1}};
	
	   System.out.println(numbers [1][1]); //will print 1st row 1st col element
	  
	   String [][]fruits = new String[2][3];	//2row 3col string
	   fruits[0][0]="grape";		//inputing grape as 1st elemnt
	   System.out.println(fruits[0][0]);	//printing grape
	  
	   for(int row=0;row<numbers.length;row++)	//printing whole elements in array numbers using for loop
	   {
	       for(int col=0;col<numbers[row].length;col++)
	       {
	         System.out.print(numbers[row][col] + " \t");
	       }
	       System.out.println();	//after first row come to 2nd col
	   }
	   
	}
}
