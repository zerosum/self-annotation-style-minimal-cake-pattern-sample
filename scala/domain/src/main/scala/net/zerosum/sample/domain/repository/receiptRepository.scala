package net.zerosum.sample.domain.repository

import java.time.LocalDateTime

import net.zerosum.sample.domain.entity.Receipt

trait ReceiptRepository {
  def findById(id: Long): Option[Receipt]
}

trait ReceiptRepositoryComponent {
  val receiptRepository: ReceiptRepository
}
