class Item {
    private String country;

    public String getCountry() {
        return country;
    }

    private int wineServings;

    public int getWineServings() {
        return wineServings;
    }

    public Item(String country, int wineServings) {
        this.country = country;
        this.wineServings = wineServings;
    }
}