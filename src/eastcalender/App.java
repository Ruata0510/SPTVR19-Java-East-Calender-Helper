package eastcalender;
import java.util.Scanner;

class App {
    
    static enum Year {
        Green_Rat, Green_Cow, Green_Tiger, Green_Rabbit,Green_Dragon,Green_Snake,Green_Horse,Green_Sheep,Green_Monkey,Green_Chicken,Green_Dog,Green_Pig, Red_Rat, Red_Cow, Red_Tiger, Red_Rabbit, Red_Dragon, Red_Snake, Red_Horse, Red_Sheep, Red_Monkey, Red_Chicken, Red_Dog, Red_Pig, Yellow_Rat, Yellow_Cow, Yellow_Tiger, Yellow_Rabbit, Yellow_Dragon, Yellow_Snake, Yellow_Horse, Yellow_Sheep, Yellow_Monkey, Yellow_Chicken, Yellow_Dog, Yellow_Pig, White_Rat, White_Cow, White_Tiger, White_Rabbit, White_Dragon, White_Snake, White_Horse, White_Sheep, White_Monkey, White_Chicken, White_Dog, White_Pig, Black_Rat, Black_Cow, Black_Tiger, Black_Rabbit, Black_Dragon, Black_Snake, Black_Horse, Black_Sheep, Black_Monkey, Black_Chicken, Black_Dog, Black_Pig
    }
    
    public static void run() {
        
        System.out.println(" --- East Calender Helper --- ");
        System.out.println(" --- This program will help you to find the name of given year in Eastern Calender --- ");
        
        Scanner scan = new Scanner(System.in);
        
        int current_year;
        int difference;
        int over_koef;
        String eastern_name;
        
        while (true) {
            
            System.out.print("\nInput the year: ");
            current_year = scan.nextInt();
            
            over_koef = (int) Math.floor((current_year - (1984 - 6000000)) / 60);
            difference = (current_year - (1984 - 6000000)) - ((60 * over_koef));
           
            System.out.println("That's the year of " + Year.values()[difference]);
            
        }
    }
}
