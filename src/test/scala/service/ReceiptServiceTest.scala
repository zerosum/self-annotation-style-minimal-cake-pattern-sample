package service

import java.time.LocalDateTime

import model.{Item, Receipt, ReceiptItem}
import org.scalamock.scalatest.MockFactory
import org.scalatest.Matchers
import org.scalatest.FlatSpec
import repository._

class ReceiptServiceTest extends FlatSpec with Matchers with MockFactory
  with ReceiptServiceTestEnvironment {

  "getTotal" should "return nothing" in {
    (receiptRepositoryStub.findById _).when(1).returns(None)

    receiptService.getTotal(1) shouldBe a[Left[RuntimeException, _]]
  }

  it should "return total price" in {
    val receipt: Receipt = Receipt(1, LocalDateTime.now())

    val receiptItems: Seq[ReceiptItem] = List (
      ReceiptItem(1, 1, 1, 1),
      ReceiptItem(2, 1, 2, 3)
    )

    val item1: Item = Item(1, "item1", 130)
    val item2: Item = Item(2, "item1", 220)

    (receiptRepositoryStub.findById _).when(1).returns(Some(receipt))

    (receiptItemRepositoryStub.findAllByReceiptId _).when(1).returns(receiptItems)

    (itemRepositoryStub.findById _).when(1).returns(Some(item1))
    (itemRepositoryStub.findById _).when(2).returns(Some(item2))

    receiptService.getTotal(1) shouldBe Right(790)
  }
}

trait ReceiptServiceTestEnvironment {
  self: MockFactory =>

  val receiptRepositoryStub: ReceiptRepository = stub[ReceiptRepository]
  val receiptItemRepositoryStub: ReceiptItemRepository = stub[ReceiptItemRepository]
  val itemRepositoryStub: ItemRepository = stub[ItemRepository]

  val receiptService: ReceiptService = new ReceiptService
    with MockComponentRegistry

  trait MockComponentRegistry
    extends ReceiptRepositoryComponent
      with ReceiptItemRepositoryComponent
      with ItemRepositoryComponent {

    val receiptRepository: ReceiptRepository = receiptRepositoryStub
    val receiptItemRepository: ReceiptItemRepository = receiptItemRepositoryStub
    val itemRepository: ItemRepository = itemRepositoryStub
  }

}
