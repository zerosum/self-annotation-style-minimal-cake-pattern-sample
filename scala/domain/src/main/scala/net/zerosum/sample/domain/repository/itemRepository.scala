package net.zerosum.sample.domain.repository

import net.zerosum.sample.domain.entity.Item

trait ItemRepository {
  def findById(id: Long): Option[Item] = Map (
    1L -> Item(1, "item1", 1500),
    2L -> Item(2, "item2", 1000)
  ).get(id)
}

trait ItemRepositoryComponent {
  val itemRepository: ItemRepository
}
