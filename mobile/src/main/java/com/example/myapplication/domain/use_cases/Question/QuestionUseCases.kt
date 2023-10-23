package com.example.myapplication.domain.use_cases.Question

data class QuestionUseCases(
    val deleteQuestion: DeleteQuestion,
    val getQuestionById: GetQuestionById,
    val getQuestionList: GetQuestionList,
    val getQuestionsByQuizId: GetQuestionsByQuizId,
    val insertQuestion: InsertQuestion
)
