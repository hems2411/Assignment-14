object Calculator {
    
 class Arithmetic { 
   
     

   def calculateGcd(a: Int,b: Int): Int = {
       if(b ==0) a else calculateGcd(b, a%b)
    }
      def addition(n1:Int,d1:Int,n2:Int,d2:Int)=
      {
         var gcd = calculateGcd(d1,d2)
          
          var lcm = d1*d2/gcd
          
          var numerator1 = n1 *(lcm/d1)
          var numerator2= n2 * (lcm/d2)
          var sum = numerator1+numerator2
          println("Addition: "+sum+"/"+lcm)
          
      }
    def subtraction(n1:Int,d1:Int,n2:Int,d2:Int)=
      {
         var gcd = calculateGcd(d1,d2)
          
          var lcm = d1*d2/gcd
          
          var numerator1 = n1 *(lcm/d1)
          var numerator2= n2 * (lcm/d2)
          var sub = numerator1-numerator2
          println("Subtraction: "+sub+"/"+lcm)
          
      }
      def multiplication(n1:Int,d1:Int,n2:Int,d2:Int)=
      {
         
          
          var numerator = n1 * n2
          var denominator= d1 * d2
         
          println("Multiplication: "+numerator+"/"+denominator)
          
      }
       def division(n1:Int,d1:Int,n2:Int,d2:Int)=
      {
         
          
          var numerator = n1 * d2
          var denominator= d1 * n2
         
          println("division: "+numerator+"/"+denominator)
          
      }
      
      
      
       def addition(n1:Int,n2:Int)=
      {
         
          
         
          var sum = n1+n2
          println("Addition: "+sum)
          
      }
    def subtraction(n1:Int,n2:Int)=
      {
         
          var sub = n1-n2
          println("Subtraction: "+sub)
          
      }
      def multiplication(n1:Int,n2:Int)=
      {
         
          
          var mul = n1 * n2
          
         
          println("Multiplication: "+mul)
          
      }
       def division(n1:Int,n2:Int)=
      {
         
          
          var div = n1 / n2
          
         
          println("division: "+div)
          
      }
      
      
      
 }
      def main(args: Array[String]) 
      {
         
          val a = new Arithmetic()
          val b = new Arithmetic()
          var n1 = 10
          var n2 = 2
          var d1 = 8
          var d2 = 10
        a.addition(n1,d1,n2,d2)// (n1/d1) + (n2/d2)
        a.subtraction(n1,d1,n2,d2)// (n1/d1) - (n2/d2)
        a.multiplication(n1,d1,n2,d2)// ((n1/d1) * (n2/d2)
        a.division(n1,d1,n2,d2)// (n1/d1) / (n2/d2)
         b.addition(n1,n2)// (n1/d1) + (n2/d2)
        b.subtraction(n1,n2)// (n1/d1) - (n2/d2)
        b.multiplication(n1,n2)// ((n1/d1) * (n2/d2)
        b.division(n1,n2)// (n1/d1) / (n2/d2)
      }
   }
