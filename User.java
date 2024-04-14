public class User {
    String fname;
    String lname;
    private String email;
    private String password;
    private boolean isGuest = false;

    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }

    public User(String fname, String lname, String email, String password) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
    }

    public void makeNonGuest(String fname, String lname, String password) {
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.isGuest = false;
    }

    public boolean isGuest() {
        return isGuest;
    }
}