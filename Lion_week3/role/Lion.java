package role;

import policy.LionAssignmentPolicy;

public class Lion extends Member{
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        // 부모 생성자 호출 시, 아기사자 전용 정책 객체를 주입
        super(name, major, generation, part, new LionAssignmentPolicy());
        this.studentId = studentId;
    }

    public void printInfo() {
        System.out.printf("[아기사자] %s, 학번: %s%n", getBaseInfo(), studentId);
        System.out.println("과제 제출 가능 여부: " + (canSubmitAssignment() ? "가능" : "불가능"));
    }


}
