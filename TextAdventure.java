import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * Important information: Consult the README.TXT for information regarding this project's purpose, development details, and future updates. 
 *
 * @author Jared R. Taylor
 * @version v1.0
 */


public class TextAdventure
{
    public static void main(String[] args) throws InterruptedException // I'm throwing this because I want there to be pauses in dialogue (v1.1)
    {
        Scanner in = new Scanner(System.in);
        boolean hasBasketball = false;
        boolean hasKey = false;
        boolean windowBroke = false;
        boolean bedroomDoorUnlocked = false;
        
        // I'm not sure if I want to keep the intro sequence. This is just a small placeholder introduction to give the initial TextAdventure some flavor. (v1.1)
        // I would like this program to take on a sci-fi role, so this "story" is just for kicks to practice development. (v1.1)
        System.out.println("Hello.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You.. what is your name?");
        String playerName = in.nextLine();
        System.out.println("Ah... " + playerName + ". I've been waiting for you. You see- I have a gift for you. One moment:");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Oh, thank you for waiting. So kind of you to wait. Waiting. Waiiiiting. Waiiiiiiiiiiiiiiitingggggggggggggggggg...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("....waiting. waiting. waiTING. WAIting. WAITINguh. W 8 ting. wate ting. wate eng.");
        TimeUnit.SECONDS.sleep(6);
        System.out.println("Isn't it SO funny how when you say a word over and over again, it doesn't even sound like a word? Oh. RIGHT. Your gift, so sorry, sorry.");
        TimeUnit.SECONDS.sleep(6);
        System.out.println("Here's YOUR gift, " + playerName);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You feel your body begin to lighten. The weightlessness makes your legs give a little, and you began to feel as if you're tripping-");
        TimeUnit.SECONDS.sleep(8);
        System.out.println("You're surprised to find your legs quickly adjust to the ground as if you just landed from a small jump. You feel carpet beneath your feet. As you begin to look forwards- you hear a familiar voice.");
        TimeUnit.SECONDS.sleep(8);
        System.out.println(playerName + " ---Welcome to the roooooooom! Yes, a room! YOUR VERY OWN ROOM!!! How does that feel? Having a room, you must just be EXPLODING with happiness- what a wonderful gift!");
        TimeUnit.SECONDS.sleep(6);
        System.out.println(".....");
        TimeUnit.SECONDS.sleep(3);
        System.out.println();
        System.out.println("The voice you heard moments earlier has now retreated. As the presence of the voice fades, you get the feeling that you're alone in your newly discovered space.");
        System.out.println("As you look around and realize that you are standing in a dimly lit bedroom. In the room there is a lamp, bed, desk, and basketball.");
        System.out.println();
        System.out.println("In addition to the objects confined to the... modest, space of the room- you notice both a door and a window.");
        System.out.println();
        // End introduction sequence (v1.1) 
        
        boolean inRoom = true; // Keeps cycling user for the inRoom choices. There are multiple ways inside of the while loop the user can change the boolean to (false) which will exit the loop (v1.1)
        
        while (inRoom)
        {
            System.out.println("You are standing in the room, what would you like to do?");
            String userAction = in.nextLine();
            userAction = userAction.toLowerCase(); // Since Java is case sensitive, this makes sure that the user input doesn't skip the if else if statements because of case difference (JRT, v1.0)
            if (userAction.equals("look") || userAction.equals("look around") || userAction.equals("look at"))
            {
                System.out.print("What would you like to look at?");
                String userFocus = in.nextLine();
                userFocus = userFocus.toLowerCase();
                if (userFocus.equals("basketball"))
                {
                    System.out.println("You notice the basketball has collected a tangible amount of dust. The ball is sitting on the bed, and appears to be heavy enough to sink the area of the bed it sits on.");
                    System.out.println("Would you like to do something with the ball?");
                    boolean doneSomething = false;
                    while (!doneSomething) // Keeps the user cycling through choices until either: they've done something with the ball or they decide to leave it alone
                        {
                            String action = in.nextLine();
                            action = action.toLowerCase();
                            if (action.equals("pick up") || action.equals("take") || action.equals("take ball") || action.equals("get") || action.equals("get ball"))
                            {
                                hasBasketball = true;
                                System.out.println("You have picked up the ball! Hoooooray! Good for you!... Why'd you bother picking up that ball?");
                                doneSomething = true;
                            }
                            else if (action.equals("talk") || action.equals("speak") || action.equals("talk to") || action.equals("speak to"))
                            {
                                System.out.println("You whisper softly to the ball. Despite your sweet and gentle words, the ball remains stoic. The ball does not show the slightest bit of joy in response to your futile attempts to charm him.");
                                System.out.println("You get the feeling you should leave him alone after the awkward encounter");
                                doneSomething = true;
                            }
                            else
                            {
                                System.out.println("What? I'm afraid I didn't catch that. Could you say that again?");
                            }
                        }
                }
                else if (userFocus.equals("lamp"))
                {
                    // TODO
                }
                else if (userFocus.equals("bed"))
                {
                    //TODO
                }
                else if (userFocus.equals("desk"))
                {
                    //TODO
                }
                else if (userFocus.equals("door"))
                {
                    //TODO
                }
                else if (userFocus.equals("window"))
                {
                    //TODO
                }
                else
                {
                    System.out.println("What? THAT? You can't look there... Um. Don't insist. Please. Try something else");
                }
            }
            else if (userAction.equals("throw basketball"))
            {
                if (hasBasketball = true)
                {
                    System.out.println("Throw it? Um... okay. Sure! What would you like to throw that dusty old ball at?");
                }
            }
        }
    }
}
