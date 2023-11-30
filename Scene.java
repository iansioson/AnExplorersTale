
import java.util.Scanner;


interface Scene {
    String showScene();
}


abstract class BaseScene implements Scene {
    
    protected String textPrompt;
    protected String option1;
    protected String option2;
    protected String option3;
    private String action;

    public abstract String showScene (); 
    
    protected String getUserChoice () {
        String choice;
        Scanner in = new Scanner (System.in);
        
         String pOption1= option1.substring(0, option1.indexOf(' '));
         String pOption2= option2.substring(0, option2.indexOf(' '));
         String pOption3= option3.substring(0, option3.indexOf(' '));
        
        do {System.out.print("\nType in choice: ");
       
        choice = in.nextLine().trim(); 
      
        if (!(choice.equalsIgnoreCase(option1) || choice.equalsIgnoreCase(pOption1)
            || choice.equalsIgnoreCase(option2) || choice.equalsIgnoreCase(pOption2)
            || choice.equalsIgnoreCase(option3) || choice.equalsIgnoreCase(pOption3))){
            
            System.out.println("Please enter a valid choice, adventurer.\n");
        }
        
        
        } while (!(choice.equalsIgnoreCase(option1) || choice.equalsIgnoreCase(pOption1)
            || choice.equalsIgnoreCase(option2) || choice.equalsIgnoreCase(pOption2)
            || choice.equalsIgnoreCase(option3) || choice.equalsIgnoreCase(pOption3)));

        
        return choice;
    }
    
 
    
}

class Prologue extends BaseScene {
    
     public Prologue (){
         textPrompt = "PROLOGUE \n"
                 + "In the kingdom of Eldoria, you step into the"
                 + "unknown from the heart of Valoria.\nBorn of dreams and courage, you seek untold"
                 + "reasures and mythical wonders beyond familiar borders. \nAs the adventure begins, the destiny of"
                 + "Eldoria awaits, and a tale of grand proportions \nis set to unfold across uncharted landscapes.\n"; 
        
}
    public String showScene (){
       System.out.println(textPrompt);
       Scanner in = new Scanner (System.in);
       System.out.print("\nEnter any key to continue...");
       return in.nextLine();
        
    }
    
    
    }

class Scene1 extends BaseScene {
    
    public Scene1 (){
         textPrompt = "\n\nSCENE 1: THE MYSTERIOUS FOREST CLEARING:" 
                 + "\n\nYou find yourself standing in a dense forest clearing."
                 + "\nThe air is thick with an otherworldly energy, and the rustling leaves seem to whisper secrets.  "
                 + "\nSuddenly, a mysterious figure appears before you. "
                 + "\n\nFigure: \"Greetings, brave adventurer! You have entered the Enchanted Forest. To proceed, you must make a choice.\"\n";
        
}
    
    public String showScene(){
        String choice;
        System.out.println(textPrompt);
        option1 = "ASK (about the forest)";
        option2 = "FIGHT (draw weapon and demand answers)";
        option3 = "IDENTITY (ask about the identity)";
        
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
       
        choice = getUserChoice();
        
        return choice;
        
    }
    
    
   
}


class Scene1A extends BaseScene {

    public Scene1A (){
    textPrompt = "\n\nThe Figure's Revelation\n\n" 
            + "The figure, revealing itself to be a mystical guide, responds to your choice.\n" 
            + "\"The Enchanted Forest is a realm of trials. To pass, seek the Guardian Stones scattered within. They hold the key to unlocking the path forward.\"\n"; }

    public String showScene (){
       
       System.out.println(textPrompt);
       option1 = "ASK (for guidance on finding the Guardian Stones)";
       option2 = "EXPLORE (explore the forest blindly)";
       option3 = "GRATITUDE (express gratitude and set off immediately)";
       
       
       System.out.println(option1);
       System.out.println(option2);
       System.out.println(option3);
      
       return getUserChoice();
    }
    
}

    
class Scene1B extends BaseScene {

    public Scene1B (){
    textPrompt = "\n\nThe Reckless Expedition\n\n" 
            + "Ignoring the guide's advice, you decide to venture into the forest without seeking the Guardian Stones. "
            + "\nThe trees close in around you, and the path becomes increasingly unclear. As you continue deeper into "
            + "\nthe woods, you hear strange whispers and eerie sounds. Suddenly, you stumble upon a clearing filled "
            + "\nwith luminescent mushrooms and a mysterious creature blocking your path.\n"; }

    public String showScene (){
       
       System.out.println(textPrompt);
       option1 = "COMMUNICATE (with the creature)";
       option2 = "ATTACK (the creature)";
       option3 = "RETREAT (back to the original clearing and reconsider your approach)";
       
       
       System.out.println(option1);
       System.out.println(option2);
       System.out.println(option3);
      
       return getUserChoice();
    }
    
}


class Scene1C extends BaseScene {

    public Scene1C (){
    textPrompt = "\n\nThe Swift Journey\n\n" 
            + "Expressing gratitude to the Guardian Guide, you decide to set off immediately in search of the Guardian Stones.\n\n" +
              "The forest unfolds before you, and the sunlight filters through the leaves. A gentle breeze guides you in the "
            + "\nright direction, and you soon come across a fork in the path.\n"; }

    public String showScene (){
       
       System.out.println(textPrompt);
       option1 = "LEFT (take the left path)";
       option2 = "RIGHT (take the right path)";
       option3 = "CLIMB (a tree to get a better view of both paths before deciding)";
       
       
       System.out.println(option1);
       System.out.println(option2);
       System.out.println(option3);
      
       return getUserChoice();
    }
    
}

class Scene2 extends BaseScene {

