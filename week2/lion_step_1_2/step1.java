package lion_step_1_2;

import java.util.Scanner;



public class step1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("이름을 입력해주세요: ");
    String name = scanner.nextLine();
    System.out.println("전공을 입력해주세요: ");
    String major = scanner.nextLine();
    System.out.println("기수를 입력해주세요: ");
    int grade = scanner.nextInt();


    System.out.println("입력값 검증을 진행합니다. ");

    if (name == null || name.isBlank()) {
      System.out.println("이름은 비어 있을 수 없습니다. ");
      System.exit(0);
    } else if (major == null || major.isBlank()) {
      System.out.println("전공은 비어 있을 수 없습니다. ");
      System.exit(0);
    } else if (grade < 1) {
      System.out.println("기수는 1 미만일 수 없습니다. ");
      System.exit(0);
    }
    System.out.println("입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다. ");


    Lion lion = new Lion(name, major, grade);

    System.out.println("아기사자 객체를 성공적으로 생성하였습니다. ");
    System.out.println("아기사자 정보를 출력합니다. ");
    System.out.println("이름: "+ name + " | 전공: " + major + " | 기수: " + grade);

  }
}
