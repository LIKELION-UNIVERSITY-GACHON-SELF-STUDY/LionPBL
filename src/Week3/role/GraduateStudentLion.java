package Week3.role;

import Week3.policy.GraduateStudentLionPolicy;
import Week3.policy.Policy;


public class GraduateStudentLion extends Lion {

    String nowPart;
    Policy lionPolicy = getPolicy();
    final static String who = "졸업사자";
    public void seePolicy () {
        System.out.println("과제 제출 여부"+this.lionPolicy.isPolicyAllowed(generation));
    }


    @Override
    public Policy getPolicy() {
        return new GraduateStudentLionPolicy();
    }

    public void inputLionInformation(){
        String lionName;
        String lionMajor, lionPart, lionNowPart;
        int lionGen;


        System.out.print(who+" 이름: ");
        lionName = input.nextLine();

        System.out.print(who+" 전공: ");
        lionMajor = input.nextLine();

        System.out.print(who+" 기수: ");
        lionGen = input.nextInt();
        input.nextLine(); // 공백 제거용

        System.out.print(who+" 현재 직무: ");
        lionNowPart = input.nextLine();


        System.out.print(who+" 파트: ");
        lionPart = input.nextLine();

        checkInformation(lionName,lionMajor,lionGen, lionNowPart, lionPart);

    }

    public void checkInformation(String lionName, String lionMajor, int lionGen, String lionNowPart, String lionPart) {
        System.out.println("검증을 진행합니다.");
        if (lionMajor.isBlank() || lionName.isBlank() || lionGen < 1 ) {
            System.out.println("[X] 잘못된 아기사자 정보입니다.");
        }
        else {
            System.out.println("객체 상태 정상 확인.");

            this.name = lionName;
            this.major = lionMajor;
            this.generation = lionGen;
            this.nowPart = lionNowPart;
            this.part = lionPart;

//            showInfo();
        }
    }

    public void showInfo() {
        System.out.println(who+"정보 출력");
        System.out.println("이름: "+ name+" | 전공 "+major+" | 기수: "+ generation + " | 파트: " + part + " | 현재 직무: "+ nowPart);
        seePolicy();
    }

}
