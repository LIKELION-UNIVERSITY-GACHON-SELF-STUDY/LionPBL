package step3;

import lion_step_1_2.Lion;

import java.util.Scanner;

public class step3 {
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

    System.out.println("Step 3-1. pbulic 필드 접근을 시도합니다. ");
    System.out.println("name 필드 값을 변경합니다. ");

    lion.name = "홍길동";
    if(lion.name != name){
      System.out.println("pulbic 필드 접근 성공");
      System.out.println("아기사자 정보를 출력합니다. ");
      lion.print();
    }

//    System.out.println("major 필드 값을 변경합니다. ");

//    lion.major = scanner.nextLine();
//    if(lion.major != name){
//      System.out.println("pulbic 필드 접근 성공");
//      System.out.println("아기사자 정보를 출력합니다. ");
//      lion.print();
//    }

//    System.out.println("grade 필드 값을 변경합니다. ");
//
//    lion.grade = scanner.nextLine();
//    if(lion.grade != name){
//      System.out.println("pulbic 필드 접근 성공");
//      System.out.println("아기사자 정보를 출력합니다. ");
//      lion.print();
//    }

  }
}
