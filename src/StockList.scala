import scala.collection.mutable.ArrayBuffer   //mutable arrays

class StockList (args : Item*) {
      var stockList = ArrayBuffer.empty[Item]
      for(a <- args) {
        stockList += a
      }
          
      def orderStockListByQuantity  {
        stockList = stockList.sortWith(_.quantity > _.quantity) //replaces list with ordered list
      }
      
      def orderStockListByName {
        stockList = stockList.sortWith(_.name < _.name)
      }
      
      def printNames {
        for (a <- stockList){
          println(a.name)
        }
      }
      
      def findItemByNumber ( itemNumber : Int ) : Item = {
        var a = stockList.find( _.ID == itemNumber)
        var b = a.getOrElse(null)
        b
      }
      
      def findItemByName ( name : String) : Item = {
        var a = stockList.find( _.name == name)
        var b = a.getOrElse(null)
        b
      }
}