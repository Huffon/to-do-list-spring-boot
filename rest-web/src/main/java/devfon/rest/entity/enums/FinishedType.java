package devfon.rest.entity.enums;

public enum FinishedType {
    FIM("완료"),
    ING("미완");

    private String value;

    FinishedType(String value) {
        this.value= value;
    }

    public String getValue() {
        return this.value;
    }

}
