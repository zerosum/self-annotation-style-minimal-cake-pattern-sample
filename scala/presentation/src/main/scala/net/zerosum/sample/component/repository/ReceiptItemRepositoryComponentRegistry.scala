package net.zerosum.sample.component.repository

import net.zerosum.sample.domain.repository.{ReceiptItemRepository, ReceiptItemRepositoryComponent}

trait ReceiptItemRepositoryComponentRegistry extends ReceiptItemRepositoryComponent {
  val receiptItemRepository: ReceiptItemRepository = new ReceiptItemRepository {}
}
