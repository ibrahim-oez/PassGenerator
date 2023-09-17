import Password as pass

fun main(){
    val start = true
    while (start) {
        println("Gebe bitte ein wie viele Character dein Passwort haben soll...")
        val x = readln().toInt()
        val y = pass()
        y.mixVariable(x)

        println("Noch einmal ? (ja/nein)")
        val z = readln()
        if (z == "ja" || z == "JA")
        {
            continue
        }else{
            break
        }

    }
}