/*
    Joh Olan S. Gomez
    Java File Handling
    November 27, 2021
*/

import java.io.*;           //import java.io package - file handling
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO{

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        ArrayList<Voter> voterList = new ArrayList<>();
        ArrayList<String> voterSenList= new ArrayList<>();

        int voterCount= 0;
        int senCount= 0;
        String choice;
        
        try{    //exception handling
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));   //BufferedWriter object - place output in output.txt file

            //input voter data
            System.out.println("***************** Voting option selected *****************");
            System.out.print("Enter your full name: ");
            String voterFullName= input.nextLine();
            System.out.print("Enter your age: ");
            int voterAge= input.nextInt();
            input.nextLine();   //take the next line not taken by nextint

            if(voterAge>=18 && voterAge<=150){  //assuming oldest age is 150

                System.out.println("\nQualified voter!\n");
                System.out.print("Enter the name of your chosen president: ");
                String voterPres= input.nextLine();
                System.out.print("Enter the name of your chosen vice president: ");
                String voterVP= input.nextLine();
                do{
                    
                    System.out.println("Enter the name of your chosen senator: ");
                    String sen= input.nextLine();
                    voterSenList.add(sen);
                    senCount++;
                    if(senCount==5){    //5- for testing
                        break;
                    }

                    System.out.print("Vote another? (Y - Yes|N - No): ");
                    choice= input.nextLine();

                } while((!choice.equalsIgnoreCase("n")));

                //add voter in array list
                voterList.add(new Voter(voterFullName, voterAge, voterPres, voterVP, voterSenList));
                voterCount++;

                //print voter
                for(Voter print: voterList){
                    System.out.println("Data entered: \n" + print.toString());
                    writer.write(voterCount + "\n" + print.toString());
                }

                //empty the voterSenList array list to make space to the next voter
                voterSenList.clear();

            }
            else{
                System.out.println("Voter is not yet allowed to vote!");
            }

            writer.close(); //close the file writer

        } catch(IOException e){
            e.printStackTrace();    //print stack trace when exception happens
        }
    }

}