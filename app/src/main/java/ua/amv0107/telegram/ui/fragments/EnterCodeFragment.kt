package ua.amv0107.telegram.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_enter_code.*
import ua.amv0107.telegram.R
import ua.amv0107.telegram.utilits.AppTextWatcher
import ua.amv0107.telegram.utilits.showToast

class EnterCodeFragment : BaseFragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        register_input_coder.addTextChangedListener(AppTextWatcher {
            val string = register_input_coder.text.toString()
            if (string.length == 6) {
                verifiCode()
            }
        })
    }

    private fun verifiCode() {
        showToast("Ok")
    }
}