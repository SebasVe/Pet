/*
 * Activity 3.6.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] myPets = new Pet[10];    
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    myPets[0] = new Pet("Whiskers", 1);
    myPets[1] = new Pet("Mittens", 1);
    myPets[2] = new Pet("Fido", 2);
    myPets[3] = new Pet("Buddy", 2);    
    // first things first, feed your pets
    for (Pet pet : myPets) 
    {
        pet.feed();
    }

    // next, make yourself the owner of all of your new pets
    for (Pet pet : myPets) 
    {
        pet.setOwner("Sebastian");
    }

    // your dogs make some noise, take them for a walk
    for (Pet pet : myPets) 
    {
        if (pet.getType() == 2) 
        {
            pet.makeNoise();
            pet.walk();
        }
    }

    // when you get back, your cats make some noise
    for (Pet pet : myPets) 
    {
        if (pet.getType() == 1) 
        {
            pet.makeNoise();
        }
    }
    
    // give all of your pets a treat
    for (Pet pet : myPets) 
    {
        pet.giveTreat();
    }
    // groom your cats
    for (Pet pet : myPets) 
    {
        if (pet.getType() == 1) 
        {
            pet.groom();
        }
    } 
    // grooming is done, play with all pets
    for (Pet pet : myPets) 
    {
        pet.play();
    }
    // whew, that was tiring, all pets nap and get fed
    for (Pet pet : myPets) 
    {
        pet.sleep();
        pet.feed();
    }
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet : myPets) 
    {
        pet.toString();
    }    
    // You decide to get a couple of pets for your friend (does not require looping)
    Pet[] friendPets = new Pet[2];
    friendPets[0] = new Pet("Fluffy", 2);
    friendPets[1] = new Pet("Spot", 1);    
    // set the owner of the new pets to your friends name
    for (Pet pet : friendPets) 
    {
        pet.setOwner("Abe");
    }    
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet : myPets) 
    {
        pet.toString();    

  }
}
}