package Week3;

import Week3.role.GraduateStudentLion;
import Week3.role.Lion;
import Week3.role.OperatorLion;
import Week3.role.StudentLion;

public class Main {
    public static void main(String[] args) {
        Lion studentLion =  new StudentLion();
        Lion operatorLion =  new OperatorLion();
        Lion graduateStudentLion = new GraduateStudentLion();

        System.out.println("어흥이들 정보 입력");
        studentLion.inputLionInformation();
        operatorLion.inputLionInformation();
        graduateStudentLion.inputLionInformation();

        System.out.println("어흥이들 정보 생성");
        studentLion.showInfo();
        operatorLion.showInfo();
        graduateStudentLion.showInfo();
    }
}
