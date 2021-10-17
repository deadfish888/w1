
import java.util.ArrayList;
import java.util.List;

public class CandyManage {
  public final List<Candidate> list=new ArrayList<>();
  int numExp;
  int numFres;
  int numInter;
          
  public CandyManage(){
    numExp=0;numFres=0;numInter=0;
  }
  
  public int check(String id){
    for(int i=0;i<list.size();i++){
      if(list.get(i).getId().equalsIgnoreCase(id)) return 0;
    }   
    return 1;
  }
  public void create(int type){
    if (type==0){  
      Experience a= new Experience();
      a.input();
      if(check(a.getId())==1){
            list.add(a);
            numExp++;
            System.out.println("Success!");
        } else {
            System.out.println("This candidate has exist !");
        }
    }    
    if (type==1){  
      Fresher b= new Fresher();
      b.input();
      if(check(b.getId())==1){
            list.add(b);
            numFres++;
            System.out.println("Success!");
        } else {
            System.out.println("This candidate has exist !");
        }
    }
    if (type==2){  
      Intern c= new Intern();
      c.input();
      if(check(c.getId())==1){
            list.add(c);
            numInter++;
            System.out.println("Success!");
        } else {
            System.out.println("This candidate has exist !");
        }
    }
  }
  
  public void search(String name,int type){
    if (type==0){    
      int count =0;
      for(int i=0;i<list.size();i++){
        if (list.get(i).getTypeCandidate()==0){
          if(list.get(i).getFirstName().toLowerCase().contains(name.toLowerCase())||list.get(i).getLastName().toLowerCase().contains(name.toLowerCase())){
              System.out.println(((Experience)list.get(i)));
          } else {
              count++;
          }
        }
      }
      if(count == numExp){
          System.out.println("not found this candidate");
      }
    }
    if (type==1){    
      int count =0;
      for(int i=0;i<list.size();i++){
        if (list.get(i).getTypeCandidate()==1){
          if(list.get(i).getFirstName().toLowerCase().contains(name.toLowerCase())||list.get(i).getLastName().toLowerCase().contains(name.toLowerCase())){
              System.out.println(((Fresher)list.get(i)));
          } else {
              count++;
          }
        }
      }
      if(count == numFres){
          System.out.println("not found this candidate");
      }
    }
    if (type==2){    
      int count =0;
      for(int i=0;i<list.size();i++){
        if (list.get(i).getTypeCandidate()==2){
          if(list.get(i).getFirstName().toLowerCase().contains(name.toLowerCase())||list.get(i).getLastName().toLowerCase().contains(name.toLowerCase())){
              System.out.println(((Intern)list.get(i)));
          } else {
              count++;
          }
        }
      }
      if(count == numInter){
          System.out.println("not found this candidate");
      }
    }
  }
}
