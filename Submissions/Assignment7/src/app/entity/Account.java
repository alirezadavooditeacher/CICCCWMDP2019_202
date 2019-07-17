package app.entity;

public class Account {
    private String email;
    private String password;
    private boolean suspended;

    public Account(String email, String password, boolean suspended) {
        this.email = email;
        this.password = password;
        this.suspended = suspended;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
}
