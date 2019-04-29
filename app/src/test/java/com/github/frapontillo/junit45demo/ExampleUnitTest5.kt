package com.github.frapontillo.junit45demo

import android.content.Intent
import org.junit.Assert
import org.junit.jupiter.api.Test

class ExampleUnitTest5 {
    @Test
    fun `intent putExtra works`() {
        val a = Intent().putExtra("a", "b")
        Assert.assertNotNull(a)
    }
}
