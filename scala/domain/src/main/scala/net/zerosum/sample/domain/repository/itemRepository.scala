package net.zerosum.sample.domain.repository

import net.zerosum.sample.domain.entity.Item

trait ItemRepository {
  def findById(id: Long): Option[Item]
}

trait ItemRepositoryComponent {
  val itemRepository: ItemRepository
}
