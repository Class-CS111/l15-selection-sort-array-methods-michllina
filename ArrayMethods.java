/********************************************
*	AUTHOR:	Michelle
* COLLABORATORS: None
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: 5/20/25
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: 
   * Returns Arrays contents in String form
   * 
   * @param a int[] of values, must be >= 1 length
   * 
   * @return array contents in String, separated by commas
  */

  public static String arrayString(int[] a)
  {
    String result = "{ " + a[0];
    //concotenates on each int value
    for(int i = 1; i < a.length; i++){
      result += ", " + a[i];
    }
    result += " }";

    return result;
  }
  
  /**DESCRIPTION: 
   * Swaps two values in the array at the given indices
   * 
   * @param array int[] that will be modified
   * @param a index of first element to swap (must be valid index!)
   * @param b index of second element to swap (must be valid index!)
  */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
	
	/**DESCRIPTION: 
   * Finds index of min value of an array at start index 
   * 
   * @param array int[] to search 
   * @param start index to begin search for min
   * 
   * @return index of min value, from start index to end of array
  */
  
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minValue = array[startIndex];
    int minIndex = startIndex;

    for(int i = startIndex; i < array.length; i++){
      if(minValue > array[i]) {
        minValue = array[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

	/**DESCRIPTION: 
   * 
   * Reverses contents of array
   * 
   * @param int[] array will be changed into reverse order
  */
  public static void reverse(int[] array)
  {
    for(int i = 0; i < array.length/2; i++){
       ArrayMethods.swap(array, i, array.length-1-i);
    }
  }

	/**DESCRIPTION: 
   * Sorts array in ascending order (least to greatest), using selection sort algorithm
   * 
   * @param array int[] 
  */
  public static void selectionSort(int[] array)
  {
    for(int i = 0; i < array.length-1; i++){
      int indexMinValue = ArrayMethods.indexOfMin(array, i);
      ArrayMethods.swap(array, i, indexMinValue);
    }
  }

}