    public Scene2() {
        textPrompt = "\n\nSCENE 2: THE WHISPERING GROVE\n"
                + "\nAs you follow the path indicated by the Guardian Guide, you enter a serene grove filled with ancient trees.\n "
                + "Their leaves seem to murmur in an enchanting melody. In the center of the grove, you notice a peculiar stone\n"
                + " pedestal with a small, ornate box resting upon it.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "EXAMINE (the box carefully)";
        option2 = "LISTEN (to the whispers of the trees)";
        option3 = "CONTINUE (on your journey without interacting with the grove)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene2A extends BaseScene {

    public Scene2A() {
        textPrompt = "\n\nThe Ornate Boxn"
                + "\nUpon closer inspection, you find that the box is adorned with intricate carvings and seems to radiate a faint glow. "
                + "The whispers of the trees intensify as you approach.\n";

    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "OPEN (the box cautiously)";
        option2 = "LEAVE (the box undisturbed and move on)";
        option3 = "MAGIC (use magic to sense the contents of the box)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene2B extends BaseScene {

    public Scene2B() {
        textPrompt = "\n\nThe Harmonious Revelation\n"
                + "\nAs you focus on the whispers of the trees, you begin to understand their language. They share "
                + "\nancient tales of the Enchanted Forest and reveal a hidden shortcut leading to the next Guardian Stone.\n";
               
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "FOLLOW (the shortcut as guided by the trees)";
        option2 = "GRATITUDE (to the trees for their guidance and continue on the main path)";
        option3 = "COMMUNICATE (further with the trees for additional insights)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene2C extends BaseScene {

    public Scene2C() {
        textPrompt = "\n\nThe Unseen Observer\n"
                + "\nDeciding to ignore the grove, you press on with your journey. Unbeknownst to you,\n"
                + "an unseen observer watches from the shadows, intrigued by your choices.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ACKNOWLEDGE (the observer and attempt to communicate)";
        option2 = "VIGILANT (Stay vigilant and continue without acknowledging the presence)";
        option3 = "RETREAT (from the grove, suspecting danger)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene3 extends BaseScene {

    public Scene3() {
        textPrompt = "\n\nSCENE 3: THE GUARDIAN STONE SANCTUARY\n"
                + "\nFollowing the guidance of the trees, you find yourself in a tranquil sanctuary where a\n"
                + " massive Guardian Stone stands, surrounded by an ethereal glow. The stone seems to hum with power.\n";
                
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "APPROACH (the Guardian Stone cautiously)";
        option2 = "PERFORM (a magical ritual to unlock its secrets)";
        option3 = "SEARCH (the area for clues before interacting with the stone)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene3A extends BaseScene {

    public Scene3A() {
        textPrompt = "\n\nThe Stone's Message\n"
                + "\nAs you approach, the Guardian Stone emits a soft glow and speaks in a mysterious language. "
                + "\nThe Guardian Guide appears beside you, translating its message.\n";
               
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ASK (the Guardian Guide for more information)";
        option2 = "DECIPHER (attempt to decipher the message yourself)";
        option3 = "TOUCH (the stone to absorb its energy)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene3B extends BaseScene {

    public Scene3B() {
        textPrompt = "\n\nThe Unleashed Power\n"
                + "\nChoosing to perform a magical ritual, you channel your energy into the Guardian Stone. The "
                + "\nair crackles with magic as the stone reacts, granting you a new mystical ability.\n";
                
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "TEST (your new ability immediately)";
        option2 = "GRATITUDE (express gratitude to the Guardian Stone)";
        option3 = "ASK (the Guardian Guide about the consequences of using this newfound power)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene3C extends BaseScene {

    public Scene3C() {
        textPrompt = "\n\nThe Investigative Scene\n"
                + "\nCarefully examining the area, you discover ancient inscriptions and symbols around the \n"
                + "Guardian Stone. Deciphering them might unveil additional information.\n";
                
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "DECIPHER (dedicate time to decipher the inscriptions)";
        option2 = "CONSULT (the Guardian Guide for insights)";
        option3 = "EXPLORE (the surroundings before focusing on the stone's symbols)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene4 extends BaseScene {

    public Scene4() {
        textPrompt = "\n\nSCENE 4: THE ETHEREAL RIVER CROSSING\n"
                + "\nAs you continue your journey, the path leads you to the edge of a shimmering river with waters that seem to flow with magical energy. On the other side, you spot a distant glow suggesting another Guardian Stone.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "CROSS (attempt to cross the river using a magical spell)";
        option2 = "SEARCH (for a bridge or a safe crossing point)";
        option3 = "FOLLOW (follow the riverbank in search of an alternative route)";
        
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        
        
        return getUserChoice();
    }

}

class Scene4A extends BaseScene {

    public Scene4A() {
        textPrompt = "\n\nThe Aerial Traverse\n"
                + "\nChanneling your magical abilities, you create a floating platform to carry you across the ethereal river. "
                + "\nHowever, halfway through, the platform starts to waver, and mysterious aquatic creatures emerge from the depths.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "STRENGTHEN (the magical platform to continue across)";
        option2 = "DIVE (into the river and confront the creatures directly)";
        option3 = "RETREAT (to the riverbank and rethink your approach)";
        
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene4B extends BaseScene {

    public Scene4B() {
        textPrompt = "\n\nThe Hidden Crossing\n"
                + "\nAfter careful exploration, you discover a concealed bridge made of intertwining vines and glowing flowers. "
                + "\nAs you step onto the bridge, it reacts to your presence, creating a secure path across the magical river.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude to the magical bridge)";
        option2 = "INVESTIGATE (the flora on the bridge for potential clues)";
        option3 = "CONTINUE (forward without acknowledging the bridge's magic)";
        
                System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}

class Scene4C extends BaseScene {

    public Scene4C() {
        textPrompt = "\n\nThe Mysterious Encounter\n"
                + "\nFollowing the riverbank, you encounter a mystical being seemingly connected to the river's magic. "
                + "\nIt hovers above the water, observing your every move.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "COMMUNICATE (with the mystical being)";
        option2 = "PERFORM (a respectful gesture to show peaceful intentions)";
        option3 = "IGNORE (the being and focus on reaching the other side)";
        
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }

}


class Scene5 extends BaseScene {

    public Scene5() {
        textPrompt = "\n\nSCENE 5: THE LUMINESCENT MEADOW\n"
                + "\nAfter crossing the river, the path leads you to a breathtaking meadow filled with radiant flowers\n"
                + "that glow in various hues. In the center, you notice a peculiar altar with an inscription.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "APPROACH (the altar and read the inscription)";
        option2 = "EXAMINE (the glowing flowers for potential magical properties)";
        option3 = "CIRCLE (the meadow cautiously, keeping an eye out for any hidden dangers)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene5A extends BaseScene {

    public Scene5A() {
        textPrompt = "\n\nThe Altar's Prophecy\n"
                + "\nAs you read the inscription, the altar reveals a prophecy about the Enchanted Forest and the challenges\n"
                + "that lie ahead.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SHARE (the prophecy with the Guardian Guide for guidance)";
        option2 = "KEEP (the information to yourself and continue independently)";
        option3 = "SEEK (more clues around the meadow to corroborate the prophecy)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene5B extends BaseScene {

    public Scene5B() {
        textPrompt = "\n\nThe Floral Alchemy\n"
                + "\nExamining the flowers closely, you discover they possess unique magical properties.\n"
                + "Experimenting with their essence, you unlock a temporary enhancement to your abilities.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "TEST (the enhanced abilities immediately)";
        option2 = "GRATITUDE (thank the meadow for its gifts and move forward)";
        option3 = "INVESTIGATE (the flowers further to understand their magical nature)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene5C extends BaseScene {

    public Scene5C() {
        textPrompt = "\n\nThe Hidden Dangers\n"
                + "\nWhile circling the meadow, you uncover concealed traps that could pose a threat\n"
                + "to unsuspecting travelers.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "DISARM (the traps to ensure safe passage)";
        option2 = "WARN (the Guardian Guide and strategize together)";
        option3 = "CHOOSE (a different path to avoid the potential dangers)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene6 extends BaseScene {

    public Scene6() {
        textPrompt = "\n\nSCENE 6: THE WHISPERS OF THE WIND\n"
                + "\nAs you progress deeper into the Enchanted Forest, the atmosphere changes, and you feel\n"
                + "the presence of a gentle breeze that carries faint whispers. The path splits into three,\n"
                + "each shrouded in a different colored mist.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "BLUE (choose the path covered in a blue mist)";
        option2 = "GREEN (choose the path covered in a green mist)";
        option3 = "PURPLE (choose the path covered in a purple mist)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
       

        return getUserChoice();
    }
}

class Scene6A extends BaseScene {

    public Scene6A() {
        textPrompt = "\n\nThe Tranquil Oasis\n"
                + "\nThe blue mist clears, revealing a peaceful oasis with a crystal-clear pond. In the center,\n"
                + "there's a floating platform with a shimmering treasure chest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "APPROACH (the treasure chest cautiously)";
        option2 = "DIVE (into the pond to explore its depths)";
        option3 = "REST (by the oasis and meditate for a moment of reflection)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene6B extends BaseScene {

    public Scene6B() {
        textPrompt = "\n\nThe Emerald Path\n"
                + "\nChoosing the green misty path, the trees around you are vibrant with life, and the air is\n"
                + "filled with the scent of blooming flowers. A mischievous sprite appears, offering to guide you\n"
                + "through a series of natural obstacles.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ACCEPT (the sprite's guidance through the obstacles)";
        option2 = "DECLINE (politely decline and navigate the challenges independently)";
        option3 = "ASK (the sprite about the origin of the obstacles)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene6C extends BaseScene {

    public Scene6C() {
        textPrompt = "\n\nThe Hidden Bro\n"
                + "\nOpting for the purple misty path, you find yourself in a mysterious grove where the trees\n"
                + "are intertwined with glowing vines. The air is charged with a mystical energy, and a sense of\n"
                + "anticipation fills the air.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INVESTIGATE (the glowing vines for potential magical properties)";
        option2 = "FOLLOW (the path deeper into the grove)";
        option3 = "MAGIC (use a magical ability to commune with the energy of the grove)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene7 extends BaseScene {

    public Scene7() {
        textPrompt = "\n\nSCENE 7: THE CELESTIAL BRIDGE\n"
                + "\nAfter successfully navigating the misty paths, the forest opens up to reveal a celestial bridge\n"
                + "suspended in the air, leading to a colossal tree that seems to touch the sky. At the center of the\n"
                + "bridge, a guardian spirit appears, testing those who seek passage.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ENGAGE (in a conversation with the guardian spirit)";
        option2 = "DEMONSTRATE (your worthiness through a display of skill)";
        option3 = "MAGIC (use a magical ability to prove your connection to the mystical energies)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene7A extends BaseScene {

    public Scene7A() {
        textPrompt = "\n\nThe Guardian's Riddle\n"
                + "\nThe guardian spirit presents you with a riddle that requires a clever and thoughtful answer.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ATTEMPT (to solve the riddle on your own)";
        option2 = "SEEK (guidance from the Guardian Guide)";
        option3 = "MAGIC (use a magical ability to gain insights into the riddle)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene7B extends BaseScene {

    public Scene7B() {
        textPrompt = "\n\nThe Trial Prowess\n"
                + "\nChoosing to display your skill, the guardian spirit challenges you to a series of acrobatic feats\n"
                + "and precision movements on the celestial bridge.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ACCEPT (the challenge and showcase your agility)";
        option2 = "REQUEST (politely request an alternative trial)";
        option3 = "MAGIC (use a magical ability to enhance your physical prowess)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene7C extends BaseScene {

    public Scene7C() {
        textPrompt = "\n\nThe Essence Collections\n"
                + "\nOpting to prove your connection to mystical energies, you channel the magical essence of the forest\n"
                + "to create a dazzling display of lights and colors.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "WAIT (for the guardian spirit's response)";
        option2 = "ASK (the Guardian Guide if your display was sufficient)";
        option3 = "GRATITUDE (express gratitude and request permission to continue your journey)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene8 extends BaseScene {

    public Scene8() {
        textPrompt = "\n\nSCENE 8: THE TREE OF LUMINESCENCE\n"
                + "\nThe guardian spirit, pleased with your chosen method of proving your worthiness, nods in approval.\n"
                + "The celestial bridge extends, guiding you to the colossal tree at the heart of the Enchanted Forest.\n"
                + "As you approach, the tree's branches shimmer with radiant light, and the guardian spirit speaks.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude and inquire about the purpose of the colossal tree)";
        option2 = "ASK the guardian spirit for guidance on the next phase of your journey)";
        option3 = "ABSORB (take a moment to absorb the magical energy emanating from the colossal tree)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene8A extends BaseScene {

    public Scene8A() {
        textPrompt = "\n\nThe Guardian's Revelation\n"
                + "\nThe guardian spirit reveals that the colossal tree, known as the Tree of Luminescence, is a\n"
                + "source of ancient wisdom and a guide to those who prove themselves worthy. It holds the key to unlocking\n"
                + "the final challenge within the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ASK (about the nature of the final challenge)";
        option2 = "REQUEST (guidance on how to communicate with the Tree of Luminescence)";
        option3 = "EXPRESS (your readiness to face the final challenge)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene8B extends BaseScene {

    public Scene8B() {
        textPrompt = "\n\nThe Whispering Leaves\n"
                + "\nAs you inquire about the next phase of your journey, the guardian spirit mentions that the leaves\n"
                + "of the colossal tree whisper secrets of the forest. They may hold clues to the final challenge and the path forward.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "LISTEN (closely to the whispers of the leaves)";
        option2 = "MAGIC (use your magical abilities to enhance your perception of the whispers)";
        option3 = "ASK (politely ask the guardian spirit for more information)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene8C extends BaseScene {

    public Scene8C() {
        textPrompt = "\n\nThe Illuminated Vision\n"
                + "\nTaking a moment to absorb the magical energy, you find yourself connected to a vision—a glimpse of the final challenge.\n"
                + "Shadows dance in your mind, revealing a mysterious path through a cavernous realm.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SHARE (the vision with the guardian spirit for validation)";
        option2 = "SECRET (keep the vision to yourself and trust your instincts)";
        option3 = "GUIDANCE (seek guidance from the Guardian Guide on interpreting the vision)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene9 extends BaseScene {

    public Scene9() {
        textPrompt = "\n\nSCENE 9: THE CAVERN OF SHADOWS\n"
                + "\nFollowing the guidance received, you traverse deeper into the Enchanted Forest, eventually arriving\n"
                + "at the entrance of a dark cavern. Eerie shadows play on the walls, and a mysterious hum echoes from within.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ENTER (the cavern without hesitation)";
        option2 = "MAGIC (use magical light to illuminate the cavern's interior before entering)";
        option3 = "CONSULT (the Guardian Guide for insights on the cavern's nature)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene9A extends BaseScene {

    public Scene9A() {
        textPrompt = "\n\nThe Labyrinthine Depths\n"
                + "\nEntering the cavern, you find yourself in a labyrinth of twisting passages. Strange symbols line the walls,\n"
                + "and distant echoes suggest unseen inhabitants.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "FOLLOW (the symbols as a guide through the labyrinth)";
        option2 = "MAGIC (use magical abilities to sense any hidden dangers or creatures)";
        option3 = "SHOUT (aloud to gauge if there are inhabitants within the labyrinth)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene9B extends BaseScene {

    public Scene9B() {
        textPrompt = "\n\nThe Guiding Light\n"
                + "\nChoosing to illuminate the cavern, your magical light reveals intricate carvings on the walls,\n"
                + "depicting the history of the Enchanted Forest. The carvings may hold clues to navigate the labyrinth.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "STUDY (the carvings for information on the labyrinth's layout)";
        option2 = "CONTINUE (forward with the magical light, exploring as you go)";
        option3 = "SHARE (the insights gained from the carvings with the Guardian Guide)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene9C extends BaseScene {

    public Scene9C() {
        textPrompt = "\n\nThe Guardian Guide's Wisdom\n"
                + "\nTurning to the Guardian Guide for insights, you learn that the cavern is a test of resolve and intuition.\n"
                + "The Guardian Guide offers guidance on navigating the labyrinth safely.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "FOLLOW (the Guardian Guide's advice through the labyrinth)";
        option2 = "GRATITUDE (thank the Guardian Guide and proceed independently)";
        option3 = "REQUEST (additional information about potential challenges in the cavern)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene10 extends BaseScene {

    public Scene10() {
        textPrompt = "\n\nSCENE 10: THE LABYRINTH'S SECRETS\n"
                + "\nWith the Guardian Guide's advice, you navigate the labyrinthine depths, following the symbols\n"
                + "and avoiding potential dangers. Eventually, you reach a central chamber with three tunnels leading further into the cavern.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "LEFT (choose the left tunnel)";
        option2 = "RIGHT (choose the right tunnel)";
        option3 = "CENTER (choose the center tunnel)";
        

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
     

        return getUserChoice();
    }
}

class Scene10A extends BaseScene {

    public Scene10A() {
        textPrompt = "\n\nThe Echoing Chorus/n"
                + "\nOpting for the left tunnel, you find yourself in a chamber filled with echoes. Strange beings\n"
                + "made of pure sound emerge, creating a symphony that resonates through the cavern.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "JOIN (the ethereal dance and harmonize with the beings)";
        option2 = "MAGIC (use your magical abilities to communicate with the sound entities)";
        option3 = "NAVIGATE (quietly navigate the chamber without disturbing the echoing chorus)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene10B extends BaseScene {

    public Scene10B() {
        textPrompt = "\n\nThe Illuminated Nexus\n"
                + "\nChoosing the right tunnel, you enter a cavern bathed in a soft, mystical glow.\n"
                + "In the center lies an illuminated nexus, radiating ancient energies.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "APPROACH (the illuminated nexus cautiously)";
        option2 = "MAGIC (use your magical abilities to examine the nexus from a distance)";
        option3 = "CONSULT (the Guardian Guide for insights on the nexus)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene10C extends BaseScene {

    public Scene10C() {
        textPrompt = "\n\nThe Crystal Guardian\n"
                + "\nVenturing through the center tunnel, you encounter a crystalline guardian blocking your path.\n"
                + "Its facets shimmer with magical energy, and its eyes glow with an otherworldly light.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "COMMUNICATE (attempt to communicate with the crystal guardian)";
        option2 = "MAGIC (use a magical ability to decipher the guardian's intentions)";
        option3 = "AVOID (circumvent the guardian by finding an alternative route)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene11 extends BaseScene {

    public Scene11() {
        textPrompt = "\n\nSCENE 11: THE VEILED ENIGMA\n"
                + "\nHaving successfully navigated the labyrinth, you emerge into a cavern adorned with shimmering crystals\n"
                + "that cast dancing reflections. At the center, a mysterious veiled figure awaits.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INQUIRE (about the purpose of the cavern and the veiled figure)";
        option2 = "FIGHT (draw your weapon and remain on guard)";
        option3 = "MAGIC (use a magical ability to unveil the secrets hidden by the figure's veil)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene11A extends BaseScene {

    public Scene11A() {
        textPrompt = "\n\nThe Guardian's Revelation\n"
                + "\nThe veiled figure reveals itself as the Guardian of Reflections, a keeper of memories and visions.\n"
                + "It imparts knowledge of the Enchanted Forest's history, unlocking the secrets of the final challenge.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "ASK (for guidance on facing the final challenge)";
        option2 = "GRATITUDE (express gratitude for the revelations and continue independently)";
        option3 = "REQUEST (request more information about the Guardian's role in the forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene11B extends BaseScene {

    public Scene11B() {
        textPrompt = "\n\nThe Defensive Stance\n"
                + "\nRemaining on guard, you sense a sudden shift in the energy. Shadows converge, forming spectral assailants\n"
                + "that surround you.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "FIGHT (engage in combat with the spectral assailants)";
        option2 = "PROTECT (use a protective magical barrier to shield yourself)";
        option3 = "NEGOTIATE (attempt to negotiate with the specters and learn their purpose)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene11C extends BaseScene {

    public Scene11C() {
        textPrompt = "\n\nThe Unveiling Gaze\n"
                + "\nUtilizing your magical abilities, you gently unveil the figure's face, revealing eyes that hold ancient wisdom.\n"
                + "The Guardian of Reflections speaks, offering insights into the final challenge.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (thank the Guardian for its guidance)";
        option2 = "CLARIFY (seek clarification on specific details about the final challenge)";
        option3 = "ASK (express curiosity about the veiled practices within the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene12 extends BaseScene {

    public Scene12() {
        textPrompt = "\n\nSCENE 12: THE WHISPERING SHADOWS\n"
                + "\nAs you proceed deeper into the cavern, shadows seem to detach from the walls, coalescing into ethereal forms.\n"
                + "They murmur cryptic messages that echo the labyrinth's history.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "LISTEN (attentively to the shadowy whispers)";
        option2 = "MAGIC (use magical abilities to decipher the messages)";
        option3 = "IGNORE (ignore the whispers and press forward)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene12A extends BaseScene {

    public Scene12A() {
        textPrompt = "\n\nThe Echoes of Betrayal\n"
                + "\nAttentively listening to the shadowy whispers, you discern tales of ancient betrayals and unfulfilled promises within the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INVESTIGATE (the source of the whispers to learn more)";
        option2 = "SHARE (the information with the Guardian Guide for insights)";
        option3 = "CONTINUE (cautiously, mindful of potential treacheries)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene12B extends BaseScene {

    public Scene12B() {
        textPrompt = "\n\nThe Veiled Prophecy\n"
                + "\nDeciphering the cryptic messages, you uncover a veiled prophecy that hints at the challenges awaiting you in the final stage of the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SHARE (the prophecy with the Guardian Guide for validation)";
        option2 = "SECRET (the prophecy to yourself and mentally prepare for the trials)";
        option3 = "SEEK (more clues within the cavern to unveil the prophecy's meaning)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene12C extends BaseScene {

    public Scene12C() {
        textPrompt = "\n\nThe Shadowy Deception\n"
                + "\nIgnoring the whispers, you forge ahead. However, the shadows intensify, creating illusions that distort your perception of reality.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "MAGIC use magical abilities to dispel the illusions.";
        option2 = "TRUST your instincts and navigate through the illusions.";
        option3 = "RETREAT and reassess your approach to avoid potential traps.";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene13 extends BaseScene {

    public Scene13() {
        textPrompt = "\n\nSCENE 13: THE ENIGMATIC PORTAL\n"
                + "\nAfter traversing the cavern's challenges, you reach a chamber with a mystic portal pulsating with energy.\n"
                + "The Guardian Guide appears beside you, ready to provide assistance.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INQUIRE (about the portal's purpose and destination)";
        option2 = "SEEK (the Guardian Guide's advice on whether to enter the portal)";
        option3 = "MAGIC (use magical abilities to sense the energies emanating from the portal)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene13A extends BaseScene {

    public Scene13A() {
        textPrompt = "\n\nThe Portal's Revalation\n"
                + "\nThe Guardian Guide reveals that the portal leads to the Celestial Nexus, a realm where the boundaries between magic and reality blur.\n"
                + "It is a crucial step towards completing the final challenge.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "EXPRESS (determination and step into the portal)";
        option2 = "CONSULT (the Guardian Guide for further insights before proceeding)";
        option3 = "CONSIDER (alternative paths before committing to the portal)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene13B extends BaseScene {

    public Scene13B() {
        textPrompt = "\n\nThe Guardian's Caution\n"
                + "\nCautioning you about the challenges within the Celestial Nexus, the Guardian Guide advises preparation and a keen understanding of magical energies.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (thank the Guardian Guide for the warning and prepare accordingly)";
        option2 = "CONFIDENCE (express confidence in your abilities and step into the portal)";
        option3 = "THINK (deliberate further on potential risks before making a decision)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene13C extends BaseScene {

    public Scene13C() {
        textPrompt = "\n\nThe Magical Insight\n"
                + "\nUsing your magical abilities to sense the portal's energies, you gain insights into the challenges that lie beyond.\n"
                + "A kaleidoscope of visions provides glimpses into potential trials.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SHARE (the visions with the Guardian Guide for validation)";
        option2 = "SECRET (keep the visions to yourself and mentally prepare for the unknown)";
        option3 = "SEEK (additional information within the cavern before entering the portal)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene14 extends BaseScene {

    public Scene14() {
        textPrompt = "\n\nSCENE 14: THE CELESTIAL NEXUS\n"
                + "\nStepping through the portal, you find yourself in the Celestial Nexus—a realm of shifting energies and floating islands.\n"
                + "A celestial guardian awaits, ready to test those who seek passage.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "APPROACH (the celestial guardian with respect and inquire about the final challenge)";
        option2 = "MAGIC (use magical abilities to understand the nature of the challenges)";
        option3 = "DEMONSTRATE (your determination to face the trials)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene14A extends BaseScene {

    public Scene14A() {
        textPrompt = "\n\nThe Celestial Inquiries\n"
                + "\nEngaging in conversation with the celestial guardian, you learn about the trials that await—tests of wisdom, courage, and harmony with the magical energies of the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "REQUEST (guidance on the order in which to face the trials)";
        option2 = "READY (express readiness to face the trials in any order)";
        option3 = "SEEK (additional insights into the specifics of each tria)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene14B extends BaseScene {

    public Scene14B() {
        textPrompt = "\n\nThe Astral Insights\n"
                + "\nUtilizing your magical abilities, you attune yourself to the astral energies of the Celestial Nexus.\n"
                + "Visions of the trials and potential outcomes flood your mind.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SHARE (the insights with the celestial guardian for validation)";
        option2 = "SECRET (keep the visions to yourself and mentally prepare for the trials)";
        option3 = "SEEK (seek confirmation from the Guardian Guide on the reliability of the visions)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene14C extends BaseScene {

    public Scene14C() {
        textPrompt = "\n\nThe Determined Resolve\n"
                + "\nExpressing your determination, you announce your readiness to face the trials, regardless of the challenges that may arise.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "WAIT (for the celestial guardian's instructions for the first trial)";
        option2 = "MAGIC (use magical abilities to demonstrate your readiness for any trial)";
        option3 = "INQUUE (about the overarching purpose of the trials within the Celestial Nexus)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene15 extends BaseScene {

    public Scene15() {
        textPrompt = "\n\nSCENE 15: THE TRIAL OF WISDOM\n"
                + "\nThe celestial guardian leads you to the first trial—a chamber filled with ancient tomes and mystical puzzles. Wisdom is the key to overcoming this challenge.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "DELVE (into the tomes and solve the puzzles independently)";
        option2 = "SEEK (seek guidance from the celestial guardian on the trial's intricacies)";
        option3 = "MAGIC (utilize your magical abilities to enhance your cognitive skills)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene15A extends BaseScene {

    public Scene15A() {
        textPrompt = "\n\nThe Arcane Knowledge\n"
                + "\nBy immersing yourself in the ancient tomes and solving the puzzles, you unlock profound arcane knowledge. The celestial guardian acknowledges your wisdom.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude and inquire about the next trial)";
        option2 = "SHARE (the acquired knowledge with the celestial guardian)";
        option3 = "REFLECT (on the significance of wisdom in your journey)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene15B extends BaseScene {

    public Scene15B() {
        textPrompt = "\n\nSCENE 15B: THE CELESTIAL GUIDANCE\n"
                + "\nChoosing to seek guidance, the celestial guardian imparts insights into the trial's complexities, emphasizing the importance of intuition and a deep understanding of magical lore.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (thank the celestial guardian and proceed confidently)";
        option2 = "ASK (for additional tips before embarking on the next trial)";
        option3 = "DISCUSS (the trial's lessons and their application in the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene15C extends BaseScene {

    public Scene15C() {
        textPrompt = "\n\nThe Magical Augmentation\n"
                + "\nUtilizing your magical abilities to enhance cognitive skills, you navigate the trial with a heightened sense of perception and intuition.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "REFLECT (on the synergy between magic and wisdom)";
        option2 = "INQUIRE (about the celestial guardian's perspective on magical augmentation)";
        option3 = "PREPARE (for the next trial with newfound confidence)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene16 extends BaseScene {

    public Scene16() {
        textPrompt = "\n\nSCENE 16: THE TRIAL OF COURAGE\n"
                + "\nThe celestial guardian guides you to the second trial—a vast arena where illusions manifest fears and doubts. Courage is essential to navigate this ethereal battlefield.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "FACE (the illusions head-on and conquer your fears)";
        option2 = "REQUEST (the celestial guardian's insights on overcoming illusions)";
        option3 = "MAGIC (use your magical abilities to dispel the illusions)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene16A extends BaseScene {

    public Scene16A() {
        textPrompt = "\n\nThe Fearless Confrontation\n"
                + "\nConfronting the illusions with unwavering courage, you dismantle the illusions one by one. The celestial guardian commends your fearless approach.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude and seek guidance for the next trial)";
        option2 = "SHARE (your experience with the celestial guardian)";
        option3 = "REFLECT (on the importance of courage in the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene16B extends BaseScene {

    public Scene16B() {
        textPrompt = "\n\nThe Celestial Counsel\n"
                + "\nSeeking the celestial guardian's insights, you learn that courage lies not in the absence of fear but in facing it with resilience and determination.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (thank the celestial guardian and prepare for the next trial)";
        option2 = "INQUIRE (about the broader significance of courage in the forest)";
        option3 = "DISCUSS (strategies for cultivating courage in challenging situations)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene16C extends BaseScene {

    public Scene16C() {
        textPrompt = "\n\nThe Dispersing Brilliance \n"
                + "\nUsing your magical abilities to dispel illusions, you create a brilliance that reveals the illusions' true nature. The celestial guardian acknowledges your mastery over magical energies.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "REFLECT (on the synergy between magic and courage)";
        option2 = "INQUIRE (about the celestial guardian's perspective on magical courage)";
        option3 = "READY (yourself for the next trial with newfound confidence)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene17 extends BaseScene {

    public Scene17() {
        textPrompt = "\n\nSCENE 17: THE TRIAL OF HARMONY\n"
                + "\nThe celestial guardian leads you to the third trial—a mystical grove where the harmony of nature intertwines with the magical energies. Maintaining balance is crucial in this enchanted realm.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "OBSERVE (the natural rhythms of the grove and harmonize with them)";
        option2 = "SEEK (guidance from the celestial guardian on maintaining magical balance)";
        option3 = "MAGIC (use your magical abilities to attune yourself to the grove's energies)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene17A extends BaseScene {

    public Scene17A() {
        textPrompt = "\n\nThe Symbiotic Dance\n"
                + "\nObserving the natural rhythms of the grove, you join a symbiotic dance with the flora and fauna. The celestial guardian commends your ability to harmonize with the magical essence.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude and inquire about the final trial)";
        option2 = "SHARE (your experience with the celestial guardian)";
        option3 = "THINK (contemplate the interconnectedness of magic and harmony)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene17B extends BaseScene {

    public Scene17B() {
        textPrompt = "\n\nThe Celestial Equilibrium\n"
                + "\nSeeking guidance on maintaining balance, the celestial guardian imparts wisdom on the delicate equilibrium between magical forces and the natural world.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (thank the celestial guardian and prepare for the final trial)";
        option2 = "INQUIRE (about the forest's reliance on magical harmony)";
        option3 = "DISCUSS (the broader implications of magical balance in the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene17C extends BaseScene {

    public Scene17C() {
        textPrompt = "\n\nSCENE 17C: THE ENERGETIC FUSION\n"
                + "\nUsing your magical abilities to attune to the grove's energies, you achieve a perfect fusion of magical and natural harmonies. The celestial guardian acknowledges your mastery over the trial.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "REFLECT (on the synergy between magic and harmony)";
        option2 = "INQUIRE (about the celestial guardian's perspective on magical harmony)";
        option3 = "FOCUS (on the upcoming final trial with a sense of profound balance)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}


class Scene18 extends BaseScene {

    public Scene18() {
        textPrompt = "\n\nSCENE 18: THE NEXUS OF DESTINY\n"
                + "\nThe celestial guardian leads you to the Nexus of Destiny, a mystical convergence of energies where the final challenge awaits. The Guardian Guide appears beside you, offering support.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INQUIRE (about the nature of the final challenge)";
        option2 = "SEEK (the celestial guardian's guidance on facing the Nexus of Destiny)";
        option3 = "MAGIC (use your magical abilities to sense the energies emanating from the nexus)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene18A extends BaseScene {

    public Scene18A() {
        textPrompt = "\n\nThe Enigmatic Revelation\n"
                + "\nThe celestial guardian reveals that the final challenge involves unlocking the Nexus of Destiny's secrets, which hold the key to the Enchanted Forest's ultimate purpose.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "EXPRESS (determination and step forward to face the challenge)";
        option2 = "CONSULT (the Guardian Guide for additional insights)";
        option3 = "REFLECT (on the significance of the Nexus of Destiny in your journey)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene18B extends BaseScene {

    public Scene18B() {
        textPrompt = "\n\nThe Celestial Wisdom\n"
                + "\nSeeking the celestial guardian's guidance, you receive wisdom on how to approach the Nexus of Destiny—a delicate balance of magical attunement, unwavering resolve, and a profound connection to the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (thank the celestial guardian and prepare for the final challenge)";
        option2 = "INQUIRE (about the nexus's role in shaping the forest's destiny)";
        option3 = "DISCUSS (the intricate details of the approaching trial with the Guardian Guide)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene18C extends BaseScene {

    public Scene18C() {
        textPrompt = "\n\nThe Energetic Pulsations\n"
                + "\nUsing your magical abilities to sense the energies emanating from the nexus, you gain insights into the trial's intricacies and the energies that intertwine within.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SHARE (the insights with the celestial guardian for validation)";
        option2 = "KEEP (the energetic pulsations to yourself and mentally prepare)";
        option3 = "CONSULT (the Guardian Guide for confirmation on your magical perceptions)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene19 extends BaseScene {

    public Scene19() {
        textPrompt = "\n\nSCENE 19: THE NEXUS UNVEILED\n"
                + "\nStepping into the Nexus of Destiny, you find yourself surrounded by swirling magical energies. The celestial guardian stands beside you, and the Guardian Guide offers a reassuring nod.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INQUIRE (about the first steps in unlocking the Nexus's secrets)";
        option2 = "FOCUS (your magical abilities on unraveling the mysteries within)";
        option3 = "SHARE (a moment of reflection with the celestial guardian and the Guardian Guide)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene19A extends BaseScene {

    public Scene19A() {
        textPrompt = "\n\nThe Confluence Ritual\n"
                + "\nThe celestial guardian instructs you to perform a confluence ritual, channeling your magical energies into the Nexus to establish a connection with the heart of the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "BEGIN (the confluence ritual with focused determination)";
        option2 = "SEEK (guidance from the celestial guardian before initiating the ritual)";
        option3 = "MAGIC (use your magical abilities to sense the optimal approach to the ritual)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene19B extends BaseScene {

    public Scene19B() {
        textPrompt = "\n\nThe Celestial Bond\n"
                + "\nFocusing your magical abilities, you sense the intricate threads of energy within the Nexus. The celestial guardian advises on establishing a profound bond to unlock the forest's destiny.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "COMMENCE (the bonding process with the Nexus)";
        option2 = "SHARE (your insights with the celestial guardian for validation)";
        option3 = "REFLECT (on the significance of forging a celestial bond with the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene19C extends BaseScene {

    public Scene19C() {
        textPrompt = "\n\nThe Guardian's Assurance\n"
                + "\nBefore initiating the ritual, you turn to the Guardian Guide for assurance. The guide offers words of encouragement, emphasizing the importance of trust in the forest's magic.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude and commence the confluence ritual)";
        option2 = "SEEK (additional guidance on the nuances of the ritual)";
        option3 = "CONTEMPLATE (the journey so far and how it led to this pivotal moment)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene20 extends BaseScene {

    public Scene20() {
        textPrompt = "\n\nSCENE 20: THE RESONANCE OF NEXUS\n"
                + "\nAs the confluence ritual unfolds, the Nexus of Destiny responds, resonating with your magical energies. Visions of the Enchanted Forest's past, present, and future flood your consciousness.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SEEK (clarity on the visions and their significance)";
        option2 = "EMBRACE (the flow of magical resonance and absorb the insights)";
        option3 = "SHARE (the experiences with the celestial guardian and the Guardian Guide)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene20A extends BaseScene {

    public Scene20A() {
        textPrompt = "\n\nThe Chronicles of Time\n"
                + "\nAs you seek clarity on the visions, the celestial guardian explains that the Nexus of Destiny unveils the chronicles of time, revealing the interconnected stories that shape the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "DELVE (deeper into the chronicles to understand their implications)";
        option2 = "ASK (the celestial guardian for guidance on interpreting the visions)";
        option3 = "REFLECT (on the role of time in the forest's mystical tapestry)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene20B extends BaseScene {

    public Scene20B() {
        textPrompt = "\n\nThe Elemental Symphony\n"
                + "\nEmbracing the magical resonance, you feel a symphony of elemental energies harmonizing within the Nexus. The celestial guardian commends your attunement to the elemental forces.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude and inquire about the next steps)";
        option2 = "SHARE (your experience with the celestial guardian for validation)";
        option3 = "CONTEMPLATE (the significance of elemental balance in the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene20C extends BaseScene {

    public Scene20C() {
        textPrompt = "\n\nNexus' Blessings\n"
                + "\nSharing the experiences with the celestial guardian and the Guardian Guide, you realize that the Nexus has bestowed upon you a blessing—a deep connection to the heart of the Enchanted Forest.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "GRATITUDE (express gratitude for the Nexus's blessing)";
        option2 = "SEEK (the celestial guardian's guidance on utilizing the newfound connection)";
        option3 = "REFLECT (on the responsibilities that come with the Nexus's blessing)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene21 extends BaseScene {

    public Scene21() {
        textPrompt = "\n\nSCENE 21: THE HARMONIOUS REVELATION\n"
                + "\nAs the confluence ritual concludes, the celestial guardian speaks, its voice resonating with the energies of the Nexus.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INQUIRE (about the revelations uncovered through the ritual)";
        option2 = "GRATITUDE (express gratitude for the guidance and insights gained)";
        option3 = "CONTEMPLATE (the role you now play in the destiny of the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene21A extends BaseScene {

    public Scene21A() {
        textPrompt = "\n\nThe Forest's Destiny\n"
                + "\nThe celestial guardian reveals that the Enchanted Forest's destiny is intricately woven with the choices made by those who traverse its magical realms. Your journey has played a crucial role in shaping this destiny.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SEEK (guidance on how to fulfill the forest's destiny)";
        option2 = "REFLECT (on the impact of your choices on the Enchanted Forest)";
        option3 = "EXPRESS (a commitment to safeguarding the forest's mystical balance)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene21B extends BaseScene {

    public Scene21B() {
        textPrompt = "\n\nThe Cosmic Threads\n"
                + "\nExpressing gratitude, you learn that the cosmic threads of destiny are ever-changing, influenced by the choices made by adventurers and guardians alike. Your role in this intricate tapestry is now clear.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "INQUIRE (about the ongoing responsibilities tied to the cosmic threads)";
        option2 = "SHARE (your reflections with the celestial guardian and the Guardian Guide)";
        option3 = "CONTEMPLATE (the interconnected nature of destinies within the Enchanted Forest)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}

class Scene21C extends BaseScene {

    public Scene21C() {
        textPrompt = "\n\nThe Guardian's Trust\n"
                + "\nThe celestial guardian acknowledges your commitment and trust in the Enchanted Forest's destiny. It imparts a final piece of wisdom, emphasizing the importance of balance and harmony in all future endeavors.\n";
    }

    public String showScene() {
        System.out.println(textPrompt);
        option1 = "SEEK (additional guidance on maintaining balance in the forest)";
        option2 = "GRATITUDE (express gratitude for the trust placed in you)";
        option3 = "CONTEMPLATE (the ongoing journey and the lessons learned)";

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        return getUserChoice();
    }
}



    