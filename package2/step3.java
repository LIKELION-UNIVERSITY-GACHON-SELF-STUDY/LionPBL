package package2;
import package1.Lion;
public class step3{
  public static void main(String[] args){
    System.out.println("아기사자 객체를 생성합니다.");
    Lion lion = new Lion("김멋대", "컴퓨터공학과", 14);
    System.out.println("아기사자 정보를 출력합니다.");
    System.out.println("이름: "+lion.name+"|"+"전공: "+lion.major+"|"+"기수: "+lion.grade);

    System.out.println("public 필드 접근을 시도합니다.");
    System.out.println("name 필드  값을 변경합니다.");
    lion.name="정효림";
    System.out.println("public 필드 접근 성공");
    System.out.println("아기사자 정보를 출력합니다.");
    System.out.println("이름: "+lion.name+"|"+"전공: "+lion.major+"|"+"기수: "+lion.grade);


    /*System.out.println("default 필드 접근을 시도합니다.");
    System.out.println("major 필드  값을 변경합니다.");
    lion.major="인공지능";

     */



    /*System.out.println("private 필드 접근을 시도합니다.");
    System.out.println("grade 필드  값을 변경합니다.");
    lion.grade=4;
    */


  }
}
