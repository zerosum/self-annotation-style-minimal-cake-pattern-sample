package repository

import java.time.LocalDateTime

import model.Receipt

trait ReceiptRepository {
  def findById(id: Long): Option[Receipt] = Some (
    Receipt(1, LocalDateTime.of(2018, 1, 1, 0, 0))
  )
}

trait ReceiptRepositoryComponent {
  val receiptRepository: ReceiptRepository
}

trait ReceiptRepositoryComponentRegistry extends ReceiptRepositoryComponent {
  val receiptRepository: ReceiptRepository = new ReceiptRepository {}
}