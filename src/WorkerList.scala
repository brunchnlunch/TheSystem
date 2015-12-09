import scala.collection.mutable.ArrayBuffer   //mutable arrays

class WorkerList ( args : Worker*) {
  var workerList = ArrayBuffer.empty[Worker]
  for(a <- args){
    workerList += a
  }
  
  
}