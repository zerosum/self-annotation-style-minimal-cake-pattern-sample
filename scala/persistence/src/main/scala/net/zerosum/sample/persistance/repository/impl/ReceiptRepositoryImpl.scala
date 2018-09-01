package net.zerosum.sample.persistance.repository.impl

import java.time.LocalDateTime

import net.zerosum.sample.domain.entity.Receipt
import net.zerosum.sample.domain.repository.ReceiptRepository

object ReceiptRepositoryImpl extends ReceiptRepository {
  def findById(id: Long): Option[Receipt] = Some (
    Receipt(1, LocalDateTime.of(2018, 1, 1, 0, 0))
  )
}
