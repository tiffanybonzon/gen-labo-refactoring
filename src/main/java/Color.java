public enum Color {
    NO_COLOR("no color"), YELLOW("yellow"), RED("red"), BLUE("blue");

    private String colorName;

    Color(String name) {
        this.colorName = name;
    }

    @Override
    public final String toString() {
        return colorName;
    }
}
