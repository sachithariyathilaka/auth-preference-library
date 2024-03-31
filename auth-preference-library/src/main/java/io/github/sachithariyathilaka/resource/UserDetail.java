package io.github.sachithariyathilaka.resource;

/**
 * User detail resource class;
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
public class UserDetail {
    private String userId;
    private boolean status;

    public UserDetail() {
    }


    public UserDetail(String userId, boolean status) {
        this.userId = userId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
