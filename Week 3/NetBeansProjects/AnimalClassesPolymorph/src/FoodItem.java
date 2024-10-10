import java.time.LocalDateTime;

class FoodItem {
    private int itemId;
    private String itemName;
    public FoodItem(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }
    public int getItemId() {
        return itemId;
    }
    public String getItemName() {
        return itemName;
    }
}
