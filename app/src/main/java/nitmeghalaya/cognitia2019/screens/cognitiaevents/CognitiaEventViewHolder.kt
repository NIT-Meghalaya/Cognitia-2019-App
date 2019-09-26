package nitmeghalaya.cognitia2019.screens.cognitiaevents

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.View
import androidx.core.content.FileProvider
import androidx.navigation.findNavController
import coil.api.load
import kotlinx.android.synthetic.main.item_cognitia_event.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.CognitiaEvent
import nitmeghalaya.cognitia2019.screens.BaseFragment
import nitmeghalaya.cognitia2019.screens.BaseViewHolder
import toJson
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class CognitiaEventViewHolder(private val baseFragment: BaseFragment, itemView: View)
    : BaseViewHolder<CognitiaEvent>(itemView) {

    override fun bind(item: CognitiaEvent) {
        itemView.apply {
            imageView.load(item.image) {
                crossfade(true)
                crossfade(500)
            }
            nameTV.text = item.name
            descriptionTV.text = item.about

            setOnClickListener {
                navigateToEventDetails(it, item)
            }

            buttonExplore.setOnClickListener {
                navigateToEventDetails(it, item)
            }

            buttonShare.setOnClickListener {
                makeShareIntent(item.name)
            }
        }
    }

    private fun navigateToEventDetails(view: View, item: CognitiaEvent) {
        val action = CognitiaEventsFragmentDirections
            .actionEventsFragmentToEventDetailFragment(item.toJson<CognitiaEvent>(), item.name, item.image)
        view.findNavController().navigate(action)
        baseFragment.hideActionBar()
    }

    private fun makeShareIntent(eventName: String) {

        try {
            //Save the image to internal storage
            val cachePath = File(itemView.context.cacheDir, "images")
            cachePath.mkdirs() // don't forget to make the directory
            val stream = FileOutputStream("$cachePath/image.png") // overwrites this image every time
            val bitmap = BitmapFactory.decodeResource(itemView.context.resources, R.drawable.cognitia_logo)
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
            stream.close()

        } catch (e: IOException) {
            e.printStackTrace()
        }

        val imagePath = File(itemView.context.cacheDir, "images")
        val newFile = File(imagePath, "image.png")
        val contentUri =
            FileProvider.getUriForFile(itemView.context, "nitmeghalaya.cognitia2019", newFile)

        val shareText = "Check out _*" + eventName + "*_ and other awesome events.\n\n" +
                "*NIT Meghalaya* welcomes you to its annual technical festival:\n\n" +
                itemView.context.resources.getString(R.string.cognitia_emoji) +
                "\n\nDownload the official app now:\n" + "https://play.google.com/store/apps/details?id=in.cognitia.cognitia18"

        //TODO: Add new download link

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri)
        shareIntent.type = "image/png"
        shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText)
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Welcome to Cognitia 2019")
        itemView.context.startActivity(Intent.createChooser(shareIntent, "Share..."))
    }
}