package com.example.profilecardlayout

class UserProfile constructor(val name: String, val status: Boolean, val drawableId: Int)

val userProfileList = arrayListOf(
    UserProfile("John Doe", true, R.drawable.profile_picture),
    UserProfile("Anna Joans", false, R.drawable.profile_woman)
)