package repository

import model.Item

trait ItemRepository {
  def findById(id: Long): Option[Item] = Map (
    1L -> Item(1, "item1", 1500),
    2L -> Item(2, "item2", 1000)
  ).get(id)
}

trait ItemRepositoryComponent {
  val itemRepository: ItemRepository
}

trait ItemRepositoryComponentRegistry extends ItemRepositoryComponent {
  val itemRepository: ItemRepository = new ItemRepository {}
}
