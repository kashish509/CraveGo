import model.User;
import model.service.dao.UserDAO;

public class TestUser {

    public static void main(String[] args) {

        User user = new User(
            0,
            "Kashish",
            "kashishagg@gmail.com",
            "test123",
            "9876543210"
        );

        UserDAO dao = new UserDAO();

        boolean result = dao.registerUser(user);

        if (result) {
            System.out.println("User Registered Successfully!");
        } else {
            System.out.println("Registration Failed!");
        }
        User login = dao.loginUser("kashishagg@gmail.com", "test123");

if (login != null) {
    System.out.println("Login Successful!");
    System.out.println(login);
} else {
    System.out.println("Invalid Email or Password!");
}
User found = dao.getUserById(3);

if (found != null) {
    System.out.println("User Found!");
    System.out.println(found);
} else {
    System.out.println("User Not Found!");
}

    }
}
