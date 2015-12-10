import scala.collection.mutable.ArrayBuffer   //mutable arrays
import java.io._
import scala.io.Source
import java.util.Date


object Test {
    def main(args: Array[String]) {
           
    
    //----------    how dates work...    CHANGE ALL ARGS OF STING TO ARGS OF DATE FOR WORKERS
    var d = new Date()
    var f = new Date(93, 0, 28)   //year+1900, month-1, date
    println(f)
    println(d)
    println(d.after(f))
    
    
    //-----------
    
    
    
    
    println("Please select what you'd like to do from below: ")
    println("(1): Be assigned a new order")
    println("(2): Report damaged stock")
    println("(3): Clocking in/out")    
    println("(4): View orders")
    println("(5): Item location")
    println("(6): Pick box size")
    println("(7): Contact Courier")
    println("(8): Purchase order recieved")
    println("(9): View purchase orders")
    println("(10): Completed an order")
    println("(11): Print delivery label")
    var choice = scala.io.StdIn.readLine()
    println("You have chosen choice (" + choice +")")
    matchTest(choice)
    
    def matchTest(x: String): Unit = x match {    //make higher order function??
      case "1" => AssignNewOrder
      case "2" => DamagedStock
      case "3" => println("3 not implemented")     // --------------- implement
      case "4" => viewOrders
      case "5" => viewItemLocation
      case "6" => findBox
      case "7" => contactCourier
      case "8" => purchaseOrderRecieved
      case "9" => checkRecievedPurchaseOrders
      case "10" => completedOrder
      case "11" => printDeliveryLabel
      case _ => println("Invalid Choice")
    }
    
    
    
    def AssignNewOrder {
      var orderID = OrderList.findNonAssignedOrder
      println("you have been assigned order number " + orderID.toString)
    }
    
    def DamagedStock {
      println("Please enter the item number of the damaged stock")
      var damStock = scala.io.StdIn.readLine()
      println("Please enter the quantity of stock which was damaged")
      var quanDamStock = scala.io.StdIn.readLine()
      StockList.decreaseQuantity(damStock.toInt, quanDamStock.toInt)
    }
    
    def viewOrders {
      println("please enter an order number")
      var orderNumber = scala.io.StdIn.readLine()
      OrderList.printOrder(orderNumber.toInt)
    }
    
    def viewItemLocation {                           //make one which takes orders?
      println("Please enter item number")
      var itemNumber = scala.io.StdIn.readLine()
      println("Item is located at:")
      println(StockList.itemLocation(itemNumber.toInt))
    }
    
    def findBox {
      var boxVolume = 0
      println("Please enter the order number")
      var orderNumber = scala.io.StdIn.readLine()
      var order = OrderList.findOrderByID(orderNumber.toInt)
      for (a <- order.items.keys) {
        boxVolume += (StockList.findItemByID(a).volume * order.items(a))
      }
      println("Required box volume is " + boxVolume.toString)
    }
    
    def contactCourier {
      println("The courier has been contacted")
    }
    
    def purchaseOrderRecieved {
      println("Please under the purchase order ID")
      var ID = scala.io.StdIn.readLine()
      PurchaseOrderList.recievedOrder(ID.toInt)
    }
    
    def checkRecievedPurchaseOrders {
      println("Please enter the purchase order ID")
      var ID = scala.io.StdIn.readLine()
      PurchaseOrderList.printPurchaseOrder(ID.toInt)
    }
    
    def completedOrder {
      println("Please enter Order ID")
      var ID = scala.io.StdIn.readLine()
      OrderList.completedOrder(ID.toInt)
    }
    
    def printDeliveryLabel {
      println("Please enter Order ID")
      var ID = scala.io.StdIn.readLine()
      println("Label printed")
      
    }
    
    
  }
}