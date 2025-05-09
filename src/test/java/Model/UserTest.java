package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void verifyPassWord() {
        User user = new User("testUser", "password123");
        assertTrue(user.verifyPassWord("password123"));
        assertFalse(user.verifyPassWord("wrongPassword"));
    }
}