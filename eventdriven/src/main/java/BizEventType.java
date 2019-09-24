public enum BizEventType {

    ORDER_CREATE("ORDER_CREATE"),
    ORDER_UPDATE("ORDER_UPDATE");

    String desc;

    BizEventType(String desc) {
        this.desc = desc;
    }
}
