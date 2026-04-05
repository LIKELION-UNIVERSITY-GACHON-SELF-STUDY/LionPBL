package package1;

import java.util.Scanner;

  public class step2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("아기사자 이름을 입력해주세요.");
      String name = sc.nextLine();

      System.out.println("전공을 입력해주세요.");
      String major = sc.nextLine();

      System.out.println("기수를 입력해주세요.");
      int grade = sc.nextInt();

      Lion lion = new Lion(name, major, grade);
      System.out.println("객체 생성이 완료되었습니다. 아기사자 객체 상태를 확인합니다.");
      int result = lion.check();

      if (result == 1) {
        System.out.println("[오류] 이름이 비어있습니다.");
      } else if (result == 2) {
          System.out.println("[오류] 전공이 비어있습니다.");
      } else if (result == 3) {
          System.out.println("[오류] 기수는 1 이상이어야 합니다.");
      } else if(result==4) {
          System.out.println("아기사자 객체가 자신의 상태를 정상으로 판단했습니다.");
          System.out.println("아기사자 정보를 출력합니다.");
          System.out.println("이름: "+lion.name+"|"+"전공: "+lion.major+"|"+"기수: "+lion.grade);
      }
    }
  }
