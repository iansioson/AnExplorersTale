import java.util.Scanner;
public class gameFlow {
    void clear (){
      for (int i = 0; i < 100; i++){
          System.out.println("\n");
         
      }
    }
    
    void printGameTitle() {
        String gameTitle = "An Explorer's Tale";
        int titleLength = gameTitle.length();
        int borderLength = titleLength + 4;

   
        printBorder(borderLength);

        
        System.out.println("| " + gameTitle + " |");

     
        printBorder(borderLength);
    }

   void printBorder(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    

     public void mainMenu() {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            printGameTitle();
            System.out.println("----- Main Menu -----");
            System.out.println("Start");
            System.out.println("Leaderboard");
            System.out.println("How to play");
            System.out.println("Exit");
            System.out.print("Enter your choice: ");
            
            String choice = in.nextLine();
            
            switch (choice.toLowerCase()) {
                case "start":
                    // Call the method to start the game
                    startGame();
                    break;
                case "leaderboard":
                    // Call the method to display the leaderboard
                    displayLeaderboard();
                    break;
                case "how to play":
                    // Call the method to display the instructions on how to play
                    displayHowToPlay();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println(); // Add a line break for readability
        }
        
    }
    
    private void startGame() {
       gameFlow();

    }
    
    public void displayLeaderboard() {
    if (Player.name != null) {
        System.out.println("Recent score of " + Player.name + ": " + Player.score);
    }
        System.out.println("--------------------------------------------");
        System.out.println("\t ALL TIME LEADERBOARD");
    System.out.println("Recent score of Ian: 1500");
    System.out.println("Recent score of Marc: 1400");
    System.out.println("Recent score of Job: 1300");
    System.out.println("Recent score of Andrei: 1200");
    System.out.println("Recent score of Mark: 1100");
    mainMenu();
}
    
    private void displayHowToPlay() {
        // Add the logic to display the instructions on how to play
        System.out.println("How to play:");
        System.out.println("Type in the keyword of the choice (capitlized letters)."
                + "\nBe careful of the words' spelling."
                + "\nEnjoy!");
    }


        public void endingScene(){
         System.out.println("Congratulations, " + Player.name + "!");
        System.out.println("You have successfully completed your epic adventure.");
        System.out.println("The realm rejoices in your triumph, and your name echoes through the lands.");
        System.out.println("The King himself honors you for your bravery and achievements.");
        System.out.println("You are hailed as a true hero, and your story will be told for generations to come.");
        System.out.println("Thank you for playing the game. Well done!");

     // Display final stats
        System.out.println("\nFinal Stats:");
          System.out.println("Player HP: " + Player.HP);
          System.out.println("Player Sanity: " + Player.sanity);
                    System.out.println("Player Score: " + Player.score);
          mainMenu();
        
     }


     boolean difficultySelect(){
        Scanner in = new Scanner(System.in);
        String difficulty;
        
       
        do {
        System.out.println("Select adventure difficulty: ");
        System.out.println("Normal");
        System.out.println("Hard");
        System.out.println("What is your choice, adventurer?");
        difficulty = in.nextLine(); 
        
        if(!difficulty.equalsIgnoreCase("normal") && !difficulty.equalsIgnoreCase("hard")){
            clear();
            System.out.println("Please enter correct choice, adventurer. Don't be dumb.\n");
            
        }
        
 
        } 
        while(!difficulty.equalsIgnoreCase("normal") && !difficulty.equalsIgnoreCase("hard") );
        
        if (difficulty.equalsIgnoreCase("normal")){
            return true;
        }
        
        else return false;
        
        
    }
     
   
     
     
    void deathScene() {
    System.out.println("-------------------------------------------------------------------------");

    if (Player.score <= 1000) {
        System.out.println("Alas, your journey has come to a tragic end. The realm mourns the loss of a valiant adventurer.");
        System.out.println("Your name will be whispered with sorrow, for you succumbed to the challenges that awaited.");
        System.out.println("May your spirit find peace in the eternal tales of the fallen.");
    } else if (Player.score >= 1001) {
        System.out.println("In the face of adversity, you fought valiantly until your last breath.");
        System.out.println("The kingdom will forever remember the hero who embraced challenges with courage and honor.");
        System.out.println("Your sacrifice will be immortalized in the annals of history, and the King himself will salute your bravery.");
    }
        System.out.println("\nFinal Stats:");
          System.out.println("Player HP: " + Player.HP);
          System.out.println("Player Sanity: " + Player.sanity);
          System.out.println("Player Score: " + Player.score);
    System.out.println("-------------------------------------------------------------------------");
    mainMenu();
}
    
    
    public int gameFlow () {
    Scanner in = new Scanner (System.in);
    Prologue prologue = new Prologue();
    Scene1 scene1 = new Scene1();
    Player player = new Player ();
    Scene1A s1A = new Scene1A();
    Scene1B s1B = new Scene1B();
    Scene1C s1C = new Scene1C();
    Scene2 scene2 = new Scene2();
    Scene2A s2A = new Scene2A();
    Scene2B s2B = new Scene2B();
    Scene2C s2C = new Scene2C();
    Scene3 scene3 = new Scene3();
Scene3A s3A = new Scene3A();
Scene3B s3B = new Scene3B();
Scene3C s3C = new Scene3C();

// Instantiate Scene4 and its choices
Scene4 scene4 = new Scene4();
Scene4A s4A = new Scene4A();
Scene4B s4B = new Scene4B();
Scene4C s4C = new Scene4C();

// Instantiate Scene5 and its choices
Scene5 scene5 = new Scene5();
Scene5A s5A = new Scene5A();
Scene5B s5B = new Scene5B();
Scene5C s5C = new Scene5C();

// Instantiate Scene6 and its choices
Scene6 scene6 = new Scene6();
Scene6A s6A = new Scene6A();
Scene6B s6B = new Scene6B();
Scene6C s6C = new Scene6C();

// Instantiate Scene7 and its choices
Scene7 scene7 = new Scene7();
Scene7A s7A = new Scene7A();
Scene7B s7B = new Scene7B();
Scene7C s7C = new Scene7C();

// Instantiate Scene8 and its choices
Scene8 scene8 = new Scene8();
Scene8A s8A = new Scene8A();
Scene8B s8B = new Scene8B();
Scene8C s8C = new Scene8C();

// Instantiate Scene9 and its choices
Scene9 scene9 = new Scene9();
Scene9A s9A = new Scene9A();
Scene9B s9B = new Scene9B();
Scene9C s9C = new Scene9C();

// Instantiate Scene10 and its choices
Scene10 scene10 = new Scene10();
Scene10A s10A = new Scene10A();
Scene10B s10B = new Scene10B();
Scene10C s10C = new Scene10C();

// Instantiate Scene11 and its choices
Scene11 scene11 = new Scene11();
Scene11A s11A = new Scene11A();
Scene11B s11B = new Scene11B();
Scene11C s11C = new Scene11C();

// Instantiate Scene12 and its choices
Scene12 scene12 = new Scene12();
Scene12A s12A = new Scene12A();
Scene12B s12B = new Scene12B();
Scene12C s12C = new Scene12C();

// Instantiate Scene13 and its choices
Scene13 scene13 = new Scene13();
Scene13A s13A = new Scene13A();
Scene13B s13B = new Scene13B();
Scene13C s13C = new Scene13C();

// Instantiate Scene14 and its choices
Scene14 scene14 = new Scene14();
Scene14A s14A = new Scene14A();
Scene14B s14B = new Scene14B();
Scene14C s14C = new Scene14C();

// Instantiate Scene15 and its choices
Scene15 scene15 = new Scene15();
Scene15A s15A = new Scene15A();
Scene15B s15B = new Scene15B();
Scene15C s15C = new Scene15C();

// Instantiate Scene16 and its choices
Scene16 scene16 = new Scene16();
Scene16A s16A = new Scene16A();
Scene16B s16B = new Scene16B();
Scene16C s16C = new Scene16C();

// Instantiate Scene17 and its choices
Scene17 scene17 = new Scene17();
Scene17A s17A = new Scene17A();
Scene17B s17B = new Scene17B();
Scene17C s17C = new Scene17C();

// Instantiate Scene18 and its choices
Scene18 scene18 = new Scene18();
Scene18A s18A = new Scene18A();
Scene18B s18B = new Scene18B();
Scene18C s18C = new Scene18C();

// Instantiate Scene19 and its choices
Scene19 scene19 = new Scene19();
Scene19A s19A = new Scene19A();
Scene19B s19B = new Scene19B();
Scene19C s19C = new Scene19C();

// Instantiate Scene20 and its choices
Scene20 scene20 = new Scene20();
Scene20A s20A = new Scene20A();
Scene20B s20B = new Scene20B();
Scene20C s20C = new Scene20C();

// Instantiate Scene21 and its choices
Scene21 scene21 = new Scene21();
Scene21A s21A = new Scene21A();
Scene21B s21B = new Scene21B();
Scene21C s21C = new Scene21C();
    
    
  


        






    boolean difficulty = difficultySelect(); //true = normal false = hard
    
    clear();
    System.out.println("Hello adventurer. Please tell me thou name: ");
    String name = in.nextLine();
    
    clear ();
    
    player.getName(name);
    System.out.println(player.getName());
    player.displayStats();
    
    System.out.println("\nI wish you the best of luck with your adventures, " + player.getName() + ".");
    System.out.println("Press any key to continue...");
    String anyKey = in.nextLine();
    
    
    
    clear (); 
    
    prologue.showScene();
   
    clear ();
    
    System.out.println(player.getName());
    player.displayStats();
    String scene1Choice = scene1.showScene();
    
    if (scene1Choice.equalsIgnoreCase ("ask")){ //MAIN CHOICE 1
        clear();
        System.out.println(player.getName());
        player.displayStats();
        String choice = s1A.showScene();
        
  
       
        if (choice.equalsIgnoreCase("ask")){
        
        System.out.println("\nThe Guardian told you what it knows. It also wishes you well on your adventure.");
        System.out.println("\n Enter any key to continue...");
        player.score += 100;
        in.nextLine();
        }
        
        if (choice.equalsIgnoreCase("explore")){
        
            if (difficulty == false){
        System.out.println("\nYou decided to explore the forest blindly. However, the mystical force that envelopes it"
                + "\nmakes it impossible to navigate. The more you tried, the more the forest got to your head. Eventually,"
                + "you return to the Guardian.\n\nSanity -1");
        player.sanity -= 1;
        player.score += 85;
        
        if (Player.HP <= 0 || Player.sanity <= 0) {
    
    System.out.println("Unfortunately, your journey has come to an end. You have been defeated.");
    // Other death-related messages...

    deathScene();
    mainMenu();
}
        
        System.out.println("\n Enter any key to continue...");
        in.nextLine();}
            
            
            if (difficulty == true){
                System.out.println("\nYou decided to explore the forest blindly. However, the mystical force that envelopes it"
                + "\nmakes it impossible to navigate. Eventually, you return to the Guardian.");
                player.score += 100;
                System.out.println("\n Enter any key to continue...");
                in.nextLine();}
        }
            
            
            if (choice.equalsIgnoreCase("gratitude")){
                System.out.println("\nYou thanked the Guardian for his time as you prepare to leave immediately. The Guardian, however,"
                        + "\nstopped you and provided you a guide before he let you leave.");
                player.score+=100;
                System.out.println("\n Enter any key to continue...");
                in.nextLine();}
             }
           
    
    if (scene1Choice.equalsIgnoreCase ("fight")){ //MAIN CHOICE 2
        clear();
        System.out.println(player.getName());
        player.displayStats();
        String choice = s1B.showScene();
        
        
        if (choice.equalsIgnoreCase("communicate")){
         if (difficulty == true){
            System.out.println("\nThe creature just ignored you.");
            System.out.println("\n Enter any key to continue...");
            in.nextLine();
            player.score += 100;
        }
        
        if (difficulty == false){
            System.out.println("\nThe creature was not friendly at all. The moment you tried to talk to it, you felt a stinging pain "
                    + "\n on your side as one of its sharp tendrils pierced you.\n\nHP -1");
            player.HP -=1;
            player.score += 85;
            
                if (Player.HP <= 0 || Player.sanity <= 0) {
    
    System.out.println("Unfortunately, your journey has come to an end. You have been defeated.");
    // Other death-related messages...

    deathScene();
    mainMenu();
}
            System.out.println("\n Enter any key to continue...");
            in.nextLine();
        }   
        }
       
        
        
        if (choice.equalsIgnoreCase("attack")){
        
        System.out.println("\nYou were no match against the creature. It was able to overwhelm you quickly using its unfamiliar powers. "
                + "\nLuckily, after seeing you get hurt, it vanished without a trace.\n\nHP -1");
        player.HP -= 1;
        System.out.println("\n Enter any key to continue...");
        player.score += 85;
        in.nextLine();
        }
        
        if (choice.equalsIgnoreCase("retreat")){
        
        System.out.println("\nYou chose to retreat and return to the Guardian to ask for guidance.");
        System.out.println("\n Enter any key to continue...");
        player.score += 100;
        in.nextLine();
        }
        
        
        
    }
    
    if (scene1Choice.equalsIgnoreCase ("identity")){ //MAIN CHOICE 3
        clear();
        System.out.println(player.getName());
        player.displayStats();
        String choice = s1C.showScene();
       
            if (choice.equalsIgnoreCase("left")){
                System.out.println("\nThis was the way the Guardian told you to take. You traverse the path safely.");
                System.out.println("\n Enter any key to continue...");
                player.score += 100;
                  in.nextLine();
            }
            
            if (choice.equalsIgnoreCase("right")){
                
                if(difficulty == false){
                System.out.println("\nAs you were traversing the path to the right, you remembered that the Guardian"
                        + "\ntold you to avoid taking this path as it was littered with evil spirits. You realized it"
                        + "\nlate as a wraith was already right in front of your face. Luckily, you were able to "
                        + "escape.\n\nHP -1 ");
                player.HP -=1;
                player.score += 85;
                
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
                System.out.println("\n Enter any key to continue...");
                  in.nextLine();
                
                }
                else {
                System.out.println("\nAs you were traversing the path to the right, you remembered that the Guardian"
                        + "\ntold you to avoid taking this path as it was littered with evil spirits. Luckily, you were"
                        + "\nable to realize it quickly and escape.");
                System.out.println("\n Enter any key to continue...");
                player.score += 85;
                in.nextLine();
                }
            }
            
            if (choice.equalsIgnoreCase("climb")){
                System.out.println("\nYou climbed a tree to view the two paths properly. Becaused of this, you were able"
                        + "\nto decide that the left path is better to take.");
                System.out.println("\n Enter any key to continue...");
                player.score += 100;
                  in.nextLine();
            }
        
    }
    
    clear ();
    
    System.out.println(player.getName());
    player.displayStats();
    String scene2Choice = scene2.showScene();
    
    
        if (scene2Choice.equalsIgnoreCase ("examine")){ //MAIN CHOICE 1
        clear();
        System.out.println(player.getName());
        player.displayStats();
        String choice = s2A.showScene();
        
            if (choice.equalsIgnoreCase("open")){
                
                System.out.println("\nAs you opened the box, a magical essence enveloped your body, rejuvenating you as you"
                        + "\ncontinue your journey.\n\nHP +1\nSanity +1");
                
                if(player.HP < player.maxHp){
                    player.HP += 1;
                }
                
                if (player.sanity < 4){
                    player.sanity += 1;
                }
                
                player.score += 100;
                
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
                
                System.out.println("\n Enter any key to continue...");
                in.nextLine();
                
            }
            
            if (choice.equalsIgnoreCase("leave")){
                
                System.out.println("\nYou decided to leave the mysterious box behind.");
                System.out.println("\n Enter any key to continue...");
                in.nextLine();
            }
            
            if (choice.equalsIgnoreCase("magic")){ 
                
                System.out.println("\nUsing your magic to sense the contents of the box, you feel that it contains some"
                        + "\nkind of magical essence. You are not sure if it's beneficial or harmful so you decided to "
                        + "\nleave the box instead.");
                player.score += 85;
                System.out.println("\n Enter any key to continue...");
                in.nextLine();
            }
       
    }
    
    if (scene2Choice.equalsIgnoreCase ("listen")){  //MAIN CHOICE 2
        clear();
        System.out.println(player.getName());
        player.displayStats();
        String choice = s2B.showScene();
        
        if (choice.equalsIgnoreCase("follow")){
            
            if(difficulty == true){
                System.out.println("You followed the guidance of the trees. The shortcut was able to lead you"
                        + "\nto your destination safely.");
                player.score += 100;
            }
            
            else{
                System.out.println("\nYou follow the guidance of the trees. Although the path they taught"
                        + "\nyou is indeed shorter. The trees did not tell you that it is filled with "
                        + "\nwandering wraiths and monsters. You realize this too late as you get attacked"
                        + "\nfrom all directions. Luckily, you were able to survive.");
                System.out.println("\nHP critical! 1 left.");
                player.HP = 1;
                player.score += 60;
                
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
            }
            
            
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
        
        if (choice.equalsIgnoreCase("gratitude")){
            
                System.out.println("\nYou set out for the next Guardian Stone after thanking the trees.");
                player.score += 100;
            
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
        
        if (choice.equalsIgnoreCase("communicate")){
            
            System.out.println("\nAsking for more insight from the trees, you found out that there is a shortcut"
                    + "\nroute but this route is filled with unfriendly entities and worse, they outnumber you by"
                    + "\na lot. Because of this, you decided to take the longer path instead.");
            
            player.score += 100;
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
        
        
        
    }
    
    if (scene2Choice.equalsIgnoreCase ("continue")){//MAIN CHOICE 3
        clear();
        System.out.println(player.getName());
        player.displayStats();
        String choice = s2C.showScene();
       
        
        if (choice.equalsIgnoreCase("acknowledge")){
            System.out.println("\nYou decided to acknowledge the observer. You try to interact with"
                    + "\nit but it just vanished suddenly without a trace.");
            player.score += 100;
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
        
        if(choice.equalsIgnoreCase("vigilant")){
            System.out.println("\nYou decided to not acknowledge the presence of the observer"
                    + "\nbut you still remain vigilant of its presence. This caused you a bit"
                    + "\nof paranoia though.\n\nSanity -1");
            
            player.sanity -= 1;
            player.score += 85;
            
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
        
        if(choice.equalsIgnoreCase("retreat")){
            System.out.println("\nBeing wary, you decided to retreat back to the grove.");
            
            player.score += 100;
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
        
        
    }
    
    clear();
System.out.println(player.getName());
player.displayStats();
String scene3Choice = scene3.showScene();

if (scene3Choice.equalsIgnoreCase("approach")) {//choice 1
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s3A.showScene();
    
    
    if (choice.equalsIgnoreCase("ask")){
        
        System.out.println("\nYou ask the Guardian Guide for more information. It nods and told you that this"
                + "\nmagic stone contains the vitality of an ancient beast. However, the stone can only be wielded"
                + "\nif the user manages to defeat the beast in a dream world. ");
      
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if (choice.equalsIgnoreCase("decipher")){
        System.out.println("You try to decipher the messages on your own. Unfortunately, you were not born"
                + "\nsmart. So you ask the Guardian Guide for more information. It nods and told you that this"
                + "\nmagic stone contains the vitality of an ancient beast. However, the stone can only be wielded"
                + "\nif the user manages to defeat the beast in a dream world. ");  
        player.score += 85;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if (choice.equalsIgnoreCase("touch")){
        
        
        if (difficulty == true){
            System.out.println("You decided to touch the stone in hopes of absorbing its power. Suddenly, you get"
                    + "\ntransported into a dream world. You see a beast charging forward without any warning. Your "
                    + "\nleg got impaled by one of its horns. Fortunately, the Guardian outside was able to pull you"
                    + "\nout of the dream world in time.\n\nHP-1\nSanity -1 ");
            player.HP -= 1;
            player.sanity -= 1;
            player.score += 65;
            
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        }
        
        else {
            System.out.println("You decided to touch the stone in hopes of absorbing its power. Suddenly, you get"
                    + "\ntransported into a dream world. You see a beast charging forward without any warning. Your "
                    + "\nchest got impaled by one of its horns. Unfortunately, the Guardian outside was not able to pull you"
                    + "\nout of the dream world in time.\n\nYou died a dog's death. ");
            player.HP = 0;
            player.sanity = 0;
            player.score += 65;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
            
        }

        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
}

if (scene3Choice.equalsIgnoreCase("perform")) {//choice 2
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s3B.showScene();
    
    if (choice.equalsIgnoreCase("test")){
        
        if (difficulty == true){
            System.out.println("\nYou decided to test your new abilities. Your knowledge of the mystical arts"
                    + "\nwas able to help you greatly in utilizing your new abilities despite you not being used to "
                    + "\nit yet. ");
            player.score += 100;
        }
        
        else{
            System.out.println("\nYou decided to test your new abilities. Unfortunately, you are born dumb and without"
                    + "\nany sort of talent. You end up hurting yourself from mystical art misuse.:D\n\nHP -1");
            player.HP -= 1;
            player.score += 85;
            
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        }
  
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if (choice.equalsIgnoreCase("gratitude")){
        System.out.println("\nYou thanked the Guardian Stone with a quick prayer before going on your way.\n\nSanity +1 ");
        if (player.sanity < 4){
            player.sanity += 1;
        }
        player.score += 100;
        
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if (choice.equalsIgnoreCase("ask")){
        System.out.println("\nYou ask the Guardian about co'nsequences of using your new found power. Interestingly enough,"
                + "\nthe Guardian just smirked as he says 'just git gud my guy'. You tilt your head in confusion. ");
        
        if(difficulty = false){
            System.out.println("\nSanity -1");
            player.sanity -= 1;
            
        }
        player.score += 85;
        
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
      
}

if (scene3Choice.equalsIgnoreCase("search")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s3C.showScene();
    
    if (choice.equalsIgnoreCase("decipher")){
        System.out.println("You try to decipher the messages on your own. Unfortunately, you were not born"
                + "\nsmart. So you ask the Guardian Guide for more information. It nods and told you that this"
                + "\nmagic stone contains the vitality of an ancient beast. However, the stone can only be wielded"
                + "\nif the user manages to defeat the beast in a dream world. ");
        
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
                player.score += 100;
    }
    
    if (choice.equalsIgnoreCase("consult")){
        System.out.println("\nYou ask the Guardian Guide for more information. It nods and told you that this"
                + "\nmagic stone contains the vitality of an ancient beast. However, the stone can only be wielded"
                + "\nif the user manages to defeat the beast in a dream world. ");
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if (choice.equalsIgnoreCase("explore")){
        System.out.println("\nYou decided to explore the surroundings before focusing on the stone. You see"
                + "\nseveral other inscriptions on the walls. Other than that, the place is pretty much plain.");
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
}

// Code for Scene 4
clear();
System.out.println(player.getName());
player.displayStats();
String scene4Choice = scene4.showScene();

if (scene4Choice.equalsIgnoreCase("cross")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s4A.showScene();
    
    
    if (choice.equalsIgnoreCase("strengthen")){
        System.out.println("\nYou strengthen the magical platform. However, there were too"
                + "\nmany aquatic creatures that came crashing to the platform. The platform"
                + "\nyou created eventually breaks and the creatures got to you.\n\nHP -1");
        
        player.HP -= 1;
        player.score += 85;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if (choice.equalsIgnoreCase("dive")){
        
        if (difficulty == true){
            System.out.println("\nYou choose to dive into the river to confront the monsters."
                    + "\nThe hell were you thinking though? You ain't no sea god. As soon as you"
                    + "touch the water, several creatures swarmed unto you, injuring you gravely.\n\nHP -1\nSanity -1");
            player.score += 85;
            player.HP -= 1;
            player.sanity -=1;
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        }
        
        else{
            System.out.println("\nYou choose to dive into the river to confront the monsters."
                    + "\nThe hell were you thinking though? You ain't no sea god. As soon as you"
                    + "touch the water, the process of your slow, painful, and wet death started.\n\nYou died a fish's death");
            player.score += 85;
            player.HP = 0;
            player.sanity = 0;
        }
        
        
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if (choice.equalsIgnoreCase("retreat")){
        
           System.out.println("\nYou choose to retreat from the unpredictable situation. This proved to be the best course"
                   + "\naction in this case as you managed to survive the school of mysterious aquatic creatures.");
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    
 
}

if (scene4Choice.equalsIgnoreCase("search")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s4B.showScene();
    
    
    if (choice.equalsIgnoreCase("gratitude")){
        
        System.out.println("\nYou expressed your thanks to the magical bridge through a quick"
                + "\nprayer before going on your way.");
       player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
        
    }
    
    
    
    if (choice.equalsIgnoreCase("investigate")){
        System.out.println("\nYou saw a glowing pink flora below the bridge. You reckon that"
                + "\nthis is the core of the bridge that powers it. Better not mess with it."); 
        
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    
    if (choice.equalsIgnoreCase("continue")){
        System.out.println("\nYou decide that the bridge is too suspicious for you to use."
        + "\nWho knows what else is on it? You continued without the help of the bridge and this proved"
        + "\nto be a mistake. Without the bridge, several aquatic monsters swarmed you making you flee and"
        + "\neventually, you retreat back to the bridge to use it.\n\nHP -1");
        
        player.HP  -= 1;
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
      
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    

    
    
}

if (scene4Choice.equalsIgnoreCase("follow")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s4C.showScene();
    

    
    
    if(choice.equalsIgnoreCase("communicate")){
        
        if(difficulty == true){
            System.out.println("\nYou attempt to communicate with the mysterious being. Surprisingly,"
                    + "\nthe being smiled you. 'You're lucky that I'm in a good mood right now :) I'll"
                    + "\nheal some of your wounds for you. Now, go on. Don't bother me.\n\nHP +1 ");
            
            if (player.HP < 3){
            player.HP += 1;}
            player.score += 100;
        }
        
        else{
            System.out.println("\nYou attempt to communicate with the mysterious being. You are shocked to"
                    + "\nto see the being's face when it turned to you. It was a gnarly frown. 'Get of my "
                    + "\nsight imbecile!' He shouts as a smacks your face, making you fly back to the bridge.\n\nHP -1");
            
            player.HP -= 1;
            player.score += 85;
              if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        }
 
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    if(choice.equalsIgnoreCase("perform")){
        System.out.println("\nYou decide to be cautious and just perform a low bow towards the mysterious"
                + "\nbeing. It just stared at you as you raise your head. You take it as a sign that this "
                + "\nentity does not want to be bothered.");
        
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    
    if(choice.equalsIgnoreCase("ignore")){
        System.out.println("\nYou decided to ignore the being to focus on getting to the other side."
                + "\nThe being ignored you as well.");
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }

    
    
    
}

// Code for Scene 5
clear();
System.out.println(player.getName());
player.displayStats();
String scene5Choice = scene5.showScene();

if (scene5Choice.equalsIgnoreCase("approach")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s5A.showScene();
    
    if(choice.equalsIgnoreCase("share")){
        
        if (difficulty == true){
        
             System.out.println("\nYou decide to share the prophecy with the Guardian Guide."
                + "\n'You can get through this. I learned some of your traits from the "
                + "\nso far, short time we have together.' Hearing the Guardian's words"
                + "\nof encouragement, you were filled with motivation going forward.\n\nSanity +1 ");
        player.score += 100;
        if (player.sanity < 4){
        player.sanity += 1;}
        }
        
        else{
            
            System.out.println("\nYou decide to share the prophecy with the Guardian Guide."
                    + "\nYou were surprised when you were cut off with a huge, hearty laugh."
                    + "\n'Hell nah! Why should I care? With your talent? You are bound to die "
                    + "\nanyway! HAHAHA consider yourself lucky that you are still alive today.'"
                    + "\nHearing the demoralizing words from the Great Guardian, your motivation sunk"
                    + "\nto its lowest as you continue your journey.\n\nSanity -1");
            player.score += 85;
            player.sanity -= 1;
              if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
            
        }
    
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    
    if(choice.equalsIgnoreCase("keep")){
        
        System.out.println("\nYou believe that it would be best to keep information about future events"
                + "\nto yourself. Therefore, you pretended to dismiss the inscriptions like it did not "
                + "\nmatter to you.");
        
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if(choice.equalsIgnoreCase("seek")){
       
        System.out.println("\nYou wanted to know more about the prophecy so you tried to look for other clues."
                + "\nYou failed to find anything relevant.");
        
        player.score += 85;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
}

if (scene5Choice.equalsIgnoreCase("examine")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s5B.showScene();
    
    if (choice.equalsIgnoreCase("test")){
        
        System.out.println("\nYou decided to test your newly enhanced powers."
                + "\nYou are pleasantly surprised to learn that the although temporary,"
                + "\nthe enhancing effects of the flowers work wonders indeed.");
        
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    if (choice.equalsIgnoreCase("gratitude")){
        System.out.println("\nYou silently thanked the meadow for its gifts as you"
                + "\ncontinue your journey.");
        player.score += 100;
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    if (choice.equalsIgnoreCase("investigate")){
        System.out.println("\nYou decide to investigate the flowers further in hopes of understanding"
                + "\nit more. Unfortunately, as you explored deeper and deeper into the meadow, you "
                + "\ncan feel the magical essence becoming more concentrated. By the time that you realized"
                + "\nwhat was happening, the magical essence was already suffocating you.\n\nHP -1\nSanity-1");
        player.score += 85;
        player.HP -=1;
        player.sanity -=1;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        
        
        
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
    
}

if (scene5Choice.equalsIgnoreCase("circle")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s5C.showScene();
    
    if (choice.equalsIgnoreCase("disarm")){
        
        System.out.println("\nYou attempt to disarm the traps. As you were disarming the traps, you hear"
                + "\nseveral footsteps. There are from the guards of the meadow who have been alerted when the traps "
                + "\nwere getting destroyed. As you run away from them, one was able to hit with a spear on the leg,"
                + "\nmaking your escape very painful.\n\nHP -1\nSanity -1");
        
        player.HP -= 1;
        player.sanity -=1;
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if(choice.equalsIgnoreCase("warn")){
        
        
        System.out.println("\nYou shout to warn the Guardian Guide. The plan you two came up with was to destroy the"
                + "\ntraps. Unfortunately, as you were disarming the traps, you hear"
                + "\nseveral footsteps. There are from the guards of the meadow who have been alerted when the traps "
                + "\nwere getting destroyed. As you run away from them, one was able to hit with a spear on the leg,"
                + "\nmaking your escape very painful.\n\nHP -1\nSanity -1" );
        
        player.HP -= 1;
        player.sanity -=1;
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    if(choice.equalsIgnoreCase("choose")){
        
        System.out.println("\nYou choose to avoid the suspicious looking terrain. Although it took you longer"
                + "\nyou were able to find a safe path towards your destination");
        
    player.score += 100;
        
        System.out.println("\n Enter any key to continue...");
                in.nextLine();
    }
    
    
}

clear();
System.out.println(player.getName());
player.displayStats();
String scene6Choice = scene6.showScene();

if (scene6Choice.equalsIgnoreCase("blue")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s6A.showScene();
    
        if (choice.equalsIgnoreCase("approach")){
           
            System.out.println("\nYou decide to approach the treasure chest very cautiously. Luckily, "
                    + "\nit seems like there is nothing around the chest. You open it and suddenly, the chest"
                    + "\nturned into a huge mouth with sharp teeth. It almost bit your hand off but you away with "
                    + "\njust a graze. \n\nHP -1");
            player.HP -= 1;
            player.score += 85;
              if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
            
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
            
        }
        
        
        

        if (choice.equalsIgnoreCase("dive")){
            
            System.out.println("\nYou decide to dive into the pond to be able to explore the area more around the chest."
                    + "\nTo your surprise, you found that underneath the chest, there were hidden teeth. It was a mimic! Luckily,"
                    + "\nyou did not open the chest yet. You were able to kill the mimic from below and gather the treasure inside"
                    + "its mouth.");
            player.score += 100;
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
        
        
   
        if (choice.equalsIgnoreCase("rest")){
            
            System.out.println("\nBah, treasure? Who cares! You instead decided to rest while taking in scene of the bright blue"
                    + "\noasis. You feel energized and full of vigor afterwards.\n\nHP +1\nSanity +1");
            
            if (player.HP < 3){
            player.HP += 1;}
            player.sanity +=1;
            player.score += 100;
            System.out.println("\n Enter any key to continue...");
                in.nextLine();
        }
}

if (scene6Choice.equalsIgnoreCase("green")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s6B.showScene();

    if (choice.equalsIgnoreCase("accept")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nYou accept the sprite's guidance. It leads you through a challenging, yet manageable path."
                    + "\nThe sprite's mischievous nature makes the journey enjoyable.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            player.score += 100;
        } else {
            System.out.println("\nYou accept the sprite's guidance. However, it leads you through an unexpectedly treacherous path."
                    + "\nThe sprite's mischievous nature becomes apparent as obstacles become more difficult.\n\nSanity -1");
            player.sanity -= 1;
            player.score += 85;
              if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        }

        System.out.println("\n Enter any key to continue..."); 
        in.nextLine();
    } else if (choice.equalsIgnoreCase("decline")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        System.out.println("\nYou politely decline the sprite's guidance and choose to navigate the challenges independently."
                + "\nYour self-confidence boosts your morale.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}

        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("ask")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nYou inquire about the origin of the obstacles. The sprite shares interesting anecdotes,"
                    + "\nlightening the mood and enhancing your understanding of the forest.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            player.score += 100;
        } else {
            System.out.println("\nCurious about the origin of the obstacles, you ask the sprite. Its cryptic responses leave you puzzled,"
                    + "\nadding an air of mystery to your journey.\n\nSanity -1");
            player.score += 85;
            player.sanity -= 1;
              if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        }

        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}

if (scene6Choice.equalsIgnoreCase("purple")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s6C.showScene();

    if (choice.equalsIgnoreCase("investigate")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nYou meticulously investigate the glowing vines, discovering their magical properties."
                    + "\nYou harness the magical energy, feeling a surge of power.\n\nHP +1\nSanity +1");
           if (player.HP < 3){
            player.HP += 1;}
            if (player.sanity < 4){
        player.sanity += 1;}
            player.score += 100;
        } else {
            System.out.println("\nYour investigation of the glowing vines is interrupted by a sudden burst of magical energy."
                    + "\nThe uncontrolled surge leaves you drained and slightly disoriented. Luckily, you have high magical resistance.\n\nSanity -1");
            player.score += 85;
            player.sanity -= 1;
              if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        }

        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("follow")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        System.out.println("\nYou decide to follow the path deeper into the grove, your senses heightened by the mystical surroundings."
                + "\nThe journey fills you with a sense of wonder and tranquility.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
        player.score += 100;

        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("magic")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nYou use your magical ability to commune with the energy of the grove, gaining insights into its mysteries."
                    + "\nThe experience leaves you enlightened and invigorated.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            player.score += 100;
        } else {
            System.out.println("\nYour attempt to use magic to commune with the energy of the grove has unintended consequences."
                    + "\nYou successfully protected yourself.");
          player.score += 100;
        }

        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}

// Code for Scene 7
clear();
System.out.println(player.getName());
player.displayStats();
String scene7Choice = scene7.showScene();

if (scene7Choice.equalsIgnoreCase("engage")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s7A.showScene();
    
    if (choice.equalsIgnoreCase("attempt")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    System.out.println("\nYou decide to tackle the riddle on your own, relying on your wit and intellect.");

    if (difficulty) {
        System.out.println("The riddle proves challenging, but you manage to solve it with your intelligence and quick thinking."
                + "\nYour confidence and mental acuity grow.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
        player.score += 100;
    } else {
        System.out.println("The riddle proves to be a formidable challenge, and your inability to solve it leaves you feeling frustrated."
                + "\nYour mental fatigue increases. The guardian laughed at you pitifully as it offered you a spirit fruit which"
                + "\nyou took. \n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
        player.score += 100;
    }

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    System.out.println("\nYou decide to seek guidance from the Guardian Guide, hoping for insights into the riddle.");

    if (difficulty) {
        System.out.println("The Guardian Guide provides helpful hints, enabling you to solve the riddle easily."
                + "\nYour gratitude towards the Guardian Guide increases.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
        player.score += 100;
    } else {
        System.out.println("The Guardian Guide's guidance is cryptic, adding to your confusion about the riddle."
                + "\nYour dependence on external help leaves you feeling uneasy.\n\nSanity -1");
        player.sanity -= 1;
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    }

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    System.out.println("\nYou decide to use a magical ability to gain insights into the riddle.");

    if (difficulty) {
        System.out.println("Your magical ability unveils hidden meanings in the riddle, making it easier for you to solve."
                + "\nYour mastery of magic enhances your self-esteem.\n\nSanity +1");
        
        if (player.sanity < 4){
        player.sanity += 1;
        }
        
        player.score += 100;
    } else {
        System.out.println("The magical attempt to decipher the riddle backfires, leaving you disoriented and mentally drained."
                + "\nYour overreliance on magic takes a toll on your mental stability.\n\nSanity -1");
        player.score += 85;
        player.sanity -= 1;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    }

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
    
    
    
    
    
    
    
}

if (scene7Choice.equalsIgnoreCase("demonstrate")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s7B.showScene();
    
    if (choice.equalsIgnoreCase("accept")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    System.out.println("\nYou accept the guardian spirit's challenge, ready to showcase your agility.");

    if (difficulty) {
        System.out.println("Your display of skill impresses the guardian, he looks at you considerately"
                + "\nthen decides to test your agility further. He tasked you with catching a mystical deer."
                + "\nYou accepted enthusiastically but the task was way harder than you thought. You injured"
                + "\nyourself while trying to complete it.\n\nHP -1"
                );
        player.HP -= 1;
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    } else {
        System.out.println("The challenging trial pushes your limits, leaving you fatigued and drained."
                + "\nYour physical endurance decreases.\n\nHP -1");
        player.HP -= 1;
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    }

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("request")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    System.out.println("\nYou politely request an alternative trial, expressing your concerns about the celestial bridge.");

    if (difficulty) {
        System.out.println("The guardian spirit laughs at your pathetic weakness and decides that you"
                + "\nare not worth his time. He smacked your bum and sent you flying.\n\n HP -1\nSanity -1");
        player.sanity -= 1;
        player.HP -=1;
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    } else {
        System.out.println("The guardian spirit is disappointed by your lack of confidence."
                + "\nYour self-esteem takes a hit, affecting your mental state. He looks at you"
                + "\nwith a sense of pity and decided to boost your vitality has he sees you as nothing"
                + "\nmore than a pathetic insect.\n\nHP +1\nSanity -1");
        player.sanity -= 1;
        if (player.HP < 3){
            player.HP +=1;
        }
        player.score += 85;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    }

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    System.out.println("\nYou decide to use a magical ability to enhance your physical prowess on the celestial bridge.");

    if (difficulty) {
        System.out.println("Your magical enhancement proves successful, boosting your agility."
                + "\nYour magical prowess leaves you feeling more confident.");
        player.score += 100;
    } else {
        System.out.println("The magical strain takes a toll on your body, leaving you weakened and fatigued."
                + "\nYour magical attempt has a negative impact on your physical well-being. Luckily, the guardian"
                + "\npitied you and decided to boost your vitality.");
        player.score += 100;
    }

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene7Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s7C.showScene();
    
    
    if (choice.equalsIgnoreCase("wait")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    
        System.out.println("\nYou patiently wait for the guardian spirit's response. Your dazzling display impresses the spirit,"
                + "\nand it acknowledges your connection to mystical energies.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
        player.score += 100;
   

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("ask")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

        System.out.println("\nYou ask the Guardian Guide if your display was sufficient. The guide commends your mastery of mystical"
                + "\nenergies and encourages you to continue your journey.\n\nHP +1");
        if (player.HP < 4){
        player.HP += 1;}
        player.score += 100;

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

  
        System.out.println("\nYou express gratitude and request permission to continue your journey. The guardian spirit, pleased with"
                + "\nyour respectful demeanor, grants you permission and bestows a blessing.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
        
        player.score += 100;
    

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

// Code for Scene 8
clear();
System.out.println(player.getName());
player.displayStats();
String scene8Choice = scene8.showScene();

if (scene8Choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s8A.showScene();
    
    if (choice.equalsIgnoreCase("ask")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nYou inquire about the nature of the final challenge. The guardian spirit's revelations illuminate"
                + "\nthe path ahead.");
    
        player.score += 100;
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("request")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    
        System.out.println("\nPolitely requesting guidance on communicating with the Tree of Luminescence, the guardian spirit"
                + "\nshares mystical insights. You feel a heightened connection to the ancient tree.");
        player.score += 100;
  
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("express")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nExpressing your readiness to face the final challenge, the guardian spirit, pleased with your determination,"
                + "\nbestows a blessing upon you. Your mental fortitude strengthens.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
       System.out.println("\nExpressing your readiness to face the final challenge, the guardian spirit, pleased with your determination,"
                + "\nbestows a blessing upon you. Your mental fortitude strengthens.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
        
    }
    player.score += 100;
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}
}
if (scene8Choice.equalsIgnoreCase("ask")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s8B.showScene();
    
    
    if (choice.equalsIgnoreCase("listen")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        
            System.out.println("\nListening closely to the whispers of the leaves, you gain insights into the mystical energies of the forest."
                    + "\nThe guardian spirit commends your attunement to nature.");
      player.score += 100;
    

        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("magic")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

       
            System.out.println("\nUsing your magical abilities to enhance perception, you feel a strain on your mental faculties."
                    + "\nThe guardian spirit acknowledges your effort, but warns about the risks of pushing too hard.\n\nSanity -1");
            player.sanity -= 1;
      
            player.score -= 85;
              if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("ask")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (!difficulty) {
            System.out.println("\nPolitely asking the guardian spirit for more information, you receive cryptic responses."
                    + "\nWhile intriguing, the lack of clear answers leaves you slightly confused.\n\nSanity -1");
            player.sanity -= 1;
            player.score += 85;
            
        } else {
            System.out.println("\nCurious about the whispers, you inquire with the guardian spirit. Clear explanations aid your understanding."
                    + "\nThe guardian spirit's guidance boosts your mental clarity.\n\nSanity +1");
            if (player.sanity < 4){
            player.sanity += 10;}
            player.score += 100;
        }
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}
    
    
    


if (scene8Choice.equalsIgnoreCase("absorb")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s8C.showScene();
    
    if (scene8Choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    
       
            System.out.println("\nSharing the vision, the guardian spirit is intrigued. The exchange of energies leaves you revitalized."
                    + "\nYour instincts sharpen, providing a heightened sense of awareness.\n\nHP +1, Sanity +1");
            if (player.HP < 3){
            player.HP += 1;}
            if (player.sanity < 4){
            player.sanity += 1;}
            player.score += 100;
        
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("secret")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

       
            System.out.println("\nOpting to keep the vision a secret, you feel a surge of self-reliance. The guardian spirit observes"
                    + "\nwith a cryptic expression, leaving you with a mix of uncertainty and determination.\n\nHP +1, Sanity -1");
          
            player.sanity -= 1;
            player.score += 85;
       
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("guidance")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        
            System.out.println("\nSeeking guidance from the Guardian Guide on interpreting the vision, you receive insightful perspectives."
                    + "\nYour understanding of the mystical path deepens.\n\nSanity +1, HP -1");
            if (player.sanity < 4){
            player.sanity += 1;}
            player.HP -= 1;
            player.score += 100;
      
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


// Code for Scene 9
clear();
System.out.println(player.getName());
player.displayStats();
String scene9Choice = scene9.showScene();

if (scene9Choice.equalsIgnoreCase("enter")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s9A.showScene();
    
 
    if (choice.equalsIgnoreCase("follow")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nTrusting the symbols as your guide through the labyrinth, you navigate the passages with confidence."
                    + "\nThe mystical symbols seem to ward off unseen dangers.\n\nSanity +1, HP -1");
            if (player.sanity < 4){
            player.sanity += 1;}
            player.HP -= 1;
        } else {
            System.out.println("\nFollowing the symbols, the labyrinth unveils its secrets to you."
                    + "\nThe guardian spirit nods in approval, acknowledging your intuition.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
        player.score += 100;
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("magic")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nUsing your magical abilities to sense hidden dangers, you feel a drain on your mental energy."
                    + "\nThe guardian spirit cautions you about the toll such magic takes on your sanity.\n\nSanity -1");
            player.sanity -= 1;
        } else {
            System.out.println("\nChanneling magic to sense dangers, you uncover hidden threats in the labyrinth."
                    + "\nThe guardian spirit commends your mastery of magic.\n\nSanity +1");
            if (player.sanity < 4){
            player.sanity += 1;}
        }
        player.score += 100;
        
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("shout")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nShouting aloud to gauge inhabitants, your voice echoes unsettlingly in the labyrinth."
                    + "\nThe guardian spirit, concerned, notes the strain on your mental well-being.\n\nSanity -1");
            player.sanity -= 1;
        } else {
            System.out.println("\nYour shout reverberates, revealing the presence of hidden creatures in the labyrinth."
                    + "\nThe guardian spirit praises your vigilance.\n\nSanity +1, HP -1");
            if (player.sanity < 4){
            player.sanity += 1;}
            player.HP -= 1;
        }
        player.score += 100;
        
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


if (scene9Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s9B.showScene();
    
    if (choice.equalsIgnoreCase("study")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (!difficulty) {
            System.out.println("\nStudying the carvings for information on the labyrinth's layout, you strain your mental faculties."
                    + "\nThe intricate details, however, provide valuable insights.\n\nSanity -1, HP +1");
            player.sanity -= 1;
            if (player.HP < 3){
            player.HP += 1;}
            
            player.score += 100;
        } else {
            System.out.println("\nDiligently studying the carvings, you unravel the secrets of the labyrinth."
                    + "\nThe guardian spirit commends your intellect.");
            player.score += 100;
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("continue")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (!difficulty) {
            System.out.println("\nContinuing forward with the magical light, you encounter unexpected challenges in the labyrinth."
                    + "\nThe strain on your mental energy is palpable.\n\nSanity -1");
            player.sanity -= 1;
            player.score += 100;
        } else {
            System.out.println("\nNavigating forward with the magical light, the labyrinth unfolds its mysteries to you."
                    + "\nThe guardian spirit acknowledges your courage.\n\nSanity +1");
            if (player.sanity < 4){
            player.sanity += 1;}
            player.score += 100;
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("share")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nSharing the insights gained from the carvings, the guardian spirit commends your effort but warns of the toll on your sanity."
                    + "\nThe labyrinth's mysteries, however, become clearer to you.\n\nSanity -1, HP +1");
            player.sanity -= 1;
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nSharing the insights, the guardian spirit expresses gratitude for your cooperation."
                    + "\nThe knowledge gained boosts your confidence.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
            player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
            
        }
        player.score += 100;
        
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}

if (scene9Choice.equalsIgnoreCase("consult")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s9C.showScene();
   
    if (choice.equalsIgnoreCase("follow")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nFollowing the Guardian Guide's advice through the labyrinth, you navigate the challenges with resilience."
                    + "\nThe guardian's wisdom proves valuable.\n\nSanity +1, HP +1");
             if (player.sanity < 4){
            player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nWholeheartedly following the Guardian Guide's advice, you find the labyrinth's secrets unfolding before you."
                    + "\nThe guardian spirit commends your trust.\n\nSanity +1");
            if (player.sanity < 4){
            player.sanity += 1;}
        }
        player.score += 100;
        
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("gratitude")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nThanking the Guardian Guide for the advice, you proceed independently. The labyrinth, however, poses unexpected challenges."
                    + "\nYour gratitude is noted, but your mental fortitude is tested.\n\nSanity -1, HP +1");
            player.sanity -= 1;
           if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nExpressing gratitude to the Guardian Guide, you gain a sense of assurance. The labyrinth's challenges seem less daunting."
                    + "\nThe guardian spirit appreciates your politeness.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
            player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
        player.score += 100;
        
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("request")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nRequesting additional information about potential challenges, the Guardian Guide shares insights."
                    + "\nThe knowledge gained is helpful, but the labyrinth takes a toll on your sanity.\n\nSanity -1, HP +1");
            player.sanity -= 1;
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nPolitely asking for more information, the guardian spirit provides guidance."
                    + "\nYour intuition strengthens, and the journey becomes more manageable.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
            player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
             player.score += 100;
             
               if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


// Code for Scene 10
clear();
System.out.println(player.getName());
player.displayStats();
String scene10Choice = scene10.showScene();

if (scene10Choice.equalsIgnoreCase("left")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s10A.showScene();
    
    if (scene10Choice.equalsIgnoreCase("join")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    choice = s10A.showScene();

  
        if (difficulty) {
            System.out.println("\nJoining the ethereal dance and harmonizing with the sound beings, you feel a surge of magical energy."
                    + "\nThe experience leaves you invigorated and more in tune with mystical forces.\n\nSanity +1, HP +1");
            player.sanity += 1;
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nWholeheartedly joining the ethereal dance, you become one with the sound entities."
                    + "\nThe guardian spirit acknowledges your openness, boosting your magical affinity.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("magic")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nUsing your magical abilities to communicate with the sound entities, you gain profound insights."
                    + "\nThe knowledge acquired enhances your mental resilience.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nUtilizing your magical abilities, you establish a unique connection with the sound entities."
                    + "\nThe guardian spirit commends your magical prowess.\n\nSanity +1, HP +1");
           if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("navigate")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nQuietly navigating the chamber without disturbing the echoing chorus, you manage to maintain your focus."
                    + "\nThe guardian spirit notes your subtlety, preserving your mental fortitude.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nCarefully navigating the chamber, you avoid disturbing the echoing chorus."
                    + "\nThe experience, although challenging, leaves you with a sense of accomplishment.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


if (scene10Choice.equalsIgnoreCase("right")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
     String choice = s10B.showScene();
     

    if (choice.equalsIgnoreCase("approach")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nApproaching the illuminated nexus cautiously, you absorb the ancient energies."
                    + "\nThe experience rejuvenates your magical essence.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            player.HP += 1;
        } else {
            System.out.println("\nCautiously approaching the nexus, you feel a surge of ancient energies revitalizing your being."
                    + "\nThe guardian spirit commends your attunement to mystical forces.\n\nSanity +1, HP +1");
           if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("magic")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nUsing your magical abilities to examine the nexus from a distance, you gain insights into its arcane properties."
                    + "\nThe knowledge acquired enhances your mental and physical resilience.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nExamining the nexus from a distance, your magical perception unveils its mysteries."
                    + "\nThe guardian spirit acknowledges your magical prowess.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("consult")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nConsulting the Guardian Guide for insights on the nexus, you receive guidance on harnessing its energies."
                    + "\nThe guardian spirit's wisdom enhances your magical abilities.\n\nSanity +1, HP +1");
           if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        } else {
            System.out.println("\nSeeking insights from the Guardian Guide, you gain valuable knowledge about the nexus."
                    + "\nThe guardian spirit commends your inquisitiveness.\n\nSanity +1, HP +1");
            if (player.sanity < 4){
        player.sanity += 1;}
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}
     
     


if (scene10Choice.equalsIgnoreCase("center")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
     String choice = s10C.showScene();
     

    if (choice.equalsIgnoreCase("communicate")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nAttempting to communicate with the crystal guardian, you establish a magical connection."
                    + "\nThe guardian shares ancient knowledge, enhancing your mental fortitude.\n\nSanity +1");
            player.sanity += 1;
        } else {
            System.out.println("\nEngaging in communication with the guardian, you receive cryptic insights into the cavern's mysteries."
                    + "\nThe experience adds an air of mystery to your journey.\n\nSanity +1");
           if (player.sanity < 4){
        player.sanity += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("magic")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nUsing a magical ability to decipher the guardian's intentions, you gain profound insights."
                    + "\nThe knowledge acquired enhances your mental resilience.\n\nSanity +1");
            player.sanity += 1;
        } else {
            System.out.println("\nApplying your magical abilities to understand the guardian, you uncover hidden aspects of the cavern."
                    + "\nThe guardian spirit acknowledges your magical prowess.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("avoid")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nCircumventing the guardian, you find an alternative route that challenges your agility."
                    + "\nThe experience enhances your physical prowess.\n\nHP +1, Sanity -1");
            if (player.HP < 3){
            player.HP += 1;}
            player.sanity -= 1;
        } else {
            System.out.println("\nChoosing to avoid the guardian, you navigate through hidden passages, adding an element of thrill to your journey."
                    + "\nThe guardian spirit commends your resourcefulness.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
} else if (scene10Choice.equalsIgnoreCase("magic")) {
    // Handle consequences for choosing magic option in Scene10C
    if (difficulty) {
        System.out.println("\nUsing your magical abilities to examine the nexus from a distance, you gain insights into its mystical properties."
                + "\nThe knowledge acquired enhances your mental resilience.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nApplying your magical abilities to examine the nexus, you sense its magical aura and gain a deeper understanding of the cavern."
                + "\nThe guardian spirit acknowledges your magical prowess.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    }

    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (scene10Choice.equalsIgnoreCase("avoid")) {
    // Handle consequences for choosing avoid option in Scene10C
    if (difficulty) {
        System.out.println("\nChoosing to navigate the chamber without disturbing the echoing chorus, you demonstrate agility and stealth."
                + "\nThe experience enhances your physical prowess.\n\nHP +1");
        if (player.HP < 3){
            player.HP += 1;}
    } else {
        System.out.println("\nNavigating the chamber quietly, you avoid disturbing the echoing chorus, adding an element of mystery to your journey."
                + "\nThe guardian spirit commends your subtlety.\n\nHP +1");
        if (player.HP < 3){
            player.HP += 1;}
    }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
     

    
    
// Code for Scene 11
clear();
System.out.println(player.getName());
player.displayStats();
String scene11Choice = scene11.showScene();

if (scene11Choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s11A.showScene();
    


    if (choice.equalsIgnoreCase("ask")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nSeeking guidance on facing the final challenge, the Guardian of Reflections shares profound insights."
                    + "\nYour mental fortitude is strengthened.\n\nSanity +1");
            player.sanity += 1;
        } else {
            System.out.println("\nCurious about the final challenge, you inquire about the Guardian's guidance. The revelations add clarity to your journey."
                    + "\nYour physical well-being is invigorated.\n\nHP +1");
            player.HP += 1;
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("gratitude")) {
        // Handle consequences for choosing gratitude option in Scene11A
        if (difficulty) {
            System.out.println("\nExpressing gratitude for the revelations, you continue your journey independently."
                    + "\nThe Guardian of Reflections acknowledges your appreciation.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nThankful for the insights gained, you express gratitude to the Guardian of Reflections."
                    + "\nThe knowledge imparts a sense of confidence to face the final challenge.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("request")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nRequesting more information about the Guardian's role in the forest, you gain deeper insights into its purpose."
                    + "\nThe knowledge acquired enhances your mental resilience.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nCurious about the Guardian's role, you request more information. The revelations add a layer of understanding to your journey."
                    + "\nYour physical well-being is invigorated.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


if (scene11Choice.equalsIgnoreCase("fight")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s11B.showScene();
    
  
    if (choice.equalsIgnoreCase("fight")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nEngaging in combat with the spectral assailants, you showcase your prowess and determination."
                    + "\nThe battle is fierce, but your resolve remains unshaken.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nFacing the spectral assailants head-on, you display your combat skills with confidence."
                    + "\nThe battle takes a toll on your physical well-being, but your strength prevails.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("protect")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nUsing a protective magical barrier, you shield yourself from the spectral assailants' attacks."
                    + "\nThe defensive stance reinforces your mental resilience.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nCreating a magical barrier to protect yourself, you successfully ward off the spectral assailants."
                    + "\nThe effort leaves you slightly drained, but your physical well-being remains intact.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("negotiate")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nAttempting to negotiate with the specters, you gain insights into their purpose."
                    + "\nThe interaction, though challenging, fortifies your mental resilience.\n\nSanity +1");
           if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nNegotiating with the spectral assailants, you manage to understand their purpose and convince them to disperse."
                    + "\nThe diplomatic approach saves you from physical exertion.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


if (scene11Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s11C.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nExpressing gratitude to the Guardian of Reflections, you absorb its guidance with a sense of clarity."
                    + "\nThe wisdom shared enhances your mental resilience.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nThanking the Guardian for its guidance, you feel a surge of energy revitalizing your physical well-being."
                    + "\nThe revelations strengthen your resolve.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("clarify")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nSeeking clarification on specific details, the Guardian of Reflections imparts additional insights."
                    + "\nThe knowledge gained enhances your mental fortitude.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nClarifying specific details about the final challenge, the Guardian's explanations deepen your understanding."
                    + "\nYour physical well-being benefits from the gained knowledge.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("ask")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nExpressing curiosity about the veiled practices within the Enchanted Forest, the Guardian shares intriguing knowledge."
                    + "\nYour mental resilience is fortified with the newfound wisdom.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nAsking about veiled practices within the Enchanted Forest, the Guardian imparts mystical insights."
                    + "\nThe shared wisdom adds a spark to your physical vitality.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


// Code for Scene 12
clear();
System.out.println(player.getName());
player.displayStats();
String scene12Choice = scene12.showScene();

if (scene12Choice.equalsIgnoreCase("listen")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s12A.showScene();
   

    if (choice.equalsIgnoreCase("investigate")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nDelving into the source of the whispers, you uncover hidden truths but at the cost of your mental stability."
                    + "\nThe revelations about ancient betrayals weigh heavily on your mind.\n\nSanity -1");
            player.sanity -= 1;
        } else {
            System.out.println("\nInvestigating the source of the whispers, you gain insights into the Enchanted Forest's history."
                    + "\nThe knowledge acquired boosts your mental resilience.\n\nHP +1");
           if (player.HP < 3){
            player.HP += 1;}
        }
        player.score+=100;
        
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("share")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nSharing the information with the Guardian Guide, you find solace in their comforting presence."
                    + "\nThe guidance received helps stabilize your mental state.\n\nSanity +1");
            if (player.sanity < 4){
        player.sanity += 1;}
        } else {
            System.out.println("\nSharing the information with the Guardian Guide, their insights into the whispers provide reassurance."
                    + "\nYour mental fortitude benefits from the shared knowledge.\n\nHP +1");
            if (player.HP < 3){
            player.HP += 1;}
        }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    } else if (choice.equalsIgnoreCase("continue")) {
        clear();
        System.out.println(player.getName());
        player.displayStats();

        if (difficulty) {
            System.out.println("\nContinuing cautiously, you remain vigilant against potential treacheries."
                    + "\nThe mental strain of anticipating betrayal takes a toll.\n\nSanity -1");
            player.sanity -= 1;
        } else {
            System.out.println("\nContinuing cautiously, you navigate the Enchanted Forest with a heightened awareness."
                    + "\nYour physical well-being benefits from the careful approach.\n\nHP +1");
            if (player.HP < 3){
        player.HP += 1;} 
        }
        player.score+=100;
        
          if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
        System.out.println("\n Enter any key to continue...");
        in.nextLine();
    }
}


if (scene12Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s12B.showScene();
    
    
    
if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nSharing the prophecy with the Guardian Guide, you seek validation and reassurance."
                + "\nThe Guardian Guide's insights provide comfort, stabilizing your mental state.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity -= 1;}
    } else {
        System.out.println("\nSharing the prophecy with the Guardian Guide, their understanding of the cryptic messages aids your mental preparation."
                + "\nYour mental fortitude benefits from the shared knowledge.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;} 
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("secret")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nKeeping the prophecy to yourself, you mentally prepare for the upcoming trials."
                + "\nThe solitude and focus contribute to your mental resilience.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity -= 1;}
    } else {
        System.out.println("\nDeciding to keep the prophecy a secret, you mentally prepare for the challenges ahead."
                + "\nYour focused preparation enhances your physical well-being.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }   
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nSeeking more clues within the cavern to unveil the prophecy's meaning, you delve deeper into the cryptic messages."
                + "\nThe mental strain of deciphering the veiled messages takes a toll.\n\nSanity -1");
        if (player.sanity < 4){
        player.sanity -= 1;}
    } else {
        System.out.println("\nCuriously seeking more clues, you explore the cavern for additional insights into the prophecy."
                + "\nThe quest for knowledge enhances your physical well-being.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene12Choice.equalsIgnoreCase("ignore")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s12C.showScene();
    
   
}

clear();
System.out.println(player.getName());
player.displayStats();
String scene13Choice = scene13.showScene();

if (scene13Choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s13A.showScene();
    
    if (choice.equalsIgnoreCase("express")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

  
        System.out.println("\nWith determination, you step into the portal, feeling the magical energies enveloping you."
                + "\nThe experience boosts your physical well-being.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    
      player.score+=100;
      
        if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("consult")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nChoosing to consult the Guardian Guide for further insights, you gain valuable knowledge about the Celestial Nexus."
                + "\nThe guidance received enhances your mental stability.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nConsulting the Guardian Guide, you receive insights into the magical properties of the Celestial Nexus."
                + "\nThe guidance received boosts your physical well-being.\n\nHP +1");
       if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("consider")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nConsidering alternative paths before committing to the portal, you weigh your options carefully."
                + "\nThe contemplation helps preserve your mental stability.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nTaking a moment to consider alternative paths, you make a well-informed decision."
                + "\nThe contemplation enhances your physical well-being.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
      player.score+=100;
      
        if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
    
}

if (scene13Choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s13B.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nExpressing gratitude for the warning, you take the time to prepare and fortify yourself against potential challenges."
                + "\nThe cautionary approach helps maintain your mental stability.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nGrateful for the Guardian Guide's caution, you prepare yourself both mentally and physically for the journey ahead."
                + "\nThe precautionary measures boost your physical well-being.\n\nHP +1");
         if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("confidence")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

 
        System.out.println("\nExpressing confidence in your abilities, you step into the portal with determination."
                + "\nThe self-assured approach enhances your mental fortitude.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
   
         player.score+=100;
         
           if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("think")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nTaking the time to deliberate on potential risks, you make a calculated decision that helps preserve your mental stability."
                + "\nThe thoughtful approach contributes to your sanity.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nDeliberating on potential risks, you make a well-thought-out decision that enhances your physical well-being."
                + "\nThe thoughtful approach contributes to your HP.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene13Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s13C.showScene();
    
    if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nSharing the magical insights with the Guardian Guide, you receive validation and additional guidance."
                + "\nThe shared knowledge contributes to your mental stability.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nSharing the magical insights with the Guardian Guide, their interpretations provide reassurance."
                + "\nThe shared knowledge contributes to your physical well-being.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("secret")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nKeeping the magical visions to yourself, you mentally prepare for the unknown challenges."
                + "\nThe solitary contemplation helps maintain your mental stability.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nChoosing to keep the magical visions to yourself, your focused mental preparation enhances your physical well-being."
                + "\nThe solitary contemplation contributes to your HP.\n\nHP +1");
       if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nSeeking additional information within the cavern, you make informed decisions that help maintain your mental stability."
                + "\nThe acquired insights contribute to your sanity.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nSeeking additional information within the cavern, you gather knowledge that enhances your physical well-being."
                + "\nThe acquired insights contribute to your HP.\n\nHP +1");
     if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
    
}

// Code for Scene 14
clear();
System.out.println(player.getName());
player.displayStats();
String scene14Choice = scene14.showScene();

if (scene14Choice.equalsIgnoreCase("approach")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s14A.showScene();
    
    if (choice.equalsIgnoreCase("request")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nRequesting guidance on the order of trials, the celestial guardian provides valuable insights."
                + "\nYour strategic approach to the challenges is enhanced.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nRequesting guidance on the order of trials, the celestial guardian's advice strengthens your physical preparedness."
                + "\nYour resilience to upcoming challenges increases.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("ready")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nExpressing readiness to face the trials in any order, the celestial guardian commends your confidence."
                + "\nYour mental fortitude is reinforced.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nExpressing readiness to face the trials in any order, the celestial guardian recognizes your determination."
                + "\nYour physical well-being receives a boost.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nSeeking additional insights into the specifics of each trial, the celestial guardian imparts mystical knowledge."
                + "\nYour understanding of the challenges deepens.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nSeeking additional insights into the specifics of each trial, the celestial guardian provides practical advice."
                + "\nYour preparedness for the trials improves.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene14Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s14B.showScene();
    
    if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nSharing the insights with the celestial guardian, you find validation in their ethereal presence."
                + "\nThe shared visions contribute to your mental clarity.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nSharing the insights with the celestial guardian, their acknowledgment boosts your confidence."
                + "\nThe shared visions enhance your physical readiness.\n\nHP +1");
       if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("secret")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nKeeping the visions to yourself, you mentally prepare for the trials ahead."
                + "\nThe internal focus strengthens your mental fortitude.\n\nSanity +1");
         if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nKeeping the visions to yourself, your mental preparation enhances your physical resilience."
                + "\nThe internal focus boosts your physical well-being.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nSeeking confirmation from the Guardian Guide on the reliability of the visions, you receive mystical insights."
                + "\nThe confirmed reliability enhances your mental clarity.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nSeeking confirmation from the Guardian Guide, their insights provide reassurance about the visions."
                + "\nThe confirmation boosts your physical readiness.\n\nHP +1");
       if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene14Choice.equalsIgnoreCase("demonstrate")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s14C.showScene();
    
    if (choice.equalsIgnoreCase("wait")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nWaiting for the celestial guardian's instructions, you maintain a focused and patient mindset."
                + "\nThe mental composure contributes to your mental clarity.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nWaiting patiently, you attune yourself to the magical energies of the Celestial Nexus."
                + "\nThe focused wait enhances your physical readiness.\n\nHP +1");
       if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nUsing magical abilities to demonstrate your readiness, you showcase your connection to the mystical forces."
                + "\nThe magical display contributes to your mental clarity.\n\nSanity +1");
       if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nUsing magical abilities to demonstrate your readiness, you impress the celestial guardian with your magical prowess."
                + "\nThe magical display enhances your physical readiness.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nInquiring about the overarching purpose of the trials, the celestial guardian shares profound insights."
                + "\nThe gained knowledge contributes to your mental clarity.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nInquiring about the overarching purpose of the trials, the celestial guardian's wisdom enhances your understanding."
                + "\nThe gained knowledge boosts your physical readiness.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

// Code for Scene 15
clear();
System.out.println(player.getName());
player.displayStats();
String scene15Choice = scene15.showScene();

if (scene15Choice.equalsIgnoreCase("delve")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s15A.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nExpressing gratitude for the arcane knowledge, you maintain a humble demeanor before the celestial guardian."
                + "\nThe guardian acknowledges your wisdom, and your mental composure improves.\n\nSanity +1");
         if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nExpressing gratitude for the arcane knowledge, you feel a surge of vitality as the guardian recognizes your wisdom."
                + "\nThe acknowledgment boosts your physical readiness.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
       
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nSharing the acquired arcane knowledge with the celestial guardian, you contribute to the shared wisdom of the Celestial Nexus."
                + "\nThe act of sharing enhances your mental clarity.\n\nSanity +1");
          if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nSharing the acquired arcane knowledge with the celestial guardian, you strengthen the bond between you and the guardian."
                + "\nThe shared knowledge boosts your physical readiness.\n\nHP +1");
       if (player.HP < 3){
        player.HP += 1;}
       
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nReflecting on the significance of wisdom in your journey, you gain a deeper understanding of your own mental resilience."
                + "\nThe introspection contributes to your mental clarity.\n\nSanity +1");
         if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nReflecting on the significance of wisdom in your journey, you feel a sense of inner strength and determination."
                + "\nThe reflection boosts your physical readiness.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
        
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}

    
    
}

if (scene15Choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s15B.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nExpressing gratitude for the celestial guidance, you internalize the insights shared by the guardian."
                + "\nThe acknowledgment enhances your mental composure.\n\nSanity +1");
          if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nExpressing gratitude for the celestial guidance, you feel a surge of confidence as the guardian recognizes your receptiveness."
                + "\nThe acknowledgment boosts your physical readiness.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
       
    }
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("ask")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nAsking for additional tips, the celestial guardian provides further insights, but the complexities of the trial weigh on your mind."
                + "\nThe additional information contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nAsking for additional tips, the celestial guardian shares valuable knowledge that bolsters your confidence."
                + "\nThe acquired insights enhance your physical readiness.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
        
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("discuss")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nDiscussing the trial's lessons and their application in the Enchanted Forest, you gain a deeper understanding but at the cost of mental clarity."
                + "\nThe intellectual discussion contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nDiscussing the trial's lessons and their application in the Enchanted Forest, you and the guardian engage in a meaningful exchange."
                + "\nThe shared insights boost your physical readiness.\n\nHP +1");
        if (player.HP < 3){
        player.HP += 1;}
        
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene15Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s15C.showScene();
    
    if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nReflecting on the synergy between magic and wisdom, you gain profound insights but at the expense of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nReflecting on the synergy between magic and wisdom, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nInquiring about the celestial guardian's perspective on magical augmentation, you receive insightful information, but the complexities of the topic affect your mental state."
                + "\nThe celestial insights contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nInquiring about the celestial guardian's perspective on magical augmentation, you gain valuable knowledge that boosts both mental and physical readiness."
                + "\nThe celestial insights enhance both HP and Sanity.\n\nHP +1, Sanity +1");
if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}    }
    player.score+=100;
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("prepare")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nPreparing for the next trial with newfound confidence, you mentally brace yourself but at the cost of physical exhaustion."
                + "\nThe intense mental preparation contributes to HP loss.\n\nHP -1");
        player.HP -= 1;
    } else {
        System.out.println("\nPreparing for the next trial with newfound confidence, you feel a surge of determination that enhances both mental and physical readiness."
                + "\nThe newfound confidence boosts both HP and Sanity.\n\nHP +1, Sanity +1");
       if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

clear();
System.out.println(player.getName());
player.displayStats();
String scene16Choice = scene16.showScene();

if (scene16Choice.equalsIgnoreCase("face")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s16A.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nExpressing gratitude and seeking guidance for the next trial, the celestial guardian provides valuable insights but at the cost of mental strain."
                + "\nThe celestial guidance contributes to mental exhaustion.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nExpressing gratitude and seeking guidance for the next trial, the celestial guardian imparts wisdom that enhances both mental and physical readiness."
                + "\nThe celestial guidance boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nSharing your experience with the celestial guardian, you find solace in the exchange but at the cost of mental clarity."
                + "\nThe shared connection contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nSharing your experience with the celestial guardian, the bond strengthens, enhancing both mental and physical readiness."
                + "\nThe shared connection boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nReflecting on the importance of courage in the Enchanted Forest, you gain profound insights but at the expense of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nReflecting on the importance of courage in the Enchanted Forest, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene16Choice.equalsIgnoreCase("request")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice =s16B.showScene();
    
    
if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nExpressing gratitude and preparing for the next trial, you find solace in the celestial guardian's wisdom but at the cost of mental strain."
                + "\nThe preparation contributes to mental exhaustion.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nExpressing gratitude and preparing for the next trial, the celestial guardian's insights enhance both mental and physical readiness."
                + "\nThe preparation boosts both HP and Sanity.\n\nHP +1, Sanity +1");
       if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nInquiring about the broader significance of courage in the forest, you gain profound insights but at the expense of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nInquiring about the broader significance of courage in the forest, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("discuss")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nDiscussing strategies for cultivating courage in challenging situations, you gain valuable insights but at the cost of mental clarity."
                + "\nThe strategic discussion contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nDiscussing strategies for cultivating courage in challenging situations, you find practical approaches that enhance both mental and physical readiness."
                + "\nThe strategic discussion boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene16Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice =s16C.showScene();
    
    
if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nReflecting on the synergy between magic and courage, you gain profound insights but at the cost of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nReflecting on the synergy between magic and courage, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nInquiring about the celestial guardian's perspective on magical courage, you gain valuable insights but at the cost of mental clarity."
                + "\nThe magical inquiry contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nInquiring about the celestial guardian's perspective on magical courage, you receive guidance that enhances both mental and physical readiness."
                + "\nThe magical insight boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("ready")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nReadying yourself for the next trial with newfound confidence, you feel mentally prepared but physically strained."
                + "\nThe mental focus contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nReadying yourself for the next trial with newfound confidence, both mental and physical readiness improve."
                + "\nThe preparation boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

// Code for Scene 17
clear();
System.out.println(player.getName());
player.displayStats();
String scene17Choice = scene17.showScene();

if (scene17Choice.equalsIgnoreCase("observe")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s17A.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nExpressing gratitude and inquiring about the final trial, you feel a deep connection but at the cost of mental clarity."
                + "\nThe profound emotions contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nExpressing gratitude and inquiring about the final trial, the celestial guardian acknowledges your connection and imparts guidance."
                + "\nThe harmonious interaction boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nSharing your experience with the celestial guardian, you feel a deep connection but at the cost of mental clarity."
                + "\nThe profound emotions contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nSharing your experience with the celestial guardian, the shared connection boosts both HP and Sanity."
                + "\nThe harmonious interaction enhances mental and physical readiness.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("think")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nContemplating the interconnectedness of magic and harmony, you gain profound insights but at the cost of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nContemplating the interconnectedness of magic and harmony, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene17Choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice  = s17B.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nExpressing gratitude and preparing for the final trial, you feel a deep connection but at the cost of mental clarity."
                + "\nThe profound emotions contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nExpressing gratitude and preparing for the final trial, the celestial guardian acknowledges your connection and imparts guidance."
                + "\nThe harmonious interaction boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nInquiring about the forest's reliance on magical harmony, you gain profound insights but at the cost of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nInquiring about the forest's reliance on magical harmony, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("discuss")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nDiscussing the broader implications of magical balance in the Enchanted Forest, you gain profound insights but at the cost of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nDiscussing the broader implications of magical balance in the Enchanted Forest, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene17Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s17C.showScene();
    
    if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nReflecting on the synergy between magic and harmony, you achieve a deeper understanding but at the cost of mental clarity."
                + "\nThe profound contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nReflecting on the synergy between magic and harmony, you attain a profound balance that enhances both mental and physical readiness."
                + "\nThe harmonious reflection boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nInquiring about the celestial guardian's perspective on magical harmony, you gain insights but at the cost of mental clarity."
                + "\nThe deep contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nInquiring about the celestial guardian's perspective on magical harmony, you find a harmonious balance that enhances both mental and physical readiness."
                + "\nThe profound understanding boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("focus")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nFocusing on the upcoming final trial with a sense of profound balance, you prepare mentally but at the cost of physical strain."
                + "\nThe intense focus contributes to physical fatigue.\n\nHP -1");
        player.HP -= 1;
    } else {
        System.out.println("\nFocusing on the upcoming final trial with a sense of profound balance, you enter the final trial with heightened mental and physical readiness."
                + "\nThe intense focus boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

// Code for Scene 18
clear();
System.out.println(player.getName());
player.displayStats();
String scene18Choice = scene18.showScene();

if (scene18Choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s18A.showScene();
    
    if (choice.equalsIgnoreCase("express")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nExpressing determination and stepping forward to face the challenge, you feel a surge of adrenaline but at the cost of mental stability."
                + "\nThe intense determination contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nExpressing determination and stepping forward to face the challenge, you enter the final challenge with heightened mental and physical readiness."
                + "\nThe intense determination boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("consult")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nConsulting the Guardian Guide for additional insights, you gain valuable information but at the cost of mental clarity."
                + "\nThe profound insights contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nConsulting the Guardian Guide for additional insights, you find guidance that enhances both mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nReflecting on the significance of the Nexus of Destiny in your journey, you achieve a deeper understanding but at the cost of mental clarity."
                + "\nThe profound contemplation contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nReflecting on the significance of the Nexus of Destiny in your journey, you attain a profound balance that enhances both mental and physical readiness."
                + "\nThe harmonious reflection boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene18Choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s18B.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nExpressing gratitude to the celestial guardian and preparing for the final challenge, you feel a deep connection but at the cost of mental stability."
                + "\nThe intense emotions contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nExpressing gratitude to the celestial guardian and preparing for the final challenge, you enter the last trial with heightened mental and physical readiness."
                + "\nThe deep connection boosts both HP and Sanity.\n\nHP +1, Sanity +1");
       if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nInquiring about the Nexus of Destiny's role in shaping the forest's destiny, you gain valuable insights but at the cost of mental clarity."
                + "\nThe profound insights contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nInquiring about the Nexus of Destiny's role in shaping the forest's destiny, you find guidance that enhances both mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score +=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("discuss")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nDiscussing the intricate details of the approaching trial with the Guardian Guide, you gain a deeper understanding but at the cost of mental clarity."
                + "\nThe profound discussion contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nDiscussing the intricate details of the approaching trial with the Guardian Guide, you attain a profound balance that enhances both mental and physical readiness."
                + "\nThe harmonious discussion boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene18Choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s18C.showScene();
    
    if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nSharing the insights with the celestial guardian for validation, you feel a deep connection but at the cost of mental stability."
                + "\nThe intense exchange contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nSharing the insights with the celestial guardian for validation, you enter the last trial with heightened mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
       if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("keep")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nKeeping the energetic pulsations to yourself and mentally preparing, you maintain mental clarity but at the cost of potential insights."
                + "\nThe focused preparation maintains your mental stability.\n\nSanity +1");
        if (player.sanity < 4){
        player.sanity += 1;}
    } else {
        System.out.println("\nKeeping the energetic pulsations to yourself and mentally preparing, you enter the last trial with a focused mind and enhanced mental resilience."
                + "\nThe solitary preparation boosts Sanity.\n\nSanity +1");
        
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("consult")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nConsulting the Guardian Guide for confirmation on your magical perceptions, you gain valuable insights but at the cost of mental clarity."
                + "\nThe shared insights contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nConsulting the Guardian Guide for confirmation on your magical perceptions, you find guidance that enhances both mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

// Code for Scene 19
clear();
System.out.println(player.getName());
player.displayStats();
String scene19Choice = scene19.showScene();

if (scene19Choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s19A.showScene();
    
    if (choice.equalsIgnoreCase("begin")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    if (!difficulty) {
        System.out.println("\nBeginning the confluence ritual with focused determination, you channel your magical energies into the Nexus."
                + "\nThe intense connection comes at a cost to your mental stability.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nBeginning the confluence ritual with focused determination, you establish a powerful connection with the heart of the Enchanted Forest."
                + "\nThe successful ritual enhances both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        
        if (player.sanity < 4){
        player.sanity += 1;
        }
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nSeeking guidance from the celestial guardian before initiating the ritual, you gain valuable insights but at the cost of mental clarity."
                + "\nThe shared insights contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } 
    else {
        System.out.println("\nSeeking guidance from the celestial guardian before initiating the ritual, you receive guidance that enhances both mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
player.score+=100;

  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("magic")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nUsing your magical abilities to sense the optimal approach to the ritual, you gain valuable insights but at the cost of mental clarity."
                + "\nThe focused magical perception contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nUsing your magical abilities to sense the optimal approach to the ritual, you establish a successful connection with the heart of the Enchanted Forest."
                + "\nThe magical approach enhances both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene19Choice.equalsIgnoreCase("focus")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s19B.showScene();
    
    
if (choice.equalsIgnoreCase("commence")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nCommencing the bonding process with the Nexus, you channel your magical energies into the intricate threads of energy within."
                + "\nThe profound connection comes at a cost to your mental stability.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nCommencing the bonding process with the Nexus, you establish a celestial bond that unlocks the forest's destiny."
                + "\nThe successful bonding enhances both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nSharing your insights with the celestial guardian for validation, you gain valuable confirmation but at the cost of mental clarity."
                + "\nThe shared insights contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nSharing your insights with the celestial guardian for validation, you receive confirmation that enhances both mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
    
    player.score+=100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nReflecting on the significance of forging a celestial bond with the Enchanted Forest, you gain valuable insights but at the cost of mental clarity."
                + "\nThe profound reflections contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nReflecting on the significance of forging a celestial bond with the Enchanted Forest, you achieve mental clarity and a deeper connection."
                + "\nThe reflections enhance both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
    player.score += 100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
    
}

if (scene19Choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s19C.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nExpressing gratitude, you commence the confluence ritual with determination and trust in the forest's magic."
                + "\nThe ritual unfolds successfully, but the intense focus takes a toll on your mental stability.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nExpressing gratitude, you commence the confluence ritual with determination and trust in the forest's magic."
                + "\nThe ritual unfolds successfully, enhancing both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
    player.score += 100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nSeeking additional guidance on the nuances of the ritual, you gain valuable insights but at the cost of mental clarity."
                + "\nThe shared insights contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nSeeking additional guidance on the nuances of the ritual, you receive valuable advice that enhances both mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
    player.score += 100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("contemplate")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nContemplating the journey so far and how it led to this pivotal moment, you gain valuable insights but at the cost of mental clarity."
                + "\nThe profound reflections contribute to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nContemplating the journey so far and how it led to this pivotal moment, you achieve mental clarity and a deeper connection."
                + "\nThe reflections enhance both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
        
    }
    player.score += 100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

// Code for Scene 20
clear();
System.out.println(player.getName());
player.displayStats();
String scene20Choice = scene20.showScene();

if (scene20Choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s20A.showScene();
    
if (choice.equalsIgnoreCase("delve")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (!difficulty) {
        System.out.println("\nDelving deeper into the chronicles of time, you gain profound insights into the interconnected stories shaping the Enchanted Forest."
                + "\nThe depth of understanding, however, takes a toll on your mental stability.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nDelving deeper into the chronicles of time, you acquire a profound understanding of the mystical tapestry that shapes the forest."
                + "\nThe enhanced knowledge boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    }
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("ask")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nAsking the celestial guardian for guidance on interpreting the visions, you receive valuable insights but at the cost of mental clarity."
                + "\nThe shared guidance contributes to mental strain.\n\nSanity -1");
        player.sanity -= 1;
    } else {
        System.out.println("\nAsking the celestial guardian for guidance on interpreting the visions, you gain valuable advice that enhances both mental and physical readiness."
                + "\nThe shared wisdom boosts both HP and Sanity.\n\nHP +1, Sanity +1");
        
        if (player.HP < 3){
        player.HP += 1;}
        if (player.sanity < 4){
        player.sanity += 1;}
    
    }
    player.score += 100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    if (difficulty) {
        System.out.println("\nReflecting on the role of time in the forest's mystical tapestry, you gain valuable insights but at the cost of mental clarity."
                 );
      
    } else {
        System.out.println("\nReflecting on the role of time in the forest's mystical tapestry, you achieve mental clarity and a deeper connection."
                );
       
    }
    player.score += 100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene20Choice.equalsIgnoreCase("embrace")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s20B.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nExpressing gratitude for the elemental symphony, you feel a renewed sense of connection to the magical forces."
            + "\nThe celestial guardian provides insights into the next steps of your journey.\n");

    player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nSharing your experience with the celestial guardian, the validation received enhances your attunement to elemental forces."
            + "\nThe shared connection deepens, benefiting both HP and Sanity.");

  
    player.score += 100;
    
      if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("contemplate")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nContemplating the significance of elemental balance in the Enchanted Forest, you gain profound insights into the interconnectedness of magic and nature."
            + "\nThe reflections contribute to enhanced mental clarity.");

   
     player.score += 100;
     
       if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

if (scene20Choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s20C.showScene();
    
    if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nExpressing gratitude for the Nexus's blessing, you feel the deep connection to the heart of the Enchanted Forest strengthening."
            + "\nThe celestial guardian acknowledges your appreciation, and the bond between you and the forest deepens.\n");

    
     player.score += 100;
     
       if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nSeeking the celestial guardian's guidance on utilizing the newfound connection, you receive insights into the potential of your deepened bond."
            + "\nThe guidance contributes to enhanced magical abilities.");

     player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
} else if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nReflecting on the responsibilities that come with the Nexus's blessing, you realize the importance of using your newfound connection responsibly."
            + "\nThe reflections contribute to enhanced mental clarity.");
    
     player.score += 100;
     
       if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    in.nextLine();
}
}

// Code for Scene 21
clear();
System.out.println(player.getName());
player.displayStats();
String scene21Choice = scene21.showScene();

if (scene21Choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s21A.showScene();
    
    
    
    if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nSeeking guidance on how to fulfill the forest's destiny, the celestial guardian imparts insights into the interconnected threads of fate."
            + "\nThe guidance strengthens your sense of purpose.\n");

     player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
} else if (choice.equalsIgnoreCase("reflect")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nReflecting on the impact of your choices on the Enchanted Forest, you recognize the significance of each decision."
            + "\nThe reflections contribute to enhanced wisdom.");

    
     player.score += 100;
     
       if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
} else if (choice.equalsIgnoreCase("express")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nExpressing a commitment to safeguarding the forest's mystical balance, you feel a surge of magical energy resonating within you."
            );

     player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
}
}

if (scene21Choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s21B.showScene();
    
    if (choice.equalsIgnoreCase("inquire")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nInquiring about the ongoing responsibilities tied to the cosmic threads, the celestial guardian shares insights into the ever-changing nature of destinies."
            + "\nUnderstanding the complexities, you prepare to embrace your role.\n");

     player.score += 100;
     
       if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
} else if (choice.equalsIgnoreCase("share")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nSharing your reflections with the celestial guardian and the Guardian Guide, you foster a deeper connection with the forest's guardians."
            + "\nThe shared wisdom contributes to a harmonious bond.");

     player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
} else if (choice.equalsIgnoreCase("contemplate")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nContemplating the interconnected nature of destinies within the Enchanted Forest, you gain a profound understanding of the forest's cosmic tapestry."
            + "\nThe contemplation enhances your mystical insight.");

     player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
}
}

if (scene21Choice.equalsIgnoreCase("express")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();
    String choice = s21C.showScene();
    
    
if (choice.equalsIgnoreCase("seek")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nSeeking additional guidance on maintaining balance in the forest, you engage in a heartfelt conversation with the celestial guardian."
            + "\nThe guardian imparts valuable insights on the symbiotic relationship between magical energies and natural harmony.");

     player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
} else if (choice.equalsIgnoreCase("gratitude")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nExpressing gratitude for the trust placed in you, you solidify the bond with the celestial guardian."
            + "\nThe acknowledgment enhances your connection with the forest's mystical energies.");

    player.score += 100;
  if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
        endingScene();
} else if (choice.equalsIgnoreCase("contemplate")) {
    clear();
    System.out.println(player.getName());
    player.displayStats();

    System.out.println("\nContemplating the ongoing journey and the lessons learned, you internalize the wisdom shared by the celestial guardian."
            + "\nThe contemplation deepens your understanding of the Enchanted Forest's intricate balance.");
     player.score += 100;
    
    if (Player.HP <= 0 || Player.sanity <= 0) {
    deathScene();
    mainMenu();
}
    System.out.println("\n Enter any key to continue...");
    endingScene();
}


}

   

     return Player.score;
    
        
    }
}
