package com.example.tugasmenggila

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class DialogLogout : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        val inflater = requireActivity().layoutInflater

        val dialogView = inflater.inflate(R.layout.dialog_logout, null)

        val btnYes: Button = dialogView.findViewById(R.id.btn_yes_logout)
        val btnNo: Button = dialogView.findViewById(R.id.btn_no_logout)

        btnYes.setOnClickListener {
            // Logout → kembali ke AuthFragment
            (activity as? MainActivity)?.navigateToAuth()
            dismiss()
        }
        btnNo.setOnClickListener {
            dismiss()
        }

        builder.setView(dialogView)
        return builder.create()
    }
}
