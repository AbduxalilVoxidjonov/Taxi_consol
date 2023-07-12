import java.lang.annotation.ElementType
import java.util.Scanner

class Umumiy:Qilinadigan_ishlar {
    val haydovchi_array= arrayListOf<haydovchi>()
    val yolovchi_array= arrayListOf<Yolovchi>()
    val manzil_array= arrayListOf<ManzilgaBorish>()
    val elonlar_array= arrayListOf<Elonlar>()
    val scanner=Scanner(System.`in`)

    var name:String=""
    var phoneNumber:String=""
    var mashina:String=""
    var id:Int=0
    var manzil:String=""
    var borish:String=""


    override fun haydovchiQabulqilish() {
        print("Id: ")
        id=scanner.nextInt()
        print("Qaysi e'lonni qabul qilasiz idsini kiriting: ")
        val str_id=scanner.nextInt()
        var bool=false
        for (i in elonlar_array.indices){
            if (elonlar_array[i].id==str_id){
                manzil_array.add(ManzilgaBorish(elonlar_array[i].turganManzil,elonlar_array[i].borishManzil,id,str_id))
                println("Yolovchi manziliga yetib bordi")
                elonlar_array.removeAt(i)
                bool=true
                break
            }
        }
        if (!bool){
            println("Hatolik mavjud qaytadan urunib ko'ring")
        }
    }
    override fun havdovchiRegistratsiya() {
        print("Haydovchi ismingiz: ")
        name=scanner.next()
        print("Haydovchi telefon raqam: ")
        phoneNumber=scanner.next()
        print("Mashina raqami: ")
        mashina=scanner.next()
        print("Haydovchi id: ")
        id=scanner.nextInt()
        for (i in haydovchi_array.indices){
            if (id==haydovchi_array[i].id){
                println("Bunday Id mavjud: ")
                havdovchiRegistratsiya()
            }
        }
        for (i in yolovchi_array.indices){
            if (id==yolovchi_array[i].id){
                println("Bunday Id mavjud: ")
                havdovchiRegistratsiya()
            }
        }
        haydovchi_array.add(haydovchi(name,phoneNumber,mashina,id))
    }
    override fun yolovchiRegistratsiya() {
        print("Yolovchi ismi: ")
        name=scanner.next()
        print("Yolovchi telefon raqam: ")
        phoneNumber=scanner.next()
        print("Yolovchi Id: ")
        id=scanner.nextInt()
        for (i in haydovchi_array.indices){
            if (id==haydovchi_array[i].id){
                println("Bunday Id mavjud: ")
                yolovchiRegistratsiya()
            }
        }
        for (i in yolovchi_array.indices){
            if (id==yolovchi_array[i].id){
                println("Bunday Id mavjud: ")
                yolovchiRegistratsiya()
            }
        }
        yolovchi_array.add(Yolovchi(name,phoneNumber,id))
    }
    override fun elonBerish() {
        print("Yolovchi Id: ")
        id=scanner.nextInt()
        print("Manzil: ")
        manzil=scanner.next()
        print("Bormoqchi bo'lgan manzil: ")
        borish=scanner.next()
        elonlar_array.add(Elonlar(id,manzil,borish))
    }

    override fun elonKorish() {
        for(i in elonlar_array.indices){
            println(elonlar_array[i])
        }
    }


}