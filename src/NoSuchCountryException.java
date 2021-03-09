public class NoSuchCountryException extends Exception {
    private final String countryName;

    public NoSuchCountryException(final String countryName) {
        this.countryName = countryName;
    }

    /***/
    @Override
    public String toString() {
        return "Страны '" + countryName + "' не существует";
    }
}
