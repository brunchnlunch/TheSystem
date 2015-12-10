import scala.collection.mutable.ArrayBuffer   //mutable arrays
import java.io._
import scala.io.Source
import java.util.Date


object Test {
    def main(args: Array[String]) {
           
      /*
    //create some Items
    var christmasGnome = new Item(100, "ChristmasGnome", 40, 25, 11111)
    var bigGnome = new Item(101, "BigGnome", 40, 50, 11112)
    var tinyGnome = new Item(102, "TinyGnome", 60, 10, 11113)
    var purpleGnome = new Item(103, "PurpleGnome", 15, 30, 11114)
    
    
    //create some orders
    var order1 = new Order(1111, Map(tinyGnome -> 2), "a", true, true)
    var order2 = new Order(1112, Map(christmasGnome -> 1, bigGnome -> 1), "b", false, true)
    var order3 = new Order(1113, Map(purpleGnome -> 5), "c", false, false)
    
    /*
    //create some workers
    var worker1 = new Worker(1111, "Terry Bobbers", ArrayBuffer.empty[Date], ArrayBuffer.empty[Date])
    var worker2 = new Worker(1112, "Joe Foot", ArrayBuffer(new Date(93, 7, 28)), ArrayBuffer.empty[Date])
    var worker3 = new Worker(1113, "Ted Desk", ArrayBuffer(new Date(110, 1, 1)), ArrayBuffer.empty[Date])
    * 
    */
    
    var a = new OrderList(order1, order2, order3)
    var b = new StockList(christmasGnome, bigGnome, tinyGnome, purpleGnome)
    //var c = new WorkerList(worker1, worker2, worker3)
    
    //----------    how dates work...    CHANGE ALL ARGS OF STING TO ARGS OF DATE FOR WORKERS
    var d = new Date()
    var f = new Date(93, 0, 28)   //year+1900, month-1, date
    println(f)
    println(d)
    println(d.after(f))
    
    
    println(bigGnome)
    
    //-----------
     * 
     */
    
      
    
      
      
    println("Hello")
    println(WorkerList.Workers)
    WorkerList.clockOut(1112)
    println(WorkerList.Workers)
    println(WorkerList.isAtWork(1112))
    
    
    /*
    println("Please select what you'd like to do from below: ")
    println("(1): Be assigned a new order")
    println("(2): Report damaged stock")
    println("(3): Clocking in/out")    //worker and workerlist class?
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
      case "6" => findBox(StockList, OrderList)
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
    /*
    def viewItemLocation(StockList: StockList) {  //make one which takes orders?
      println("Please enter item number")
      var itemNumber = scala.io.StdIn.readLine()
      println("Item is located at:")
      println(StockList.findItemByNumber(itemNumber.toInt).location)
    }
    
    def findBox (StockList: StockList, OrderList : OrderList) {
      var boxVolume = 0
      println("Please enter the order number")
      var orderNumber = scala.io.StdIn.readLine()
      var order = OrderList.findOrderByNumber(orderNumber.toInt)
      for (a <- order.items.keys) {
        boxVolume += (a.volume * order.items(a))
      }
      println("Required box volume is " + boxVolume.toString)
    }
    * 
    */
    * 
    */
  }
}