/*Scala program to demonstrate example of collection list and for loop.*/

object ExampleForAndCollection {
   def main(args: Array[String]) {
      //declare an integer
      var N: Int=0;
      
      //declare integer list
      var numbers = List(100,200,300,400);
      
      //to print all numbers using for loop
      for(N<-numbers){
          println(N);
      }
      
   }
}