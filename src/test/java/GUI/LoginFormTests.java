package GUI;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginFormTests {

    @Test
    void initialize() {
    }

    @Test
    void actionPerformed() {
        String username = "admin";
        String password = "admin";
        User user = getAuthenticatedUser(username, password);

        assertNull(user, "Username atau password invalid");
        ;
    }

    @Test
    User getAuthenticatedUser(String username, String password) {
        User user = null;
        return user;
    }

    @Test
    void applicationContextTest() {
        LoginForm.main(new String[] {});
    }
}
