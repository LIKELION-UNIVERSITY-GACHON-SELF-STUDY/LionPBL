package Week3.role;

import Week3.policy.Policy;
import Week3.policy.StudentLionPolicy;

public class OperatorLion extends Lion{

    final static String who = "운영사자";
    String role;
    Policy lionPolicy = getPolicy();
    public void seePolicy () {
        System.out.println("과제 제출 여부"+lionPolicy.isPolicyAllowed(generation));
    }

    public void inputLionInformation(){
        String lionName;
        String lionMajor, lionPart,lionPosition;
        int lionGen;


        System.out.print(who+" 이름: ");
        lionName = input.nextLine();

        System.out.print(who+" 전공: ");
        lionMajor = input.nextLine();

        System.out.print(who+" 기수: ");
        lionGen = input.nextInt();
        input.nextLine(); // 공백 제거용

        System.out.print(who+" 파트: ");
        lionPart = input.nextLine();

        System.out.print(who+" 직책: ");
        lionPosition = input.nextLine();




        checkInformation(lionName,lionMajor,lionGen,lionPart,lionPosition);

//        showInfo();
    }

    public void checkInformation(String lionName, String lionMajor, int lionGen, String lionPart, String lionPosition) {
        System.out.println("검증을 진행합니다.");
        if (lionMajor.isBlank() || lionName.isBlank() || lionGen < 1 ) {
            System.out.println("[X] 잘못된 아기사자 정보입니다.");
        }
        else {
            System.out.println("객체 상태 정상 확인.");
//            Lion babyLion = new Lion(lionName, lionMajor, lionGen);
            this.name = lionName;
            this.major = lionMajor;
            this.generation = lionGen;
            this.part = lionPart;
            this.role = lionPosition;


        }
    }

    public void showInfo() {
        System.out.println(who+" 정보 출력");
        System.out.println("이름: "+ name+" | 전공 "+major+" | 기수: "+ generation + " | 파트: " + part + " | 직책: "+ role);
        seePolicy();
    }


    @Override
    public Policy getPolicy() {
        return new StudentLionPolicy();
    }
}
