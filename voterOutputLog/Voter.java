import java.util.ArrayList;

public class Voter {

    private String votersFullName;
    private int votersAge;
    private String chosenPres;
    private String chosenVP;
    private ArrayList<String> chosenSenators= new ArrayList<>(); 
    
    //constructor
    public Voter(String vFullName, int vAge, String vChosenPres, String vChosenVP, ArrayList<String> vChosenSen) {
        this.setVotersFullName(vFullName);
        this.setVotersAge(vAge);
        this.setChosenPres(vChosenPres);
        this.setChosenVP(vChosenVP);
        this.setChosenSenators(vChosenSen);
    }

    public String getVotersFullName() {
        return votersFullName;
    }

    public void setVotersFullName(String votersFullName) {
        this.votersFullName = votersFullName;
    }

    public int getVotersAge() {
        return votersAge;
    }

    public void setVotersAge(int votersAge) {
        this.votersAge = votersAge;
    }

    public String getChosenPres(){
        return chosenPres;
    }

    public void setChosenPres(String chosenPres){
        this.chosenPres= chosenPres;
    }

    public String getChosenVP(){
        return chosenVP;
    }

    public void setChosenVP(String chosenVP){
        this.chosenVP= chosenVP;
    }

    public ArrayList<String> getChosenSenators(){
        return chosenSenators;
    }

    public void setChosenSenators(ArrayList<String> chosenSenators){
        this.chosenSenators= chosenSenators;
    }

    public String toString(){

        String listString= String.join(", ", this.getChosenSenators()); //convert arraylist to string

        return String.format("Name: %s\nAge: %s\nPresident: %s\nVice President: %s\nSenators: %s\n", 
                                this.getVotersFullName(), this.getVotersAge(), this.getChosenPres(), this.getChosenVP(), listString);
    }

}
