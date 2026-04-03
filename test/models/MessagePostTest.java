package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagePostTest {
    MessagePost messagePost1;
    MessagePost messagePost2;
    MessagePost messagePost3;


    @BeforeEach
    void setUp() {
        messagePost1 = new MessagePost("Mary", "Hi there.");
        messagePost2 = new MessagePost("John", "I'm on my way.");
        messagePost3 = new MessagePost("Scott", "I'm on my way to pick up the groceries from the shop, please wait for me.");
    }

    @AfterEach
    void tearDown() {
        messagePost1 = null;
        messagePost2 = null;
        messagePost3 = null;
    }

    @Test
    void setMessage() {
        assertEquals("Hi there." ,messagePost1.getMessage());
        assertEquals("I'm on my way." ,messagePost2.getMessage());

        messagePost1.setMessage("Bye Bye");
        messagePost2.setMessage("Wait.. Wait..");
        assertEquals("Bye Bye", messagePost1.getMessage());
        assertEquals("Wait.. Wait..", messagePost2.getMessage());
        //TODO  test when try to set a message that's too long
        assertEquals("I'm on my way to pick up the groceries from the shop, please wait for me.",messagePost3.getMessage());
        messagePost3.setMessage("See you later");
        assertEquals("See you later", messagePost3.getMessage());
        //Test fails as the string is out of range set in messagePost class
    }
}