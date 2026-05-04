package package2;

import package1.Lion;

import java.util.Scanner;

public class step3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int num;
    String major;
    int Number;
    System.out.print("이름을 입력하세요 : ");
    name = sc.nextLine();
    System.out.print("전공을 입력하세요 : ");
    major = sc.nextLine();
    System.out.print("기수를 입력하세요 : ");
    num = sc.nextInt();
    Lion lions = new Lion(name,major, num);
    String NewName = "홍길동";
    String NewMajor = "컴공";
    int NewNum = 15;
    String NewName = "홍길동";
    String NewMajor = "컴공";
    int NewNum = 15;
    publicMethod(lion,NewName);
    privateMethod(lion,NewMajor);
    defaultMethod(lion,NewNum);


  }
  public static void publicMethod(Lion lion,String NewName){
    System.out.println("Step 3-1. public 필드 접근을 시도합니다");
    lion.name =  NewName;
    System.out.println("public 필드 접근 성공");
    lion.print();
  }
  public static void privateMethod(Lion lion,String NewMajor){
    System.out.println("Step 3-2. private 필드 접근을 시도합니다");
    lion.major =  NewMajor;
    System.out.println("private 필드 접근 성공");
    lion.print();
  }
  public static void defaultMethod(Lion lion,int NewNum){
    System.out.println("Step 3-3. default 필드 접근을 시도합니다");
    lion.num =  NewNum;
    System.out.println("default 필드 접근 성공");
    lion.print();
  }
}
}
