package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import kotlin.math.log

class QuizQuestions : AppCompatActivity()
{
    var tv_question:TextView?=null
    var iv_flag:ImageView?=null
    var pb_progress:ProgressBar?=null
    var tv_progress:TextView?=null

    var tv_option1:TextView?=null
    var tv_option2:TextView?=null
    var tv_option3:TextView?=null
    var tv_option4:TextView?=null

    var btn_submit:Button?=null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        tv_question=findViewById(R.id.tv_question)
        iv_flag=findViewById(R.id.iv_flag)
        pb_progress=findViewById(R.id.pb_progress)
        tv_progress=findViewById(R.id.tv_progress)

 //       tv_option1=findViewById(R.id.tv_op1)
//        tv_option2=findViewById(R.id.tv_op2)
//        tv_option3=findViewById(R.id.tv_op3)
//        tv_option4=findViewById(R.id.tv_op4)

        btn_submit=findViewById(R.id.btn_submit)

        val questionList=Constants.getQuestions()

        var c=1
        val questions:Questions=questionList[c-1]

        tv_question?.text= questions.question
        iv_flag?.setImageResource(questions.image)
        pb_progress?.progress=c
        tv_progress?.text="${c}/${pb_progress?.max}"
        //tv_option1?.text= questions.optionOne
//        tv_option1?.text= questions.optionTwo
//        tv_option1?.text= questions.optionThree
//        tv_option1?.text= questions.optionFour
        //c++
//        btn_submit?.setOnClickListener {
//        }

    }
}