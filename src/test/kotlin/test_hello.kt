package PrimeFactors


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.properties.Delegates


class PrimeFactorsTest {

    @Test
    fun factors() {
        print("this is a test here ... ")
        assert(factorsOf(1) == emptyList<Int>())
        assertEquals(listOf(2), factorsOf(2))
        observeMe = "bb"
        observeMe = "cd"


    }

    @Test
    fun stringFirst() {

        assertEquals("one", "one two".firstWord)

    }


    private fun factorsOf(n: Int): List<Int> {
        val factors = mutableListOf<Int>()


        if (n > 1) {
            factors.add(2)
        }
        return factors

    }

    var observeMe by Delegates.observable("a") { p, old, new ->
        println("\nobserveMe: ${p.name} goes $old -> $new")

    }


    val String.firstWord: String
        get() {
            val index = indexOf(" ")
            return if (index < 0) this else substring(0, index)
        }


}