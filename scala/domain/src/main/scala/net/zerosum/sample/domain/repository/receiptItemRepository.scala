package net.zerosum.sample.domain.repository

import net.zerosum.sample.domain.entity.ReceiptItem

trait ReceiptItemRepository {
  def findAllByReceiptId(receiptId: Long): Seq[ReceiptItem] = List(
    ReceiptItem(1, 1, 1, 2),
    ReceiptItem(2, 1, 2, 1)
  )
}

trait ReceiptItemRepositoryComponent {
  val receiptItemRepository: ReceiptItemRepository
}
