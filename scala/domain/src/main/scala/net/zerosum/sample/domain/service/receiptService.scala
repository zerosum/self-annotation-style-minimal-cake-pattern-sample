package net.zerosum.sample.domain.service

import net.zerosum.sample.domain.repository.{ItemRepositoryComponent, ReceiptItemRepositoryComponent, ReceiptRepositoryComponent}

trait ReceiptService {
  self: ReceiptRepositoryComponent
    with ReceiptItemRepositoryComponent
    with ItemRepositoryComponent =>

  def getTotal(receiptId: Long): Either[Throwable, Int] = {
    receiptRepository.findById(receiptId).map { _ =>
      val subTotals = for {
        receiptItem <- receiptItemRepository.findAllByReceiptId(receiptId)
        item <- itemRepository.findById(receiptItem.itemId)
      } yield {
        item.price * receiptItem.quantity
      }

      subTotals.sum
    }.toRight(
      new RuntimeException(s"there is no receipt. id:[$receiptId]")
    )
  }
}

trait ReceiptServiceComponent {
  val receiptService: ReceiptService
}
