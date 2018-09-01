package net.zerosum.sample.domain.repository

import java.time.LocalDateTime

import net.zerosum.sample.domain.entity.Receipt

trait ReceiptRepository {
  def findById(id: Long): Option[Receipt] = Some (
    Receipt(1, LocalDateTime.of(2018, 1, 1, 0, 0))
  )
}

trait ReceiptRepositoryComponent {
  val receiptRepository: ReceiptRepository
}
