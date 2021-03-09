public enum Country {
    RUSSIA("Россия", true),
    GERMANY("Германия", false),
    FRANCE("Франция", false),
    JAPAN("Япония", true),
    ITALY("Италия", false),
    CANADA("Канада", true),
    SWEDEN("Швеция", true);

    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    public String getRuName() {
        return ruName;
    }

    @Override
    public String toString() {
        return this.name() + " (" + this.getRuName() + ")";
    }

    public static Country getByRuName(final String ruCountry) throws NoSuchCountryException {
        for (Country country : Country.values()) {
            if (country.ruName.equals(ruCountry)) {
                return country;
            }
        }
        throw new NoSuchCountryException(ruCountry);
    }

    public void getInfo() {
        if (isOpen) {
            System.out.println("Страна [" + toString() + "] открыта для посещения");
        } else {
            System.out.println("Страна [" + toString() + "] закрыта для посещения");
        }
    }
}
