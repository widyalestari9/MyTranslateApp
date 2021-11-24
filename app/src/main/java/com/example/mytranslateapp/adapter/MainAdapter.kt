import android.view.LayoutInflater
import com.example.mytranslateapp.R
import com.example.mytranslateapp.model.ModelMain
import com.github.vipulasri.timelineview.TimelineView
import kotlinx.android.synthetic.main.list_item_translate.view.*
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MainAdapter(private val items: List<ModelMain>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_translate, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTranslation.text = data.strTranslation
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return TimelineView.getTimeLineViewType(position)
    }

    class ViewHolder(itemView: View, viewType: Int) : RecyclerView.ViewHolder(itemView) {
        var timelineView: TimelineView
        var tvTranslation: TextView

        init {
            timelineView = itemView.timelineView
            timelineView.initLine(viewType)
            tvTranslation = itemView.tvTranslation
        }
    }
}