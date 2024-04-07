public enum Day {
    MONDAY("Mon"), TUESDAY("Tue");

    private String abbreviation;

    private Day(String abbr) {
        this.abbreviation = abbr;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static Day forName(String name) {
        Day[] allDays = Day.values();
        for (int i = 0; i < allDays.length; i++) {
            if (allDays[i].name().equals(name.toUpperCase())) {
                return allDays[i];
            }
        }

        return null;
    }
}
