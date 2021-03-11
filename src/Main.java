import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        for (Country country : Country.values()) {
            System.out.println(country.toString());
        }
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Country country;
        try {
            country = Country.valueOf(input.toUpperCase());
            country.getInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
            try {
                country = Country.getByRuName(input);
                country.getInfo();
            } catch (NoSuchCountryException noSuchCountryException) {
                System.out.println(noSuchCountryException.toString());
            }
        } catch (NullPointerException e) {
            System.out.println("Введено пустое значение, поиск невозможен");
        }
    }
}
