package net.zerosum.sample.persistance.repository.impl

import net.zerosum.sample.domain.entity.Item
import net.zerosum.sample.domain.repository.ItemRepository

object ItemRepositoryImpl extends ItemRepository {
  def findById(id: Long): Option[Item] = Map(
    1L -> Item(1, "item1", 1500),
    2L -> Item(2, "item2", 1000)
  ).get(id)
}
