public class Main {
    public static void main(String[] args) {
        // Obține instanța WebHelper
        WebHelper webHelper = WebHelper.getInstance();

        // Accesează conținutul paginii web
        String content = webHelper.getWebSiteContent();

        // Afișează conținutul paginii 
        System.out.println("Conținutul paginii este:");
        System.out.println(content.substring(0, Math.min(content.length(), 500))); // Afișează doar primele 500 de caractere
    }
}
