import java.sql.Date

class Newspaper (_name: String) {
    val name = _name
    var number: Int = 0
    var rdate = Date(/* date = milliseconds*/ 1675874720866)

    constructor(_name: String, _number: Int) : this(_name) {
        number = _number
    }

    constructor(_name: String, _number: Int, _rdate: Date) : this(_name, _number) {
        rdate = _rdate
    }

    fun getLatestNewspaper() {
        println("The latest newspaper was released in $rdate")
    }

    fun getNewspaper() {
        println("Newspaper №$number named $name")
    }

    fun getNewspaperDate() {
        println("Newspaper №$number released $rdate")
    }
}
