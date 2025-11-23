package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    /**
     * Create a performance with the given play id and audience size.
     *
     * @param playID   the identifier of the play
     * @param audience the audience size
     */
    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Return the play id of this performance.
     *
     * @return the play id
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Return the audience size of this performance.
     *
     * @return the audience size
     */
    public int getAudience() {
        return audience;
    }
}

