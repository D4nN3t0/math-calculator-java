import java.util.Locale;

public class App {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Menu menu = new Menu();

        menu.iniciar();
    }
}
