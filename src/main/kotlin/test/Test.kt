package test

import javax.smartcardio.TerminalFactory

class Test {
    val terminals = TerminalFactory.getDefault().terminals()!!
}