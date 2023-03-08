fun main() {
    cekbilanganprima()
}

fun cekbilanganprima() {
    var bilanganprima :Boolean =true
    print("Masukan sebuah bilangan bulat positif: ")
    var inputangka: Int = readln().toInt()
    if (inputangka ==0 ||inputangka == 1) {
        bilanganprima = false
    } else{
        for (i in 2..inputangka/2){
            if (inputangka % i == 0){
                bilanganprima = false;
                break
            }
        }
    }

    if (bilanganprima){
        println("$inputangka Merupakan Bilangan Prima")
    }else{
        println("$inputangka Bukan Merupakan Bilangan Prima")
    }
}
