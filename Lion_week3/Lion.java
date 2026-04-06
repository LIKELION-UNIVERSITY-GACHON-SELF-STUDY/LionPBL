public class Lion extends role{
    int id;

    public Lion(
        String name,
        String major,
        int th,
        String part,
        int id
    )
    {
        // super 를 통해 부모의 생성자 호출, 공통 4개 필드를 부모에게 넘겨줌
        super(name, major, th, part);
        this.id = id;
    }


}
