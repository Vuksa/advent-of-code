import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as _is

class InverseCaptchaTest {


    private lateinit var inverseCaptcha: InverseCaptcha

    @Before
    fun setUp() {
        inverseCaptcha = InverseCaptcha()
    }

    @Test
    fun `should return zero if sequence is shorter than two`() {
        val sum: Int = inverseCaptcha.sumSequence("1")
        val sum1: Int = inverseCaptcha.sumSequence("")

        assertThat(sum, _is(equalTo(0)))
        assertThat(sum1, _is(equalTo(0)))
    }

    @Test
    fun `should return n for sequence that has length of two has two identical n numbers one after another`() {
        val character = 8

        val sum = inverseCaptcha.sumSequence("$character$character")

        assertThat(sum, _is(equalTo(character)))
    }

    @Test
    fun `should return 0 for sequence that has length of two but two different numbers one after another`() {
        val character1 = 5
        val character2 = 6

        val sum = inverseCaptcha.sumSequence("$character1$character2")

        assertThat(sum, _is(equalTo(0)))
    }


    @Test
    fun `should return n for sequence that has at least length of 3 and second two numbers are identical`() {
        val character1 = 1
        val character2 = 2
        val character3 = 2

        val sum = inverseCaptcha.sumSequence("$character1$character2$character3")

        assertThat(sum, _is(equalTo(character2)))
    }

    @Test
    fun `should return n for sequence that has at least length of 3 and first two numbers are identical`() {
        val character1 = 2
        val character2 = 2
        val character3 = 1

        val sum = inverseCaptcha.sumSequence("$character1$character2$character3")

        assertThat(sum, _is(equalTo(character1)))
    }

    @Test
    fun `should return n for sequence that has at least length of 3 and first and last numbers are identical`() {
        val character1 = 2
        val character2 = 1
        val character3 = 2

        val sum = inverseCaptcha.sumSequence("$character1$character2$character3")

        assertThat(sum, _is(equalTo(character1)))
    }

    @Test
    fun `should return 4 times n for sequence that has at least length of 4 and all numbers are identical`() {
        val character1 = 2
        val character2 = 3
        val character3 = 3
        val character4 = 3

        val sum = inverseCaptcha.sumSequence("$character1$character2$character3$character4")

        assertThat(sum, _is(equalTo(3 * character1)))
    }

    @Test
    fun `should return 0 for sequence that has at least length of 4 and all numbers are different`() {
        val character1 = 2
        val character2 = 3
        val character3 = 4
        val character4 = 5

        val sum = inverseCaptcha.sumSequence("$character1$character2$character3$character4")

        assertThat(sum, _is(equalTo(0)))
    }

}