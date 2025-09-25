package com.example.tugasmenggila

import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {


    // Mengambil sesi jika sudah login atau belum ke aplikasi
    private val prefs: SharedPreferences = context.getSharedPreferences("MyAppSession", Context.MODE_PRIVATE)

    fun setLoggedIn(loggedIn: Boolean) {
        prefs.edit().putBoolean("isLoggedIn", loggedIn).apply()
    }

    fun isLoggedIn(): Boolean {
        return prefs.getBoolean("isLoggedIn", false)
    }

    //jika logout maka data dihapus
    fun logout() {
        prefs.edit().clear().apply()
    }



    //login
    // Simpan status login
//                val session = SessionManager(requireContext())
//                session.setLoggedIn(true)

    //register
    // Simpan status login
//                val session = SessionManager(requireContext())
//                session.setLoggedIn(true)


    //main
    //    private lateinit var sessionManager: SessionManager

    //        sessionManager = SessionManager(this)

    // Fungsi Action

//    fun handleLoginSuccess(username: String) {
//        sessionManager.setLoggedIn(true)
//        navigateToHome(username)
//    }
}

//sessionManager.logout()