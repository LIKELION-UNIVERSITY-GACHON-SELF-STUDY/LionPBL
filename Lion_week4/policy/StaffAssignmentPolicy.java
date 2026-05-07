package policy;

// 운영진용 과제 제출 정책: 제출 불가능
public class StaffAssignmentPolicy implements AssignmentPolicy{
    public boolean canSubmit() {
        return false;
    }
}
