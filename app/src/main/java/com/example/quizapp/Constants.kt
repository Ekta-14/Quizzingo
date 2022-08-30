package com.example.quizapp

object Constants
{
    fun getQuestions():ArrayList<Questions>
    {
     val questionlist=ArrayList<Questions>()

        val ques1=Questions(
            1,
            "What country does this flag belog to?",
            R.drawable.england,
            "Japan",
            "England",
            "India",
            "America",
            "England"
        )
        questionlist.add(ques1)

        val ques2=Questions(
            2,
            "What country does this flag belog to?",
            R.drawable.japann,
            "Japan",
            "England",
            "India",
            "America",
            "Japan"
        )
        questionlist.add(ques2)


        val ques3=Questions(
            1,
            "What country does this flag belog to?",
            R.drawable.america,
            "Japan",
            "Germany",
            "New Zealand",
            "America",
            "America"
        )
        questionlist.add(ques3)


        val ques4=Questions(
            1,
            "What country does this flag belog to?",
            R.drawable.france,
            "Japan",
            "England",
            "France",
            "America",
            "France"
        )
        questionlist.add(ques4)
        val ques5=Questions(
            1,
            "What country does this flag belog to?",
            R.drawable.india,
            "Japan",
            "England",
            "France",
            "India",
            "India"
        )
        questionlist.add(ques5)
        return questionlist
    }

}