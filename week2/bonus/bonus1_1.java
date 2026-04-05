package bonus;

import lion_step_1_2.Lion;

import java.util.Scanner;

public class bonus1_1 {


  public static void main(String[] args) {
    boolean finish = true;
    Scanner scanner = new Scanner(System.in);
    System.out.println("이름을 입력해주세요: ");
    String name = scanner.nextLine();
    System.out.println("전공을 입력해주세요: ");
    String major = scanner.nextLine();
    System.out.println("기수를 입력해주세요: ");
    int grade = scanner.nextInt();
    scanner.nextLine(); //nextInt()로 인해 남아있는 버퍼를 청소해줌

    bonus1_lion bonus1_lion = new bonus1_lion(name, major, grade);
    System.out.println("유효한 값으로 아기사자 객체가 생성되었습니다. ");
    System.out.println("이름: " + name + " | 전공: " + major + " | 기수: " + grade);

    while (true) {
      System.out.println("아기사자 정보를 수정하시겠습니까? (네 / 아니요)");
      String answer = scanner.nextLine();
      finish = true;
      if (answer.equals("네")){
        while (finish) {
          System.out.println("수정할 정보를 입력해주세요. (이름 / 전공 / 기수)");
          String what = scanner.nextLine();
          System.out.println(what + " 변경 요청을 받았습니다. ");
          switch (what) {
            case "이름": {
              System.out.println("변경할 이름을 입력해주세요. ");
              name = scanner.nextLine();
              bonus1_lion.check_name(name);
              System.out.println(what + " 성공적으로 변경되었습니다. ");
              System.out.println("이름: " + name + " | 전공: " + major + " | 기수: " + grade);
              System.out.println("--=====================================================");
              break;
            }
            case "전공": {
              System.out.println("변경할 이름을 입력해주세요. ");
              major = scanner.nextLine();
              bonus1_lion.check_name(major);
              System.out.println(what + " 성공적으로 변경되었습니다. ");
              System.out.println("이름: " + name + " | 전공: " + major + " | 기수: " + grade);
              System.out.println("--=====================================================");
              break;
            }
            case "기수": {
              System.out.println("변경할 기수를 입력해주세요. ");
              grade = scanner.nextInt();
              scanner.nextLine();
              bonus1_lion.check_grade(grade);
              System.out.println(what + " 성공적으로 변경되었습니다. ");
              System.out.println("이름: " + name + " | 전공: " + major + " | 기수: " + grade);
              System.out.println("--=====================================================");
              break;
            }
            default: {
              System.out.println("세 개 중에 하나를 골라주세요. ");
            }
          }
          finish = false;
        }
      } else if (answer.equals("아니요")){
        System.out.println("아기사자 정보 수정을 종료합니다. ");
        break;
      }
    }
    System.out.println("프로그램을 종료합니다. ");
  }
}


