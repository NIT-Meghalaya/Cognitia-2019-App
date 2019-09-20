import com.google.gson.Gson

/**
 * Created by Devansh on 19-09-2019
 */

fun <T> Any.toJson() = Gson().toJson(this as T)
