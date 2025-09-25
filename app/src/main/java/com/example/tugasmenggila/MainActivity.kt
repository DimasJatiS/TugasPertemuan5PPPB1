// File: MainActivity.kt
package com.example.tugasmenggila

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    fun handleLogout() {
        val dialogLogout = DialogLogout()
        dialogLogout.show(supportFragmentManager, "DialogLogout")
    }

    fun handleExitApp() {
        val dialogExit = DialogExit()
        dialogExit.show(supportFragmentManager, "DialogExit")
    }
}
