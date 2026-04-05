package Week2.Package1;


import java.util.Scanner;

public class step2 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("이름: ");
        String name = input.nextLine();
        System.out.print("전공: ");
        String major = input.nextLine();
        System.out.print("기수: ");
        int generation = input.nextInt();
        input.nextLine();
        // 모든 입력 끝

        Lion lion = new Lion(name,major,generation);
        System.out.println("입력값 검증을 진행합니다.");
        if(lion.isverified())
            System.out.println("유효성 통과");
        else
            System.out.println("유효성 통과 실패");
    }
}