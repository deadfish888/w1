
import java.util.Scanner;
public class Intern extends Candidate {
    private String Majors;
    private String Semester;
    private String University_name;

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String University_name) {
        this.University_name = University_name;
    }
    
    public Intern(){
        
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Majors: ");
        this.Majors=sc.nextLine();
        System.out.print("Semester: ");
        this.Semester=sc.nextLine();
        System.out.print("University_name: ");
        this.University_name=sc.nextLine();
        super.setTypeCandidate(2);
    }
    public String toString(){
        return super.toString()+" | "+this.getMajors()+" | "+this.getSemester()+" | "+this.getUniversity_name();
    }
}
