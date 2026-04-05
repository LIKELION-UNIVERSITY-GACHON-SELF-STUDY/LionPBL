package lion_step_1_2;

import java.util.Scanner;

public class step2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("이름을 입력해주세요: ");
    String name = scanner.nextLine();
    System.out.println("전공을 입력해주세요: ");
    String major = scanner.nextLine();
    System.out.println("기수를 입력해주세요: ");
    int grade = scanner.nextInt();

    Lion lion = new Lion(name, major, grade);

    System.out.println("객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다. ");
    lion.check();
    lion.print();

  }

}
