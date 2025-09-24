// File: MainActivity.kt
package com.example.tugasmenggila

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

//    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        sessionManager = SessionManager(this)

        // Tampilkan halaman saat aplikasi dibuka
        if (savedInstanceState == null) {
                navigateToAuth() // Jika belum, ke halaman login/register
            }
        }

    // Navigasi
    fun navigateToHome(username: String) {
        val homeFragment = HomeFragment.newInstance(username)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, homeFragment)
            .commit()
    }

    fun navigateToAuth() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, AuthFragment())
            .commit()
    }

    // Fungsi Action

//    fun handleLoginSuccess(username: String) {
//        sessionManager.setLoggedIn(true)
//        navigateToHome(username)
//    }

    fun handleLogout() {
        AlertDialog.Builder(this)
            .setTitle("Logout")
            .setMessage("Apakah Anda yakin ingin logout?")
            .setPositiveButton("Ya") { _, _ ->
//                sessionManager.logout()
                navigateToAuth()
            }
            .setNegativeButton("Tidak", null)
            .show()
    }

    fun handleExitApp() {
        AlertDialog.Builder(this)
            .setTitle("Keluar")
            .setMessage("Apakah Anda yakin ingin keluar dari aplikasi?")
            .setPositiveButton("Ya") { _, _ ->
                finish() // Menutup aplikasi
            }
            .setNegativeButton("Tidak", null)
            .show()
    }
}