import java.util.Scanner;

/**
 * Important information: Consult the README.TXT for information regarding this project's purpose, development details, and future updates. 
 *
 * @author Jared R. Taylor
 * @version v1.0
 */


public class TextAdventure
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean hasBasketball = false;
        boolean hasKey = false;
        boolean windowBroke = false;
        boolean bedroomDoorUnlocked = false;
        
        System.out.println("Hello.");
        System.out.println("You.. what is your name?");
        String playerName = in.nextLine();
        System.out.println("Ah... " + playerName + ". I've been waiting for you.");
        
        System.out.println(playerName + "You must leave. You're not needed in THIS room. Actually, I'm not sure WHY you're in this room, you just appeared here seconds ago. How'd you do that? Neat.");
        System.out.println(" ");
        System.out.println("You look around and realize that you are standing in a dimly lit bedroom. In the room there is a lamp, bed, desk, and basketball. The room looks as if it belongs to a child, however as you look around it feels like no one has been here in quite some time.");
        System.out.println("There is a door to the NORTH and a window to the WEST");
        
        boolean inRoom = true;
        
        while (inRoom)
        {
            System.out.println("You are standing in the bedroom, what would you like to do?");
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
                    while (!doneSomething)
                        {
                            String action = in.nextLine();
                            action = action.toLowerCase();
                            if (action.equals("pick up") || action.equals("take") || action.equals("take ball") || action.equals("get") || action.equals("get ball"))
                            {
                                hasBasketball = true;
                                System.out.println("You have picked up the ball! Hoooooray! Good for you!... Why'd you bother picking up that ball?");
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
