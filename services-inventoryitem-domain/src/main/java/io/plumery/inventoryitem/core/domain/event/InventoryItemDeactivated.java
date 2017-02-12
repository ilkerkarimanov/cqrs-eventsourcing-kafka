package io.plumery.inventoryitem.core.domain.event;

import io.plumery.core.Event;
import io.plumery.core.ID;

public class InventoryItemDeactivated extends Event {
    public InventoryItemDeactivated(ID id) {
        this.id = id;
    }
}
