package com.example.week1_android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Create instances of Shape subclasses
        val square: Shape = Square(5.0)
        val rectangle: Shape = Rectangle(5.0, 2.0)
        val triangle: Shape = Triangle(5.0,2.0)


        // Calculate and display areas
        val squareArea = square.calculateArea()
        val rectangleArea = rectangle.calculateArea()
        val triangleArea = triangle.calculateArea()

        // Find the TextView by its ID
        var shapeValuesTextView: TextView = findViewById(R.id.shapeValuesTextView);
        // Display the values in the TextView
        val shapeValuesText = """
            Shape Values:
             • Square Area: $squareArea
             • Rectangle Area: $rectangleArea
             • Triangle Area: $triangleArea
            """.trimIndent()

        shapeValuesTextView.setText(shapeValuesText) // Use


    }
}