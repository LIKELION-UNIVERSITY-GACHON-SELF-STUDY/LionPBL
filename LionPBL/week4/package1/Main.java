package package1;
import role.Lion;
import role.Staff;
import role.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
  public static void main(String[] args) {
    boolean bt = true;
    Scanner sc = new Scanner(System.in);
    Lion lion = null;
    Staff staff = null;
    List<Role> lions = new ArrayList<>();
    while(bt) {
      System.out.println("1. 멤버 등록");
      System.out.println("2. 전체 멤버 조회");
      System.out.println("3. 이름으로 검색");
      System.out.println("4. 종료");
      System.out.print("선택 : ");
      int tap = sc.nextInt();
      switch (tap) {
        case 1:
          sc.nextLine();
          boolean bt2 = true;
          System.out.println("===== 멤버 등록 =====");
          System.out.print("역할 선택(1 : 아기사자, 2 : 운영진) : ");
          int job = sc.nextInt();
          sc.nextLine();
          if(job==1) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            for (int i = 0; i < lions.size(); i++) {
              if (lions.get(i).getName().equals(name)) {
                System.out.println("이미 동일한 이름이 있습니다.");
                exit(0);
              }
            }
            System.out.print("전공 : ");
            String Major = sc.nextLine();
            System.out.print("기수 : ");
            int NUmber = Integer.parseInt(sc.nextLine());
            System.out.print("파트 : ");
            String part = sc.nextLine();
            lion = new Lion(job,name, Major, NUmber, part);
            lions.add(lion);
            System.out.println("등록 완료 : "+lion.getName());
          }else if(job==2) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            for(int i = 0; i < lions.size(); i++) {
              if(lions.get(i).getName().equals(name)) {
                System.out.println("이미 동일한 이름이 있습니다.");
                exit(0);
                }
              }
              System.out.print("전공 : ");
              String Major = sc.nextLine();
              System.out.print("기수 : ");
              int NUmber = Integer.parseInt(sc.nextLine());
              System.out.print("파트 : ");
              String part = sc.nextLine();
              staff = new Staff(job,name,Major,NUmber,part);
              lions.add(staff);
          }break;
        case 2:
          for (int i = 0; i < lions.size(); i++) {
            System.out.println(i+1+" .["+lions.get(i).getJob()+"]"+lions.get(i).getName());
          }
          break;
        case 3:
          sc.nextLine();
          System.out.print("검색할 이름 : ");
          String seName = sc.nextLine();
          System.out.print("\n\t[검색 결과]\n");
          for (int i = 0; i < lions.size(); i++) {
            if (lions.get(i).getName().equals(seName)) {
                lions.get(i).Print();
            }
          }
          break;
        case 4:
          exit(1);
      }
    }
  }
}


