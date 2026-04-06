package package1;

import java.util.Scanner;

public class step2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    String major;
    int num;
    System.out.print("이름을 입력하세요 : ");
    name = sc.nextLine();
    System.out.print("전공을 입력하세요 : ");
    major = sc.nextLine();
    System.out.print("기수를 입력하세요 : ");
    num = Integer.parseInt(sc.nextLine());
    Lion lion = new Lion(name,major, num);


  }
}