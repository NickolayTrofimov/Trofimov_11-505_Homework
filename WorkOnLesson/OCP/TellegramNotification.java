package OCP;

public class TellegramNotification implements NotificationServise {

    @Override
    public void send(){
        System.out.println("Сообщение отправленно в телеграмм");
    }
}
