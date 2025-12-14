package OCP;

public class Main {
    public static void main(String[] args) {
        NotificationServise letter = new TellegramNotification();
        NotificationServise letter1 = new SMSNotification();
        letter.send();
        letter1.send();
    }
}
