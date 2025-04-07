import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojectsub.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Parent layout
        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            setBackgroundResource(R.drawable.simplebg)
        }

        // ScrollView
        val scrollView = ScrollView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            setPadding(20, 20, 20, 20)
        }

        val containerLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        // Header Section
        val headerLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 0, 0, 20)
            }
            setBackgroundResource(R.drawable.rounded_corners)
            elevation = 4f
            setPadding(16, 16, 16, 16)
        }

        val headerTextView = TextView(this).apply {
            text = "Onboarding Application ✈"
            textSize = 36f
            setTextColor(resources.getColor(android.R.color.black))
            gravity = android.view.Gravity.CENTER
            setTypeface(typeface, android.graphics.Typeface.BOLD_ITALIC)
        }

        headerLayout.addView(headerTextView)
        containerLayout.addView(headerLayout)

        // Registration Section
        val registrationLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setBackgroundResource(R.drawable.rounded_corners)
            elevation = 4f
            setPadding(16, 16, 16, 16)
        }

        val registrationHeader = TextView(this).apply {
            text = "REGISTER YOURSELF"
            textSize = 24f
            setTextColor(resources.getColor(android.R.color.black))
            gravity = android.view.Gravity.CENTER
            setTypeface(typeface, android.graphics.Typeface.BOLD)
        }

        registrationLayout.addView(registrationHeader)

        // Fields for Name, Email, Gender, etc.
        val nameTextView = TextView(this).apply {
            text = "NAME:"
            textSize = 20f
            setTextColor(resources.getColor(android.R.color.black))
        }

        val nameEditText = EditText(this).apply {
            hint = "Enter Your Name"
            textSize = 16f
            setTextColor(resources.getColor(android.R.color.black))
            setBackgroundResource(R.drawable.edittext_background_states)
            setPadding(12, 12, 12, 12)
        }

        registrationLayout.addView(nameTextView)
        registrationLayout.addView(nameEditText)

        // Similarly, add other fields like Email, Gender RadioGroup, DatePicker, Switch, etc.

        containerLayout.addView(registrationLayout)
        scrollView.addView(containerLayout)
        mainLayout.addView(scrollView)

        setContentView(mainLayout)
    }
}