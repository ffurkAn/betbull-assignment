package com.betbull.assignment.model;

/**
 * Created by kbayindir on 10/27/2017.
 */

import org.springframework.http.HttpStatus;

public class BetException extends RuntimeException {
    private final HttpStatus status;
    private final String code;
    private final String desc;

    /**
     * @param status
     * @param code
     * @param message
     */
    public BetException(HttpStatus status, String code, String message) {
        super(message);
        this.status = status;
        this.code = code;
        this.desc = message;
    }

    /**
     * @param code
     * @param message
     */
    public BetException(String code, String message) {
        this(HttpStatus.INTERNAL_SERVER_ERROR, code, message);
    }



    /**
     * @return
     */
    public HttpStatus getStatus() {
        return this.status;
    }

    /**
     * @return
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @param o
     * @return
     */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BetException)) {
            return false;
        } else {
            BetException other = (BetException) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getStatus() != other.getStatus()) {
                return false;
            } else {
                String this$code = this.getCode();
                String other$code = other.getCode();
                if (this$code == null) {
                    return other$code == null;
                } else return this$code.equals(other$code);

            }
        }
    }

    /**
     * @param other
     * @return
     */
    protected boolean canEqual(Object other) {
        return other instanceof BetException;
    }

    /**
     * @return
     */
    public String toString() {
        return "BetException(status=" + this.getStatus() + ", code=" + this.getCode() + ")";
    }
}
