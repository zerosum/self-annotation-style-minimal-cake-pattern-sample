package net.zerosum.sample.component.service

import net.zerosum.sample.component.repository.{ItemRepositoryComponentRegistry, ReceiptItemRepositoryComponentRegistry, ReceiptRepositoryComponentRegistry}
import net.zerosum.sample.domain.service.{ReceiptService, ReceiptServiceComponent}

trait ReceiptServiceComponentRegistry extends ReceiptServiceComponent {
  val receiptService: ReceiptService = new ReceiptService
    with ReceiptRepositoryComponentRegistry
    with ReceiptItemRepositoryComponentRegistry
    with ItemRepositoryComponentRegistry
}
