package ilu2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ilu2.Welcome;

public class WelcomeTest {

	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation ...");
		Welcome welcome = new Welcome();
	}
		
    @Test
    public void testWelcomeCase1() {
        String result = Welcome.Welcome("bob");
        assertEquals("Hello, Bob", result);
    }

    @Test
    public void testWelcomeCase2() {
        String result = Welcome.Welcome("");
        assertEquals("Hello, my friend", result);
    }

    @Test
    public void testWelcomeCase3() {
        String result = Welcome.Welcome("JERRY");
        assertEquals("HELLO, JERRY !", result);
    }

    @Test
    public void testWelcomeCase4() {
        String result = Welcome.Welcome("amy,bob");
        assertEquals("Hello, Amy, Bob", result);
    }

    @Test
    public void testWelcomeCase5() {
        String result = Welcome.Welcome("Amy, bob,jerry");
        assertEquals("Hello, Amy, Bob, Jerry", result);
    }

    @Test
    public void testWelcomeCase6() {;
        String result = Welcome.Welcome("Amy, BOB, Jerry");
        assertEquals("Hello, Amy, Jerry. AND HELLO, BOB !", result);
    }

    @Test
    public void testWelcomeCase7() {
        String result = Welcome.Welcome("bob, amy, jerry");
        assertEquals("Hello, Bob, Amy and Jerry", result);
    }

    @Test
    public void testWelcomeCase8() {
        String result = Welcome.Welcome("bob, AMY, jerry, JACK");
        assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !", result);
    }

    @Test
    public void testWelcomeCase9() {
        String result = Welcome.Welcome("bob , amy ");
        assertEquals("Hello, Bob and Amy", result);
    }

    @Test
    public void testWelcomeCase10() {
        String result = Welcome.Welcome("bob, JERRY, amy, bob, JERRY, bob");
        assertEquals("Hello, Bob (x3), and Amy. AND HELLO, JERRY (x2) !", result);
    }

    @Test
    public void testWelcomeCase11() {
        String result = Welcome.Welcome("bob, yoda, amy, JERRY");
        assertEquals("Bob, Yoda, and Amy, Hello. AND HELLO JERRY", result);
    }

    @Test
    public void testWelcomeCase12() {
        String result = Welcome.Welcome("bob, YODA, amy, JERRY, YODA");
        assertEquals("Hello, Bob and Amy. AND YODA (x2) AND JERRY, HELLO !", result);
    }
}
