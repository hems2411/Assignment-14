

class Calc
{
    var n:Int = 0
    var d:Int = 0
    def set(x:Int,y:Int)
    {
        n = x
        d = y
        
    }
    def add(o1:Calc,o2:Calc) 
    {
        n = o1.n*o2.d + o2.n*o1.d;
		d = o1.d * o2.d;
		println(n+"/"+d);
        
    }
    def sub(o1:Calc,o2:Calc) 
    {
        n = o1.n*o2.d - o2.n*o1.d;
		d = o1.d * o2.d;
		println(n+"/"+d);
        
    }
    def mul(o1:Calc,o2:Calc) 
    {
       n = o1.n*o2.n ;
		d = o1.d * o2.d;
		System.out.println(n+"/"+d);
        
    }
    def div(o1:Calc,o2:Calc) 
    {
        n = o1.n*o2.d ;
		d = o1.d * o2.n;
		System.out.println(n+"/"+d);
        
    }
    
}

object Calculator {
      
      def main(args: Array[String]) {
     val a = new Calc();
      val b = new Calc();
       val c = new Calc();
       a.set(4,5)
       b.set(7,3)
       c.add(a,b)
       c.sub(a,b)
       c.mul(a,b)
       c.div(a,b)
      }
   }
