package theater;

/**
 * Class representing information about a play.
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Create a play with the given name and type.
     *
     * @param name the display name of the play
     * @param type the type of the play (for example, tragedy or comedy)
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Return the name of this play.
     *
     * @return the play name
     */
    public String getName() {
        return name;
    }

    /**
     * Return the type of this play.
     *
     * @return the play type
     */
    public String getType() {
        return type;
    }
}
