package common.multilinestring;

public class MultiLineString {

    private final String NEW_LINE = System.getProperty("line.separator");

    public String textBlocks() {
        return """
        Get busy living
        or
        get busy dying.
        --Stephen King""";
    }

    public String stringJoin() {
        return String.join(NEW_LINE,
                "Get busy living",
                "or",
                "get busy dying.",
                "--Stephen King");
    }

    public String stringBuilder() {
        return new StringBuilder()
                .append("Get busy living")
                .append(NEW_LINE)
                .append("or")
                .append(NEW_LINE)
                .append("get busy dying.")
                .append(NEW_LINE)
                .append("--Stephen King")
                .toString();
    }

}
