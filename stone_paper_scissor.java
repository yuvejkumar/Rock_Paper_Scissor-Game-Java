import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// The game is played by a user and System
public class stone_paper_scissor {
    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random(); // System will select randomly (rock paper and scissor)
        return list.get(rand.nextInt(list.size()));
    }
    static boolean isNumber(String s) { // Creating a fn to check whether the input is numeric 
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("welcome to stone paper scissor game");
        System.out.println(" Enter 1 : Stone ");
        System.out.println(" Enter 2 : Paper");
        System.out.println(" Enter 3 : scissor");
        String x="Stone";
        String y="Paper";
        String z="scissor";
        System.out.print("----> ");
        while (true){
        String s=sc.next();
        if (isNumber(s)){ 
            int n=Integer.parseInt(s);
            if (n>3 || n<1){  // if number if out of option case
                System.out.println("you have entered invalid option");
            }
            else{
                ArrayList<Integer> l=new ArrayList<>();
                for (int i=1;i<=3;i++){  // Creating an options for system
                    l.add(i);
                }
                stone_paper_scissor obj=new stone_paper_scissor();
                int cmpt= obj.getRandomElement(l);   // system selecting random option
                System.out.println("_______________________");
                if (cmpt==n){
                    if (n==1){
                        System.out.println("system selected : Stone");
                    }
                    else if (n==2){
                        System.out.println("system selected : Paper");
                    }
                    else {
                        System.out.println("system selected : scissor");
                    }
                    System.out.println("|      It's a tie         |");
                }
                // checking with user input and printing the result
                else if (cmpt==1 && n==2){
                    System.out.println("system selected : "+x);
                    System.out.println("| you are the winner |");
                }
                else if (cmpt==1 && n==3){
                    System.out.println("system selected : "+x);
                    System.out.println("| computer won the game |");
                }
                else if (cmpt==2 && n==1){
                    System.out.println("system selected : "+y);
                    System.out.println("| computer won the game |");
                }
                else if (cmpt ==2 && n==3){
                    System.out.println("system selected : "+y);
                    System.out.println("| you are the winner |");
                }
                else if (cmpt == 3 && n==1){
                    System.out.println("system selected :"+z);
                    System.out.println("| you are the winner |");
                }
                else if (cmpt ==3 && n==2){
                    System.out.println("system selected :"+z);
                    System.out.println("| compter won the game |");
                }
                System.out.println("----------------------");
                System.out.println(" ");
                System.out.println("");
                System.out.println("welcome to stone paper scissor game");
                System.out.println(" Enter 1 : Stone ");
                System.out.println(" Enter 2 : Paper");
                System.out.println(" Enter 3 : scissor");
                System.out.print("----> ");
            }
        
        }
        else{
            System.out.println("Enter only positive Integer");
        }
        //sc.close();
        // loop continues
    }
    
    }
}
