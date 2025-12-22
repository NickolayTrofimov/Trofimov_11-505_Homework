public class TellegramNotification implements NotificationService {

    @Override
    public void send(){
        System.out.println("Сообщение отправленно в телеграмм");
    }
}
