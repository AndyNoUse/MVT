package TDD;

public class User {

    private String userName, password;

    // Constructor
    public User(String userNameInput, String passwordInput) {
        this.userName = userNameInput;
        this.password = passwordInput;
    }

    // Getter method for userName
    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String nameChange() {
        return userName = "Bob";
    }

    public int nameGetLength() {
        return userName.length();
    }
}