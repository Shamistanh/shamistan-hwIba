package March6;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
    private WarmUp app;

    @BeforeEach
    public void setUp() {
        this.app =
                new WarmUp();
    }

    @Test
    public void calc1() {
        assertEquals(1, app.calc("()()()"));
    }

    @Test
    public void calc1a() {
        assertEquals(1, app.calc("()"));
    }

    @Test
    public void calc2() {
        assertEquals(2, app.calc("()(()())()"));
    }

    @Test
    public void calc3() {
        assertEquals(3, app.calc("()(()())((()()))(())()"));
    }

    @Test
    public void calc4() {
        assertEquals(3, app.calc("()(()()()(()))"));
    }

}
