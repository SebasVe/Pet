/*
 * Activity 3.6.4
 */
public class StandardArrayAlgoritms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int[] goalCounter = new int[20];
    Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
                    new Player("Bobbie", 18), new Player("Blaine", 22),
                    new Player("Chris", 15), new Player("Charlie", 15) };
    int maxCount = 0;
    int maxKey = -1;
    boolean hasValue = true;
    boolean allHaveValues = true;
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
    for (int i = 0; i < goals.length; i++)
    {
      goalCounter[goals[i]]++;
      if (goalCounter[goals[i]] > maxCount)
      {
        maxCount = goalCounter[goals[i]];
        maxKey = goals[i];
      }
    }
    int k = 0;
    while (k < players.length)
    {
      int m = players[0].getAge();
      if (m >= 18)
      {
        hasValue = true;
        break;
      }
      k++;
    }
    boolean allUnder21 = true;
    for (int age : players) 
    {
      if (age >= 21) 
      {
          allUnder21 = false;
          break;
      }
    }
    for (int i = 0; i < players.length - 1; i += 2) 
    {
      System.out.println(players[i] + " and " + players[i + 1]);
    }

    
    System.out.println("All goals: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Max: " + max);
    System.out.println("Min:" + min);
    System.out.println(maxKey);
    System.out.println("Player over 18 in team: " + hasValue);
    System.out.println("Are all player's under 21: " + allUnder21);

  }
  
}

