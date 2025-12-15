/*
 * Activity 4.2.2
 */
import java.util.ArrayList;
import java.util.List;

public class InsertionSort
{
  public static void main(String[] args)
  {
    ArrayList<Integer> ratings = new ArrayList<Integer>(List.of(5, 4, 8, 9, 3, 2, 1));

    
    // the first element is sorted (so far) so iterate through all others
    for (int i = 1; i < ratings.size(); i++) 
    {
      // save curr element
      int curr = ratings.get(i); 
   
      // store the last element of the sorted portion,
      // the remaining portion is unsorted
      int marker = i - 1; 
      
      // loop backwards through the sorted portion starting at marker
      while (marker >= 0)
      {      
        if ((curr < ratings.get(marker)))
        {
          ratings.set(marker + 1, ratings.get(marker));
          ratings.set(marker, curr); 
        }
        else
        {
          // element is in correct place so stop iterating
          marker = 0;
        }
        marker--;
      }
    }

    System.out.println(ratings);
  }
}
