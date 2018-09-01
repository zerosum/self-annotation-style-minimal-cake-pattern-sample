package net.zerosum.sample.component.repository

import net.zerosum.sample.domain.repository.{ReceiptRepository, ReceiptRepositoryComponent}

trait ReceiptRepositoryComponentRegistry extends ReceiptRepositoryComponent {
  val receiptRepository: ReceiptRepository = new ReceiptRepository {}
}
