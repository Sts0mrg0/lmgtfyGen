package com.wilderpereira.lmgtfygen.extensions

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager

fun View.hideKeyboard() {
    val inputMethodManager = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}