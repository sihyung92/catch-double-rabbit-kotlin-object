package theater

import org.junit.jupiter.api.Test

internal class InvitationTest {

    @Test
    fun `초대장 생성 시 시간 확인`() {
        val a = Invitation()
        println(a.invitationTime)
    }
}