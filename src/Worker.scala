import scala.collection.mutable.ArrayBuffer   //mutable arrays
import java.util.Date

case class Worker (ID: Int, name: String, clockIn: ArrayBuffer[String], clockOut: ArrayBuffer[String]){ //is forklift qualified? has order assigned?
}


object WorkerList {
  var Workers = Set(new Worker(1111, "Terry Bobbers", ArrayBuffer.empty[String], ArrayBuffer.empty[String]),
      new Worker(1112, "Joe Foot", ArrayBuffer("a"), ArrayBuffer.empty[String]),
      new Worker(1113, "Ted Desk", ArrayBuffer("a"), ArrayBuffer.empty[String]))
      
  def clockIn (ID : Int) {
    var date = "a"   //replace with real date
    var newWorkers = Set.empty[Worker]
    for (a <- Workers) {
      if (ID != a.ID) {
        newWorkers += a
      } else {
        var b = a.clockIn
        newWorkers += new Worker(a.ID, a.name, b+="some date", a.clockOut)  //change a.clockIn
      }
    }
    Workers = newWorkers
  }
  
  def clockOut (ID : Int) {
    var date = "a"   //replace with real date
    var newWorkers = Set.empty[Worker]
    for (a <- Workers) {
      if (ID != a.ID) {
        newWorkers += a
      } else {
        var b = a.clockOut
        newWorkers += new Worker(a.ID, a.name, a.clockIn, b+="some date")  //change a.clockIn
      }
    }
    Workers = newWorkers
  }
  
  def isAtWork (ID : Int) : Boolean = {
    var worker : Worker = null
    for (a <- Workers) {
      if (ID == a.ID) {
        worker = a
      }
    }
    if (1 < 2) {  //when using dates put here      worker.clockIn.reverse.head.after(worker.clockOut.reverse.head)
      true
    } else {
      false
    }
  }
}