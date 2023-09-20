package com.example.myapplication

import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.TypefaceSpan
import java.util.*

class WidgetUpdaterManual {
    fun PerformWidgetUpdate(): SpannableString {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        // Create a SpannableString to customize text colors
        val strings = arrayOf(
            "I T L I S A M P M R Q\n\n", //0 2 4 6 8 10 12 14 16 18 20
            "A C Q U A R T E R D C\n\n", //23 25 27 29 31 33 35 37 39 41 43
            "T W E N T Y F I V E X\n\n", //46 48 50 52 54 56 58 60 62 64 66
            "H A L F S T E N F T O\n\n", //69 71 73 75 77 79 81 83 85 87 89
            "P A S T E R U N I N E\n\n", //92 94 96 98 100 102 104 106 108 110 112
            "O N E S I X T H R E E\n\n", //115 117 119 121 123 125 127 129 131 133 135
            "F O U R F I V E T W O\n\n", //138 140 142 144 146 148 150 152 154 156 158
            "E I G H T E L E V E N\n\n", //161 163 165 167 169 171 173 175 177 179 181
            "S E V E N T W E L V E\n\n", //184 186 188 190 192 194 196 198 200 202 204
            "T E N S E O' C L O C K"     //207 209 211 213 215 217 220 222 224 226 228
        )

        // Concatenate the individual strings
        val fullText = strings.joinToString("")

        // Create a SpannableString
        val spannableTime = SpannableString(fullText)

        // Apply the Courier font style to the entire string
        val courierFont = TypefaceSpan("monospace")
        spannableTime.setSpan(courierFont, 0, spannableTime.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Define the color for the '2'
        val blueColor = android.graphics.Color.RED

        if (hour == 1 || hour == 13) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 154, 159, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 115, 120, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 2 || hour == 14) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 127, 136, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 154, 159, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 3 || hour == 15) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 138, 145, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 127, 136, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 4 || hour == 16) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 146, 153, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 138, 145, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 5 || hour == 17) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 121, 126, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 146, 153, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 6 || hour == 18) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 184, 193, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 121, 126, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 7 || hour == 19) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 161, 170, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 184, 193, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 8 || hour == 20) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 106, 113, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 161, 170, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 9 || hour == 21) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 207, 212, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 106, 113, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 10 || hour == 22) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 171, 182, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 207, 212, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else if (hour == 11 || hour == 23) {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 194, 205, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 171, 182, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }
        else {
            if (minute >= 35){
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 115, 120, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            else {
                spannableTime.setSpan(ForegroundColorSpan(blueColor), 194, 205, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }


        if (minute < 5) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 6, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 217, 229, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 10) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 92, 99, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 58, 65, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 15) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 92, 99, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 79, 84, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 20) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 92, 99, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 27, 40, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 25) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 92, 99, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 46, 57, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 30) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 92, 99, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 46, 65, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 35) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 92, 99, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 69, 76, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 40) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 46, 65, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 87, 90, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 45) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 87, 90, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 46, 57, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 50 ){
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 87, 90, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 27, 40, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else if (minute < 55) {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 87, 90, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 79, 84, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        else {
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 87, 90, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableTime.setSpan(ForegroundColorSpan(blueColor), 58, 65, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }



        return spannableTime
    }
}