

object Square extends App {
      def square(n:Int):Unit ={ //function
      var y = 1 //variables initialization
      var x = n
      while(x - y > 0 ){ //while loop for looping
        x = ( x + y ) / 2
        y = n / x          //logics
      }
      
      println(x)  
      
    }
    square(10)

}