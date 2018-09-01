package net.zerosum.sample.component.repository

import net.zerosum.sample.domain.repository.{ReceiptItemRepository, ReceiptItemRepositoryComponent}
import net.zerosum.sample.persistance.repository.impl.ReceiptItemRepositoryImpl

trait ReceiptItemRepositoryComponentRegistry extends ReceiptItemRepositoryComponent {
  val receiptItemRepository: ReceiptItemRepository = ReceiptItemRepositoryImpl
}
