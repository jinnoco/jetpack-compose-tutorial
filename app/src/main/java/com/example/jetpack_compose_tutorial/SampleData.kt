package com.example.jetpack_compose_tutorial

object SampleData {
    val conversationSample: List<Message> = listOf(
        Message("Jin", "Hello Jetpack Compose"),
        Message("Jin", "Test...Test..."),
        Message("Jin", "The sample app chat is becoming increasingly interesting. Next, have fun creating animations. Add the ability to animate both content size and background color, and expand the message to be displayed into longer text. To preserve this local UI state, we need to track whether the message is expanded or not. To track this state change, use the remember function and the mutableStateOf function.")
    )
}
