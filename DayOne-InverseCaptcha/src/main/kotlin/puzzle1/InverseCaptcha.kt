package puzzle1

class InverseCaptcha {
    fun sumSequence(sequence: String): Int {
        val appendedSequence = if (sequence.length > 2) sequence + sequence[0] else sequence

        return (1 until appendedSequence.length)
                .asSequence()
                .filter { appendedSequence[it - 1] == appendedSequence[it] }
                .sumBy { appendedSequence[it - 1].intValue() }
    }
}

private fun Char.intValue(): Int = toString().toInt()
