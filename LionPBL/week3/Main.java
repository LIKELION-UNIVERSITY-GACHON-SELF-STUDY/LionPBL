import policy.LionPolicy;
import policy.StaffPolicy;
import role.Lion;
import role.Staff;
import role.total;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    LionPolicy lionPolicy = new LionPolicy();
    StaffPolicy staffPolicy = new StaffPolicy();
    Scanner sc = new Scanner(System.in);

    System.out.println("===== 아기사자 정보 입력 =====");
    System.out.print("이름 : ");
    String name = sc.nextLine();
    System.out.print("전공 : ");
    String Major = sc.nextLine();
    System.out.print("기수 : ");
    int NUmber = Integer.parseInt(sc.nextLine());
    System.out.print("파트 : ");
    String part = sc.nextLine();

    total lion = new Lion(name,Major,NUmber,part);

    System.out.println("===== 운영진 정보 입력 =====");
    System.out.print("이름 : ");
    String sName = sc.nextLine();
    System.out.print("전공 : ");
    String sMajor = sc.nextLine();
    System.out.print("기수 : ");
    int sNUmber = Integer.parseInt(sc.nextLine());
    System.out.print("파트 : ");
    String sPart = sc.nextLine();

    total staff = new Staff(sName,sMajor,sNUmber, sPart);

    lion.Print();
    staff.Print();

  }
}
