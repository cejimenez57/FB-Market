package com.example.marketplaceautoposter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var titleInput: EditText
    private lateinit var priceInput: EditText
    private lateinit var descriptionInput: EditText
    private lateinit var selectImageButton: Button
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        titleInput = findViewById(R.id.titleInput)
        priceInput = findViewById(R.id.priceInput)
        descriptionInput = findViewById(R.id.descriptionInput)
        selectImageButton = findViewById(R.id.selectImageButton)
        submitButton = findViewById(R.id.submitButton)

        // Set up button click listeners
        selectImageButton.setOnClickListener {
            // Placeholder for image selection (we will use random images or gallery later)
            Toast.makeText(this, "Image selected (simulated).", Toast.LENGTH_SHORT).show()
        }

        submitButton.setOnClickListener {
            // Simulate post submission
            submitPost()
        }
    }

    private fun submitPost() {
        val title = titleInput.text.toString()
        val price = priceInput.text.toString()
        val description = descriptionInput.text.toString()

        if (title.isEmpty() || price.isEmpty() || description.isEmpty()) {
            Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            return
        }

        // Simulate post submission to Facebook Marketplace
        Toast.makeText(this, "Post Scheduled!", Toast.LENGTH_SHORT).show()

        // You can later schedule a real background job here using WorkManager or any other background task
    }
}