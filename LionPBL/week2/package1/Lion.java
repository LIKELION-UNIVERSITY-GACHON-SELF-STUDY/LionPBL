package package1;

public class Lion {
   public String name;
   private String major;
   int num;

   public Lion(String name, String major, int num){
        this.name = name;
        this.num = num;
        this.major = major;
        System.out.println("객체가 생성 완료되었습니다. 아기사자 객체의 상태를 확인합니.");
        validate(name,major,num);
   }

   public void print(){
     System.out.println("아기사자 정보를 출력합니다.");
      System.out.println("이름 :"+name+"|"+",전공:"+major+"|"+",기수:"+ num +"|");
   }
  public void validate(String name,String major,int num){
    boolean flag = true;
    if(name.trim().isEmpty()){
      System.out.println("이름이 비어 있습니다");
      flag = false;
    }else if(major.trim().isEmpty() ){
      System.out.println("전공이 비어 있습니다");
      flag = false;
    }else if(num < 0 ){
      System.out.println("기수가 올바르지 않습니다");
      flag = false;
    }
    if (flag == true){
      System.out.println("아기사자 객체가 자신 상태를 정상으 판단했습니다.");
      print();
    }else{
      System.out.println("잘못된 아기사자 정보입니다.");
    }

  }
}
