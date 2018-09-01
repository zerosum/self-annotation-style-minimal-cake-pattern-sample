package net.zerosum.sample.persistance.repository.impl

import net.zerosum.sample.domain.entity.ReceiptItem
import net.zerosum.sample.domain.repository.ReceiptItemRepository

object ReceiptItemRepositoryImpl extends ReceiptItemRepository {
  def findAllByReceiptId(receiptId: Long): Seq[ReceiptItem] = List(
    ReceiptItem(1, 1, 1, 2),
    ReceiptItem(2, 1, 2, 1)
  )
}
