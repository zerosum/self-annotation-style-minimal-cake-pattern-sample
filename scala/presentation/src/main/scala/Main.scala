import net.zerosum.sample.component.service.ReceiptServiceComponentRegistry

object Main extends App
  with ReceiptServiceComponentRegistry
{
  val receiptId = 1

  receiptService.getTotal(1).fold(
    e => println(e.getMessage),
    total => println(s"total is [$total], receiptId:[$receiptId]")
  )
}
