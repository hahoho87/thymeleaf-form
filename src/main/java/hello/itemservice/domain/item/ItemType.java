package hello.itemservice.domain.item;

public enum ItemType {

    BOOK("기타"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
