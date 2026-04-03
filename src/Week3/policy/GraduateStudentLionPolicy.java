package Week3.policy;

public class GraduateStudentLionPolicy implements Policy{
    @Override
    public boolean isPolicyAllowed(int generation) {
        return generation >=14;
    }
}