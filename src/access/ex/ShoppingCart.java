package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (Item item : items) {
            if (item == null) {
                break;
            }
            System.out.println("상품명: " + item.getName() + ',' + "합계 : " + item.getTotalPrice());
        }
        System.out.println("총합계 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            if (item == null) {
                break;
            }
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
