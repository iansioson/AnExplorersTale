

class Player {

public static int HP; //current health points
protected int maxHp; //maximum hp
protected int intelligence; //intelligence stat
protected int athleticsm; //vigor stat
protected int charisma; //charisma stat
public static int sanity; //sanity stat
public static String name;
public static int score;



int randomVal (){ //method that generates a random number (used for stats)
int min = 4;
int max = 10;
int randomValue = (int)Math.floor(Math.random() * (max - min + 1) + min);
return randomValue;
}


public  Player (){
this.maxHp = 3;                     
this.HP = maxHp;
this.sanity = 4;

}

boolean dead = false;

String getName (String name){
    this.name = name;
    return this.name;
}
 void  displayStats (){
System.out.println("HP: " + this.HP);
System.out.println("Sanity: " + this.sanity);
}
 
String getName (){
    return this.name;
}

}















