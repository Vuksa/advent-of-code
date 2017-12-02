package puzzle2

import intValue

class InverseCaptcha2 {

    fun sumSequence(sequence: String): Int = (0 until sequence.length)
            .asSequence()
            .filter { sequence[it] == sequence[(it + sequence.length / 2) % sequence.length] }
            .sumBy { sequence[it].intValue() }
}