import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.print("What would you like to name your pet? ");
      String petName = input.nextLine();

      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {

         // TODO 2:
         // Display happiness, hunger, and energy.
         System.out.println("\n--- " + petName + "'s Stats ---");
         System.out.println("Happiness: " + happiness);
         System.out.println("Hunger: " + hunger);
         System.out.println("Energy: " + energy);
         System.out.println("--------------------------");
         
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         System.out.println("6. Secret Action");
         
         choice = input.nextInt();
         
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.
         if (choice == 1) {
            hunger = hunger - 3;
            energy = energy + 1;
            System.out.println(petName + " inhaled the 100 % Full Fat Fat Free Kibble.");
         } else if (choice == 2) {
            happiness = happiness + 3;
            hunger = hunger + 2;
            energy = energy - 3;
            System.out.println("You threw the ball. " + petName + " stared at it and ate it.");
         } else if (choice == 3) {
            energy = energy + 5;
            hunger = hunger + 1;
            System.out.println(petName + " is a white noise machine.");
         } else if (choice == 4) {
            happiness = happiness - 2;
            System.out.println(petName + " hates water.");
         } else if (choice == 5) {
            System.out.println("Preparing to say goodbye...");
         } else if (choice == 6) {
            happiness = happiness + 5;
            hunger = hunger + 5;
            energy = energy + 5;
            System.out.println(petName + " took a sip of a Monster an.");
         } else {
            System.out.println("Invalid choice! " + petName + " tilts his head in utter confusion at your choice.");
         }

         // Extra Challenge Level 2: Random Events
         if (choice != 5 && choice >= 1 && choice <= 6 && happiness < 15 && hunger < 10 && energy > 0) {
            if (Math.random() < 0.25) {
               System.out.println("\n[RANDOM EVENT] You win the real sweapstakes lottery!");
               happiness = happiness + 2;
               hunger = hunger - 2;
            }
         }
      }

      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      System.out.println("\n=== GAME OVER ===");
      if (choice == 5) {
         System.out.println("Goodbye!");
      } else if (happiness >= 15) {
         System.out.println("YOU WIN! Happier than a cat on Catnip!");
      } else if (hunger >= 10) {
         System.out.println("Your pet starved!");
      } else if (energy <= 0) {
         System.out.println("He dead.");
      }

      input.close();
   }
}

