package puzzle2

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.`is` as _is
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test

class InverseCaptcha2Test {

    private lateinit var inverseCaptcha: InverseCaptcha2

    @Before
    fun setUp() {
        inverseCaptcha = InverseCaptcha2()
    }

    @Test
    fun `return 6 for 1212`() {
        assertThat(inverseCaptcha.sumSequence("1212"), _is(equalTo(6)))
    }

    @Test
    fun `should return zero for 1221`() {
        assertThat(inverseCaptcha.sumSequence("1221"), _is(equalTo(0)))
    }

    @Test
    fun `should return four for 123425`() {
        assertThat(inverseCaptcha.sumSequence("123425"), _is(equalTo(4)))
    }

    @Test
    fun `should return 12 for 123123`() {
        assertThat(inverseCaptcha.sumSequence("123123"), _is(equalTo(12)))
    }

    @Test
    fun `should return 4 for 12131415`() {
        assertThat(inverseCaptcha.sumSequence("12131415"), _is(equalTo(4)))
    }

}
