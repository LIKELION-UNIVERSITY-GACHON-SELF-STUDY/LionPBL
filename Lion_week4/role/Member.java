package role;

import policy.AssignmentPolicy;

public abstract class Member {
    // 객체(맴버)가 가지게 될 상태나 정보를 저장할 빈 공간
    // 외부에서 값을 수정하지 못하도록 캡슐화
    private String name;
    private String major;
    private int generation;
    private String part;

    //참조 변수
    private AssignmentPolicy assignmentPolicy;

    // 새로운 맴버가 실제로 시스템에서 태어날 때 딱 한 번 실행되는 초기화 블록
    public Member(String name, String major, int generation, String part, AssignmentPolicy policy) {
        this.name = name; //this. 입력받은 값을 넣는 곳
        this.major = major;
        this.generation = generation;
        this.part = part;
        this.assignmentPolicy = policy;
}

    public String getName() { return name; }
    public String getPart() { return part; }
    //과제를 낼 수 있는지 참조 변수로 받은 리턴값을 리턴
    public boolean canSubmitAssignment() {
        return assignmentPolicy.canSubmit();
    }
    //내 밑으로 들어오는 자식들은 무조건 자기 상황에 맞게 printInfo 직접 완성해라
    public abstract void printInfo();

    // 공통 정보 출력을 위한 출력 도우미 메서드
    protected String getBaseInfo() {
        return String.format("이름: %s, 전공: %s, 기수: %d, 파트: %s", name, major, generation, part);
    }
}

