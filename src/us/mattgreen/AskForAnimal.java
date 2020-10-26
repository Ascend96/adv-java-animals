package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class AskForAnimal implements Talkable{

    Scanner scanner = new Scanner(System.in);


    @Override
    public String talk() {
        System.out.println("Enter what the animal says");
        String input;
        do{
            input = scanner.nextLine();
            if(input.length() <= 2){
                System.out.println("Invalid response, must be more than 2 characters please try again.");
            }
        } while(input.length() <= 2);
        return input;
    }

    @Override
    public String getName() {
            System.out.println("Enter the type of animal");
            String input;
           do{ input = scanner.nextLine();
           if(input.length() < 3){
               System.out.println("Invalid response, must be more than 2 characters please try again");
           }
           }
           while(input.length() < 3);


            return input;

    }

    public void AddToList(Talkable t, ArrayList<Talkable> list){
        list.add(t);
    }

}
