package class1.example2;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProducOrder[] orders = new ProducOrder[3];
        ProducOrder pro1 = new ProducOrder();
        pro1.productName = "두부";
        pro1.price = 2000;
        pro1.quantity = 2;
        orders[0]=pro1;

        ProducOrder pro2 = new ProducOrder();
        pro2.productName = "김치";
        pro2.price = 5000;
        pro2.quantity = 1;
        orders[1]=pro2;

        ProducOrder pro3 = new ProducOrder();
        pro3.productName = "콜라";
        pro3.price = 1500;
        pro3.quantity = 2;
        orders[2]=pro3;


        int totalAmount = 0;
        for (ProducOrder order : orders) {
            System.out.println("상품명 : "+order.productName+ " ,가격 : "+order.price+" 수량 : "+order.quantity);
            totalAmount += order.price*order.quantity;

        }
        System.out.println("총 결제 금액 : " +totalAmount);
    }
}
