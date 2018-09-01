package net.zerosum.sample.component.repository

import net.zerosum.sample.domain.repository.{ItemRepository, ItemRepositoryComponent}

trait ItemRepositoryComponentRegistry extends ItemRepositoryComponent {
  val itemRepository: ItemRepository = new ItemRepository {}
}
