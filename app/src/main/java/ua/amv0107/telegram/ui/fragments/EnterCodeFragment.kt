package ua.amv0107.telegram.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.fragment_enter_code.*
import ua.amv0107.telegram.MainActivity
import ua.amv0107.telegram.R
import ua.amv0107.telegram.activities.RegisterActivity
import ua.amv0107.telegram.utilits.AUTH
import ua.amv0107.telegram.utilits.AppTextWatcher
import ua.amv0107.telegram.utilits.replaceActivity
import ua.amv0107.telegram.utilits.showToast

class EnterCodeFragment(val PhoneNumber: String, val id: String) : BaseFragment(R.layout.fragment_enter_code) {


    override fun onStart() {
        super.onStart()
        (activity as RegisterActivity).title = PhoneNumber
        register_input_coder.addTextChangedListener(AppTextWatcher {
            val string = register_input_coder.text.toString()
            if (string.length == 6) {
                enterCode()
            }
        })
    }

    private fun enterCode() {
        val code = register_input_coder.text.toString()
        val credential = PhoneAuthProvider.getCredential(id, code)
        AUTH.signInWithCredential(credential).addOnCompleteListener{
            if (it.isSuccessful){
                showToast("Ok")
                (activity as RegisterActivity).replaceActivity(MainActivity())
            } else {
                showToast(it.exception?.message.toString())
            }
        }
    }
}