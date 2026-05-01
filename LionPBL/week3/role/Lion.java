package role;

import policy.LionPolicy;

import java.util.Scanner;

public  class  Lion extends total {
  String job;
  int StudentNumber;


  public Lion(String name, String Major, int number, String part) {
    super(name, Major,number, part);
    job = "아기사자";
    Scanner sc = new Scanner(System.in);
    System.out.print("학번 : ");
    StudentNumber = sc.nextInt();
  }
  public LionPolicy getLionPolicy() {
    return new LionPolicy();
  }

  @Override
  public void Print() {
    System.out.println("===== 결과 출력 =====");
    System.out.println("역할 : " + job);
    System.out.println("이름 : "+getName()+ " | 전공 : "+getMajor()+" | 기수 : "+getNumber()+ " | 파트 : "+getPart());
    System.out.println("학번 : "+ StudentNumber);
    System.out.print("과제 제출 가능 여부 : " + (getLionPolicy().Policy() ? "가능" : "불가능"));
  }


}
