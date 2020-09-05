fun main(){
    var info = Collage()
    info.name()
    info.departments()

}

interface Students {
    val id : Int
    val collNum :Int
}

interface Teatchers : Students {
    fun name ()
    fun departments()
}

class Collage :Teatchers{
    override fun name() {
        println("The Teacher name is Ali")
    }

    override fun departments() {
        println("The departments is information  of teachnology")
    }

    override val id: Int
        get() = 14

    override val collNum: Int
        get() = 40

}