package package1;

import java.util.Scanner;

public class step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        String name;
        String major;
        int num;
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("전공을 입력하세요 : ");
        major = sc.nextLine();
        System.out.print("기수를 입력하세요 : ");
        num = Integer.parseInt(sc.nextLine());
        System.out.println("입력값 검증을 실행합니다");
        if(name.trim().isEmpty() ){
            System.out.print("이름이 비어 있습니다");
            flag = false;
        }if(major.trim().isEmpty() ){
            System.out.println("전공이 비어 있습니다");
            flag = false;
        }if(num < 0 ){
            System.out.print("기수가 올바르지 않습니다");
            flag = false;
        }
        if(flag == true){
            System.out.print("입력값 검증을 통과하여 아기 사자 객체 생성을 진행합니디.");
            Lion lion = new Lion(name,major,num);
            System.out.println("아기사자 객체를 성공적으로 생성하였습니다.");
            lion.print();
        }


    }

}