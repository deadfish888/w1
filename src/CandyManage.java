
import java.util.ArrayList;
import java.util.List;

public class CandyManage {
  public final List<Candidate> list=new ArrayList<>();
  int numExp;
  int numFres;
  int numInter;
          
  public CandyManage(){
    numExp=4;numFres=0;numInter=0;
    list.add(new Experience("01","Stefan","Aelbreacht",1990,"Sao paulo","0940394357","eva@asante.com",0,10,"qwerty"));
    list.add(new Experience("02","Eva","Aguirre",1999,"None","0123456789","noname@non.com",0,11,"qwerty"));
    list.add(new Experience("03","Maria","Ahlgren Maria",1992,"none","0123456789","noname@non.com",0,12,"qwerty"));
    list.add(new Experience("04","Adeleva","Antonio",1993,"none","0123987654","noname@non.com",0,15,"proscras"));
  }
  
  public int check(String id){
    for(int i=0;i<list.size();i++){
      if(list.get(i).getId().equals(id)) return 0;
    }   
    return 1;
  }
  public void create(int type){
    switch(type){
      case 0:
        Experience a= new Experience();
        a.input();
        if(check(a.getId())==1){
              list.add(a);
              numExp++;
              System.out.println("Success!");
          } else {
              System.out.println("This candidate has exist !");
          }
        break;    
    case 1:
      Fresher b= new Fresher();
      b.input();
      if(check(b.getId())==1){
            list.add(b);
            numFres++;
            System.out.println("Success!");
        } else {
            System.out.println("This candidate has exist !");
        }
        break;
    case 2: 
      Intern c= new Intern();
      c.input();
      if(check(c.getId())==1){
            list.add(c);
            numInter++;
            System.out.println("Success!");
        } else {
            System.out.println("This candidate has exist !");
        }
      break;
    }
  }
  
  public void search(String name,int type){
    int count=0;
    switch(type){
    case 0:    
      for(var i:list){
        if(i instanceof Experience)
          if(i.getFirstName().toLowerCase().contains(name.toLowerCase())||i.getLastName().toLowerCase().contains(name.toLowerCase())){
              System.out.println(((Experience)i));
          } else {
              count++;
          }
        }
      if(count == numExp){
          System.out.println("not found this candidate");
      }
      break;
    case 1:
      for(var i:list){
        if(i instanceof Fresher)
          if(i.getFirstName().toLowerCase().contains(name.toLowerCase())||i.getLastName().toLowerCase().contains(name.toLowerCase())){
              System.out.println(((Fresher)i));
          } else {
              count++;
          }
        }
      if(count == numFres){
          System.out.println("not found this candidate");
      }
      break;
    case 2:
      for(var i:list){
        if(i instanceof Intern)
          if(i.getFirstName().toLowerCase().contains(name.toLowerCase())||i.getLastName().toLowerCase().contains(name.toLowerCase())){
              System.out.println(((Intern)i));
          } else {
              count++;
          }
      }
      if(count == numInter){
          System.out.println("not found this candidate");
      }
    }
  }
}
