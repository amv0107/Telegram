package ua.amv0107.telegram.ui.fragments

import android.widget.Toast
import androidx.fragment.app.Fragment
import ua.amv0107.telegram.R
import kotlinx.android.synthetic.main.fragment_enter_phone_number.*
import ua.amv0107.telegram.utilits.replaceFragment
import ua.amv0107.telegram.utilits.showToast

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {

    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener { sendCode() }
    }

    private fun sendCode(){
        if(register_input_phone_number.text.toString().isEmpty()) {
            showToast(getString(R.string.register_toast_enter_phone))
        } else {
            replaceFragment(EnterCodeFragment())
        }

    }
}