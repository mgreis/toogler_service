package com.mgreis.delivery.jsonmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mgreis.delivery.annotations.Nullable;

/**
 * An abstract class with the fields shared by all responses.
 *
 * @author mario.pereira
 * @since 1.0.0
 *
 */
public abstract class AbstractResponse {
    /**
     * A method that returns the name of the service featured in the request.
     * @return a {@link String} class instance containing the service's name.
     */
    @Nullable
    @JsonProperty("service")
    public abstract String getService ();

    /**
     * A method that returns a timestamp generated by the server.
     * @return a long containing a timestamp.
     */
    @JsonProperty("timestamp")
    public abstract long getTimestamp ();

    /**
     * A method that returns the request's uuid generated by the server.
     * @return a {@link String} class instance containing the request's uuid.
     */
    @JsonProperty("uuid")
    public abstract String getUuid ();
}
