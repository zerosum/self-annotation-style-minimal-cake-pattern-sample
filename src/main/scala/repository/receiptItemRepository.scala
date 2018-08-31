package repository

import model.ReceiptItem

trait ReceiptItemRepository {
  def findAllByReceiptId(receiptId: Long): Seq[ReceiptItem] = List(
    ReceiptItem(1, 1, 1, 2),
    ReceiptItem(2, 1, 2, 1)
  )
}

trait ReceiptItemRepositoryComponent {
  val receiptItemRepository: ReceiptItemRepository
}

trait ReceiptItemRepositoryComponentRegistry extends ReceiptItemRepositoryComponent {
  val receiptItemRepository: ReceiptItemRepository = new ReceiptItemRepository {}
}
