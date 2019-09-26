package nitmeghalaya.cognitia2019.screens.contactus

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.FileProvider
import coil.api.load
import coil.transform.RoundedCornersTransformation
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.fragment_contact_us.*
import kotlinx.android.synthetic.main.fragment_contact_us.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream


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

        gsTech1ImageView.load("https://firebasestorage.googleapis.com/v0/b/cognitia-2019.appspot.com/o/Deepak.jpg?alt=media&token=58395280-a62b-4d49-be7a-295ecaccc2d3") {
            transformations(RoundedCornersTransformation(20.0f))
        }

        gsTech2ImageView.load("https://firebasestorage.googleapis.com/v0/b/cognitia-2019.appspot.com/o/Priyesh.jpg?alt=media&token=da51e1b3-b8c5-42d2-b396-923c5cd2c7d1") {
            transformations(RoundedCornersTransformation(20.0f))
        }

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

        btnShare.setOnClickListener {
            shareCard(view.cardView)
        }
    }


    private fun shareCard(card: MaterialCardView) {
        card.isDrawingCacheEnabled = true
        card.buildDrawingCache()
        val bitmap = card.drawingCache

        try {
            val cachePath = File(card.context.cacheDir, "images")
            cachePath.mkdirs() // don't forget to make the directory
            val stream = FileOutputStream("$cachePath/card_image.png") // overwrites this image every time
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
            stream.close()

            val imagePath = File(card.context.cacheDir, "images")
            val newFile = File(imagePath, "card_image.png")

            val uri = FileProvider.getUriForFile(card.context, "nitmeghalaya.cognitia2019", newFile)

            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_STREAM, uri)
            shareIntent.type = "image/jpeg"
            context!!.startActivity(Intent.createChooser(shareIntent, "Share"))

        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }

    }
}
