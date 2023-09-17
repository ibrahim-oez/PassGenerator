
import kotlin.random.Random


class Password(){

    private val vars: String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"+
            "0123456789,.-_+*~#'`´!§$%&/()=?"

    fun mixVariable(passLength:Int)
    {
      val random =Random(System.currentTimeMillis())
      var passCounter = true
      var write : String = ""

      while (passCounter)
      {
          val givenNum = random.nextInt(vars.length)
          val selectedChar = vars[givenNum]

          write += selectedChar

          if (write.length == passLength) {
              passCounter = false
          }
      }
        println(write)
    }

}



