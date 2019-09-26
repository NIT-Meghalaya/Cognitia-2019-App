package nitmeghalaya.cognitia2019.screens

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import nitmeghalaya.cognitia2019.R

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar as Toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        navController = findNavController(R.id.nav_host_fragment)

        setupActionBarWithNavController(navController, drawerLayout)
        NavigationUI.setupWithNavController(navigationView, navController)
        navigationView.setNavigationItemSelectedListener(this)
        navigationView.setCheckedItem(R.id.eventsFragment)
        navigationView.itemIconTintList = null
    }

    override fun onSupportNavigateUp(): Boolean =
        NavigationUI.navigateUp(findNavController(R.id.nav_host_fragment), drawerLayout)

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        menuItem.isChecked = true
        navigationView.setCheckedItem(menuItem.itemId)
        drawerLayout.closeDrawers()

        when(menuItem.itemId) {
            R.id.events -> {
                navController.navigate(R.id.eventCategoriesFragment)
            }
            R.id.team -> {
                navController.navigate(R.id.teamsFragment)
            }
            R.id.contact ->{
                navController.navigate(R.id.contactUsFragment)
            }
            R.id.sponsors -> {
                navController.navigate(R.id.sponsorFragment)
            }
            R.id.link_website -> {
                val uri = Uri.parse("http://www.cognitia.co.in/")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.link_facebook-> {
                val uri = Uri.parse("https://www.facebook.com/NITMcognitia/")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.link_instagram-> {
                val uri = Uri.parse("https://www.instagram.com/cognitia_nitm/?igshid=cgv6r2lamk9c")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.link_twitter-> {
                val uri = Uri.parse("http://www.cognitia.co.in/")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            R.id.link_youtube-> {
                val uri = Uri.parse("http://www.cognitia.co.in/")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        }

        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportActionBar?.isShowing != true)
            supportActionBar?.show()
    }
}