import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLocalCurrentDate());
        System.out.println(Main.class.getClassLoader());
    }

    private static String getLocalCurrentDate() {

        LocalDate date = new LocalDate();
        return date.toString();

    }
}
