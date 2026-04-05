package Week2.Package1;


import java.util.Scanner;

public class step1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("이름: ");
        String name = input.nextLine();
        System.out.print("전공: ");
        String major = input.nextLine();
        System.out.print("기수: ");
        int generation = input.nextInt();
        input.nextLine();
        // 모든 입력 끝
        System.out.println("입력값 검증을 진행합니다.");

        // 유효성 검증
        if( name.isBlank() || major.isBlank() || generation < 1) {
            System.out.println("유효하지 않은 입력값입니다.");
        }
        else { // 문제가 없을 때만 동작
            System.out.println("유효한 입력값입니다.");
            Lion lion = new Lion(name,major,generation);;
        }
    }

}