package com.example.todoapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TodoListPage(modifier: Modifier = Modifier) {
    
    val todoList = getFakeTodo()
    Text(text = todoList.toString())
}
