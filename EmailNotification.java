public class EmailNotification implements NotificationService {

    @Override
    public void send(){
        System.out.println("Сообщение отправленно  на почту");
    }
}