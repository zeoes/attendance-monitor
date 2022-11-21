package com.example.barcodescanner.extension

import android.widget.EditText

fun EditText.isNotBlank(): Boolean {
    return text.isNotBlank()
}

var EditText.textString: String
    get() = text.toString()
    set(value) {}
