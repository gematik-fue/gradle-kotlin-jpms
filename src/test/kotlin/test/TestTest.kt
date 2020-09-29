package test

import org.junit.Test
import javax.smartcardio.TerminalFactory

class TestTest {

    @Test
    fun smartCard() {
        TerminalFactory.getDefault().terminals()
    }
}