package policy;

// 아기사자용 과제 제출 정책: 제출 가능
public class LionAssignmentPolicy implements AssignmentPolicy{
    public boolean canSubmit() {
        return true;
    }
}
