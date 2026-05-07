package role;

import policy.StaffAssignmentPolicy;

public class Staff extends Member{
    private String position;

    public Staff(String name, String major, int generation, String part, String position) {
        // 부모 생성자 호출 시, 운영진 전용 정책 객체를 주입
        super(name, major, generation, part, new StaffAssignmentPolicy());
        this.position = position;
    }

    public void printInfo() {
        System.out.printf("[운영진] %s, 직책: %s%n", getBaseInfo(), position);
        System.out.println("과제 제출 가능 여부: " + (canSubmitAssignment() ? "가능" : "불가능"));
    }
}
