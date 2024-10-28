import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mail.R
import com.example.model.Email
import kotlin.random.Random

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.senderTextView.text = email.sender
        holder.subjectTextView.text = email.subject
        holder.timeTextView.text = email.time
        holder.contentTextView.text = email.content // Hiển thị nội dung email
        holder.starImageView.setImageResource(if (email.isStarred) R.drawable.ic_star else R.drawable.ic_star_border)

        // Thiết lập chữ cái đầu tiên của người gửi
        holder.avatarTextView.text = email.sender.first().toString()

        // Tạo màu ngẫu nhiên cho nền của avatar
        val randomColor = getRandomColor()
        val drawable = GradientDrawable()
        drawable.shape = GradientDrawable.OVAL
        drawable.setColor(randomColor)

        holder.avatarTextView.background = drawable // Áp dụng màu ngẫu nhiên cho avatar

        // Thiết lập sự kiện nhấn vào ngôi sao
        holder.starImageView.setOnClickListener {
            email.isStarred = !email.isStarred // Đảo ngược trạng thái đã đánh dấu
            holder.starImageView.setImageResource(if (email.isStarred) R.drawable.ic_star else R.drawable.ic_star_border)
        }
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderTextView: TextView = itemView.findViewById(R.id.senderTextView)
        val subjectTextView: TextView = itemView.findViewById(R.id.subjectTextView)
        val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
        val contentTextView: TextView = itemView.findViewById(R.id.contentTextView) // Khởi tạo contentTextView
        val starImageView: ImageView = itemView.findViewById(R.id.starImageView)
        val avatarTextView: TextView = itemView.findViewById(R.id.avatarTextView)

    }
    private fun getRandomColor(): Int {
        val random = Random
        val r = random.nextInt(256)
        val g = random.nextInt(256)
        val b = random.nextInt(256)
        return Color.rgb(r, g, b)
    }
}
