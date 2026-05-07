import role.Lion;
import role.Member;
import role.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        // 1. 아기사자 정보 입력 및 객체 생성
        System.out.println("--- 아기사자 정보 입력 ---");
        System.out.print("이름, 전공, 기수, 파트, 학번을 공백으로 구분하여 입력: ");
        Member babylion  = new Lion(
            scanner.next(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next()
        );

        // 2. 운영진 정보 입력 및 객체 생성
        System.out.println("\n--- 운영진 정보 입력 ---");
        System.out.print("이름, 전공, 기수, 파트, 직책을 공백으로 구분하여 입력: ");
        Member staff = new Staff(
            scanner.next(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next()
        );

        // 3. 역할별 정보 출력 및 과제 제출 가능 여부 판단
        System.out.println("\n--- 전체 멤버 정보 및 과제 제출 상태 ---");
        babylion.printInfo();
        System.out.println("------------------------------------");
        staff.printInfo();
        System.out.println("------------------------------------");

        scanner.close();
    }



}
