package devfon.todo.entity;
public enum PriorityType {
    high("높음"),
    mid("중간"),
    low("낮음");

    private String value;

    PriorityType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}