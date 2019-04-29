package com.github.frapontillo.junit45demo

import android.content.Intent
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest4 {
    @Test
    fun `intent putExtra works`() {
        val a = Intent().putExtra("a", "b")
        assertNotNull(a)
    }
}
