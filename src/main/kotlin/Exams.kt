import java.sql.Date

class Exams (_studentname: String){
    val studentname = _studentname
    var subject:String = "Undefined"
    var exdate = Date(/* date = milliseconds*/ 1675874720866)
    var grade:Byte = 0

    constructor(_studentname: String, _subject: String): this(_studentname){
        subject = _subject
    }
    constructor(_studentname: String, _subject: String, _exdate: Date): this(_studentname, _subject){
        exdate = _exdate
    }
    constructor(_studentname: String, _subject: String, _exdate: Date, _grade: Byte): this(_studentname, _subject, _exdate){
        grade = _grade
    }
    fun getExamInfo() {
        println("Date of $subject exam is $exdate")
    }
    fun getExamMark() {
        println("$studentname has a grade of $grade on the $subject exam")
    }
    fun getStudentExam() {
        println("$studentname has a $subject exam")
    }
}