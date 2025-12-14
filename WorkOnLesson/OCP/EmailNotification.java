package OCP;

public class EmailNotification implements NotificationServise {

    @Override
    public void send(){
        System.out.println("Сообщение отправленно  на почту");
    }
}
