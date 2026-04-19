package Week2.Package1;

public class Lion {
    public Lion (String name, String major, int generation) { // 생성자
        this.name = name;
        this.major = major;
        this.generation = generation;
    }
    public String name;
    String major;
    int generation;


    public boolean isverified() {
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

}