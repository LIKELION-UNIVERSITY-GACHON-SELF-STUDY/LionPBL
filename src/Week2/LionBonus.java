package Week2;

public class LionBonus {
    public LionBonus (String name, String major, int generation) {
        if(isverified(name,major,generation)) {
            this.name = name;
            this.major = major;
            this.generation = generation;
            System.out.println("유효한 값으로 아기사자 객체가 생성되었습니다.");
            showField();
        }
        else {
            System.out.println("유효하지 않은 값으로 아기사자 객체가 생성되었습니다. 필드값을 수정해주세요.");
        }
    }


    private String name;
    private String major;
    private int generation;


    public boolean isverified(String name, String major, int generation) {
        if( name.isBlank()) {
            System.out.println("이름이 비어있음");
            return false;
        }
        else if(major.isBlank()) {
            System.out.println("전공이 비어있음");
            return false;
        } else if (generation < 1) {
            System.out.println("기수가 유효하지 않음");
            return false;
        }
        return true;
    }
    public void showField() {
        System.out.printf("이름: %s | 전공: %s | 기수: %d \n",this.name,this.major,this.generation);

    }
    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
    public int getGeneration() {
        return generation;
    }

    public void setName(String name) {
        if(!name.isBlank()) {
            this.name = name;
            System.out.println("성공적으로 변경했습니다.");
        }
        System.out.println("유효하지 않은 값입니다.");
    }

    public void setMajor(String major) {
        if(!major.isBlank()) {
            this.major = major;
            System.out.println("성공적으로 변경했습니다.");
            return;
        }
        System.out.println("유효하지 않은 값입니다.");
    }

    public void setGeneration(int generation) {
        if(!(generation<1)) {
            this.generation = generation;
            System.out.println("성공적으로 변경했습니다.");
            return;
        }
        System.out.println("유효하지 않은 값입니다.");

    }
}