package com.example.mail

import EmailAdapter
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mail.R
import com.example.model.Email


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Danh sách email mẫu
        val emailList = listOf(
            Email("EduRila Team",
                "Learn Web Designing for $19 Only",
                "12:34 PM",
                false,
                "Join our online course to learn web design skills at an affordable price."),

            Email("Chris Abad",
                "Help make Campaign Monitor better",
                "11:22 AM",
                false,
                "We appreciate your feedback to improve our services. Please share your thoughts!"),

            Email("Tuto Support",
                "8h of free training and new tutorials",
                "11:04 AM",
                false,
                "Get access to 8 hours of free training materials and new tutorials."),

            Email("Company Support",
                "Follow up on your support request",
                "10:26 AM",
                false,
                "This is a reminder regarding your support request. We are here to assist you."),

            Email("Matt Ionic",
                "The all-new Creator is here!",
                "9:45 AM",
                false,
                "Discover the new features in our Creator tool and start building amazing applications."),

            Email("EduRila Team",
                "Learn Web Designing for $19 Only",
                "12:34 PM",
                false,
                "Join our online course to learn web design skills at an affordable price."),

            Email("Chris Abad",
                "Help make Campaign Monitor better",
                "11:22 AM",
                false,
                "We appreciate your feedback to improve our services. Please share your thoughts!"),

            Email("Tuto Support",
                "8h of free training and new tutorials",
                "11:04 AM",
                false,
                "Get access to 8 hours of free training materials and new tutorials."),

            Email("Company Support",
                "Follow up on your support request",
                "10:26 AM",
                false,
                "This is a reminder regarding your support request. We are here to assist you."),

            Email("Matt Ionic",
                "The all-new Creator is here!",
                "9:45 AM",
                false,
                "Discover the new features in our Creator tool and start building amazing applications."),

            Email("EduRila Team",
                "Learn Web Designing for $19 Only",
                "12:34 PM",
                false,
                "Join our online course to learn web design skills at an affordable price."),

            Email("Chris Abad",
                "Help make Campaign Monitor better",
                "11:22 AM",
                false,
                "We appreciate your feedback to improve our services. Please share your thoughts!"),

            Email("Tuto Support",
                "8h of free training and new tutorials",
                "11:04 AM",
                false,
                "Get access to 8 hours of free training materials and new tutorials."),

            Email("Company Support",
                "Follow up on your support request",
                "10:26 AM",
                false,
                "This is a reminder regarding your support request. We are here to assist you."),

            Email("Matt Ionic",
                "The all-new Creator is here!",
                "9:45 AM",
                false,
                "Discover the new features in our Creator tool and start building amazing applications.")
        )



        val adapter = EmailAdapter(emailList)
        recyclerView.adapter = adapter
    }
}
