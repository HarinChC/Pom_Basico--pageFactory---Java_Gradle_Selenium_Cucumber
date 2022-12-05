package runners.Browser_Manager;


public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type) {
            case Chrome:
                driverManager = new ChromeDriverManager();
                break;
            case Firefox:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                System.out.println("Es invalido el navegador");
                break;
        }
        return driverManager;
    }
}
