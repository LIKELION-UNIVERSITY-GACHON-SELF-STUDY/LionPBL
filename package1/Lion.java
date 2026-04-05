package package1;
public class Lion{
  public String name;
  String major;
  private int grade;

  public Lion(String name, String major, int grade){
    this.name= name;
    this.major= major;
    this.grade=grade;
  }

  public int check(){
    if(name.isEmpty()){

      return 1;
    }
    else if(major.isEmpty()){

      return 2;
    }
    else if(grade<1){

      return 3;
    }
    else {
      return 4;
    }
  }
}