package net.zerosum.sample.component.repository

import net.zerosum.sample.domain.repository.{ItemRepository, ItemRepositoryComponent}
import net.zerosum.sample.persistance.repository.impl.ItemRepositoryImpl

trait ItemRepositoryComponentRegistry extends ItemRepositoryComponent {
  val itemRepository: ItemRepository = ItemRepositoryImpl
}
