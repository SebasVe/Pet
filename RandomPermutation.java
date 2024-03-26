import java.util.Random;

public class RandomPermutation 
{
    public static int[] randomPermutation(int[] p) 
    {
        int[] r = new int[p.length]; 
        int counter = p.length; 

        Random random = new Random();
        for (int i = 0; i < p.length; i++) 
        {
            int randomIndex = random.nextInt(counter);
            int randomValue = p[randomIndex];

            r[i] = randomValue;
            p[randomIndex] = p[counter - 1];
            p[counter - 1] = randomValue;
            counter--;
        }
        
        return r;
    }
}