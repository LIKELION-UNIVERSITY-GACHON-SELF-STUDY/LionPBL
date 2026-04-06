package package1;

public class Lion {

    // 맴버 변수
     public String name;
     String major;
     private int th;

    // 생성자
    // 클래스 내부의 정의, 생성자 메서드명은 클래스명과 일치
    // new 연산자와 함께 사용
    public Lion(
        String name,
        String major,
        int th
    ) {
        // this 뒤에 붙은 변수는 클래스 내부에 정의된 맴버변수, 오른쪽 변수는 입력받은 값 의미
        // 3개 필드 모두 초기화 시켜줌
        this.name = name;
        this.major = major;
        this.th = th;


    }

    // 메소드
    public boolean IsValidName(){
        if(!name.isBlank())
            return true;

        System.out.println("이름이 비어 있습니다.");
        return false;
    }
    public boolean IsValidMajor(){
        if(!major.isBlank())
            return true;

        System.out.println("전공이 비어 있습니다.");
        return false;
    }
    public boolean IsValid_th(){
        if(th >= 1)
            return true;

        System.out.println("기수가 1미만입니다");
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getTh() {
        return th;
    }

    public void setTh(int th) {
        this.th = th;
    }
}
