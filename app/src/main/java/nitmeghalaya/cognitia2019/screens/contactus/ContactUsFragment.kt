package nitmeghalaya.cognitia2019.screens.contactus


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_contact_us.*

import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class ContactUsFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        hideLoadingAnimation()
        setActionbarTitle("Contact Us")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_us, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "cognitia@nitm.ac.in", null))
            startActivity(Intent.createChooser(intent, "Choose an Email client :"))
        }

        btnFacebook.setOnClickListener {
            val uri = Uri.parse("https://www.facebook.com/NITMcognitia/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        btnWebsite.setOnClickListener {
            val uri = Uri.parse("http://www.cognitia.co.in/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        btnInstagram.setOnClickListener {
            val uri = Uri.parse("https://www.instagram.com/cognitia_nitm/?igshid=cgv6r2lamk9c")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }


}
