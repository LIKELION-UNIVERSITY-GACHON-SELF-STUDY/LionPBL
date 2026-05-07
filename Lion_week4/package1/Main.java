package package1;

import role.Lion;
import role.Member;
import role.Staff;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // [Step 1] 전체 명단을 관리할 List
        List<Member> memberList = new ArrayList<>();
        boolean run = true;

        while (run) {
            System.out.println("\n=== [Step 1] 메뉴 ===");
            System.out.println("1.등록 2.전체조회 3.이름검색 4.종료");
            System.out.print("선택: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("역할(1.아기사자 2.운영진), 이름, 전공, 기수, 파트, 기타(학번/직책): ");
                    int type = sc.nextInt();
                    String name = sc.next();
                    String major = sc.next();
                    int gen = sc.nextInt();
                    String part = sc.next();
                    String extra = sc.next();

                    // 중복 이름 체크
                    boolean isDuplicate = false;
                    for (Member m : memberList) {
                        if (m.getName().equals(name)) {
                            isDuplicate = true;
                            break; // 중복을 찾으면 더 이상 반복할 필요 없음
                        }
                    }

                    if (isDuplicate) {
                        System.out.println("❌ 등록 거부: 이미 존재하는 이름입니다.");
                    } else {
                        Member newMember = (type == 1) ?
                            new Lion(name, major, gen, part, extra) :
                            new Staff(name, major, gen, part, extra);

                        memberList.add(newMember); // 리스트에 추가
                        System.out.println("✅ 등록 성공!");
                    }
                    break;
                case 2:
                    System.out.println("\n--- 전체 명단 ---");
                    if (memberList.isEmpty()) System.out.println("등록된 멤버가 없습니다.");
                    for (Member m : memberList) m.printInfo();
                    break;
                case 3:
                    System.out.print("검색할 이름: ");
                    String searchName = sc.next();
                    boolean found = false;
                    for (Member m : memberList) {
                        if (m.getName().equals(searchName)) {
                            m.printInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("결과가 없습니다.");
                    break;
                case 4:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
        sc.close();
    }
}
