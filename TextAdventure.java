import java.util.Scanner;
/**
 * Important information: Consult the README.TXT for information regarding this project's purpose, development details, and future updates. 
 *
 * @author Jared R. Taylor
 * @version v1.2
 */


public class TextAdventure
{
    public static void main(String[] args) // Got rid of all forced sleep methods in previous versions (v1.2)
    {
        Scanner in = new Scanner(System.in);
        boolean hasBasketball = false;
        boolean hasKey = false;
        boolean windowBroke = false;
        boolean lampBroke = false;
        boolean hasPassword = false;
        boolean passwordAccepted = false;
        boolean doorUnlocked = false;
        
        // I'm not sure if I want to keep the intro sequence. This is just a small placeholder introduction to give the initial TextAdventure some flavor. (v1.1)
        // I would like this program to take on a sci-fi role, so this "story" is just for kicks to practice development. (v1.1)
        System.out.println("You are approached by a Shiba Inu dog. The dog is wearing a rainbow-colored cap with a spinwheel on top. He begins to speak to you: ");
        System.out.println("You.. BARK.. what is your name? BAARK!.. BARK-Bark.");
        String playerName = in.nextLine();
        System.out.println("Ah... " + playerName + ". I've been waiting for you. You see- I have a gift for you. One moment:");
        System.out.println("As the strange dog scutters off, you hear his feet scuffing against a tile floor.");
        System.out.println("Oh, thank you for waiting. So kind of you to wait. Waiting. Waiiiiting. Waiiiiiiiiiiiiiiitingggggggggggggggggg...");
        System.out.println("....waiting. waiting. waiTING. WAIting. WAITINguh. W 8 ting. wate ting. wate eng. Hahaha. Strange word.");
        System.out.println("Isn't it SO funny how when you say a word over and over again, it doesn't even sound like a word? Oh. RIGHT. Your gift, so sorry, sorry.");
        System.out.println("Here's YOUR gift, " + playerName);
        System.out.println("You're surprised to find your legs quickly adjust to the ground as if you just landed from a small jump. You feel carpet beneath your feet. As you begin to look forwards- you hear a familiar voice.");
        System.out.println(playerName + " Welcome to the roooooooom! YOUR VERY OWN ROOM!!! This must be great. Wow. Such space. Much carpet.");
        System.out.println("The strange dog is beginning to creep you out with his enthusiasm for rooms.");
        System.out.println(".....");
        System.out.println();
        System.out.println("The voice you heard moments earlier has now retreated. As the presence of the voice fades, you get the feeling that you're alone in your newly discovered space.");
        System.out.println("As you look around and realize that you are standing in a dimly lit bedroom. In the room there is a lamp, bed, desk, and basketball.");
        System.out.println();
        System.out.println("In addition to the objects confined to the... modest, space of the room- you notice both a door and a window.");
        System.out.println();
        System.out.println("If you find yourself having trouble, enter \"help\".");
        System.out.println("To exit the game, enter \"quit\". ");
        // End introduction sequence (v1.1) 
        
        boolean inRoom = true; // Keeps cycling user for the inRoom choices. There are multiple ways inside of the while loop the user can change the boolean to (false) which will exit the loop (v1.1)
        
        while (inRoom)
        {
            System.out.println("You are standing in the room, what would you like to do?");
            String userAction = in.nextLine();
            userAction = userAction.toLowerCase(); // Since Java is case sensitive, this makes sure that the user input doesn't skip the if else if statements because of case difference (JRT, v1.0)
            if (userAction.equals("look") || userAction.equals("look around") || userAction.equals("look at"))
            {
                System.out.println("What would you like to look at? (to return to center of the room, enter \"leave\") ");
                String userFocus = in.nextLine();
                userFocus = userFocus.toLowerCase();
                if (userFocus.equals("basketball"))
                {
                    System.out.println("You notice the basketball has collected a tangible amount of dust. The ball is sitting on the bed, and appears to be heavy enough to sink the area of the bed it sits on.");
                    System.out.println("Would you like to do something with the ball?");
                    boolean doneSomething = false; // Defined within the if statement so that each object in the room can use the same boolean, making the reading consistent throughout the game (v1.2)
                    while (!doneSomething) // Keeps the user cycling through choices until either: they've done something with the ball or they decide to leave it alone
                        {
                            String action = in.nextLine();
                            action = action.toLowerCase();
                            if (action.equals("pick up") || action.equals("take") || action.equals("take ball") || action.equals("get") || action.equals("get ball") || action.equals("pick up ball"))
                            {
                                hasBasketball = true;
                                System.out.println("You have picked up the ball! Hoooooray! Good for you!... Why'd you bother picking up that ball?");
                                System.out.println("The ball is now in your hands.");
                                doneSomething = true;
                            }
                            else if (action.equals("talk") || action.equals("speak") || action.equals("talk to") || action.equals("speak to"))
                            {
                                System.out.println("You whisper softly to the ball. Despite your sweet and gentle words, the ball remains stoic. The ball does not show the slightest bit of joy in response to your futile attempts to charm him.");
                                System.out.println("You get the feeling you should leave him alone after the awkward encounter.");
                                doneSomething = true;
                            }
                            else if (action.equals("leave") || action.equals("no"))
                            {
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
                    if (!lampBroke)
                        {System.out.println("In the corner of the room you notice a small lamp in the shape of a rocket ship. You notice that the lamp is making a small humming noise, and occasionally flickers softly.");
                        System.out.println("While looking at the lamp, you imagine what it would be like to shrink down to the size of an eraser and pilot the small aircraft through the galaxy.");
                        System.out.println("During your flight through grand galactic space, you notice the lamp flicker softly again- waking you back to reality.");
                        System.out.println(" \"It would sure be nice to be an astronaut. I should have applied to MIT instead of following my SO to community college.\" you mumble to yourself.");
                        System.out.println("Exasperated and fighting mild regret, you approach the lamp.");
                        System.out.println("Would you like to do something with the lamp?");
                        boolean doneSomething = false;
                        while (!doneSomething)
                        {
                            String action = in.nextLine();
                            action = action.toLowerCase(); // actions are not done at the ROOM level, but the OBJECT level (v1.2)
                            if (action.equals("take") || action.equals("get") || action.equals("take lamp") || action.equals("get lamp") || action.equals("pick up"))
                            {
                                System.out.println("As you approach the lamp, you feel that you should let the spaceship stay on the desk. It would be wrong to move it.");
                                doneSomething = true;
                            }
                            else if (action.equals("break") || action.equals("break lamp") || action.equals("destroy lamp") || action.equals("destroy"))
                            {
                                System.out.println("You approach the lamp. You smile at the lamp.");
                                System.out.println("The lamp is smiling at you. The lamp thinks of you as a friend. It believes you are coming in close to embrace it.");
                                System.out.println("The lamp's beaming smile quickly turns to a face of despair. You pick up the lamp and smash it against the desk.");
                                System.out.println("Fragments of the lamp scatter across the room. The lamp is as broken as your childhood dreams.");
                                System.out.println("You think of fixing the lamp. However, you did not go to MIT and do not have a degree in lamp-repair.");
                                System.out.println("The basketball is disappointed.");
                                doneSomething = true;
                                lampBroke = true;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("There's nothing you can do. You've ruined it.");
                        System.out.println("You monster.");
                        System.out.println("The baskbetball is disappointed.");
                    }
                }
                else if (userFocus.equals("bed"))
                {
                    System.out.println("The bed is taking up about 1/4 of the room. You can tell is has been used recently.");
                    System.out.println("As you approach the bed, you notice that there is a small paper tucked behind one of the pillows.");
                    System.out.println("Would you like to do something with the bed?");
                    boolean doneSomething = false;
                    while (!doneSomething)
                    {
                        String action = in.nextLine();
                        action = action.toLowerCase(); // Defining and using action here instead of userAction because we're at the OBJECT level, not the ROOM level (v1.2)
                        if (action.equals("take paper") || action.equals("get paper") || action.equals("look at paper") || action.equals("look paper") || action.equals("take the paper") || action.equals("get the paper"))
                        {
                            hasPassword = true;
                            System.out.println("You take the paper from behind the pillow.");
                            System.out.println("The paper has a combination written on it: \"WITMOL?42\".");
                            System.out.println("You feel that the combination may be important, and store the paper in your pocket.");
                            doneSomething = true;
                        }
                        else if (action.equals("sleep") || action.equals("lay down") || action.equals("go to bed") || action.equals("go to sleep") || action.equals("sleep on bed") || action.equals("lay on bed"))
                        {
                            System.out.println("You give the bed a few good pats and begin to lay down.");
                            System.out.println("As you begin to doze off, you feel as if the room is spinning.");
                            System.out.println("You feel as if everything up until now has just been a dream.");
                            System.out.println();
                            System.out.println(".....");
                            System.out.println("ZzzzZzzzZzz...");
                            System.out.println("You feel well rested. You also feel like this was a waste of time.");
                            doneSomething = true;
                        }
                        else if (action.equals("leave") || action.equals("no"))
                        {
                            doneSomething = true;
                        }
                        else
                        {
                            System.out.println("What? I didn't catch that.");
                        }
                    }
                }
                else if (userFocus.equals("desk"))
                {
                    System.out.println("You approach the desk the lamp was sitting on.");
                    System.out.println("As you approach the desk, you notice that there is a drawer hidden on the side.");
                    System.out.println("Would you like to do something with the desk?");
                    boolean doneSomething = false;
                    while (!doneSomething)
                    {
                        String action = in.nextLine();
                        action = action.toLowerCase();
                        if (action.equals("open drawer") || action.equals("open the drawer") || action.equals("look in the drawer") || action.equals("look inside drawer"))
                        {
                            System.out.println("You open up the drawer and find a note with a key attached to it. ");
                            System.out.println("You read the note, it says: ");
                            System.out.println("BARK-BARK! HELLO FRIEND. GOOB JOB. USE KEY TO GO. GOOD WORK.");
                            System.out.println("You cringe at the stranger's choice of words and take the key.");
                            System.out.println("You have no idea who could've left a note like that. You mull it over a while, but eventually figure thinking about it isn't worth it.");
                            doneSomething = true;
                            hasKey = true;
                        }
                        else if (action.equals("shake drawer") || action.equals("bang on desk") || action.equals("shake desk") || action.equals("bang drawer") || action.equals("shake") || action.equals("bang"))
                        {
                            System.out.println("The dog from earlier falls out of the desk.");
                            System.out.println("He falls to the floor, looks up at you, and runs away from the awkward encounter.");
                            System.out.println("He leaves a note on the ground that says, \"Please ignore that. Bark.\" ");
                            doneSomething = true;
                        }
                        else
                        {
                            System.out.println("What? I didn't catch that.");
                        }
                    }
                }
                else if (userFocus.equals("door"))
                {
                    System.out.println("You look over at the door to the room. The door appears to be made of steel.");
                    System.out.println("As you approach the door, you notice it has a system of locks.");
                    System.out.println("The door has a small keyboard that accepts numbers, letters, and a few miscellaneous symbols.");
                    System.out.println("Would you like to do something with the door?");
                    boolean doneSomething = false;
                    while (!doneSomething)
                    {
                        String action = in.nextLine();
                        action = action.toLowerCase();
                        if (hasKey && hasPassword)
                        {
                            System.out.println("BARK! BARK! YOU HAVE IT! YOU HAVE THEM BOTH! BAAAARK-bArkK!! Would you like to use the password??? ");
                            System.out.println("You can't help but cringe from the dog's scripted lines in this game.");
                            System.out.println();
                            System.out.println("Use the password? Yes / No ");
                            String choice = in.next();
                            choice = choice.toLowerCase();
                            if (choice.equals("yes"))
                            {
                                boolean passwordCorrect = false;
                                while (!passwordCorrect)
                                {
                                    System.out.println("Enter the password! Bark! (enter Q to stop trying)");
                                    String userAttempt = in.nextLine();
                                    if (userAttempt.equals("WITMOL?42"))
                                    {
                                        System.out.println("Password correct.");
                                        passwordCorrect = true;
                                        passwordAccepted = true;
                                        doneSomething = true;
                                        System.out.println("BARK! NICELY DONE FRIEND!");
                                        System.out.println("The door begins to make a sharp buzzing noise.");
                                        System.out.println("The keyboard is retracted into the door. In its place, a small household lock emerges.");
                                        System.out.println("USE YOUR KEY! BARK!");
                                        System.out.println("I mean.. Woof. Oh no. How will you ever get past this obstacle? Woof.");
                                        System.out.println("You think that the dog's woof is much more tolerable than the original bark.");
                                        System.out.println("You pull out the key from your pocket and slide it into the lock. With a quick turn of the wrist, the lock responds and turns.");
                                        System.out.println("The door begins to ease open. You walk through and throw yourself into the dark beyond the door.");
                                        inRoom = false;
                                    }
                                    else if (userAttempt.equals("q") || userAttempt.equals("Q"))
                                    {
                                        System.out.println("Dismissing...");
                                        doneSomething = true;
                                        passwordCorrect = true; // Note: only doing this to exit the loop. Notice we are not setting passwordAccepted to true (v1.2)
                                    }
                                    else
                                    {
                                        System.out.println("Password not accepted.");
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("You decide you'll wait and explore the room further.");
                            }
                        }
                        else if (hasKey && !hasPassword)
                        {
                            System.out.println("BAAARK! BARKakrkBark NO! You don't have the secret password.");
                            System.out.println("You feel annoyed at the dog, but decide to go back to the center of the room to look around.");
                            doneSomething = true;
                        }
                        else if (!hasKey && hasPassword)
                        {
                            System.out.println("BARKARABRKARBAKRBK. #*&@^#^@*^#@Q*@#&^");
                            System.out.println("Error: Dog cannot function.");
                            System.out.println("You get the feeling you should look around the room a little bit more...");
                        }
                        else
                        {
                            System.out.println("You look at the keyboard, but can't bring yourself to push anything. What if you break it?");
                            System.out.println("To keep yourself safe, you decide to go back to the center of the room to look around.");
                        }
                    }
                }
                else if (userFocus.equals("window"))
                {
                    System.out.println("You notice the window in the room. Looking through the window, there is nothing visible - it seems pitch black, as if it were night time.");
                    System.out.println("As you approach the window, you notice that it is cracked through the center.");
                    System.out.println("It doesn't look like it would take a significant amount of force to break it.");
                    System.out.println("Would you like to do something with the window?");
                    boolean doneSomething = false;
                    while (!doneSomething)
                    {
                        String action = in.nextLine();
                        action = action.toLowerCase();
                        if (action.equals("break window") || action.equals("punch window") || action.equals("break") || action.equals("punch"))
                        {
                            System.out.println("While the window seems fragile, you don't think it will be effective to just hit it yourself.");
                            doneSomething = true;
                        }
                        else if (action.equals("throw ball") || action.equals("throw basketball") || action.equals("use ball") || action.equals("toss ball") || action.equals ("throw"))
                        {
                            if (hasBasketball)
                            {
                                System.out.println("You muster all of your strength to launch the basketball towards the fragile window.");
                                System.out.println("-CRASH-");
                                System.out.println("The window has shattered, and now leaves a dark whole in the side of the room.");
                                windowBroke = true; // Defined at beginning of main() (v1.2)
                                doneSomething = true;
                            }
                            else
                            {
                                System.out.println("What? You have nothing to throw.");
                            }
                        }
                        else if (action.equals("no") || action.equals("leave"))
                        {
                            System.out.println("You think you should go back to the center of the room to look around.");
                        }
                        else
                        {
                            System.out.println("What? I didn't catch that.");
                        }
                    }
                }
                else
                {
                    System.out.println("You get the feeling you should try something else.");
                }
            }
            else if (userAction.equals("help"))
            {
                System.out.println("Hello- if you're having trouble, try using simple, short commands to interact with the environment. To get started, I'd recommend looking around the room."); // Help feature to give direction (v1.2)
            }
            else if(userAction.equals("quit"))
            {
                break;
            }
            else if (userAction.equals("read password") || userAction.equals("look at password") || userAction.equals("look password") || userAction.equals("read paper"))
            {
                if (hasPassword)
                {
                    System.out.println("You take the small piece of paper out of your pocket and read it.");
                    System.out.println("The password is: WITMOL?42");
                }
                else
                {
                    System.out.println("Password? You're being silly.");
                }
            }
            else if (userAction.equals("throw basketball") || userAction.equals("throw ball") || userAction.equals("use ball") || userAction.equals("toss") || userAction.equals ("throw")) // userAction is always done for actions at the ROOM level
            {
                if (hasBasketball)
                {
                    System.out.println("Throw it? Um... okay. Sure! What would you like to throw that dusty old ball at?");
                    
                    String target = in.nextLine(); // Now using "target" since we're not at the room level (v1.2)
                    target = target.toLowerCase();
                    if (target.equals("window") || target.equals("the window"))
                    {
                        System.out.println("You muster all of your strength to launch the basketball towards the fragile window.");
                        System.out.println("-CRASH-");
                        System.out.println("The window has shattered, and now leaves a dark whole in the side of the room.");
                        windowBroke = true; // Defined at beginning of main() (v1.2)
                    }
                    else if (target.equals("door") || target.equals("the door"))
                    {
                        System.out.println("You weakly lop the ball towards the door.");
                        System.out.println("The ball rolls back to you. Not wanting to leave the room messy, you pick the ball back up in haste.");
                        System.out.println("The ball seems disappointed.");
                    }
                    else if (target.equals("lamp") || target.equals("the lamp") || target.equals("at the lamp"))
                    {
                        System.out.println("As you prepare to launch the ball- the ball resists.");
                        System.out.println("You get the feeling that if you're to break the lamp, you must do it on your own.");
                        System.out.println("The basketball is frightened.");
                    }
                }
                else 
                {
                    System.out.println("What? What are you trying to throw?");
                }
            }
            else if (userAction.equals("go through window") || (userAction.equals("enter window") || userAction.equals("climb into window") || userAction.equals("leave by window") || userAction.equals("leave through window") || userAction.equals("climb through window") || userAction.equals("climb window") || userAction.equals("use window")))
            {
                if (windowBroke)
                {
                    System.out.println("You manage to bend yourself through the window. You throw yourself through into the darkness.");
                    inRoom = false; // Exits the while loop to leave the room
                    if (lampBroke)
                    {
                        System.out.println("The ball is relieved that you are finally gone.");
                    }
                    else
                    {
                        System.out.println("The ball is proud of your escape. It beams with joy. You get the feeling that it will miss your presence.");
                    }
                }
            }
    }
}
}
