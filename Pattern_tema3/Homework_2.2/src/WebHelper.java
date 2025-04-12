import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {

    private static WebHelper instance;
    private String webContent;

    // URL-ul paginii web (hardcodat)
    private static final String WEBSITE_URL = "https://www.ucv.ro/";

    // Constructor privat pentru a preveni instanțierea directă
    private WebHelper() {}

    // Metodă statică pentru a obține instanța unică a clasei
    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    // Metoda pentru a obține conținutul paginii web
    public String getWebSiteContent() {
        if (webContent == null) {
            // Dacă conținutul nu a fost încă descărcat, îl descărcăm acum
            webContent = downloadContent();
        }
        return webContent;
    }

    // Metodă privată pentru a descărca conținutul paginii web
    private String downloadContent() {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(WEBSITE_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Citirea conținutului paginii
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
