import java.util.Scanner;
public class Experience extends Candidate {
     private int yearExperience;
    private String ProSkill;

    public Experience() {}

    public Experience(String id, String firstName, String lastName, int birthDate,
            String address, String phone, String email, int type, int yearExperience, String ProSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                type);
        this.yearExperience = yearExperience;
        this.ProSkill = ProSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
            this.yearExperience = yearExperience;   
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
     @Override
    public void input(){
        Scanner sc= new Scanner(System.in);
        super.input();
        while(true){
            try{
                System.out.print("yearExperience: ");
                int a= Integer.parseInt(sc.nextLine());
                if(a>=0&&a<=100){
                    this.yearExperience=a;
                    break;
                } else {
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.print("professionalSkill: ");
        this.ProSkill=sc.nextLine();
        super.setTypeCandidate(0);
    }
     @Override
    public String toString(){
        return super.toString()+" | "+this.getYearExperience()+" | "+this.getProSkill();  
    }

    
    
}
