import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;

public class Zoo
{
    public static  void main(String[] args) throws InterruptedException 
    {
        List<Animalia> animals = new ArrayList<Animalia>();

        System.out.println("Welcome to the Zoo!\n");
        System.out.print("Building the cages");
        delayDots();
        System.out.print("Populating the animals");
        populateAnimals(animals);
        delayDots();
        System.out.print("Hiring zookeepers");
        delayDots();

        Scanner in = new Scanner(System.in);
        System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?");
        System.out.println("Type help to find out what you can do.\n");
        String text = in.nextLine();
        String msg = "";
        while(!text.equals("leave"))
        {
            switch(text)
            {
                case "help" : 
                msg = "So far we can visit cages, listen, leave \n"+
                "look up, look around, look down, and ask for help.";
                break;
                case "visit cages" : 
                msg = visitCages(animals);
                break;
                case "look up" :
                msg = lookUp(animals);
                break;
                case "look around" :
                msg = lookAround(animals);
                break;
                case "listen" :
                msg = listen(animals);
                break;
                case "look down":
                msg = lookDown(animals);
                break;
                default : msg = "You flail helplessly with indecision.";
            }
            System.out.println("\n" + msg);
            delayDots(3);
            System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?\n");
            text = in.nextLine();
        }

        System.out.println(Math.random() < .8 ? "\nHave a nice day!  Hope you come back!" : "\nAn escaped lion eats you on your way out.  Sorry!");

    }

    public static String visitCages(List<Animalia> animals)
    {
        String msg = "";
        Scanner in = new Scanner(System.in);
        System.out.println("You can visit the Mammalia, Amphibian, Reptilia, Aves, or Tetrapoda. Which would you like to visit?");
        String text = in.nextLine();
        switch(text)
        {
            case "Mammalia" : 
                for(Animalia a : animals)
                {
                    if(a instanceof Mammalia){
                        System.out.println(a.getClass().getName() + " is an animal you can learn about");
                    }
                }
                System.out.println("Which animal would you like more information on?");
                String text2= in.nextLine();
                for(Animalia a : animals)
                {
                    if(a instanceof Mammalia && a.getClass().getName().equals(text2))
                    {
                        for(String parent : a.getParents())
                        {
                            System.out.println(parent + " is an type of you can learn about");
                        }     
                        System.out.println("Which of these would you like to learn about?");
                        String text4 = in.nextLine();
                        a.getDescription(text4);
                        break;
                    }
                }
                break;
            case "Amphibian" :
                for(Animalia a : animals)
                {
                    if(a instanceof Amphibian){
                        System.out.println(a.getClass().getName() + " is an animal you can learn about");
                    }
                }
                System.out.println("Which animal would you like more information on?");
                text2= in.nextLine();
                for(Animalia a : animals)
                {
                    if(a instanceof Amphibian && a.getClass().getName().equals(text2))
                    {
                        for(String parent : a.getParents())
                        {
                            System.out.println(parent + " is an type of you can learn about");
                        }     
                        System.out.println("Which of these would you like to learn about?");
                        String text4 = in.nextLine();
                        a.getDescription(text4);
                        break;
                    }
                }
                break;
            case "Reptilia" :
                for(Animalia a : animals)
                {
                    if(a instanceof Reptilia){
                        System.out.println(a.getClass().getName() + " is an animal you can learn about");
                    }
                }
                System.out.println("Which animal would you like more information on?");
                text2= in.nextLine();
                for(Animalia a : animals)
                {
                    if(a instanceof Reptilia && a.getClass().getName().equals(text2))
                    {
                        for(String parent : a.getParents())
                        {
                            System.out.println(parent + " is an type of you can learn about");
                        }     
                        System.out.println("Which of these would you like to learn about?");
                        String text4 = in.nextLine();
                        a.getDescription(text4);
                        break;
                    }
                }
                break;
            case "Aves" :
                for(Animalia a : animals)
                {
                    if(a instanceof Aves){
                        System.out.println(a.getClass().getName() + " is an animal you can learn about");
                    }
                }
                System.out.println("Which animal would you like more information on?");
                text2= in.nextLine();
                for(Animalia a : animals)
                {
                    if(a instanceof Aves && a.getClass().getName().equals(text2))
                    {
                        for(String parent : a.getParents())
                        {
                            System.out.println(parent + " is an type of you can learn about");
                        }     
                        System.out.println("Which of these would you like to learn about?");
                        String text4 = in.nextLine();
                        a.getDescription(text4);
                        break;
                    }
                }
                break;
            case "Tetrapoda":
                for(Animalia a : animals)
                {
                    if(a instanceof Tetrapoda){
                        System.out.println(a.getClass().getName() + " is an animal you can learn about");
                    }
                }
                System.out.println("Which animal would you like more information on?");
                text2= in.nextLine();
                for(Animalia a : animals)
                {
                    if(a instanceof Tetrapoda && a.getClass().getName().equals(text2))
                    {
                        for(String parent : a.getParents())
                        {
                            System.out.println(parent + " is an type of you can learn about");
                        }     
                        System.out.println("Which of these would you like to learn about?");
                        String text4 = in.nextLine();
                        a.getDescription(text4);
                        break;
                    }
                }
                break;
            default : msg = "You flail helplessly with indecision.";
        }
        msg = "";
        return msg;
    }

