package net.zerosum.sample.component.repository

import net.zerosum.sample.domain.repository.{ReceiptRepository, ReceiptRepositoryComponent}
import net.zerosum.sample.persistance.repository.impl.ReceiptRepositoryImpl

trait ReceiptRepositoryComponentRegistry extends ReceiptRepositoryComponent {
  val receiptRepository: ReceiptRepository = ReceiptRepositoryImpl
}
