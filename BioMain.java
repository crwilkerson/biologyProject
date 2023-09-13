import java.util.Scanner;
public class BioMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BioFacts b = new BioFacts();
        
        System.out.println("Hello everyone! My name is Lok.");
        System.out.println("I'm currently being ran by 1s and 0s in a Java program built by my dad, Chase!");
        System.out.println("What fact number would you like to see? Answer 1-6.");
        int fact_num = sc.nextInt();
        
        if (fact_num == 1){
            System.out.println("- You'd like to know what Information Security is? I'm glad you asked.");
            System.out.println("- Fact #1 is: " + b.getFact1());
            System.out.println("- Press the green arrow at the top to start the program again! Try another number :) ");
        }
        
        if (fact_num == 2){
            System.out.println("- Great question. I can tell you what the components of Information Security are! One moment. -*BZZT*-");
            System.out.println("- Fact #2 is: " + b.getFact2());
            System.out.println("- Press the green arrow at the top to start the program again! Try another number :) ");
        }
        
        if (fact_num == 3){
            System.out.println("- Wonderful! A healthy Information System Security starts with the most important meal of the day- Dinner!");
            System.out.println("- Fact #3 is: " + b.getFact3());
            System.out.println("- Press the green arrow at the top to start the program again! Try another number :) ");
        }
        
        if (fact_num == 4){
            System.out.println("- You chose fact number #4!");
            System.out.println("- Fact #4 is: " + b.getFact4());
            System.out.println("- Press the green arrow at the top to start the program again! Try another number :) ");
        }
        
        if (fact_num == 5){
            System.out.println("- You chose fact number #5!");
            System.out.println("- Fact #5 is: " + b.getFact5());
            System.out.println("- Press the green arrow at the top to start the program again! Try another number :) ");
        }
        
        if (fact_num == 6){
            System.out.println("- You chose fact number #6!");
            System.out.println("- Fact #6 is: " + b.getFact6());
            System.out.println("- Press the green arrow at the top to start the program again! Try another number :) ");
        }
        
        if (fact_num > 6){
            System.err.println("ERROR: Please enter a VALID number between 1 and 6. THANK YOU. I LIKE DINOSAURS. THE MONSTER I SAW GOES 'Vrooooo'");
        }
        
        System.out.println("Thank you for using my built-in dictionary program. Have you or a loved one been diagnosed with Mesothelioma? Call today.");
        
        
        
        
    }
    
}
