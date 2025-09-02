import java.util.Scanner;


public class Main {
    public static void main(String [] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter your user name");
    String userName = myObj.nextLine();  // Read user input of a String
    System.out.println("Hello " + userName + "! It is good to meet you!");  // Returns user output user input
        
    String song1 = new String("We're no strangers to love\n" + //
                "You know the rules and so do I\n" + //
                "A full commitment's what I'm thinkin' of\n" + //
                "You wouldn't get this from any other guy\n" + //
                "I just wanna tell you how I'm feeling\n" + //
                "Gotta make you understand\n" + //
                "Never gonna give you up, never gonna let you down\n" + //
                "Never gonna run around and desert you\n" + //
                "Never gonna make you cry, never gonna say goodbye\n" + //
                "Never gonna tell a lie and hurt you\n" + //
                "We've known each other for so long\n" + //
                "Your heart's been aching, but you're too shy to say it\n" + //
                "Inside, we both know what's been going on\n" + //
                "We know the game and we're gonna play it\n" + //
                "And if you ask me how I'm feeling\n" + //
                "Don't tell me you're too blind to see\n" + //
                "Never gonna give you up, never gonna let you down\n" + //
                "Never gonna run around and desert you\n" + //
                "Never gonna make you cry, never gonna say goodbye\n" + //
                "Never gonna tell a lie and hurt you\n" + //
                "Never gonna give you up, never gonna let you down\n" + //
                "Never gonna run around and desert you\n" + //
                "Never gonna make you cry, never gonna say goodbye\n" + //
                "Never gonna tell a lie and hurt you\n" + //
                "We've known each other for so long\n" + //
                "Your heart's been aching, but you're too shy to say it\n" + //
                "Inside, we both know what's been going on\n" + //
                "We know the game and we're gonna play it\n" + //
                "I just wanna tell you how I'm feeling\n" + //
                "Gotta make you understand\n" + //
                "Never gonna give you up, never gonna let you down\n" + //
                "Never gonna run around and desert you\n" + //
                "Never gonna make you cry, never gonna say goodbye\n" + //
                "Never gonna tell a lie and hurt you\n" + //
                "Never gonna give you up, never gonna let you down\n" + //
                "Never gonna run around and desert you\n" + //
                "Never gonna make you cry, never gonna say goodbye\n" + //
                "Never gonna tell a lie and hurt you\n" + //
                "Never gonna give you up, never gonna let you down\n" + //
                "Never gonna run around and desert you\n" + //
                "Never gonna make you cry, never gonna say goodbye\n" + //
                "Never gonna tell a lie and hurt you");
    String song2 = new String("I see a red door\n" + //
                "And I want it painted black\n" + //
                "No colors anymore\n" + //
                "I want them to turn black\n" + //
                "I see the girls walk by\n" + //
                "Dressed in their summer clothes\n" + //
                "I have to turn my head\n" + //
                "Until my darkness goes\n" + //
                "I see a line of cars\n" + //
                "And they're all painted black\n" + //
                "With flowers and my love\n" + //
                "Both never to come back\n" + //
                "I've seen people turn their heads\n" + //
                "And quickly look away\n" + //
                "Like a newborn baby\n" + //
                "It just happens everyday\n" + //
                "I look inside myself\n" + //
                "And see my heart is black\n" + //
                "I see my red door\n" + //
                "I must have it painted black\n" + //
                "Maybe then, I'll fade away\n" + //
                "And not have to face the facts\n" + //
                "It's not easy facing up\n" + //
                "When your whole world is black\n" + //
                "No more will my green sea\n" + //
                "Go turn a deeper blue\n" + //
                "I could not foresee this thing\n" + //
                "Happening to you\n" + //
                "If I look hard enough\n" + //
                "Into the setting sun\n" + //
                "My love will laugh with me\n" + //
                "Before the morning comes\n" + //
                "I see a red door\n" + //
                "And I want it painted black\n" + //
                "No colors anymore\n" + //
                "I want them to turn black\n" + //
                "I see the girls walk by\n" + //
                "Dressed in their summer clothes\n" + //
                "I have to turn my head\n" + //
                "Until my darkness goes\n" + //
                "I wanna see it painted\n" + //
                "Painted black\n" + //
                "Black as night\n" + //
                "Black as coal\n" + //
                "I wanna see the sun\n" + //
                "Blotted out from the sky\n" + //
                "I wanna see it painted, painted, painted\n" + //
                "Painted black, yeah");
    String song3 = new String("I remember when\n" + //
                "I remember, I remember when I lost my mind\n" + //
                "There was something so pleasant about that place\n" + //
                "Even your emotions have an echo in so much space\n" + //
                "Hmm\n" + //
                "And when you're out there without care\n" + //
                "Yeah, I was out of touch\n" + //
                "But it wasn't because I didn't know enough\n" + //
                "I just knew too much, hm\n" + //
                "Does that make me crazy?\n" + //
                "Does that make me crazy?\n" + //
                "Does that make me crazy?\n" + //
                "Possibly\n" + //
                "And I hope that you are having the time of your life\n" + //
                "But think twice, that's my only advice, mm\n" + //
                "Come on now, who do you, who do you, who do you\n" + //
                "Who do you think you are?\n" + //
                "Ha-ha-ha, bless your soul\n" + //
                "You really think you're in control, well\n" + //
                "I think you're crazy\n" + //
                "I think you're crazy\n" + //
                "I think you're crazy\n" + //
                "Just like me\n" + //
                "My heroes had the heart to lose their lives out on the limb\n" + //
                "And all I remember is thinking \"I want to be like them\"\n" + //
                "Ever since I was little\n" + //
                "Ever since I was little, it looked like fun\n" + //
                "And it's no coincidence I've come\n" + //
                "And I can die when I'm done\n" + //
                "But maybe I'm crazy\n" + //
                "Maybe you're crazy\n" + //
                "Maybe we're crazy\n" + //
                "Probably\n" + //
                "Whoo-ooh-whoo\n" + //
                "Whoo-ooh\n" + //
                "Whoo-hmm-mm");
    Scanner in = new Scanner(System.in); // Read the user input of an int
    while (true){
        System.out.println("Press 1 for Never Gonna Give You Up. Press 2 for Paint It, Black. Press 3 for Crazy. Press 4 to exit");

        int side = in.nextInt(); //What can we do with this?
        if (side == 1){
            System.out.println(song1);
        } else if(side == 2){
            System.out.println(song2);
        } else if(side == 3){
            System.out.println(song3);
        } else if(side == 4){
            System.out.println("bye");
            break;
        }
    }   


    }
}
