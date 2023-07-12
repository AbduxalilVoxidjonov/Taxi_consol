import java.util.Scanner

fun main() {
    val scanner=Scanner(System.`in`)
    val umumiyIshlar=Umumiy()
    var num=0
    while (true){
        println("<1>Haydovchi registratsiya, <2> Yo'lovchi registratsiya, <3>Elon berish, <4>Elonlarni ko'rish , <5>Haydovchi elonni qabul qilish")
        num=scanner.nextInt()
        when(num){
            1->{
                umumiyIshlar.havdovchiRegistratsiya()
                println("Registratsiya qabul qilindi")
            }
            2->{
                umumiyIshlar.yolovchiRegistratsiya()
                println("Registratsiya qabul qilindi")
            }
            3->{
                umumiyIshlar.elonBerish()
                println("Elon berildi")
            }
            4->{
                umumiyIshlar.elonKorish()
                println()
            }
            5->{
                umumiyIshlar.haydovchiQabulqilish()
            }
        }
    }
}