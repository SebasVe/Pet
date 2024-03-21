/*
 * Activity 3.6.4
 */
public class StandardArrayAlgoritms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int[] goalCounter = new int[20];
    double average = 0.0;
    int sum = 0;
    int max = goals[0];
    int min = goals[0];
    for (int i = 0; i < goals.length; i++)
    {
      sum += goals[i];
      if (goals[i] > max)
      {
        max = goals[i];
      }
      if (goals[i] < min) 
      {
        min = goals[i];
      }
      goalCounter[i]++;
    }
       average = sum / (double)goals.length;
      
    
    System.out.println("All goals: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Max: " + max);
    System.out.println("Min:" + min);
    System.out.println(goalCounter);
  }
  
}