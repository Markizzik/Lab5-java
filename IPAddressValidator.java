import java.util.regex.*;

public class IPAddressValidator {
    public static void main(String[] args) {
        String ipAddress = "192.168.0.1";
        String ipPattern = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println("IP-адрес корректен!");
        } else {
            System.out.println("Некорректный IP-адрес.");
        }
    }
}
