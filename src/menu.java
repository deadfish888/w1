
import java.util.Scanner;

public class menu {
  public static void main(String[] args) {
    CandyManage q=new CandyManage();
    Scanner sc = new Scanner(System.in);
    System.out.println("CANDIDATE MANAGEMENT SYSTEM");
    System.out.println("1. Experience");
    System.out.println("2. Fresher");
    System.out.println("3. Internship");
    System.out.println("4. Searching");
    System.out.println("5. Exit");
    
    int checkpoint=1;
    while(checkpoint==1){
      int choice;
      while(true){
        try{
          System.out.print("Chose case from 1 to 5: ");
          choice=Integer.parseInt(sc.nextLine());
          if(choice>=1&&choice<=5) break;
          else throw new Exception();
        }catch(Exception e){
          System.out.println("Wrong pattern!! Please choose again!!");
        }
      }
      switch (choice){
        case 1:
          q.create(0);
          break;
        case 2:
          q.create(1);
          break;
        case 3:
          q.create(2);
          break;
        case 4:
          System.out.println("===========EXPERIENCE CANDIDATE============");
          for(int i=0;i<q.list.size();i++){
            if (q.list.get(i).getTypeCandidate()==0)
              System.out.println(q.list.get(i).getLastName()+" "+q.list.get(i).getFirstName());
          }
          System.out.println("===========FRESHER CANDIDATE==============");
          for(int i=0;i<q.list.size();i++){
            if (q.list.get(i).getTypeCandidate()==1)
            System.out.println(q.list.get(i).getLastName()+" "+q.list.get(i).getFirstName());
          }
          System.out.println("===========INTERN CANDIDATE==============");
          for(int i=0;i<q.list.size();i++){
            if (q.list.get(i).getTypeCandidate()==2)
            System.out.println(q.list.get(i).getLastName()+" "+q.list.get(i).getFirstName());
          }
          System.out.print("Input Candidate name (First name or Last name): ");
          String name=sc.nextLine().trim();
          int type =-1;
          while(true){
          try{
            System.out.print("Input type of candidate: ");
            type=Integer.parseInt(sc.nextLine());
            if(type>=0&&type<=2)break;
            else throw new Exception();
           }catch(Exception e){
             System.out.println(e);
           }
          }
          q.search(name, type);
          break;
        case 5:
          checkpoint=0;
          break;
      }
    }
  }
}