    public static String listen(List<Animalia> animals)
    {
        String msg = "";
        for(Animalia a : animals)
        {
            msg += a.getName() + ": \n       " 
            + a.makeNoise() + "\n";
        }
        return msg;
    }

    public static String lookDown(List<Animalia> animals)
    {
        String msg = "";

        for(Animalia a : animals)
        {
            if(a instanceof Swimming) 
            {
                Swimming f = (Swimming) a;
                msg += a.getName() + ": \n       " 
                + f.swim() + "\n";
            }
        }
        return msg;

    }

    public static String lookAround(List<Animalia> animals)
    {
        String msg = "";

        for(Animalia a : animals)
        {
            if(a instanceof Walking) 
            {
                Walking w = (Walking) a;
                msg += a.getName() + ": \n       " 
                + w.walk() + "\n";
            }
        }
        return msg;

    }

    public static String lookUp(List<Animalia> animals)
    {
        String msg = "";

        for(Animalia a : animals)
        {
            if(a instanceof Flying) 
            {
                Flying f = (Flying) a;
                msg += a.getName() + ": \n       " 
                + f.fly() + "\n";
            }
        }
        return msg;

    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots(int dotAmount) throws InterruptedException 
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots() throws InterruptedException 
    {
        delayDots(0);
    }

    /**
     * This is where we will all collaborate.
     * Construct your animal and add it to the List
     * @param animals the list containing all the zoo animals
     */
    public static void populateAnimals(List<Animalia> animals)
    {
        AfricanPaintedDog Doug = new AfricanPaintedDog("Doug", "Doug likes his meat well done");
        animals.add(Doug);
        BatEaredFox Freddy = new BatEaredFox("Freddy", "Freddy always wished he could fly");
        animals.add(Freddy);
        FennecFox Felix = new FennecFox("Felix", "Felix is very sneaky");
        animals.add(Felix);
        Meerkat Maren = new Meerkat("Maren", "Maren like to sleep");
        animals.add(Maren);
        NorthAmericanRiverOtter Oscar = new NorthAmericanRiverOtter("Oscar", "Oscar is a clam collector");
        animals.add(Oscar);
        AsianSmallClawedOtter Ollie = new AsianSmallClawedOtter("Ollie", "Ollie loves holding hands");
        animals.add(Ollie);
        CaliforniaSeaLion Larry = new CaliforniaSeaLion("Larry", "Larry loves his toy ball");
        animals.add(Larry);
        CaracalCaracal Cathy = new CaracalCaracal("Cathy", "Cathy likes soup");
        animals.add(Cathy);
        Cheetah Chester = new Cheetah("Chester", "Chester is the best at the 60m");
        animals.add(Chester);
        BlackFootedCat Barry = new BlackFootedCat("Barry", "Barry always has bad luck");
        animals.add(Barry);
        AfricanLion Leo = new AfricanLion("Leo", "Leo has some anger management issues");
        animals.add(Leo);
        AmurLeopard Lenny = new AmurLeopard("Lenny", "Lenny keeps to himself");
        animals.add(Lenny);
        Polarbear Perry = new Polarbear("Perry", "Perry loves the warm weather");
        animals.add(Perry);
        RedPanda Remy = new RedPanda("Remy", "Remy eats sticks for fun");
        animals.add(Remy);
        RedRiverHog Pumbaa = new RedRiverHog("Pumbaa", "Pumbaa loves to sing");
        animals.add(Pumbaa);
        MasaiGiraffe Mary = new MasaiGiraffe("Mary", "Mary has a neck infection");
        animals.add(Mary);
        Llama Lily = new Llama("Lily", "She is definely not an Alpaca");
        animals.add(Lily);
        DromedaryCamel CamCam = new DromedaryCamel("CamCam", "He is an expert traveler");
        animals.add(CamCam);
        Bongo Billy = new Bongo("Billy", "Billy loves the drums");
        animals.add(Billy);
        Hippopotamus Gloria = new Hippopotamus("Gloria", "The best singer in the land");
        animals.add(Gloria);
        BlackRhinoceros Ryan = new BlackRhinoceros("Ryan", "Very headstrong");
        animals.add(Ryan);
        GrantsZebra Grant = new GrantsZebra("Grant", "Grant is his own Zebra");
        animals.add(Grant);
        GoldenLionTamarin Gary = new GoldenLionTamarin("Gary", "Gary loves speed");
        animals.add(Gary);
        BoreanOrangutan Borus = new BoreanOrangutan("Borus", "The biggest monkey around");
        animals.add(Borus);
        Chimpanzee Charlie = new Chimpanzee("Charlie", "Charlie loves to learn");
        animals.add(Charlie);
        FrancoisLangur Francis = new FrancoisLangur("Francis", "Francis get bored very easily");
        animals.add(Francis);
        GuineaBaboon Harry = new GuineaBaboon("Harry", "Harry loves making new friends");
        animals.add(Harry);
        BlueMonkey Manny = new BlueMonkey("Manny", "Manny's favorite color is red");
        animals.add(Manny);
        MonaMonkey Molly = new MonaMonkey("Molly", "Molly loves sharing");
        animals.add(Molly);
        RedCappedMangabey Matthew = new RedCappedMangabey("Matthew", "Matthew's favorite color is blue");
        animals.add(Matthew);
        LionTailedMacaque Terry = new LionTailedMacaque("Terry", "Terry follows all the rules");
        animals.add(Terry);
        MactschieTreeKangaroo Ali = new MactschieTreeKangaroo("Ali", "Boxing Champion");
        animals.add(Ali);
        ParmaWallaby Pam = new ParmaWallaby("Pam", "Her favorite food is spam");
        animals.add(Pam);
        RedKangaroo Kelly = new RedKangaroo("Kelly", "Kelly loves the ocean");
        animals.add(Kelly);
        AfricanElephant Payton = new AfricanElephant("Payton", "She is the zookeepers favorite");
        animals.add(Payton);
        MarineFrog Jack = new MarineFrog("Jack", "Jack loves playing cards");
        animals.add(Jack);
        BluePoisonDartFrog Kyle = new BluePoisonDartFrog("Kyle", "Do not mess with the Dart");
        animals.add(Kyle);
        LeopardTortoise Ugway = new LeopardTortoise("Ugway", "The wisest of them all");
        animals.add(Ugway);
        AldabraTortoise Po = new AldabraTortoise("Po", "The dumbest of them all");
        animals.add(Po);
        GreenTreePython Sam = new GreenTreePython("Sam", "A slimly one");
        animals.add(Sam);
        BurmesePython David = new BurmesePython("David", "An even slimly one");
        animals.add(David);
        BlackSwan Laney = new BlackSwan("Laney", "Loves to show off");
        animals.add(Laney);
        AfricanGroundHornbill George = new AfricanGroundHornbill("George", "Just wishes he was a real boy");
        animals.add(George);
        RhinocerosHornbill Robert = new RhinocerosHornbill("Robert", "wishes people called him Rod");
        animals.add(Robert);
        AfricanCrownedCrane Carey = new AfricanCrownedCrane("Carey", "wants to skip town");
        animals.add(Carey);
        AfricanFishEagle Abby = new AfricanFishEagle("Abby", "loves the spotlight");
        animals.add(Abby);
        LappetFacedVulture Logan = new LappetFacedVulture("Logan", "Logan eats his friends for fun");
        animals.add(Logan);
        ElectusParrot Conner = new ElectusParrot("Conner", "The copier");
        animals.add(Conner);
        GreenWingedMacaw Blue = new GreenWingedMacaw("Blue", "He loves being the last of his kind");
        animals.add(Blue);
        RainbowLorikeet Jada = new RainbowLorikeet("Jada", "always on meds");
        animals.add(Jada);
        IndianPeacock Izzy = new IndianPeacock("Izzy", "The most beautiful in all the land");
        animals.add(Izzy);
        GentooPengion Garret = new GentooPengion("Garret", "Wants to be a pilot");
        animals.add(Garret);
        HumboldtPenguin Brian = new HumboldtPenguin("Brian", "gave up on flying years ago");
        animals.add(Brian);
        KingPenguin Thomas = new KingPenguin("Thomas", "King of the World");
        animals.add(Thomas);
        ChileanFlamingo Chappy = new ChileanFlamingo("Chappy", "Master of Zen");
        animals.add(Charlie);
        Kookaburra Emmy = new Kookaburra("Emmy", "Loves to climb");
        animals.add(Emmy);
        BlueNeckedOstrich Nessy = new BlueNeckedOstrich("Nessy", "No it is not a rash");
        animals.add(Nessy);
        AfricanCrestedPorcupine Poppy = new AfricanCrestedPorcupine("Poppy", "The most senstive of all the animals");
        animals.add(Poppy);
        BlackDwarfPorcupine Milo = new BlackDwarfPorcupine("Milo", "Loves making friends");
        animals.add(Milo);
        PrevostSquirrel Tommy = new PrevostSquirrel("Tommy", "The most forward of them all");
        animals.add(Tommy);
    }
}