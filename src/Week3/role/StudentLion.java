package Week3.role;

import Week3.policy.OperatorLionPolicy;
import Week3.policy.Policy;


public class StudentLion extends Lion {

    final static String who = "학생사자";
    int schoolNumber;
    Policy lionPolicy = getPolicy();
    public void seePolicy () {
        System.out.println("과제 제출 여부"+this.lionPolicy.isPolicyAllowed(generation));
    }


    @Override
    public Policy getPolicy() {
        return new OperatorLionPolicy();
    }

    public void inputLionInformation(){
        String lionName;
        String lionMajor, lionPart;
        int lionGen,lionSchoolNum;


        System.out.print(who+" 이름: ");
        lionName = input.nextLine();

        System.out.print(who+" 전공: ");
        lionMajor = input.nextLine();

        System.out.print(who+" 기수: ");
        lionGen = input.nextInt();
        input.nextLine(); // 공백 제거용

        System.out.print(who+" 학번: ");
        lionSchoolNum = input.nextInt();
        input.nextLine(); // 공백 제거용

        System.out.print(who+" 파트: ");
        lionPart = input.nextLine();

        checkInformation(lionName,lionMajor,lionGen, lionSchoolNum, lionPart);
    }

    public void checkInformation(String lionName, String lionMajor, int lionGen, int lionSchoolNum, String lionPart) {
        System.out.println("검증을 진행합니다.");
        if (lionMajor.isBlank() || lionName.isBlank() || lionGen < 1 ) {
            System.out.println("[X] 잘못된 아기사자 정보입니다.");
        }
        else {
            System.out.println("객체 상태 정상 확인.");

            this.name = lionName;
            this.major = lionMajor;
            this.generation = lionGen;
            this.schoolNumber = lionSchoolNum;
            this.part = lionPart;

//            showInfo();
        }
    }

    public void showInfo() {
        System.out.println(who+" 정보 출력");
        System.out.println("이름: "+ name+" | 전공 "+major+" | 기수: "+ generation + " | 파트: " + part + " | 학번: "+ schoolNumber);
        seePolicy();
    }

}
