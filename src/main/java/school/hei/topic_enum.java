package school.hei;

public enum topic_enum {
    ROMANCE, COMEDY, OTHER;

    @Override
    public String toString() {
        return name().toUpperCase();

    }
}
