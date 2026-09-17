package SOLID;

interface NotificationService {
    void send(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("EMAIL: "+message);
    }
}

class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS: "+message);
    }
}

class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        // Logic to place the order
        notificationService.send("Order placed successfully");
    }
}

public class Main {
    public static void main(String[] args) {
        //using email
        NotificationService email = new EmailNotification();
        OrderService orderService1 = new OrderService(email);
        orderService1.placeOrder();

        //using sms
        NotificationService sms = new SmsNotification();
        OrderService orderService2 = new OrderService(sms);
        orderService2.placeOrder();
    }
}
