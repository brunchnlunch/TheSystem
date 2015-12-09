import scala.collection.mutable.ArrayBuffer   //mutable arrays

object Test {
    def main(args: Array[String]) {
    
    
    case class Item (ID: Int, Name: String, Quantity: Int, Volume: Int, Location: Int)
    
    object StockList {
    var stocklist = ArrayBuffer(Item(100, "ChristmasGnome", 40, 25, 11111),
        Item(101, "BigGnome", 40, 50, 11112),
        Item(102, "TinyGnome", 60, 10, 11113))
    
        
    def OrderStockListByQuantity  {
      StockList.stocklist = StockList.stocklist.sortWith(_.Quantity > _.Quantity)
    }
    
    def OrderStockListByName : ArrayBuffer[Item] = {
      StockList.stocklist.sortWith(_.Name < _.Name)
    }
    
    }
    
    StockList
    println(StockList.stocklist(0).Quantity)
    println(StockList.stocklist)
    StockList.OrderStockListByQuantity
    println(StockList.stocklist)
    
    
    
  }
}