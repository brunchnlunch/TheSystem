import scala.collection.mutable.ArrayBuffer   //mutable arrays
import java.io._
import scala.io.Source

object Test {
    def main(args: Array[String]) {
    
    //create some Items
    var christmasGnome = new Item(100, "ChristmasGnome", 40, 25, 11111)
    var bigGnome = new Item(101, "BigGnome", 40, 50, 11112)
    var tinyGnome = new Item(102, "TinyGnome", 60, 10, 11113)
    var purpleGnome = new Item(103, "PurpleGnome", 15, 30, 11114)
    
    //create some orders
    var order1 = new Order(1111, Map(tinyGnome -> 2), "a", true, true)
    var order2 = new Order(1112, Map(christmasGnome -> 1, bigGnome -> 1), "b", false, true)
    var order3 = new Order(1113, Map(purpleGnome -> 5), "c", false, false)
    
    object StockList{
      var stockList = ArrayBuffer(christmasGnome, bigGnome, tinyGnome, purpleGnome)
          
      def orderStockListByQuantity  {
        StockList.stockList = StockList.stockList.sortWith(_.quantity > _.quantity) //replaces list with ordered list
      }
      
      def orderStockListByName {
        StockList.stockList = StockList.stockList.sortWith(_.name < _.name)
      }
      
      def printNames {
        for (a <- stockList){
          println(a.name)
        }
      }
    }
    
    object OrderList {
      var orderList = ArrayBuffer(order1, order2, order3)
    }
    
    object UserSelection {
      def menu {
          println("Please select what you'd like to do from below: ")
          println("(1): Be assigned a new order")
          println("(2): Report damaged stock")
          println("(3): Clocking in/out")
          println("(4): View orders")
          println("(5): Item location")
          println("(6): Pick box size")
          var choice = scala.io.StdIn.readLine()
          println("You have chosen choice (" + choice +")")
          
          def matchTest(x: String): Unit = x match {
            case "1" =>  println("asasas")
            case _ => println("Invalid Choice")
            }
          
          matchTest(choice)
      }
    }
    
    
    
    
    UserSelection.menu
    
    
    
    
  }
}