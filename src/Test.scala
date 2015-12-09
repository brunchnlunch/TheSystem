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
    
    
    var a = new OrderList(order1, order2, order3)
    var b = new StockList(christmasGnome, bigGnome, tinyGnome, purpleGnome)
    
    
    
    println("Please select what you'd like to do from below: ")
    println("(1): Be assigned a new order")
    println("(2): Report damaged stock")
    println("(3): Clocking in/out")
    println("(4): View orders")
    println("(5): Item location")
    println("(6): Pick box size")
    var choice = scala.io.StdIn.readLine()
    println("You have chosen choice (" + choice +")")
    matchTest(choice, a, b)
    
    def matchTest(x: String, OrderList : OrderList, StockList : StockList): Unit = x match {
      case "1" => AssignNewOrder(OrderList)
      case "2" => DamagedStock(StockList)
      case "3" => println("3 not implemented")
      case "4" => viewOrders(OrderList)
      case "5" => viewItemLocation(StockList)
      case "6" => println("6 not implemented")
      case _ => println("Invalid Choice")
    }
    
    def AssignNewOrder (OrderList : OrderList) {
      var order = OrderList.findNonAssignedOrder
      println("you have been assigned order number " + order.ID.toString)
    }
    
    def DamagedStock (StockList: StockList) {
      println("Please enter the item number of the damaged stock")
      var damStock = scala.io.StdIn.readLine()
      println("Please enter the quantity of stock which was damaged")
      var quanDamStock = scala.io.StdIn.readLine()
      var a = StockList.findItemByNumber(damStock.toInt)
      a.decreaseQuantity(quanDamStock.toInt)
    }
    
    def viewOrders (OrderList : OrderList) {
      println("please enter an order number")
      var orderNumber = scala.io.StdIn.readLine()
      var order = OrderList.findOrderByNumber(orderNumber.toInt).printOrder
    }
    
    def viewItemLocation(StockList: StockList) {
      println("Please enter item number")
      var itemNumber = scala.io.StdIn.readLine()
      println("Item is located at:")
      println(StockList.findItemByNumber(itemNumber.toInt).location)
    }
    
  }
}