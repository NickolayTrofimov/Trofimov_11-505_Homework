package OCP;

public class SMSNotification implements NotificationServise {

    @Override
    public void send(){
        System.out.println("Сообщение отправленно в МАХ");
    }
}
