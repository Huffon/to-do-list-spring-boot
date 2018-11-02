package devfon.entity.enums;

public enum PriorityType {
    high("높음"),
    mid("중간"),
    low("낮음");

    private String priority;

    PriorityType(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return this.priority;
    }

}
