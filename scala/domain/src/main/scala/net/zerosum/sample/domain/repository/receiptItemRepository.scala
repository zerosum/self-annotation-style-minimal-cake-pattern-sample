package net.zerosum.sample.domain.repository

import net.zerosum.sample.domain.entity.ReceiptItem

trait ReceiptItemRepository {
  def findAllByReceiptId(receiptId: Long): Seq[ReceiptItem]
}

trait ReceiptItemRepositoryComponent {
  val receiptItemRepository: ReceiptItemRepository
}
